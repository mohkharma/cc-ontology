
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
    "from",
    "to",
    "fromAgent",
    "toAgent",
    "fromAgentIdNameMap",
    "toAgentIdNameMap",
    "sourceInfo",
    "targetInfo",
    "filterApplicationName",
    "filterApplicationServiceTypeCode",
    "filterApplicationServiceTypeName",
    "filterTargetRpcList",
    "totalCount",
    "errorCount",
    "slowCount",
    "responseStatistics",
    "histogram",
    "timeSeriesHistogram",
    "hasAlert"
})
@Generated("jsonschema2pojo")
public class LinkDataArray {

    @JsonProperty("key")
    private String key;
    @JsonProperty("from")
    private String from;
    @JsonProperty("to")
    private String to;
    @JsonProperty("fromAgent")
    private List<String> fromAgent = new ArrayList<String>();
    @JsonProperty("toAgent")
    private List<String> toAgent = new ArrayList<String>();
    @JsonProperty("fromAgentIdNameMap")
    private FromAgentIdNameMap fromAgentIdNameMap;
    @JsonProperty("toAgentIdNameMap")
    private ToAgentIdNameMap toAgentIdNameMap;
    @JsonProperty("sourceInfo")
    private SourceInfo sourceInfo;
    @JsonProperty("targetInfo")
    private TargetInfo targetInfo;
    @JsonProperty("filterApplicationName")
    private String filterApplicationName;
    @JsonProperty("filterApplicationServiceTypeCode")
    private Long filterApplicationServiceTypeCode;
    @JsonProperty("filterApplicationServiceTypeName")
    private String filterApplicationServiceTypeName;
    @JsonProperty("filterTargetRpcList")
    private List<FilterTargetRpc> filterTargetRpcList = new ArrayList<FilterTargetRpc>();
    @JsonProperty("totalCount")
    private Long totalCount;
    @JsonProperty("errorCount")
    private Long errorCount;
    @JsonProperty("slowCount")
    private Long slowCount;
    @JsonProperty("responseStatistics")
    private ResponseStatistics responseStatistics;
    @JsonProperty("histogram")
    private Histogram histogram;
    @JsonProperty("timeSeriesHistogram")
    private List<TimeSeriesHistogram> timeSeriesHistogram = new ArrayList<TimeSeriesHistogram>();
    @JsonProperty("hasAlert")
    private Boolean hasAlert;
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

    public LinkDataArray withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    public LinkDataArray withFrom(String from) {
        this.from = from;
        return this;
    }

    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    public LinkDataArray withTo(String to) {
        this.to = to;
        return this;
    }

    @JsonProperty("fromAgent")
    public List<String> getFromAgent() {
        return fromAgent;
    }

    @JsonProperty("fromAgent")
    public void setFromAgent(List<String> fromAgent) {
        this.fromAgent = fromAgent;
    }

    public LinkDataArray withFromAgent(List<String> fromAgent) {
        this.fromAgent = fromAgent;
        return this;
    }

    @JsonProperty("toAgent")
    public List<String> getToAgent() {
        return toAgent;
    }

    @JsonProperty("toAgent")
    public void setToAgent(List<String> toAgent) {
        this.toAgent = toAgent;
    }

    public LinkDataArray withToAgent(List<String> toAgent) {
        this.toAgent = toAgent;
        return this;
    }

    @JsonProperty("fromAgentIdNameMap")
    public FromAgentIdNameMap getFromAgentIdNameMap() {
        return fromAgentIdNameMap;
    }

    @JsonProperty("fromAgentIdNameMap")
    public void setFromAgentIdNameMap(FromAgentIdNameMap fromAgentIdNameMap) {
        this.fromAgentIdNameMap = fromAgentIdNameMap;
    }

    public LinkDataArray withFromAgentIdNameMap(FromAgentIdNameMap fromAgentIdNameMap) {
        this.fromAgentIdNameMap = fromAgentIdNameMap;
        return this;
    }

    @JsonProperty("toAgentIdNameMap")
    public ToAgentIdNameMap getToAgentIdNameMap() {
        return toAgentIdNameMap;
    }

    @JsonProperty("toAgentIdNameMap")
    public void setToAgentIdNameMap(ToAgentIdNameMap toAgentIdNameMap) {
        this.toAgentIdNameMap = toAgentIdNameMap;
    }

    public LinkDataArray withToAgentIdNameMap(ToAgentIdNameMap toAgentIdNameMap) {
        this.toAgentIdNameMap = toAgentIdNameMap;
        return this;
    }

    @JsonProperty("sourceInfo")
    public SourceInfo getSourceInfo() {
        return sourceInfo;
    }

    @JsonProperty("sourceInfo")
    public void setSourceInfo(SourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    public LinkDataArray withSourceInfo(SourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    @JsonProperty("targetInfo")
    public TargetInfo getTargetInfo() {
        return targetInfo;
    }

    @JsonProperty("targetInfo")
    public void setTargetInfo(TargetInfo targetInfo) {
        this.targetInfo = targetInfo;
    }

    public LinkDataArray withTargetInfo(TargetInfo targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }

    @JsonProperty("filterApplicationName")
    public String getFilterApplicationName() {
        return filterApplicationName;
    }

    @JsonProperty("filterApplicationName")
    public void setFilterApplicationName(String filterApplicationName) {
        this.filterApplicationName = filterApplicationName;
    }

    public LinkDataArray withFilterApplicationName(String filterApplicationName) {
        this.filterApplicationName = filterApplicationName;
        return this;
    }

    @JsonProperty("filterApplicationServiceTypeCode")
    public Long getFilterApplicationServiceTypeCode() {
        return filterApplicationServiceTypeCode;
    }

    @JsonProperty("filterApplicationServiceTypeCode")
    public void setFilterApplicationServiceTypeCode(Long filterApplicationServiceTypeCode) {
        this.filterApplicationServiceTypeCode = filterApplicationServiceTypeCode;
    }

    public LinkDataArray withFilterApplicationServiceTypeCode(Long filterApplicationServiceTypeCode) {
        this.filterApplicationServiceTypeCode = filterApplicationServiceTypeCode;
        return this;
    }

    @JsonProperty("filterApplicationServiceTypeName")
    public String getFilterApplicationServiceTypeName() {
        return filterApplicationServiceTypeName;
    }

    @JsonProperty("filterApplicationServiceTypeName")
    public void setFilterApplicationServiceTypeName(String filterApplicationServiceTypeName) {
        this.filterApplicationServiceTypeName = filterApplicationServiceTypeName;
    }

    public LinkDataArray withFilterApplicationServiceTypeName(String filterApplicationServiceTypeName) {
        this.filterApplicationServiceTypeName = filterApplicationServiceTypeName;
        return this;
    }

    @JsonProperty("filterTargetRpcList")
    public List<FilterTargetRpc> getFilterTargetRpcList() {
        return filterTargetRpcList;
    }

    @JsonProperty("filterTargetRpcList")
    public void setFilterTargetRpcList(List<FilterTargetRpc> filterTargetRpcList) {
        this.filterTargetRpcList = filterTargetRpcList;
    }

    public LinkDataArray withFilterTargetRpcList(List<FilterTargetRpc> filterTargetRpcList) {
        this.filterTargetRpcList = filterTargetRpcList;
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

    public LinkDataArray withTotalCount(Long totalCount) {
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

    public LinkDataArray withErrorCount(Long errorCount) {
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

    public LinkDataArray withSlowCount(Long slowCount) {
        this.slowCount = slowCount;
        return this;
    }

    @JsonProperty("responseStatistics")
    public ResponseStatistics getResponseStatistics() {
        return responseStatistics;
    }

    @JsonProperty("responseStatistics")
    public void setResponseStatistics(ResponseStatistics responseStatistics) {
        this.responseStatistics = responseStatistics;
    }

    public LinkDataArray withResponseStatistics(ResponseStatistics responseStatistics) {
        this.responseStatistics = responseStatistics;
        return this;
    }

    @JsonProperty("histogram")
    public Histogram getHistogram() {
        return histogram;
    }

    @JsonProperty("histogram")
    public void setHistogram(Histogram histogram) {
        this.histogram = histogram;
    }

    public LinkDataArray withHistogram(Histogram histogram) {
        this.histogram = histogram;
        return this;
    }

    @JsonProperty("timeSeriesHistogram")
    public List<TimeSeriesHistogram> getTimeSeriesHistogram() {
        return timeSeriesHistogram;
    }

    @JsonProperty("timeSeriesHistogram")
    public void setTimeSeriesHistogram(List<TimeSeriesHistogram> timeSeriesHistogram) {
        this.timeSeriesHistogram = timeSeriesHistogram;
    }

    public LinkDataArray withTimeSeriesHistogram(List<TimeSeriesHistogram> timeSeriesHistogram) {
        this.timeSeriesHistogram = timeSeriesHistogram;
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

    public LinkDataArray withHasAlert(Boolean hasAlert) {
        this.hasAlert = hasAlert;
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

    public LinkDataArray withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LinkDataArray.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("to");
        sb.append('=');
        sb.append(((this.to == null)?"<null>":this.to));
        sb.append(',');
        sb.append("fromAgent");
        sb.append('=');
        sb.append(((this.fromAgent == null)?"<null>":this.fromAgent));
        sb.append(',');
        sb.append("toAgent");
        sb.append('=');
        sb.append(((this.toAgent == null)?"<null>":this.toAgent));
        sb.append(',');
        sb.append("fromAgentIdNameMap");
        sb.append('=');
        sb.append(((this.fromAgentIdNameMap == null)?"<null>":this.fromAgentIdNameMap));
        sb.append(',');
        sb.append("toAgentIdNameMap");
        sb.append('=');
        sb.append(((this.toAgentIdNameMap == null)?"<null>":this.toAgentIdNameMap));
        sb.append(',');
        sb.append("sourceInfo");
        sb.append('=');
        sb.append(((this.sourceInfo == null)?"<null>":this.sourceInfo));
        sb.append(',');
        sb.append("targetInfo");
        sb.append('=');
        sb.append(((this.targetInfo == null)?"<null>":this.targetInfo));
        sb.append(',');
        sb.append("filterApplicationName");
        sb.append('=');
        sb.append(((this.filterApplicationName == null)?"<null>":this.filterApplicationName));
        sb.append(',');
        sb.append("filterApplicationServiceTypeCode");
        sb.append('=');
        sb.append(((this.filterApplicationServiceTypeCode == null)?"<null>":this.filterApplicationServiceTypeCode));
        sb.append(',');
        sb.append("filterApplicationServiceTypeName");
        sb.append('=');
        sb.append(((this.filterApplicationServiceTypeName == null)?"<null>":this.filterApplicationServiceTypeName));
        sb.append(',');
        sb.append("filterTargetRpcList");
        sb.append('=');
        sb.append(((this.filterTargetRpcList == null)?"<null>":this.filterTargetRpcList));
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
        sb.append("responseStatistics");
        sb.append('=');
        sb.append(((this.responseStatistics == null)?"<null>":this.responseStatistics));
        sb.append(',');
        sb.append("histogram");
        sb.append('=');
        sb.append(((this.histogram == null)?"<null>":this.histogram));
        sb.append(',');
        sb.append("timeSeriesHistogram");
        sb.append('=');
        sb.append(((this.timeSeriesHistogram == null)?"<null>":this.timeSeriesHistogram));
        sb.append(',');
        sb.append("hasAlert");
        sb.append('=');
        sb.append(((this.hasAlert == null)?"<null>":this.hasAlert));
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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.timeSeriesHistogram == null)? 0 :this.timeSeriesHistogram.hashCode()));
        result = ((result* 31)+((this.targetInfo == null)? 0 :this.targetInfo.hashCode()));
        result = ((result* 31)+((this.filterApplicationName == null)? 0 :this.filterApplicationName.hashCode()));
        result = ((result* 31)+((this.filterTargetRpcList == null)? 0 :this.filterTargetRpcList.hashCode()));
        result = ((result* 31)+((this.filterApplicationServiceTypeName == null)? 0 :this.filterApplicationServiceTypeName.hashCode()));
        result = ((result* 31)+((this.filterApplicationServiceTypeCode == null)? 0 :this.filterApplicationServiceTypeCode.hashCode()));
        result = ((result* 31)+((this.responseStatistics == null)? 0 :this.responseStatistics.hashCode()));
        result = ((result* 31)+((this.toAgent == null)? 0 :this.toAgent.hashCode()));
        result = ((result* 31)+((this.slowCount == null)? 0 :this.slowCount.hashCode()));
        result = ((result* 31)+((this.totalCount == null)? 0 :this.totalCount.hashCode()));
        result = ((result* 31)+((this.histogram == null)? 0 :this.histogram.hashCode()));
        result = ((result* 31)+((this.sourceInfo == null)? 0 :this.sourceInfo.hashCode()));
        result = ((result* 31)+((this.fromAgentIdNameMap == null)? 0 :this.fromAgentIdNameMap.hashCode()));
        result = ((result* 31)+((this.toAgentIdNameMap == null)? 0 :this.toAgentIdNameMap.hashCode()));
        result = ((result* 31)+((this.hasAlert == null)? 0 :this.hasAlert.hashCode()));
        result = ((result* 31)+((this.fromAgent == null)? 0 :this.fromAgent.hashCode()));
        result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
        result = ((result* 31)+((this.to == null)? 0 :this.to.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        result = ((result* 31)+((this.errorCount == null)? 0 :this.errorCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LinkDataArray) == false) {
            return false;
        }
        LinkDataArray rhs = ((LinkDataArray) other);
        return ((((((((((((((((((((((this.timeSeriesHistogram == rhs.timeSeriesHistogram)||((this.timeSeriesHistogram!= null)&&this.timeSeriesHistogram.equals(rhs.timeSeriesHistogram)))&&((this.targetInfo == rhs.targetInfo)||((this.targetInfo!= null)&&this.targetInfo.equals(rhs.targetInfo))))&&((this.filterApplicationName == rhs.filterApplicationName)||((this.filterApplicationName!= null)&&this.filterApplicationName.equals(rhs.filterApplicationName))))&&((this.filterTargetRpcList == rhs.filterTargetRpcList)||((this.filterTargetRpcList!= null)&&this.filterTargetRpcList.equals(rhs.filterTargetRpcList))))&&((this.filterApplicationServiceTypeName == rhs.filterApplicationServiceTypeName)||((this.filterApplicationServiceTypeName!= null)&&this.filterApplicationServiceTypeName.equals(rhs.filterApplicationServiceTypeName))))&&((this.filterApplicationServiceTypeCode == rhs.filterApplicationServiceTypeCode)||((this.filterApplicationServiceTypeCode!= null)&&this.filterApplicationServiceTypeCode.equals(rhs.filterApplicationServiceTypeCode))))&&((this.responseStatistics == rhs.responseStatistics)||((this.responseStatistics!= null)&&this.responseStatistics.equals(rhs.responseStatistics))))&&((this.toAgent == rhs.toAgent)||((this.toAgent!= null)&&this.toAgent.equals(rhs.toAgent))))&&((this.slowCount == rhs.slowCount)||((this.slowCount!= null)&&this.slowCount.equals(rhs.slowCount))))&&((this.totalCount == rhs.totalCount)||((this.totalCount!= null)&&this.totalCount.equals(rhs.totalCount))))&&((this.histogram == rhs.histogram)||((this.histogram!= null)&&this.histogram.equals(rhs.histogram))))&&((this.sourceInfo == rhs.sourceInfo)||((this.sourceInfo!= null)&&this.sourceInfo.equals(rhs.sourceInfo))))&&((this.fromAgentIdNameMap == rhs.fromAgentIdNameMap)||((this.fromAgentIdNameMap!= null)&&this.fromAgentIdNameMap.equals(rhs.fromAgentIdNameMap))))&&((this.toAgentIdNameMap == rhs.toAgentIdNameMap)||((this.toAgentIdNameMap!= null)&&this.toAgentIdNameMap.equals(rhs.toAgentIdNameMap))))&&((this.hasAlert == rhs.hasAlert)||((this.hasAlert!= null)&&this.hasAlert.equals(rhs.hasAlert))))&&((this.fromAgent == rhs.fromAgent)||((this.fromAgent!= null)&&this.fromAgent.equals(rhs.fromAgent))))&&((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from))))&&((this.to == rhs.to)||((this.to!= null)&&this.to.equals(rhs.to))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))))&&((this.errorCount == rhs.errorCount)||((this.errorCount!= null)&&this.errorCount.equals(rhs.errorCount))));
    }

}
