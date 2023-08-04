
package edu.coverter.apm.pojo;

import java.util.LinkedHashMap;
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
    "applicationName",
    "serviceType",
    "serviceTypeCode",
    "isWas"
})
@Generated("jsonschema2pojo")
public class TargetInfo {

    @JsonProperty("applicationName")
    private String applicationName;
    @JsonProperty("serviceType")
    private String serviceType;
    @JsonProperty("serviceTypeCode")
    private Long serviceTypeCode;
    @JsonProperty("isWas")
    private Boolean isWas;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("applicationName")
    public String getApplicationName() {
        return applicationName;
    }

    @JsonProperty("applicationName")
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public TargetInfo withApplicationName(String applicationName) {
        this.applicationName = applicationName;
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

    public TargetInfo withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    @JsonProperty("serviceTypeCode")
    public Long getServiceTypeCode() {
        return serviceTypeCode;
    }

    @JsonProperty("serviceTypeCode")
    public void setServiceTypeCode(Long serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public TargetInfo withServiceTypeCode(Long serviceTypeCode) {
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

    public TargetInfo withIsWas(Boolean isWas) {
        this.isWas = isWas;
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

    public TargetInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TargetInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("applicationName");
        sb.append('=');
        sb.append(((this.applicationName == null)?"<null>":this.applicationName));
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
        result = ((result* 31)+((this.serviceType == null)? 0 :this.serviceType.hashCode()));
        result = ((result* 31)+((this.isWas == null)? 0 :this.isWas.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.applicationName == null)? 0 :this.applicationName.hashCode()));
        result = ((result* 31)+((this.serviceTypeCode == null)? 0 :this.serviceTypeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TargetInfo) == false) {
            return false;
        }
        TargetInfo rhs = ((TargetInfo) other);
        return ((((((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType)))&&((this.isWas == rhs.isWas)||((this.isWas!= null)&&this.isWas.equals(rhs.isWas))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.applicationName == rhs.applicationName)||((this.applicationName!= null)&&this.applicationName.equals(rhs.applicationName))))&&((this.serviceTypeCode == rhs.serviceTypeCode)||((this.serviceTypeCode!= null)&&this.serviceTypeCode.equals(rhs.serviceTypeCode))));
    }

}
