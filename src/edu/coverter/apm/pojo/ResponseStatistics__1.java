
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
    "Tot",
    "Sum",
    "Avg",
    "Max"
})
@Generated("jsonschema2pojo")
public class ResponseStatistics__1 {

    @JsonProperty("Tot")
    private Long tot;
    @JsonProperty("Sum")
    private Long sum;
    @JsonProperty("Avg")
    private Long avg;
    @JsonProperty("Max")
    private Long max;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("Tot")
    public Long getTot() {
        return tot;
    }

    @JsonProperty("Tot")
    public void setTot(Long tot) {
        this.tot = tot;
    }

    public ResponseStatistics__1 withTot(Long tot) {
        this.tot = tot;
        return this;
    }

    @JsonProperty("Sum")
    public Long getSum() {
        return sum;
    }

    @JsonProperty("Sum")
    public void setSum(Long sum) {
        this.sum = sum;
    }

    public ResponseStatistics__1 withSum(Long sum) {
        this.sum = sum;
        return this;
    }

    @JsonProperty("Avg")
    public Long getAvg() {
        return avg;
    }

    @JsonProperty("Avg")
    public void setAvg(Long avg) {
        this.avg = avg;
    }

    public ResponseStatistics__1 withAvg(Long avg) {
        this.avg = avg;
        return this;
    }

    @JsonProperty("Max")
    public Long getMax() {
        return max;
    }

    @JsonProperty("Max")
    public void setMax(Long max) {
        this.max = max;
    }

    public ResponseStatistics__1 withMax(Long max) {
        this.max = max;
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

    public ResponseStatistics__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResponseStatistics__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tot");
        sb.append('=');
        sb.append(((this.tot == null)?"<null>":this.tot));
        sb.append(',');
        sb.append("sum");
        sb.append('=');
        sb.append(((this.sum == null)?"<null>":this.sum));
        sb.append(',');
        sb.append("avg");
        sb.append('=');
        sb.append(((this.avg == null)?"<null>":this.avg));
        sb.append(',');
        sb.append("max");
        sb.append('=');
        sb.append(((this.max == null)?"<null>":this.max));
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
        result = ((result* 31)+((this.tot == null)? 0 :this.tot.hashCode()));
        result = ((result* 31)+((this.sum == null)? 0 :this.sum.hashCode()));
        result = ((result* 31)+((this.avg == null)? 0 :this.avg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.max == null)? 0 :this.max.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResponseStatistics__1) == false) {
            return false;
        }
        ResponseStatistics__1 rhs = ((ResponseStatistics__1) other);
        return ((((((this.tot == rhs.tot)||((this.tot!= null)&&this.tot.equals(rhs.tot)))&&((this.sum == rhs.sum)||((this.sum!= null)&&this.sum.equals(rhs.sum))))&&((this.avg == rhs.avg)||((this.avg!= null)&&this.avg.equals(rhs.avg))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.max == rhs.max)||((this.max!= null)&&this.max.equals(rhs.max))));
    }

}
