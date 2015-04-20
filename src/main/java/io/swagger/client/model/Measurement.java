package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Measurement  {
  
  private String variable = null;
  private String source = null;
  private Long timestamp = null;
  private Double value = null;
  private String unit = null;

  
  /**
   * ORIGINAL Name of the variable for which we are creating the measurement records
   **/
  @ApiModelProperty(required = true, value = "ORIGINAL Name of the variable for which we are creating the measurement records")
  @JsonProperty("variable")
  public String getVariable() {
    return variable;
  }
  public void setVariable(String variable) {
    this.variable = variable;
  }

  
  /**
   * Application or device used to record the measurement values
   **/
  @ApiModelProperty(required = true, value = "Application or device used to record the measurement values")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * Timestamp for the measurement event in epoch time
   **/
  @ApiModelProperty(required = true, value = "Timestamp for the measurement event in epoch time")
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * Measurement value
   **/
  @ApiModelProperty(required = true, value = "Measurement value")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  
  /**
   * Unit of Measurement
   **/
  @ApiModelProperty(required = true, value = "Unit of Measurement")
  @JsonProperty("unit")
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measurement {\n");
    
    sb.append("  variable: ").append(variable).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  unit: ").append(unit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
