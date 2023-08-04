
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
    "1s",
    "3s",
    "5s",
    "Slow",
    "Error"
})
@Generated("jsonschema2pojo")
public class Histogram__1 {

    @JsonProperty("1s")
    private Long _1s;
    @JsonProperty("3s")
    private Long _3s;
    @JsonProperty("5s")
    private Long _5s;
    @JsonProperty("Slow")
    private Long slow;
    @JsonProperty("Error")
    private Long error;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("1s")
    public Long get1s() {
        return _1s;
    }

    @JsonProperty("1s")
    public void set1s(Long _1s) {
        this._1s = _1s;
    }

    public Histogram__1 with1s(Long _1s) {
        this._1s = _1s;
        return this;
    }

    @JsonProperty("3s")
    public Long get3s() {
        return _3s;
    }

    @JsonProperty("3s")
    public void set3s(Long _3s) {
        this._3s = _3s;
    }

    public Histogram__1 with3s(Long _3s) {
        this._3s = _3s;
        return this;
    }

    @JsonProperty("5s")
    public Long get5s() {
        return _5s;
    }

    @JsonProperty("5s")
    public void set5s(Long _5s) {
        this._5s = _5s;
    }

    public Histogram__1 with5s(Long _5s) {
        this._5s = _5s;
        return this;
    }

    @JsonProperty("Slow")
    public Long getSlow() {
        return slow;
    }

    @JsonProperty("Slow")
    public void setSlow(Long slow) {
        this.slow = slow;
    }

    public Histogram__1 withSlow(Long slow) {
        this.slow = slow;
        return this;
    }

    @JsonProperty("Error")
    public Long getError() {
        return error;
    }

    @JsonProperty("Error")
    public void setError(Long error) {
        this.error = error;
    }

    public Histogram__1 withError(Long error) {
        this.error = error;
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

    public Histogram__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Histogram__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_1s");
        sb.append('=');
        sb.append(((this._1s == null)?"<null>":this._1s));
        sb.append(',');
        sb.append("_3s");
        sb.append('=');
        sb.append(((this._3s == null)?"<null>":this._3s));
        sb.append(',');
        sb.append("_5s");
        sb.append('=');
        sb.append(((this._5s == null)?"<null>":this._5s));
        sb.append(',');
        sb.append("slow");
        sb.append('=');
        sb.append(((this.slow == null)?"<null>":this.slow));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
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
        result = ((result* 31)+((this._1s == null)? 0 :this._1s.hashCode()));
        result = ((result* 31)+((this.slow == null)? 0 :this.slow.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._5s == null)? 0 :this._5s.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this._3s == null)? 0 :this._3s.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Histogram__1) == false) {
            return false;
        }
        Histogram__1 rhs = ((Histogram__1) other);
        return (((((((this._1s == rhs._1s)||((this._1s!= null)&&this._1s.equals(rhs._1s)))&&((this.slow == rhs.slow)||((this.slow!= null)&&this.slow.equals(rhs.slow))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._5s == rhs._5s)||((this._5s!= null)&&this._5s.equals(rhs._5s))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this._3s == rhs._3s)||((this._3s!= null)&&this._3s.equals(rhs._3s))));
    }

}
