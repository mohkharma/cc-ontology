
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
    "rpc",
    "rpcServiceTypeCode"
})
@Generated("jsonschema2pojo")
public class FilterTargetRpc {

    @JsonProperty("rpc")
    private String rpc;
    @JsonProperty("rpcServiceTypeCode")
    private Long rpcServiceTypeCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("rpc")
    public String getRpc() {
        return rpc;
    }

    @JsonProperty("rpc")
    public void setRpc(String rpc) {
        this.rpc = rpc;
    }

    public FilterTargetRpc withRpc(String rpc) {
        this.rpc = rpc;
        return this;
    }

    @JsonProperty("rpcServiceTypeCode")
    public Long getRpcServiceTypeCode() {
        return rpcServiceTypeCode;
    }

    @JsonProperty("rpcServiceTypeCode")
    public void setRpcServiceTypeCode(Long rpcServiceTypeCode) {
        this.rpcServiceTypeCode = rpcServiceTypeCode;
    }

    public FilterTargetRpc withRpcServiceTypeCode(Long rpcServiceTypeCode) {
        this.rpcServiceTypeCode = rpcServiceTypeCode;
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

    public FilterTargetRpc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FilterTargetRpc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rpc");
        sb.append('=');
        sb.append(((this.rpc == null)?"<null>":this.rpc));
        sb.append(',');
        sb.append("rpcServiceTypeCode");
        sb.append('=');
        sb.append(((this.rpcServiceTypeCode == null)?"<null>":this.rpcServiceTypeCode));
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
        result = ((result* 31)+((this.rpcServiceTypeCode == null)? 0 :this.rpcServiceTypeCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rpc == null)? 0 :this.rpc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FilterTargetRpc) == false) {
            return false;
        }
        FilterTargetRpc rhs = ((FilterTargetRpc) other);
        return ((((this.rpcServiceTypeCode == rhs.rpcServiceTypeCode)||((this.rpcServiceTypeCode!= null)&&this.rpcServiceTypeCode.equals(rhs.rpcServiceTypeCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rpc == rhs.rpc)||((this.rpc!= null)&&this.rpc.equals(rhs.rpc))));
    }

}
