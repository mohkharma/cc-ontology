package edu.coverter.cve;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.jena.ontology.*;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.vocabulary.RDF;

import java.io.*;

public class JsonToIndividualsConverter {
    static OntModel ontologyModel;
    static String cveOntologyIRI = "http://birzeit.edu/cve_schema5_0";
    static String ccOntologyIRI = "http://birzeit.edu/CC";
    static boolean isTrue = false;
    public static void main(String[] args) throws FileNotFoundException {
        // Path to the JSON file
        String jsonFilePath = ".\\cveExample1.json";
//        String jsonFilePath = ".\\cveExampleForPaper.json";

        // Load the ontology
        ontologyModel = ModelFactory.createOntologyModel();
        ontologyModel.read("./CC_Ontology.owl");

        // Read the JSON file
        String jsonData = readJsonFile(jsonFilePath);

        // Convert JSON to individuals
        JsonObject jsonObject = JsonParser.parseString(jsonData).getAsJsonObject();
        JsonArray array = jsonObject.getAsJsonArray("List");
        for (int i = 0; i < array.size(); i++) {
            isTrue = true;
            convertJsonToIndividuals(array.get(i).getAsJsonObject(), ontologyModel);
//            convertJsonToIndividuals1(array.get(i).getAsJsonObject(), ontologyModel);
//            isTrue = true; //to add the CC indivduals
//            break;
        }

        // Save the ontology to a file
        ontologyModel.write(System.out, "RDF/XML-ABBREV");
        // Uncomment the line below to save the ontology to a file
        ontologyModel.write(new FileOutputStream("generatedCVERecord.owl"), "RDF/XML-ABBREV");
        ontologyModel.write(new FileOutputStream("TURTLECVE.owl"), "TURTLE");


//        try {
//            ProcessBuilder processBuilder = new ProcessBuilder("python",
//                    ("C:\\M.kharma_data\\PhD\\03-Semester-2022\\Threat-modeling\\OdTM-mkharma\\uploadGraphDB.py"));
////        processBuilder.redirectErrorStream(true);
//            Process process = processBuilder.start();
//            int exitCode = process.waitFor();
//            System.out.println("No errors should be detected" + exitCode);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }

    private static String readJsonFile(String filePath) {
        StringBuilder jsonData = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonData.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonData.toString();
    }

    private static void convertJsonToIndividuals(JsonObject jsonObject, OntModel ontologyModel) {
        // Extract the JSON data
        JsonObject cveMetadata = jsonObject.getAsJsonObject("cveMetadata");
        JsonObject containers = jsonObject.getAsJsonObject("containers");
        JsonObject cna = containers.getAsJsonObject("cna");
        JsonObject affected = cna.getAsJsonArray("affected").get(0).getAsJsonObject();
        JsonObject credits = null;
        if (cna.getAsJsonArray("credits") != null)
            credits = cna.getAsJsonArray("credits").get(0).getAsJsonObject();
        JsonObject descriptions = cna.getAsJsonArray("descriptions").get(0).getAsJsonObject();
        JsonObject metrics = null;
        if (cna.getAsJsonArray("metrics") != null)
            metrics = cna.getAsJsonArray("metrics").get(0).getAsJsonObject();
        JsonObject problemTypes = cna.getAsJsonArray("problemTypes").get(0).getAsJsonObject();
//        JsonObject providerMetadata = cna.getAsJsonObject("providerMetadata");
        JsonObject references = cna.getAsJsonArray("references").get(0).getAsJsonObject();

//        JsonObject solutions = cna.getAsJsonArray("solutions").get(0).getAsJsonObject();
//        JsonObject source = cna.getAsJsonObject("source");
//        JsonObject timeline = cna.getAsJsonArray("timeline").get(0).getAsJsonObject();
//        String xGenerator = cna.getAsJsonObject("x_generator").get("engine").getAsString();

        // Create the CVE individual
        String cveId = cveMetadata.get("cveId").getAsString();
        Individual cveIndividual = createIndividual(cveOntologyIRI, "#CVE", cveId);

//        Individual cveHeaderIndividual = createIndividual(cveOntologyIRI, "#CVEHeader", cveId);

//        cveIndividual.addProperty(ontologyModel.getProperty(
//                cveOntologyIRI + "#hasCveHeader"), cveHeaderIndividual);
        Individual cveInformationSourceIndividual = createIndividual(cveOntologyIRI,
                "#CVEInformationSource", cveId); //todo check

        cveIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#cveId"),
                cveId);
        cveIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasOrgId"),
                cveMetadata.get("assignerOrgId").getAsString());
        cveIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#status"),
                cveMetadata.get("state").getAsString());
        cveIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#assignerShortName"),
                cveMetadata.get("assignerShortName").getAsString());
        cveIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#dateReserved"),
                cveMetadata.get("dateReserved").getAsString());
        cveIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#datePublished"),
                cveMetadata.get("datePublished").getAsString());



        cveIndividual.addProperty(ontologyModel.getProperty(
                cveOntologyIRI + "#hasDetailsFrom"), cveInformationSourceIndividual);

        // Create the Affected individual
//        Individual affectedIndividual = createIndividual(cveOntologyIRI,
//                "#AffectedProduct", cveId);

        // Connect the CVE individual to the Affected individual
//        cveInformationSourceIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasAffected"),
//                affectedIndividual);



        Individual productIndividual = createIndividual(cveOntologyIRI,
                "#Product", getClearText(affected.get("product").getAsString()));
        if (affected.get("defaultStatus") != null)
            productIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI +
                            "#affectedProductStatus"),
                    affected.get("defaultStatus").getAsString());

        cveInformationSourceIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasAffectedProduct"),
                productIndividual);

        Individual vendorIndividual = createIndividual(cveOntologyIRI,
                "#ProductVendor", getClearText(affected.get("vendor").getAsString()));

        productIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasVendor"),
                vendorIndividual);



        //link the CVE with the cloud provider
        try{
            if(isTrue) {
                String vendor = "Microsoft";
                String product = "Microsoft Azure Kubernetes Service";
                String product2 = "Docker";
                Individual CloudProviderIndividual = createIndividual(ccOntologyIRI,
                        "#CloudProvider", vendor/*getClearText(affected.get("vendor").getAsString())*/);

                Individual vendor1Individual = createIndividual(cveOntologyIRI,
                        "#ProductVendor", vendor/*getClearText(affected.get("vendor").getAsString())*/);


                CloudProviderIndividual.addProperty(ontologyModel.getProperty(
                        "http://www.w3.org/2002/07/owl#sameAs"),
                        vendor1Individual);

                Individual cloudServiceModelIndividual = createIndividual("http://example.com/cloud",
                        "#PaaS", getClearText(product/*affected.get("product").getAsString()*/));

                CloudProviderIndividual.addProperty(ontologyModel.getProperty(ccOntologyIRI + "#offerService"),
                        cloudServiceModelIndividual);

                Individual component1Individual = createIndividual(ccOntologyIRI,
                        "#ServiceComponent", getClearText(product/*affected.get("product").getAsString()*/));



                Individual product1Individual = createIndividual(cveOntologyIRI,
                        "#Product", getClearText(product)/*getClearText(affected.get("vendor").getAsString())*/);


                component1Individual.addProperty(ontologyModel.getProperty(
                                "http://www.w3.org/2002/07/owl#sameAs"),
                        product1Individual);


                cloudServiceModelIndividual.addProperty(ontologyModel.getProperty(ccOntologyIRI + "#hasComponent"),
                        component1Individual);

                Individual component2Individual = createIndividual(ccOntologyIRI,
                        "#ServiceComponent", getClearText(product2/*affected.get("product").getAsString()*/));

                Individual product2Individual = createIndividual(cveOntologyIRI,
                        "#Product", getClearText(product2)/*getClearText(affected.get("vendor").getAsString())*/);


                component2Individual.addProperty(ontologyModel.getProperty(
                                "http://www.w3.org/2002/07/owl#sameAs"),
                        product2Individual);


                cloudServiceModelIndividual.addProperty(ontologyModel.getProperty(ccOntologyIRI + "#hasComponent"),
                        component2Individual);

                component1Individual.addProperty(ontologyModel.getProperty(ccOntologyIRI + "#componentImpactedByCVE"),
                        createIndividual(cveOntologyIRI, "#CVE", "CVE-2021-24109"));

                component2Individual.addProperty(ontologyModel.getProperty(ccOntologyIRI + "#componentImpactedByCVE"),
                        createIndividual(cveOntologyIRI, "#CVE", "CVE-2019-5736"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }




        // Create the Platform individual
        String platformValue =
                removeSpecialChar(affected.getAsJsonArray("platforms"));
        Individual platformIndividual = createIndividual(cveOntologyIRI,
                "#Platform", platformValue);

        platformIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasName"),
                platformValue);

        // Connect the Affected individual to the Platform individual
        cveInformationSourceIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasPlatform"),
                platformIndividual);

        // Create the Version individual
        JsonObject version = affected.getAsJsonArray("versions").get(0).getAsJsonObject();
//        Individual versionIndividual = createIndividual(cveOntologyIRI,
//                "#Version", removeSpecialChar(affected.getAsJsonArray("versions")));
//
//        versionIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#status"),
//                version.get("status").getAsString());
//        versionIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#versionValue"),
//                version.get("version").getAsString());

        // Connect the Affected individual to the Version individual
        productIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasVersion"),
                version.get("version").getAsString());

        if (credits != null) {
            // Create the Credit individual
            Individual contributerIndividual =
                    createIndividual(cveOntologyIRI,
                            "#Contributer", cveId);
            // Connect the CVE individual to the Credit individual
            cveInformationSourceIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasContributer"),
                    contributerIndividual);

            contributerIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#lang"),
                    credits.get("lang").getAsString());
            contributerIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#contributionType"),
                    credits.get("type").getAsString());
            contributerIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#user"),
                    credits.get("user").getAsString());
            contributerIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#contributionDesc"),
                    credits.get("value").getAsString());
        }
        // Create the Description individual
//        Individual descriptionIndividual =  createIndividual(androidOntologyIRI,
//                "#Description", cveId);

//        descriptionIndividual.addProperty(ontologyModel.getProperty(androidOntologyIRI + "#lang"),
//                descriptions.get("lang").getAsString());
//        descriptionIndividual.addProperty(ontologyModel.getProperty(androidOntologyIRI + "#value"),
//                descriptions.get("value").getAsString());

        // Connect the CVE individual to the Description individual
        cveInformationSourceIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI +
                        "#hasDescription"),
                descriptions.get("value").getAsString());

        if (metrics != null) {
            // Create the Metric individual
            Individual metricIndividual =
                    createIndividual(cveOntologyIRI,
                            "#Metric", cveId);

            metricIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#format"),
                    metrics.get("format").getAsString());

            // Create the CVSSV3 individual
            JsonObject cvssV3 = metrics.getAsJsonObject("cvssV3_1");
//            Individual cvssV3Individual = ontologyModel.createIndividual(
//                    cveOntologyIRI + "#CVSSV3_" + cveId,
//                    ontologyModel.getOntClass(cveOntologyIRI + "#CVSSV3"));

            // Add properties to the CVSSV3 individual todo
//        cvssV3Individual.addProperty(RDF.type, ontologyModel.getOntClass(androidOntologyIRI + "#CVSSV3"));
            metricIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#attackComplexity"),
                    cvssV3.get("attackComplexity").getAsString());
            metricIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#attackVector"),
                    cvssV3.get("attackVector").getAsString());
            metricIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#availabilityImpact"),
                    cvssV3.get("availabilityImpact").getAsString());
            metricIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#baseScore"),
                    cvssV3.get("baseScore").getAsString());
            metricIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#baseSeverity"),
                    cvssV3.get("baseSeverity").getAsString());
            metricIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#confidentialityImpact"),
                    cvssV3.get("confidentialityImpact").getAsString());
            metricIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#integrityImpact"),
                    cvssV3.get("integrityImpact").getAsString());
            metricIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#privilegesRequired"),
                    cvssV3.get("privilegesRequired").getAsString());
            metricIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#scope"),
                    cvssV3.get("scope").getAsString());
            metricIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#userInteraction"),
                    cvssV3.get("userInteraction").getAsString());

            // Connect the Metric individual to the CVSSV3 individual
//            metricIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasCVSSV3"),
//                    cvssV3Individual);

            // Connect the CVE individual to the Metric individual
            cveInformationSourceIndividual.addProperty(
                    ontologyModel.getProperty(cveOntologyIRI + "#hasMetrix"),
                    metricIndividual);
        }
        // Create the ProblemType individual


        JsonObject problemTypeData = problemTypes.getAsJsonArray("descriptions").get(0).getAsJsonObject();
        // Add properties to the ProblemTypeData individual
        if (problemTypeData.get("cweId") != null) {
            Individual problemTypeDataIndividual =
                    createIndividual(cveOntologyIRI,
                            "#CWE", problemTypeData.get("cweId").getAsString());
            problemTypeDataIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#cweId"),
                    problemTypeData.get("cweId").getAsString());
            problemTypeDataIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#description"),
                    problemTypeData.get("description").getAsString());
//            problemTypeDataIndividual.addProperty(ontologyModel.getProperty(androidOntologyIRI + "#lang"),
//                    problemTypeData.get("lang").getAsString());
            cveInformationSourceIndividual.addProperty(
                    ontologyModel.getProperty(cveOntologyIRI + "#hasCWE"),
                    problemTypeDataIndividual);
        }
//        // Create the ProviderMetadata individual
//        Individual providerMetadataIndividual = ontologyModel.createIndividual(
//                androidOntologyIRI + "#ProviderMetadata_" + cveId,
//                ontologyModel.getOntClass(androidOntologyIRI + "#PROVIDERMETADATA"));
//
//        // Add properties to the ProviderMetadata individual
//        providerMetadataIndividual.addProperty(RDF.type, ontologyModel.getOntClass(androidOntologyIRI + "#PROVIDERMETADATA"));
//        providerMetadataIndividual.addProperty(ontologyModel.getProperty(androidOntologyIRI + "#url"),
//                providerMetadata.get("url").getAsString());
//        providerMetadataIndividual.addProperty(ontologyModel.getProperty(androidOntologyIRI + "#providerName"),
//                providerMetadata.get("providerName").getAsString());
//
//        // Connect the CVE individual to the ProviderMetadata individual
//        cveIndividual.addProperty(ontologyModel.getProperty(androidOntologyIRI + "#hasProviderMetadata"),
//                providerMetadataIndividual);

        // Create the Reference individual
//        Individual referenceIndividual =
//                createIndividual(cveOntologyIRI,
//                        "#Reference", cveId);

        cveInformationSourceIndividual.addProperty(
                ontologyModel.getProperty(cveOntologyIRI + "#hasReference"),
                references.get("url").getAsString());

        // Connect the CVE individual to the Reference individual
//        cveInformationSourceIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasReference"),
//                referenceIndividual);
//
//        // Create the Solution individual


        try {
            // Create the solutions individual
            if(cna.getAsJsonArray("solutions")!=null) {
                JsonObject solutions = cna.getAsJsonArray("solutions").get(0).getAsJsonObject();
//                Individual solutionIndividual =
//                        createIndividual(cveOntologyIRI,
//                                "#Solution", cveId);

//                solutionIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI
//                                + "#hasDescription"),
//                        solutions.get("value").getAsString());

                // Connect the CVE individual to the Reference individual
                cveInformationSourceIndividual.addProperty(
                        ontologyModel.getProperty(cveOntologyIRI + "#hasSolution"),
                        solutions.get("value").getAsString());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//            if(cna.getAsJsonArray("timeline")!=null) {
//                // Create the reportingHistoryIndividual individual
//                JsonObject solutions = cna.getAsJsonArray("timeline").get(0).getAsJsonObject();
//                Individual reportingHistoryIndividual =
//                        createIndividual(cveOntologyIRI,
//                                "#ReportingHistory", cveId);
//
//                reportingHistoryIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasStatus"),
//                        solutions.get("value").getAsString());
//                reportingHistoryIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasTime"),
//                        solutions.get("time").getAsString());
//
//                // Connect the CVE individual to the Reference individual
//                cveInformationSourceIndividual.addProperty(
//                        ontologyModel.getProperty(cveOntologyIRI + "#hasReportingHistory"),
//                        reportingHistoryIndividual);
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            if(cna.getAsJsonArray("workarounds")!=null) {
                // Create the solutions individual
                JsonObject solutions = cna.getAsJsonArray("workarounds").get(0).getAsJsonObject();
//                Individual solutionIndividual =
//                        createIndividual(cveOntologyIRI,
//                                "#Workaround", cveId);

//                solutionIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasDescription"),
//                        solutions.get("value").getAsString());

                // Connect the CVE individual to the Reference individual
                cveInformationSourceIndividual.addProperty(ontologyModel.getProperty(cveOntologyIRI + "#hasWorkaround"),
                        solutions.get("value").getAsString());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }




        // Save the ontology model to a file
        try {
            FileOutputStream outputStream = new FileOutputStream("generated_cve_ontology.owl");
            ontologyModel.write(outputStream, "RDF/XML-ABBREV");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Ontology creation completed.");
    }
    private static void convertJsonToIndividuals1(JsonObject jsonObject, OntModel ontologyModel) {
        //link the CVE with the cloud provider
        try{
//            if(isTrue) {
                String vendor = "Microsoft";
                String product = "Microsoft Azure Kubernetes Service";
                String product2 = "Docker";
                Individual CloudProviderIndividual = createIndividual(ccOntologyIRI,
                        "#CloudProvider", vendor/*getClearText(affected.get("vendor").getAsString())*/);

                Individual vendor1Individual = createIndividual(cveOntologyIRI,
                        "#ProductVendor", vendor/*getClearText(affected.get("vendor").getAsString())*/);


                CloudProviderIndividual.addProperty(ontologyModel.getProperty(
                        "http://www.w3.org/2002/07/owl#sameAs"),
                        vendor1Individual);

                Individual cloudServiceModelIndividual = createIndividual("http://example.com/cloud",
                        "#PaaS", getClearText(product/*affected.get("product").getAsString()*/));

                CloudProviderIndividual.addProperty(ontologyModel.getProperty(ccOntologyIRI + "#offerService"),
                        cloudServiceModelIndividual);

                Individual component1Individual = createIndividual(ccOntologyIRI,
                        "#ServiceComponent", getClearText(product/*affected.get("product").getAsString()*/));



                Individual product1Individual = createIndividual(cveOntologyIRI,
                        "#Product", getClearText(product)/*getClearText(affected.get("vendor").getAsString())*/);


                component1Individual.addProperty(ontologyModel.getProperty(
                                "http://www.w3.org/2002/07/owl#sameAs"),
                        product1Individual);


                cloudServiceModelIndividual.addProperty(ontologyModel.getProperty(ccOntologyIRI + "#hasComponent"),
                        component1Individual);

                Individual component2Individual = createIndividual(ccOntologyIRI,
                        "#ServiceComponent", getClearText(product2/*affected.get("product").getAsString()*/));

                Individual product2Individual = createIndividual(cveOntologyIRI,
                        "#Product", getClearText(product2)/*getClearText(affected.get("vendor").getAsString())*/);


                component2Individual.addProperty(ontologyModel.getProperty(
                                "http://www.w3.org/2002/07/owl#sameAs"),
                        product2Individual);


                cloudServiceModelIndividual.addProperty(ontologyModel.getProperty(ccOntologyIRI + "#hasComponent"),
                        component2Individual);

                component1Individual.addProperty(ontologyModel.getProperty(ccOntologyIRI + "#componentImpactedByCVE"),
                        createIndividual(cveOntologyIRI, "#CVE", "CVE-2021-24109"));

                component2Individual.addProperty(ontologyModel.getProperty(ccOntologyIRI + "#componentImpactedByCVE"),
                        createIndividual(cveOntologyIRI, "#CVE", "CVE-2019-5736"));

//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Save the ontology model to a file
        try {
            FileOutputStream outputStream = new FileOutputStream("generated_cve_ontology.owl");
            ontologyModel.write(outputStream, "RDF/XML-ABBREV");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Ontology creation completed.");
    }

    private static String getClearText(String id) {
        return id.replaceAll("[^a-zA-Z0-9_.-]", "");
    }

    private static Individual createIndividual(String iri, String name, String id) {
        id = getClearText(id);
        Individual individual = ontologyModel.createIndividual(
                iri + name + "_" + id,
                ontologyModel.getOntClass(
                        iri +
                                name));
        individual.addProperty(RDF.type,
                ontologyModel.getOntClass(
                        iri +
                                name));
        return individual;
    }

    private static String removeSpecialChar(JsonArray platforms) {
        String s = "Centos";
        if (platforms != null)
            for (JsonElement platform : platforms) {
                if (platform.toString().length() > 0)
                    s += "_" + platform.toString();
                else if (platform.getAsString() != null && platform.getAsJsonObject().get("version").getAsString().length() > 0)
                    s += "_" + platform.getAsJsonObject().get("version").getAsString();
            }
        return s.replaceAll("\"", "")
                .replaceAll("\\[", "")
                .replaceAll("]", "")
                .replaceAll(":", "")
                .replaceAll("\\.", "")
                .replaceAll("\\{", "")
                .replaceAll("}", "")
                .replaceAll(" ", "_")
                .replaceAll(",", "_").replaceFirst("_", "");
    }
}
