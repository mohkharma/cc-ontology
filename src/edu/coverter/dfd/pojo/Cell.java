
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
    "type",
    "size",
    "position",
    "angle",
    "id",
    "z",
    "hasOpenThreats",
    "attrs",
    "smooth",
    "source",
    "target",
    "vertices",
    "labels"
})
@Generated("jsonschema2pojo")
public class Cell {

    @JsonProperty("description")
    private String description;

    @JsonProperty("type")
    private String type;
    @JsonProperty("size")
    private Size size;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("angle")
    private Integer angle;
    @JsonProperty("id")
    private String id;
    @JsonProperty("z")
    private Integer z;
    @JsonProperty("hasOpenThreats")
    private Boolean hasOpenThreats;
    @JsonProperty("attrs")
    private Attrs attrs;
    @JsonProperty("smooth")
    private Boolean smooth;
    @JsonProperty("source")
    private Source source;
    @JsonProperty("target")
    private Target target;
    @JsonProperty("vertices")
    private List<Vertex> vertices;
    @JsonProperty("labels")
    private List<Label> labels;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("size")
    public Size getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Size size) {
        this.size = size;
    }

    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Position position) {
        this.position = position;
    }

    @JsonProperty("angle")
    public Integer getAngle() {
        return angle;
    }

    @JsonProperty("angle")
    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("z")
    public Integer getZ() {
        return z;
    }

    @JsonProperty("z")
    public void setZ(Integer z) {
        this.z = z;
    }

    @JsonProperty("hasOpenThreats")
    public Boolean getHasOpenThreats() {
        return hasOpenThreats;
    }

    @JsonProperty("hasOpenThreats")
    public void setHasOpenThreats(Boolean hasOpenThreats) {
        this.hasOpenThreats = hasOpenThreats;
    }

    @JsonProperty("attrs")
    public Attrs getAttrs() {
        return attrs;
    }

    @JsonProperty("attrs")
    public void setAttrs(Attrs attrs) {
        this.attrs = attrs;
    }

    @JsonProperty("smooth")
    public Boolean getSmooth() {
        return smooth;
    }

    @JsonProperty("smooth")
    public void setSmooth(Boolean smooth) {
        this.smooth = smooth;
    }

    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    @JsonProperty("target")
    public Target getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Target target) {
        this.target = target;
    }

    @JsonProperty("vertices")
    public List<Vertex> getVertices() {
        return vertices;
    }

    @JsonProperty("vertices")
    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
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
        sb.append(Cell.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("position");
        sb.append('=');
        sb.append(((this.position == null)?"<null>":this.position));
        sb.append(',');
        sb.append("angle");
        sb.append('=');
        sb.append(((this.angle == null)?"<null>":this.angle));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("z");
        sb.append('=');
        sb.append(((this.z == null)?"<null>":this.z));
        sb.append(',');
        sb.append("hasOpenThreats");
        sb.append('=');
        sb.append(((this.hasOpenThreats == null)?"<null>":this.hasOpenThreats));
        sb.append(',');
        sb.append("attrs");
        sb.append('=');
        sb.append(((this.attrs == null)?"<null>":this.attrs));
        sb.append(',');
        sb.append("smooth");
        sb.append('=');
        sb.append(((this.smooth == null)?"<null>":this.smooth));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("vertices");
        sb.append('=');
        sb.append(((this.vertices == null)?"<null>":this.vertices));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
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
