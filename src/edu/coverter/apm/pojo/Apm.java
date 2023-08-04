
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
    "applicationMapData"
})
@Generated("jsonschema2pojo")
public class Apm {

    @JsonProperty("applicationMapData")
    private ApplicationMapData applicationMapData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("applicationMapData")
    public ApplicationMapData getApplicationMapData() {
        return applicationMapData;
    }

    @JsonProperty("applicationMapData")
    public void setApplicationMapData(ApplicationMapData applicationMapData1) {
        applicationMapData = applicationMapData1;
    }

    public Apm withApplicationMapData(ApplicationMapData applicationMapData1) {
        applicationMapData = applicationMapData1;
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

    public Apm withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    public static void main(String[] args) {
        ApplicationMapData applicationMapData = new ApplicationMapData();


    }
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(Apm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
//        sb.append("applicationMapData");
//        sb.append('=');
//        sb.append(((this.applicationMapData == null)?"<null>":this.applicationMapData));
//        sb.append(',');
//        sb.append("additionalProperties");
//        sb.append('=');
//        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
//        sb.append(',');
//        if (sb.charAt((sb.length()- 1)) == ',') {
//            sb.setCharAt((sb.length()- 1), ']');
//        } else {
//            sb.append(']');
//        }
//        return sb.toString();
//    }
//
//    @Override
//    public int hashCode() {
//        int result = 1;
//        result = ((result* 31)+((this.applicationMapData == null)? 0 :this.applicationMapData.hashCode()));
//        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof Apm) == false) {
//            return false;
//        }
//        Apm rhs = ((Apm) other);
//        return (((this.applicationMapData == rhs.applicationMapData)||((this.applicationMapData!= null)&&this.applicationMapData.equals(rhs.applicationMapData)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
//    }

}
