package io.swagger.client.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Measurement  {
  
  private String variable = null;
  private String source = null;
  private Long timestamp = null;
  private Double value = null;
  private String unit = null;
  private Double storedValue = null;
  private String storedUnit = null;

  
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
   * Converted measurement value in requested unit
   **/
  @ApiModelProperty(required = true, value = "Converted measurement value in requested unit")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  
  /**
   * Unit of measurement as requested in GET request
   **/
  @ApiModelProperty(required = true, value = "Unit of measurement as requested in GET request")
  @JsonProperty("unit")
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }

  
  /**
   * Measurement value in the unit as orignally submitted
   **/
  @ApiModelProperty(value = "Measurement value in the unit as orignally submitted")
  @JsonProperty("storedValue")
  public Double getStoredValue() {
    return storedValue;
  }
  public void setStoredValue(Double storedValue) {
    this.storedValue = storedValue;
  }

  
  /**
   * Unit of measurement as originally submitted
   **/
  @ApiModelProperty(value = "Unit of measurement as originally submitted")
  @JsonProperty("storedUnit")
  public String getStoredUnit() {
    return storedUnit;
  }
  public void setStoredUnit(String storedUnit) {
    this.storedUnit = storedUnit;
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
    sb.append("  storedValue: ").append(storedValue).append("\n");
    sb.append("  storedUnit: ").append(storedUnit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
