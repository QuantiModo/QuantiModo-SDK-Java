package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MeasurementValue;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
public class MeasurementPost   {
  
  private Integer variableId = null;
  private Integer sourceId = null;
  private Integer unitId = null;
  private List<MeasurementValue> measurements = new ArrayList<MeasurementValue>();

  
  /**
   * ID of the variable for the measurement as obtained from the GET variables endpoint
   **/
  
  @ApiModelProperty(required = true, value = "ID of the variable for the measurement as obtained from the GET variables endpoint")
  @JsonProperty("variable_id")
  public Integer getVariableId() {
    return variableId;
  }
  public void setVariableId(Integer variableId) {
    this.variableId = variableId;
  }

  
  /**
   * Source ID of the app or device as obtained from the GET sources endpoint
   **/
  
  @ApiModelProperty(required = true, value = "Source ID of the app or device as obtained from the GET sources endpoint")
  @JsonProperty("source_id")
  public Integer getSourceId() {
    return sourceId;
  }
  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   * Unit id for the measurement value as obtained from the GET units endpoint
   **/
  
  @ApiModelProperty(required = true, value = "Unit id for the measurement value as obtained from the GET units endpoint")
  @JsonProperty("unit_id")
  public Integer getUnitId() {
    return unitId;
  }
  public void setUnitId(Integer unitId) {
    this.unitId = unitId;
  }

  
  /**
   * measurements
   **/
  
  @ApiModelProperty(required = true, value = "measurements")
  @JsonProperty("measurements")
  public List<MeasurementValue> getMeasurements() {
    return measurements;
  }
  public void setMeasurements(List<MeasurementValue> measurements) {
    this.measurements = measurements;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementPost measurementPost = (MeasurementPost) o;
    return Objects.equals(variableId, measurementPost.variableId) &&
        Objects.equals(sourceId, measurementPost.sourceId) &&
        Objects.equals(unitId, measurementPost.unitId) &&
        Objects.equals(measurements, measurementPost.measurements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableId, sourceId, unitId, measurements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementPost {\n");
    
    sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    measurements: ").append(toIndentedString(measurements)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

