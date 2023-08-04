
package edu.coverter.dfd.pojo;

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
    "text",
    "font-weight",
    "font-size"
})
@Generated("jsonschema2pojo")
public class Text__1 {

    @JsonProperty("text")
    private String text;
    @JsonProperty("font-weight")
    private String fontWeight;
    @JsonProperty("font-size")
    private String fontSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("font-weight")
    public String getFontWeight() {
        return fontWeight;
    }

    @JsonProperty("font-weight")
    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }

    @JsonProperty("font-size")
    public String getFontSize() {
        return fontSize;
    }

    @JsonProperty("font-size")
    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
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
        sb.append(Text__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("fontWeight");
        sb.append('=');
        sb.append(((this.fontWeight == null)?"<null>":this.fontWeight));
        sb.append(',');
        sb.append("fontSize");
        sb.append('=');
        sb.append(((this.fontSize == null)?"<null>":this.fontSize));
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
