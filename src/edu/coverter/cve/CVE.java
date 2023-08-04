package edu.coverter.cve;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

public class CVE {
    private String dataType;
    private String dataVersion;
    private CVEMetadata cveMetadata;
    private Containers containers;

    // Constructor, getters, and setters for all attributes

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public CVEMetadata getCveMetadata() {
        return cveMetadata;
    }

    public void setCveMetadata(CVEMetadata cveMetadata) {
        this.cveMetadata = cveMetadata;
    }

    public Containers getContainers() {
        return containers;
    }

    public void setContainers(Containers containers) {
        this.containers = containers;
    }

    @Override
    public String toString() {
        return "CVE{" +
                "dataType='" + dataType + '\'' +
                ", dataVersion='" + dataVersion + '\'' +
                ", cveMetadata=" + cveMetadata +
                ", containers=" + containers +
                '}';
    }
}

class CVEMetadata {
    private String cveId;
    private String assignerOrgId;
    private String state;
    private String assignerShortName;
    private String dateReserved;
    private String datePublished;

    // Constructor, getters, and setters for all attributes

    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    public String getAssignerOrgId() {
        return assignerOrgId;
    }

    public void setAssignerOrgId(String assignerOrgId) {
        this.assignerOrgId = assignerOrgId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAssignerShortName() {
        return assignerShortName;
    }

    public void setAssignerShortName(String assignerShortName) {
        this.assignerShortName = assignerShortName;
    }

    public String getDateReserved() {
        return dateReserved;
    }

    public void setDateReserved(String dateReserved) {
        this.dateReserved = dateReserved;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    @Override
    public String toString() {
        return "CVEMetadata{" +
                "cveId='" + cveId + '\'' +
                ", assignerOrgId='" + assignerOrgId + '\'' +
                ", state='" + state + '\'' +
                ", assignerShortName='" + assignerShortName + '\'' +
                ", dateReserved='" + dateReserved + '\'' +
                ", datePublished='" + datePublished + '\'' +
                '}';
    }
}

class Containers {
    private CNA cna;

    // Constructor, getters, and setters for all attributes

    public CNA getCna() {
        return cna;
    }

    public void setCna(CNA cna) {
        this.cna = cna;
    }

    @Override
    public String toString() {
        return "Containers{" +
                "cna=" + cna +
                '}';
    }
}

class CNA {
    private List<Affected> affected;
    private List<Credit> credits;
    private String datePublic;
    private List<Description> descriptions;
    private List<Metric> metrics;
    private List<ProblemType> problemTypes;
    private ProviderMetadata providerMetadata;
    private List<Reference> references;
    private List<Solution> solutions;
    private Source source;
    private List<Timeline> timeline;
    private String title;
    private List<Workaround> workarounds;
    @JsonIgnoreProperties
    private Xgenerator xgenerator;

    // Constructor, getters, and setters for all attributes

    public List<Affected> getAffected() {
        return affected;
    }

    public void setAffected(List<Affected> affected) {
        this.affected = affected;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    public String getDatePublic() {
        return datePublic;
    }

    public void setDatePublic(String datePublic) {
        this.datePublic = datePublic;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public List<Metric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<Metric> metrics) {
        this.metrics = metrics;
    }

    public List<ProblemType> getProblemTypes() {
        return problemTypes;
    }

    public void setProblemTypes(List<ProblemType> problemTypes) {
        this.problemTypes = problemTypes;
    }

    public ProviderMetadata getProviderMetadata() {
        return providerMetadata;
    }

    public void setProviderMetadata(ProviderMetadata providerMetadata) {
        this.providerMetadata = providerMetadata;
    }

    public List<Reference> getReferences() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    public List<Solution> getSolutions() {
        return solutions;
    }

    public void setSolutions(List<Solution> solutions) {
        this.solutions = solutions;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public List<Timeline> getTimeline() {
        return timeline;
    }

    public void setTimeline(List<Timeline> timeline) {
        this.timeline = timeline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Workaround> getWorkarounds() {
        return workarounds;
    }

    public void setWorkarounds(List<Workaround> workarounds) {
        this.workarounds = workarounds;
    }

    public Xgenerator getXgenerator() {
        return xgenerator;
    }

    public void setXgenerator(Xgenerator xgenerator) {
        this.xgenerator = xgenerator;
    }

    @Override
    public String toString() {
        return "CNA{" +
                "affected=" + affected +
                ", credits=" + credits +
                ", datePublic='" + datePublic + '\'' +
                ", descriptions=" + descriptions +
                ", metrics=" + metrics +
                ", problemTypes=" + problemTypes +
                ", providerMetadata=" + providerMetadata +
                ", references=" + references +
                ", solutions=" + solutions +
                ", source=" + source +
                ", timeline=" + timeline +
                ", title='" + title + '\'' +
                ", workarounds=" + workarounds +
                ", xgenerator=" + xgenerator +
                '}';
    }
}

class Affected {
    private String defaultStatus;
    private List<String> platforms;
    private String product;
    private String vendor;
    private List<Version> versions;

    // Constructor, getters, and setters for all attributes

    public String getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(String defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public List<String> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<String> platforms) {
        this.platforms = platforms;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public void setVersions(List<Version> versions) {
        this.versions = versions;
    }

    @Override
    public String toString() {
        return "Affected{" +
                "defaultStatus='" + defaultStatus + '\'' +
                ", platforms=" + platforms +
                ", product='" + product + '\'' +
                ", vendor='" + vendor + '\'' +
                ", versions=" + versions +
                '}';
    }
}

class Version {
    private String status;
    private String version;
    private String lessThan;
    private String versionType;
    private List<Change> changes;

    // Constructor, getters, and setters for all attributes

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLessThan() {
        return lessThan;
    }

    public void setLessThan(String lessThan) {
        this.lessThan = lessThan;
    }

    public String getVersionType() {
        return versionType;
    }

    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }

    public List<Change> getChanges() {
        return changes;
    }

    public void setChanges(List<Change> changes) {
        this.changes = changes;
    }

    @Override
    public String toString() {
        return "Version{" +
                "status='" + status + '\'' +
                ", version='" + version + '\'' +
                ", lessThan='" + lessThan + '\'' +
                ", versionType='" + versionType + '\'' +
                ", changes=" + changes +
                '}';
    }
}

class Change {
    private String at;
    private String status;

    // Constructor, getters, and setters for all attributes

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Change{" +
                "at='" + at + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

class Credit {
    private String lang;
    private String type;
    private String user;
    private String value;

    // Constructor, getters, and setters for all attributes

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "lang='" + lang + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

class Description {
    private String lang;
    private String cweId;
    private String type;
    private String description;
    private List<SupportingMedia> supportingMedia;
    private String value;

    // Constructor, getters, and setters for all attributes

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<SupportingMedia> getSupportingMedia() {
        return supportingMedia;
    }

    public void setSupportingMedia(List<SupportingMedia> supportingMedia) {
        this.supportingMedia = supportingMedia;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCweId() {
        return cweId;
    }

    public void setCweId(String cweId) {
        this.cweId = cweId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Description{" +
                "lang='" + lang + '\'' +
                ", cweId='" + cweId + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", supportingMedia=" + supportingMedia +
                ", value='" + value + '\'' +
                '}';
    }
}

class SupportingMedia {
    private boolean base64;
    private String type;
    private String value;

    // Constructor, getters, and setters for all attributes

    public boolean isBase64() {
        return base64;
    }

    public void setBase64(boolean base64) {
        this.base64 = base64;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SupportingMedia{" +
                "base64=" + base64 +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

class Metric {
    private CVSSV3_1 cvssV3_1;
    private String format;
    private List<Scenario> scenarios;

    // Constructor, getters, and setters for all attributes

    public CVSSV3_1 getCvssV3_1() {
        return cvssV3_1;
    }

    public void setCvssV3_1(CVSSV3_1 cvssV3_1) {
        this.cvssV3_1 = cvssV3_1;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<Scenario> getScenarios() {
        return scenarios;
    }

    public void setScenarios(List<Scenario> scenarios) {
        this.scenarios = scenarios;
    }

    @Override
    public String toString() {
        return "Metric{" +
                "cvssV3_1=" + cvssV3_1 +
                ", format='" + format + '\'' +
                ", scenarios=" + scenarios +
                '}';
    }
}

class CVSSV3_1 {
    private String attackComplexity;
    private String attackVector;
    private String availabilityImpact;
    private int baseScore;
    private String baseSeverity;
    private String confidentialityImpact;
    private String integrityImpact;
    private String privilegesRequired;
    private String scope;
    private String userInteraction;
    private String vectorString;
    private String version;

    // Constructor, getters, and setters for all attributes

    public String getAttackComplexity() {
        return attackComplexity;
    }

    public void setAttackComplexity(String attackComplexity) {
        this.attackComplexity = attackComplexity;
    }

    public String getAttackVector() {
        return attackVector;
    }

    public void setAttackVector(String attackVector) {
        this.attackVector = attackVector;
    }

    public String getAvailabilityImpact() {
        return availabilityImpact;
    }

    public void setAvailabilityImpact(String availabilityImpact) {
        this.availabilityImpact = availabilityImpact;
    }

    public int getBaseScore() {
        return baseScore;
    }

    public void setBaseScore(int baseScore) {
        this.baseScore = baseScore;
    }

    public String getBaseSeverity() {
        return baseSeverity;
    }

    public void setBaseSeverity(String baseSeverity) {
        this.baseSeverity = baseSeverity;
    }

    public String getConfidentialityImpact() {
        return confidentialityImpact;
    }

    public void setConfidentialityImpact(String confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact;
    }

    public String getIntegrityImpact() {
        return integrityImpact;
    }

    public void setIntegrityImpact(String integrityImpact) {
        this.integrityImpact = integrityImpact;
    }

    public String getPrivilegesRequired() {
        return privilegesRequired;
    }

    public void setPrivilegesRequired(String privilegesRequired) {
        this.privilegesRequired = privilegesRequired;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getUserInteraction() {
        return userInteraction;
    }

    public void setUserInteraction(String userInteraction) {
        this.userInteraction = userInteraction;
    }

    public String getVectorString() {
        return vectorString;
    }

    public void setVectorString(String vectorString) {
        this.vectorString = vectorString;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "CVSSV3_1{" +
                "attackComplexity='" + attackComplexity + '\'' +
                ", attackVector='" + attackVector + '\'' +
                ", availabilityImpact='" + availabilityImpact + '\'' +
                ", baseScore=" + baseScore +
                ", baseSeverity='" + baseSeverity + '\'' +
                ", confidentialityImpact='" + confidentialityImpact + '\'' +
                ", integrityImpact='" + integrityImpact + '\'' +
                ", privilegesRequired='" + privilegesRequired + '\'' +
                ", scope='" + scope + '\'' +
                ", userInteraction='" + userInteraction + '\'' +
                ", vectorString='" + vectorString + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}

class Scenario {
    private String lang;
    private String value;

    // Constructor, getters, and setters for all attributes

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Scenario{" +
                "lang='" + lang + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

class ProblemType {
    private List<Description> descriptions;

    // Constructor, getters, and setters for all attributes

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "ProblemType{" +
                "descriptions=" + descriptions +
                '}';
    }
}

class ProviderMetadata {
    private String orgId;
    private String shortName;
    private String dateUpdated;

    // Constructor, getters, and setters for all attributes

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "ProviderMetadata{" +
                "orgId='" + orgId + '\'' +
                ", shortName='" + shortName + '\'' +
                ", dateUpdated='" + dateUpdated + '\'' +
                '}';
    }
}

class Reference {
    private String url;

    // Constructor, getters, and setters for all attributes

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Reference{" +
                "url='" + url + '\'' +
                '}';
    }
}

class Solution {
    private String lang;
    private List<SupportingMedia> supportingMedia;
    private String value;

    // Constructor, getters, and setters for all attributes

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<SupportingMedia> getSupportingMedia() {
        return supportingMedia;
    }

    public void setSupportingMedia(List<SupportingMedia> supportingMedia) {
        this.supportingMedia = supportingMedia;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "lang='" + lang + '\'' +
                ", supportingMedia=" + supportingMedia +
                ", value='" + value + '\'' +
                '}';
    }
}

class Source {
    private List<String> defect;
    private String discovery;

    // Constructor, getters, and setters for all attributes

    public List<String> getDefect() {
        return defect;
    }

    public void setDefect(List<String> defect) {
        this.defect = defect;
    }

    public String getDiscovery() {
        return discovery;
    }

    public void setDiscovery(String discovery) {
        this.discovery = discovery;
    }

    @Override
    public String toString() {
        return "Source{" +
                "defect=" + defect +
                ", discovery='" + discovery + '\'' +
                '}';
    }
}

class Timeline {
    private String lang;
    private String time;
    private String value;

    // Constructor, getters, and setters for all attributes

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Timeline{" +
                "lang='" + lang + '\'' +
                ", time='" + time + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

class Workaround {
    private String lang;
    private List<SupportingMedia> supportingMedia;
    private String value;

    // Constructor, getters, and setters for all attributes

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<SupportingMedia> getSupportingMedia() {
        return supportingMedia;
    }

    public void setSupportingMedia(List<SupportingMedia> supportingMedia) {
        this.supportingMedia = supportingMedia;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Workaround{" +
                "lang='" + lang + '\'' +
                ", supportingMedia=" + supportingMedia +
                ", value='" + value + '\'' +
                '}';
    }
}

class Xgenerator {
    private String engine;

    // Constructor, getters, and setters for all attributes

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Xgenerator{" +
                "engine='" + engine + '\'' +
                '}';
    }
}
