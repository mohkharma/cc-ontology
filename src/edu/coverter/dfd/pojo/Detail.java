
package edu.coverter.dfd.pojo;

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
    "contributors",
    "diagrams"
})
@Generated("jsonschema2pojo")
public class Detail {

    @JsonProperty("contributors")
    private List<Object> contributors;
    @JsonProperty("diagrams")
    private List<Diagram> diagrams;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("contributors")
    public List<Object> getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(List<Object> contributors) {
        this.contributors = contributors;
    }

    @JsonProperty("diagrams")
    public List<Diagram> getDiagrams() {
        return diagrams;
    }

    @JsonProperty("diagrams")
    public void setDiagrams(List<Diagram> diagrams) {
        this.diagrams = diagrams;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Detail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contributors");
        sb.append('=');
        sb.append(((this.contributors == null)?"<null>":this.contributors));
        sb.append(',');
        sb.append("diagrams");
        sb.append('=');
        sb.append(((this.diagrams == null)?"<null>":this.diagrams));
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

}
