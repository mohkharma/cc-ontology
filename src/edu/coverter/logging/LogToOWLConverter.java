package edu.coverter.logging;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.*;
import org.apache.jena.ontology.*;

import java.io.*;
import java.util.UUID;

public class LogToOWLConverter {
    public static void main(String[] args) {
        // Read the raw log file
        String logFilePath = "C:\\M.kharma_data\\PhD\\03-Semester-2022\\Threat-modeling\\OdTM-mkharma\\tomcatLogSample.log";
        File logFile = new File(logFilePath);

        // Load the ontology
        OntModel ontModel = ModelFactory.createOntologyModel();
        ontModel.read("C:\\M.kharma_data\\PhD\\03-Semester-2022\\Threat-modeling\\OdTM-mkharma\\CC_Ontology.owl");
//        ontModel.read("C:\\M.kharma_data\\PhD\\03-Semester-2022\\Threat-modeling\\OdTM-mkharma\\loggingSchema.owl");

//
//        // Create an empty OWL ontology
//        OntModel ontModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);

        // Set the namespace and prefix for the ontology
        String ns = "http://birzeit.edu/logging_schema#";
        String prefix = "logont";

        ontModel.setNsPrefix(prefix, ns);

        // Define classes and properties from the ontology
        OntClass logEntryClass = ontModel.createClass(ns + "LogEntry");
        OntClass logLevelClass = ontModel.createClass(ns + "LogLevel");
        OntClass loggerClass = ontModel.createClass(ns + "Logger");
        DatatypeProperty timestampProperty = ontModel.createDatatypeProperty(ns + "hasTimestamp");
        ObjectProperty logLevelProperty = ontModel.createObjectProperty(ns + "hasLevel");
        ObjectProperty componentProperty = ontModel.createObjectProperty(ns + "hasLogger");
        DatatypeProperty messageProperty = ontModel.createDatatypeProperty(ns + "hasMessage");

        // Read the log file and process each log entry
        try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Parse the log entry
                LogEntry logEntry = parseLogEntry(line);

                // Create an individual for the log entry
                Individual logEntryIndividual = ontModel.createIndividual(ns + logEntry.getId(), logEntryClass);
                Individual logLevelIndividual = ontModel.createIndividual(ns + logEntry.getLogLevel(), logLevelClass);
                Individual loggerIndividual = ontModel.createIndividual(ns + logEntry.getComponent(), loggerClass);

                // Set property values for the individual
                logEntryIndividual.addProperty(timestampProperty, logEntry.getTimestamp());
                logEntryIndividual.addProperty(logLevelProperty, logLevelIndividual);
                logEntryIndividual.addProperty(componentProperty, loggerIndividual);
                logEntryIndividual.addProperty(messageProperty, logEntry.getMessage());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Serialize the ontology to XML format
        try (OutputStream outputStream = new FileOutputStream("generated_logging_example.owl")) {
            ontModel.write(outputStream, "RDF/XML-ABBREV");
            ontModel.write(new FileOutputStream("TURTLELogging.owl"), "TURTLE");
        } catch (IOException e) {
            e.printStackTrace();
        }




        try {
            ProcessBuilder processBuilder = new ProcessBuilder("python",
                    ("C:\\M.kharma_data\\PhD\\03-Semester-2022\\Threat-modeling\\OdTM-mkharma\\uploadGraphDB.py"));
//        processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("No errors should be detected" + exitCode);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    // Method to parse a log entry and extract relevant information
    private static LogEntry parseLogEntry(String logEntryString) {
        // Implement your own logic to extract relevant information from the log entry string
        // and create a LogEntry object with the extracted values
        // Here's a simple example assuming a specific log entry format
        String[] parts = logEntryString.split(" ");
        String timestamp = parts[0] + " " + parts[1];
        String logLevel = parts[2].replaceAll("]","").replace("[","");
        String component = parts[3].replaceAll("]","").replace("[","");
        String message = logEntryString.substring(logEntryString.indexOf("]") + 2);
        return new LogEntry(timestamp, logLevel, component, message);
    }

    // Class representing a log entry
    private static class LogEntry {
        private String id;
        private String timestamp;
        private String logLevel;
        private String component;
        private String message;

        public LogEntry(String timestamp, String logLevel, String component, String message) {
            this.id = generateId();
            this.timestamp = timestamp;
            this.logLevel = logLevel;
            this.component = component;
            this.message = message;
        }

        public String getId() {
            return id;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public String getLogLevel() {
            return logLevel;
        }

        public String getComponent() {
            return component;
        }

        public String getMessage() {
            return message;
        }

        private String generateId() {
            return UUID.randomUUID().toString();
        }
    }
}

