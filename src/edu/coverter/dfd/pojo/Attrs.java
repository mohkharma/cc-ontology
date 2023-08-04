
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
    ".element-shape",
    "text",
    ".element-text",
    ".marker-target",
    ".connection"
})
@Generated("jsonschema2pojo")
public class Attrs {

    @JsonProperty(".element-shape")
    private ElementShape elementShape;
    @JsonProperty("text")
    private Text text;
    @JsonProperty(".element-text")
    private ElementText elementText;
    @JsonProperty(".marker-target")
    private MarkerTarget markerTarget;
    @JsonProperty(".connection")
    private Connection connection;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty(".element-shape")
    public ElementShape getElementShape() {
        return elementShape;
    }

    @JsonProperty(".element-shape")
    public void setElementShape(ElementShape elementShape) {
        this.elementShape = elementShape;
    }

    @JsonProperty("text")
    public Text getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(Text text) {
        this.text = text;
    }

    @JsonProperty(".element-text")
    public ElementText getElementText() {
        return elementText;
    }

    @JsonProperty(".element-text")
    public void setElementText(ElementText elementText) {
        this.elementText = elementText;
    }

    @JsonProperty(".marker-target")
    public MarkerTarget getMarkerTarget() {
        return markerTarget;
    }

    @JsonProperty(".marker-target")
    public void setMarkerTarget(MarkerTarget markerTarget) {
        this.markerTarget = markerTarget;
    }

    @JsonProperty(".connection")
    public Connection getConnection() {
        return connection;
    }

    @JsonProperty(".connection")
    public void setConnection(Connection connection) {
        this.connection = connection;
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
        sb.append(Attrs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("elementShape");
        sb.append('=');
        sb.append(((this.elementShape == null)?"<null>":this.elementShape));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("elementText");
        sb.append('=');
        sb.append(((this.elementText == null)?"<null>":this.elementText));
        sb.append(',');
        sb.append("markerTarget");
        sb.append('=');
        sb.append(((this.markerTarget == null)?"<null>":this.markerTarget));
        sb.append(',');
        sb.append("connection");
        sb.append('=');
        sb.append(((this.connection == null)?"<null>":this.connection));
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
