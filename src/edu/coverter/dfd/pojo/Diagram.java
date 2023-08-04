
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
    "title",
    "thumbnail",
    "diagramType",
    "id",
    "$$hashKey",
    "diagramJson",
    "size"
})
@Generated("jsonschema2pojo")
public class Diagram {

    @JsonProperty("title")
    private String title;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("diagramType")
    private String diagramType;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("$$hashKey")
    private String $$hashKey;
    @JsonProperty("diagramJson")
    private DiagramJson diagramJson;
    @JsonProperty("size")
    private Size__1 size;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("diagramType")
    public String getDiagramType() {
        return diagramType;
    }

    @JsonProperty("diagramType")
    public void setDiagramType(String diagramType) {
        this.diagramType = diagramType;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("$$hashKey")
    public String get$$hashKey() {
        return $$hashKey;
    }

    @JsonProperty("$$hashKey")
    public void set$$hashKey(String $$hashKey) {
        this.$$hashKey = $$hashKey;
    }

    @JsonProperty("diagramJson")
    public DiagramJson getDiagramJson() {
        return diagramJson;
    }

    @JsonProperty("diagramJson")
    public void setDiagramJson(DiagramJson diagramJson) {
        this.diagramJson = diagramJson;
    }

    @JsonProperty("size")
    public Size__1 getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Size__1 size) {
        this.size = size;
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
        sb.append(Diagram.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("thumbnail");
        sb.append('=');
        sb.append(((this.thumbnail == null)?"<null>":this.thumbnail));
        sb.append(',');
        sb.append("diagramType");
        sb.append('=');
        sb.append(((this.diagramType == null)?"<null>":this.diagramType));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("$$hashKey");
        sb.append('=');
        sb.append(((this.$$hashKey == null)?"<null>":this.$$hashKey));
        sb.append(',');
        sb.append("diagramJson");
        sb.append('=');
        sb.append(((this.diagramJson == null)?"<null>":this.diagramJson));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
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
