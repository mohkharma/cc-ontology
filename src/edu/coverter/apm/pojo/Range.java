
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
    "from",
    "to",
    "fromDateTime",
    "toDateTime"
})
@Generated("jsonschema2pojo")
public class Range {

    @JsonProperty("from")
    private Long from;
    @JsonProperty("to")
    private Long to;
    @JsonProperty("fromDateTime")
    private String fromDateTime;
    @JsonProperty("toDateTime")
    private String toDateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Range() {
    }

    @JsonProperty("from")
    public Long getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(Long from) {
        this.from = from;
    }

    public Range withFrom(Long from) {
        this.from = from;
        return this;
    }

    @JsonProperty("to")
    public Long getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(Long to) {
        this.to = to;
    }

    public Range withTo(Long to) {
        this.to = to;
        return this;
    }

    @JsonProperty("fromDateTime")
    public String getFromDateTime() {
        return fromDateTime;
    }

    @JsonProperty("fromDateTime")
    public void setFromDateTime(String fromDateTime) {
        this.fromDateTime = fromDateTime;
    }

    public Range withFromDateTime(String fromDateTime) {
        this.fromDateTime = fromDateTime;
        return this;
    }

    @JsonProperty("toDateTime")
    public String getToDateTime() {
        return toDateTime;
    }

    @JsonProperty("toDateTime")
    public void setToDateTime(String toDateTime) {
        this.toDateTime = toDateTime;
    }

    public Range withToDateTime(String toDateTime) {
        this.toDateTime = toDateTime;
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

    public Range withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Range.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("to");
        sb.append('=');
        sb.append(((this.to == null)?"<null>":this.to));
        sb.append(',');
        sb.append("fromDateTime");
        sb.append('=');
        sb.append(((this.fromDateTime == null)?"<null>":this.fromDateTime));
        sb.append(',');
        sb.append("toDateTime");
        sb.append('=');
        sb.append(((this.toDateTime == null)?"<null>":this.toDateTime));
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
        result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
        result = ((result* 31)+((this.to == null)? 0 :this.to.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fromDateTime == null)? 0 :this.fromDateTime.hashCode()));
        result = ((result* 31)+((this.toDateTime == null)? 0 :this.toDateTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Range) == false) {
            return false;
        }
        Range rhs = ((Range) other);
        return ((((((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from)))&&((this.to == rhs.to)||((this.to!= null)&&this.to.equals(rhs.to))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fromDateTime == rhs.fromDateTime)||((this.fromDateTime!= null)&&this.fromDateTime.equals(rhs.fromDateTime))))&&((this.toDateTime == rhs.toDateTime)||((this.toDateTime!= null)&&this.toDateTime.equals(rhs.toDateTime))));
    }

}
