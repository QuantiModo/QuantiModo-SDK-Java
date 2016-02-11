package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
public class MeasurementValue   {
  
  private String startTime = null;
  private Float value = null;
  private String note = null;

  
  /**
   * When the measurement event occurred . Use ISO 8601 datetime format
   **/
  
  @ApiModelProperty(required = true, value = "When the measurement event occurred . Use ISO 8601 datetime format")
  @JsonProperty("start_time")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  /**
   * Value for the measurement
   **/
  
  @ApiModelProperty(required = true, value = "Value for the measurement")
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }
  public void setValue(Float value) {
    this.value = value;
  }

  
  /**
   * An optional note the user may include with their measurement
   **/
  
  @ApiModelProperty(value = "An optional note the user may include with their measurement")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementValue measurementValue = (MeasurementValue) o;
    return Objects.equals(startTime, measurementValue.startTime) &&
        Objects.equals(value, measurementValue.value) &&
        Objects.equals(note, measurementValue.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, value, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementValue {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

