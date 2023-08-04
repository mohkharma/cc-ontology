
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
    "range",
    "linkDataArray",
    "nodeDataArray"
})
@Generated("jsonschema2pojo")
public class ApplicationMapData {

    @JsonProperty("range")
    private Range range;
    @JsonProperty("linkDataArray")
    private List<LinkDataArray> linkDataArray = new ArrayList<LinkDataArray>();
    @JsonProperty("nodeDataArray")
    private List<NodeDataArray> nodeDataArray = new ArrayList<NodeDataArray>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("range")
    public Range getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(Range range1) {
          range = range1;
    }

    public ApplicationMapData withRange(Range range1) {
         range = range1;
        return this;
    }

    @JsonProperty("linkDataArray")
    public List<LinkDataArray> getLinkDataArray() {
        return linkDataArray;
    }

    @JsonProperty("linkDataArray")
    public void setLinkDataArray(List<LinkDataArray> linkDataArray) {
        this.linkDataArray = linkDataArray;
    }

    public ApplicationMapData withLinkDataArray(List<LinkDataArray> linkDataArray) {
        this.linkDataArray = linkDataArray;
        return this;
    }

    @JsonProperty("nodeDataArray")
    public List<NodeDataArray> getNodeDataArray() {
        return nodeDataArray;
    }

    @JsonProperty("nodeDataArray")
    public void setNodeDataArray(List<NodeDataArray> nodeDataArray) {
        this.nodeDataArray = nodeDataArray;
    }

    public ApplicationMapData withNodeDataArray(List<NodeDataArray> nodeDataArray) {
        this.nodeDataArray = nodeDataArray;
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

    public ApplicationMapData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationMapData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("range");
        sb.append('=');
        sb.append(((range == null)?"<null>":range));
        sb.append(',');
        sb.append("linkDataArray");
        sb.append('=');
        sb.append(((this.linkDataArray == null)?"<null>":this.linkDataArray));
        sb.append(',');
        sb.append("nodeDataArray");
        sb.append('=');
        sb.append(((this.nodeDataArray == null)?"<null>":this.nodeDataArray));
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
        result = ((result* 31)+((range == null)? 0 :range.hashCode()));
        result = ((result* 31)+((this.linkDataArray == null)? 0 :this.linkDataArray.hashCode()));
        result = ((result* 31)+((this.nodeDataArray == null)? 0 :this.nodeDataArray.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof ApplicationMapData) == false) {
//            return false;
//        }
//        ApplicationMapData rhs = ((ApplicationMapData) other);
//        return (((((range == rhs.getRange())||((range!= null)&&range.equals(rhs.range)))&&((this.linkDataArray == rhs.linkDataArray)||((this.linkDataArray!= null)&&this.linkDataArray.equals(rhs.linkDataArray))))&&((this.nodeDataArray == rhs.nodeDataArray)||((this.nodeDataArray!= null)&&this.nodeDataArray.equals(rhs.nodeDataArray))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
//    }

}
