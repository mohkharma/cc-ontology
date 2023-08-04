
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
    "shopping.api01",
    "apigw01"
})
@Generated("jsonschema2pojo")
public class ToAgentIdNameMap {

    @JsonProperty("shopping.api01")
    private String shoppingApi01;
    @JsonProperty("apigw01")
    private String apigw01;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("shopping.api01")
    public String getShoppingApi01() {
        return shoppingApi01;
    }

    @JsonProperty("shopping.api01")
    public void setShoppingApi01(String shoppingApi01) {
        this.shoppingApi01 = shoppingApi01;
    }

    public ToAgentIdNameMap withShoppingApi01(String shoppingApi01) {
        this.shoppingApi01 = shoppingApi01;
        return this;
    }

    @JsonProperty("apigw01")
    public String getApigw01() {
        return apigw01;
    }

    @JsonProperty("apigw01")
    public void setApigw01(String apigw01) {
        this.apigw01 = apigw01;
    }

    public ToAgentIdNameMap withApigw01(String apigw01) {
        this.apigw01 = apigw01;
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

    public ToAgentIdNameMap withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ToAgentIdNameMap.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shoppingApi01");
        sb.append('=');
        sb.append(((this.shoppingApi01 == null)?"<null>":this.shoppingApi01));
        sb.append(',');
        sb.append("apigw01");
        sb.append('=');
        sb.append(((this.apigw01 == null)?"<null>":this.apigw01));
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
        result = ((result* 31)+((this.apigw01 == null)? 0 :this.apigw01 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shoppingApi01 == null)? 0 :this.shoppingApi01 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ToAgentIdNameMap) == false) {
            return false;
        }
        ToAgentIdNameMap rhs = ((ToAgentIdNameMap) other);
        return ((((this.apigw01 == rhs.apigw01)||((this.apigw01 != null)&&this.apigw01 .equals(rhs.apigw01)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shoppingApi01 == rhs.shoppingApi01)||((this.shoppingApi01 != null)&&this.shoppingApi01 .equals(rhs.shoppingApi01))));
    }

}
