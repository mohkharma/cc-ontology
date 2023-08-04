
package edu.coverter.apm.pojo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key",
    "applicationName",
    "category",
    "serviceType",
    "serviceTypeCode",
    "isWas",
    "isQueue",
    "isAuthorized",
    "totalCount",
    "errorCount",
    "slowCount",
    "hasAlert",
    "responseStatistics",
    "histogram",
    "apdexScore",
    "apdexFormula",
    "timeSeriesHistogram",
    "instanceCount",
    "instanceErrorCount",
    "agentIds",
    "agentIdNameMap"
})
@Generated("jsonschema2pojo")
public class NodeDataArray {

    @JsonProperty("key")
    private String key;
    @JsonProperty("applicationName")
    private String applicationName;
    @JsonProperty("category")
    private String category;
    @JsonProperty("serviceType")
    private String serviceType;
    @JsonProperty("serviceTypeCode")
    private String serviceTypeCode;
    @JsonProperty("isWas")
    private Boolean isWas;
    @JsonProperty("isQueue")
    private Boolean isQueue;
    @JsonProperty("isAuthorized")
    private Boolean isAuthorized;
    @JsonProperty("totalCount")
    private Long totalCount;
    @JsonProperty("errorCount")
    private Long errorCount;
    @JsonProperty("slowCount")
    private Long slowCount;
    @JsonProperty("hasAlert")
    private Boolean hasAlert;
    @JsonProperty("responseStatistics")
    private ResponseStatistics__1 responseStatistics;
    @JsonProperty("histogram")
    private Histogram__1 histogram;
    @JsonProperty("apdexScore")
    private Double apdexScore;
    @JsonProperty("apdexFormula")
    private ApdexFormula apdexFormula;
    @JsonProperty("timeSeriesHistogram")
    private List<TimeSeriesHistogram__1> timeSeriesHistogram = new ArrayList<TimeSeriesHistogram__1>();
    @JsonProperty("instanceCount")
    private Long instanceCount;
    @JsonProperty("instanceErrorCount")
    private Long instanceErrorCount;
    @JsonProperty("agentIds")
    private List<String> agentIds = new ArrayList<String>();
    @JsonProperty("agentIdNameMap")
    private AgentIdNameMap agentIdNameMap;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public NodeDataArray withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("applicationName")
    public String getApplicationName() {
        return applicationName;
    }

    @JsonProperty("applicationName")
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public NodeDataArray withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public NodeDataArray withCategory(String category) {
        this.category = category;
        return this;
    }

    @JsonProperty("serviceType")
    public String getServiceType() {
        return serviceType;
    }

    @JsonProperty("serviceType")
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public NodeDataArray withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    @JsonProperty("serviceTypeCode")
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    @JsonProperty("serviceTypeCode")
    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public NodeDataArray withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    @JsonProperty("isWas")
    public Boolean getIsWas() {
        return isWas;
    }

    @JsonProperty("isWas")
    public void setIsWas(Boolean isWas) {
        this.isWas = isWas;
    }

    public NodeDataArray withIsWas(Boolean isWas) {
        this.isWas = isWas;
        return this;
    }

    @JsonProperty("isQueue")
    public Boolean getIsQueue() {
        return isQueue;
    }

    @JsonProperty("isQueue")
    public void setIsQueue(Boolean isQueue) {
        this.isQueue = isQueue;
    }

    public NodeDataArray withIsQueue(Boolean isQueue) {
        this.isQueue = isQueue;
        return this;
    }

    @JsonProperty("isAuthorized")
    public Boolean getIsAuthorized() {
        return isAuthorized;
    }

    @JsonProperty("isAuthorized")
    public void setIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    public NodeDataArray withIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }

    @JsonProperty("totalCount")
    public Long getTotalCount() {
        return totalCount;
    }

    @JsonProperty("totalCount")
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public NodeDataArray withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @JsonProperty("errorCount")
    public Long getErrorCount() {
        return errorCount;
    }

    @JsonProperty("errorCount")
    public void setErrorCount(Long errorCount) {
        this.errorCount = errorCount;
    }

    public NodeDataArray withErrorCount(Long errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    @JsonProperty("slowCount")
    public Long getSlowCount() {
        return slowCount;
    }

    @JsonProperty("slowCount")
    public void setSlowCount(Long slowCount) {
        this.slowCount = slowCount;
    }

    public NodeDataArray withSlowCount(Long slowCount) {
        this.slowCount = slowCount;
        return this;
    }

    @JsonProperty("hasAlert")
    public Boolean getHasAlert() {
        return hasAlert;
    }

    @JsonProperty("hasAlert")
    public void setHasAlert(Boolean hasAlert) {
        this.hasAlert = hasAlert;
    }

    public NodeDataArray withHasAlert(Boolean hasAlert) {
        this.hasAlert = hasAlert;
        return this;
    }

    @JsonProperty("responseStatistics")
    public ResponseStatistics__1 getResponseStatistics() {
        return responseStatistics;
    }

    @JsonProperty("responseStatistics")
    public void setResponseStatistics(ResponseStatistics__1 responseStatistics1) {
        responseStatistics = responseStatistics1;
    }

    public NodeDataArray withResponseStatistics(ResponseStatistics__1 responseStatistics1) {
        responseStatistics = responseStatistics1;
        return this;
    }

    @JsonProperty("histogram")
    public Histogram__1 getHistogram() {
        return histogram;
    }

    @JsonProperty("histogram")
    public void setHistogram(Histogram__1 histogram1) {
        histogram = histogram1;
    }

    public NodeDataArray withHistogram(Histogram__1 histogram1) {
        histogram = histogram1;
        return this;
    }

    @JsonProperty("apdexScore")
    public Double getApdexScore() {
        return apdexScore;
    }

    @JsonProperty("apdexScore")
    public void setApdexScore(Double apdexScore) {
        this.apdexScore = apdexScore;
    }

    public NodeDataArray withApdexScore(Double apdexScore) {
        this.apdexScore = apdexScore;
        return this;
    }

    @JsonProperty("apdexFormula")
    public ApdexFormula getApdexFormula() {
        return apdexFormula;
    }

    @JsonProperty("apdexFormula")
    public void setApdexFormula(ApdexFormula apdexFormula1) {
        apdexFormula = apdexFormula1;
    }

    public NodeDataArray withApdexFormula(ApdexFormula apdexFormula1) {
        apdexFormula = apdexFormula1;
        return this;
    }

    @JsonProperty("timeSeriesHistogram")
    public List<TimeSeriesHistogram__1> getTimeSeriesHistogram() {
        return timeSeriesHistogram;
    }

    @JsonProperty("timeSeriesHistogram")
    public void setTimeSeriesHistogram(List<TimeSeriesHistogram__1> timeSeriesHistogram) {
        this.timeSeriesHistogram = timeSeriesHistogram;
    }

    public NodeDataArray withTimeSeriesHistogram(List<TimeSeriesHistogram__1> timeSeriesHistogram) {
        this.timeSeriesHistogram = timeSeriesHistogram;
        return this;
    }

    @JsonProperty("instanceCount")
    public Long getInstanceCount() {
        return instanceCount;
    }

    @JsonProperty("instanceCount")
    public void setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
    }

    public NodeDataArray withInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    @JsonProperty("instanceErrorCount")
    public Long getInstanceErrorCount() {
        return instanceErrorCount;
    }

    @JsonProperty("instanceErrorCount")
    public void setInstanceErrorCount(Long instanceErrorCount) {
        this.instanceErrorCount = instanceErrorCount;
    }

    public NodeDataArray withInstanceErrorCount(Long instanceErrorCount) {
        this.instanceErrorCount = instanceErrorCount;
        return this;
    }

    @JsonProperty("agentIds")
    public List<String> getAgentIds() {
        return agentIds;
    }

    @JsonProperty("agentIds")
    public void setAgentIds(List<String> agentIds) {
        this.agentIds = agentIds;
    }

    public NodeDataArray withAgentIds(List<String> agentIds) {
        this.agentIds = agentIds;
        return this;
    }

    @JsonProperty("agentIdNameMap")
    public AgentIdNameMap getAgentIdNameMap() {
        return agentIdNameMap;
    }

    @JsonProperty("agentIdNameMap")
    public void setAgentIdNameMap(AgentIdNameMap agentIdNameMap1) {
        agentIdNameMap = agentIdNameMap1;
    }

    public NodeDataArray withAgentIdNameMap(AgentIdNameMap agentIdNameMap1) {
        agentIdNameMap = agentIdNameMap1;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public NodeDataArray withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NodeDataArray.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("applicationName");
        sb.append('=');
        sb.append(((this.applicationName == null)?"<null>":this.applicationName));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("serviceTypeCode");
        sb.append('=');
        sb.append(((this.serviceTypeCode == null)?"<null>":this.serviceTypeCode));
        sb.append(',');
        sb.append("isWas");
        sb.append('=');
        sb.append(((this.isWas == null)?"<null>":this.isWas));
        sb.append(',');
        sb.append("isQueue");
        sb.append('=');
        sb.append(((this.isQueue == null)?"<null>":this.isQueue));
        sb.append(',');
        sb.append("isAuthorized");
        sb.append('=');
        sb.append(((this.isAuthorized == null)?"<null>":this.isAuthorized));
        sb.append(',');
        sb.append("totalCount");
        sb.append('=');
        sb.append(((this.totalCount == null)?"<null>":this.totalCount));
        sb.append(',');
        sb.append("errorCount");
        sb.append('=');
        sb.append(((this.errorCount == null)?"<null>":this.errorCount));
        sb.append(',');
        sb.append("slowCount");
        sb.append('=');
        sb.append(((this.slowCount == null)?"<null>":this.slowCount));
        sb.append(',');
        sb.append("hasAlert");
        sb.append('=');
        sb.append(((this.hasAlert == null)?"<null>":this.hasAlert));
        sb.append(',');
        sb.append("responseStatistics");
        sb.append('=');
        sb.append(((this.responseStatistics == null)?"<null>":this.responseStatistics));
        sb.append(',');
        sb.append("histogram");
        sb.append('=');
        sb.append(((this.histogram == null)?"<null>":this.histogram));
        sb.append(',');
        sb.append("apdexScore");
        sb.append('=');
        sb.append(((this.apdexScore == null)?"<null>":this.apdexScore));
        sb.append(',');
        sb.append("apdexFormula");
        sb.append('=');
        sb.append(((this.apdexFormula == null)?"<null>":this.apdexFormula));
        sb.append(',');
        sb.append("timeSeriesHistogram");
        sb.append('=');
        sb.append(((this.timeSeriesHistogram == null)?"<null>":this.timeSeriesHistogram));
        sb.append(',');
        sb.append("instanceCount");
        sb.append('=');
        sb.append(((this.instanceCount == null)?"<null>":this.instanceCount));
        sb.append(',');
        sb.append("instanceErrorCount");
        sb.append('=');
        sb.append(((this.instanceErrorCount == null)?"<null>":this.instanceErrorCount));
        sb.append(',');
        sb.append("agentIds");
        sb.append('=');
        sb.append(((this.agentIds == null)?"<null>":this.agentIds));
        sb.append(',');
        sb.append("agentIdNameMap");
        sb.append('=');
        sb.append(((this.agentIdNameMap == null)?"<null>":this.agentIdNameMap));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
//
//    @Override
//    public int hashCode() {
//        int result = 1;
//        result = ((result* 31)+((this.serviceType == null)? 0 :this.serviceType.hashCode()));
//        result = ((result* 31)+((this.isWas == null)? 0 :this.isWas.hashCode()));
//        result = ((result* 31)+((this.timeSeriesHistogram == null)? 0 :this.timeSeriesHistogram.hashCode()));
//        result = ((result* 31)+((this.agentIds == null)? 0 :this.agentIds.hashCode()));
//        result = ((result* 31)+((this.agentIdNameMap == null)? 0 :this.agentIdNameMap.hashCode()));
//        result = ((result* 31)+((this.instanceErrorCount == null)? 0 :this.instanceErrorCount.hashCode()));
//        result = ((result* 31)+((this.responseStatistics == null)? 0 :this.responseStatistics.hashCode()));
//        result = ((result* 31)+((this.slowCount == null)? 0 :this.slowCount.hashCode()));
//        result = ((result* 31)+((this.totalCount == null)? 0 :this.totalCount.hashCode()));
//        result = ((result* 31)+((this.apdexFormula == null)? 0 :this.apdexFormula.hashCode()));
//        result = ((result* 31)+((this.isQueue == null)? 0 :this.isQueue.hashCode()));
//        result = ((result* 31)+((this.histogram == null)? 0 :this.histogram.hashCode()));
//        result = ((result* 31)+((this.isAuthorized == null)? 0 :this.isAuthorized.hashCode()));
//        result = ((result* 31)+((this.instanceCount == null)? 0 :this.instanceCount.hashCode()));
//        result = ((result* 31)+((this.hasAlert == null)? 0 :this.hasAlert.hashCode()));
//        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
//        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
//        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
//        result = ((result* 31)+((this.applicationName == null)? 0 :this.applicationName.hashCode()));
//        result = ((result* 31)+((this.errorCount == null)? 0 :this.errorCount.hashCode()));
//        result = ((result* 31)+((this.serviceTypeCode == null)? 0 :this.serviceTypeCode.hashCode()));
//        result = ((result* 31)+((this.apdexScore == null)? 0 :this.apdexScore.hashCode()));
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof NodeDataArray) == false) {
//            return false;
//        }
//        NodeDataArray rhs = ((NodeDataArray) other);
//        return (((((((((((((((((((((((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType)))&&((this.isWas == rhs.isWas)||((this.isWas!= null)&&this.isWas.equals(rhs.isWas))))&&((this.timeSeriesHistogram == rhs.timeSeriesHistogram)||((this.timeSeriesHistogram!= null)&&this.timeSeriesHistogram.equals(rhs.timeSeriesHistogram))))&&((this.agentIds == rhs.agentIds)||((this.agentIds!= null)&&this.agentIds.equals(rhs.agentIds))))&&((this.agentIdNameMap == rhs.agentIdNameMap)||((this.agentIdNameMap!= null)&&this.agentIdNameMap.equals(rhs.agentIdNameMap))))&&((this.instanceErrorCount == rhs.instanceErrorCount)||((this.instanceErrorCount!= null)&&this.instanceErrorCount.equals(rhs.instanceErrorCount))))&&((this.responseStatistics == rhs.responseStatistics)||((this.responseStatistics!= null)&&this.responseStatistics.equals(rhs.responseStatistics))))&&((this.slowCount == rhs.slowCount)||((this.slowCount!= null)&&this.slowCount.equals(rhs.slowCount))))&&((this.totalCount == rhs.totalCount)||((this.totalCount!= null)&&this.totalCount.equals(rhs.totalCount))))&&((this.apdexFormula == rhs.apdexFormula)||((this.apdexFormula!= null)&&this.apdexFormula.equals(rhs.apdexFormula))))&&((this.isQueue == rhs.isQueue)||((this.isQueue!= null)&&this.isQueue.equals(rhs.isQueue))))&&((this.histogram == rhs.histogram)||((this.histogram!= null)&&this.histogram.equals(rhs.histogram))))&&((this.isAuthorized == rhs.isAuthorized)||((this.isAuthorized!= null)&&this.isAuthorized.equals(rhs.isAuthorized))))&&((this.instanceCount == rhs.instanceCount)||((this.instanceCount!= null)&&this.instanceCount.equals(rhs.instanceCount))))&&((this.hasAlert == rhs.hasAlert)||((this.hasAlert!= null)&&this.hasAlert.equals(rhs.hasAlert))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))))&&((this.applicationName == rhs.applicationName)||((this.applicationName!= null)&&this.applicationName.equals(rhs.applicationName))))&&((this.errorCount == rhs.errorCount)||((this.errorCount!= null)&&this.errorCount.equals(rhs.errorCount))))&&((this.serviceTypeCode == rhs.serviceTypeCode)||((this.serviceTypeCode!= null)&&this.serviceTypeCode.equals(rhs.serviceTypeCode))))&&((this.apdexScore == rhs.apdexScore)||((this.apdexScore!= null)&&this.apdexScore.equals(rhs.apdexScore))));
//    }

}
