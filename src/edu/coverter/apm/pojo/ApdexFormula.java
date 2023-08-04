
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
    "satisfiedCount",
    "toleratingCount",
    "totalSamples"
})
@Generated("jsonschema2pojo")
public class ApdexFormula {

    @JsonProperty("satisfiedCount")
    private Long satisfiedCount;
    @JsonProperty("toleratingCount")
    private Long toleratingCount;
    @JsonProperty("totalSamples")
    private Long totalSamples;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("satisfiedCount")
    public Long getSatisfiedCount() {
        return satisfiedCount;
    }

    @JsonProperty("satisfiedCount")
    public void setSatisfiedCount(Long satisfiedCount) {
        this.satisfiedCount = satisfiedCount;
    }

    public ApdexFormula withSatisfiedCount(Long satisfiedCount) {
        this.satisfiedCount = satisfiedCount;
        return this;
    }

    @JsonProperty("toleratingCount")
    public Long getToleratingCount() {
        return toleratingCount;
    }

    @JsonProperty("toleratingCount")
    public void setToleratingCount(Long toleratingCount) {
        this.toleratingCount = toleratingCount;
    }

    public ApdexFormula withToleratingCount(Long toleratingCount) {
        this.toleratingCount = toleratingCount;
        return this;
    }

    @JsonProperty("totalSamples")
    public Long getTotalSamples() {
        return totalSamples;
    }

    @JsonProperty("totalSamples")
    public void setTotalSamples(Long totalSamples) {
        this.totalSamples = totalSamples;
    }

    public ApdexFormula withTotalSamples(Long totalSamples) {
        this.totalSamples = totalSamples;
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

    public ApdexFormula withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApdexFormula.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("satisfiedCount");
        sb.append('=');
        sb.append(((this.satisfiedCount == null)?"<null>":this.satisfiedCount));
        sb.append(',');
        sb.append("toleratingCount");
        sb.append('=');
        sb.append(((this.toleratingCount == null)?"<null>":this.toleratingCount));
        sb.append(',');
        sb.append("totalSamples");
        sb.append('=');
        sb.append(((this.totalSamples == null)?"<null>":this.totalSamples));
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
        result = ((result* 31)+((this.totalSamples == null)? 0 :this.totalSamples.hashCode()));
        result = ((result* 31)+((this.satisfiedCount == null)? 0 :this.satisfiedCount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.toleratingCount == null)? 0 :this.toleratingCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApdexFormula) == false) {
            return false;
        }
        ApdexFormula rhs = ((ApdexFormula) other);
        return (((((this.totalSamples == rhs.totalSamples)||((this.totalSamples!= null)&&this.totalSamples.equals(rhs.totalSamples)))&&((this.satisfiedCount == rhs.satisfiedCount)||((this.satisfiedCount!= null)&&this.satisfiedCount.equals(rhs.satisfiedCount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.toleratingCount == rhs.toleratingCount)||((this.toleratingCount!= null)&&this.toleratingCount.equals(rhs.toleratingCount))));
    }

}
