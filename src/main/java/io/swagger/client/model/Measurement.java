package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.HumanTime;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-24T00:56:42.474Z")
public class Measurement   {
  
  private String variable = null;
  private String source = null;
  private Long timestamp = null;
  private String startTime = null;
  private HumanTime humanTime = null;
  private Double value = null;
  private String unit = null;
  private Integer originalValue = null;
  private Double storedValue = null;
  private String storedAbbreviatedUnitName = null;
  private String originalAbbreviatedUnitName = null;
  private String abbreviatedUnitName = null;
  private String note = null;

  
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
   * Start Time for the measurement event in ISO 8601
   **/
  @ApiModelProperty(value = "Start Time for the measurement event in ISO 8601")
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  /**
   * Start Time for the measurement event in ISO 8601
   **/
  @ApiModelProperty(value = "Start Time for the measurement event in ISO 8601")
  @JsonProperty("humanTime")
  public HumanTime getHumanTime() {
    return humanTime;
  }
  public void setHumanTime(HumanTime humanTime) {
    this.humanTime = humanTime;
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
   * Original value
   **/
  @ApiModelProperty(value = "Original value")
  @JsonProperty("originalValue")
  public Integer getOriginalValue() {
    return originalValue;
  }
  public void setOriginalValue(Integer originalValue) {
    this.originalValue = originalValue;
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
  @JsonProperty("storedAbbreviatedUnitName")
  public String getStoredAbbreviatedUnitName() {
    return storedAbbreviatedUnitName;
  }
  public void setStoredAbbreviatedUnitName(String storedAbbreviatedUnitName) {
    this.storedAbbreviatedUnitName = storedAbbreviatedUnitName;
  }

  
  /**
   * Original Unit of measurement as originally submitted
   **/
  @ApiModelProperty(value = "Original Unit of measurement as originally submitted")
  @JsonProperty("originalAbbreviatedUnitName")
  public String getOriginalAbbreviatedUnitName() {
    return originalAbbreviatedUnitName;
  }
  public void setOriginalAbbreviatedUnitName(String originalAbbreviatedUnitName) {
    this.originalAbbreviatedUnitName = originalAbbreviatedUnitName;
  }

  
  /**
   * Unit of measurement as originally submitted
   **/
  @ApiModelProperty(value = "Unit of measurement as originally submitted")
  @JsonProperty("abbreviatedUnitName")
  public String getAbbreviatedUnitName() {
    return abbreviatedUnitName;
  }
  public void setAbbreviatedUnitName(String abbreviatedUnitName) {
    this.abbreviatedUnitName = abbreviatedUnitName;
  }

  
  /**
   * Note of measurement
   **/
  @ApiModelProperty(value = "Note of measurement")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measurement {\n");
    
    sb.append("    variable: ").append(StringUtil.toIndentedString(variable)).append("\n");
    sb.append("    source: ").append(StringUtil.toIndentedString(source)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    startTime: ").append(StringUtil.toIndentedString(startTime)).append("\n");
    sb.append("    humanTime: ").append(StringUtil.toIndentedString(humanTime)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(StringUtil.toIndentedString(unit)).append("\n");
    sb.append("    originalValue: ").append(StringUtil.toIndentedString(originalValue)).append("\n");
    sb.append("    storedValue: ").append(StringUtil.toIndentedString(storedValue)).append("\n");
    sb.append("    storedAbbreviatedUnitName: ").append(StringUtil.toIndentedString(storedAbbreviatedUnitName)).append("\n");
    sb.append("    originalAbbreviatedUnitName: ").append(StringUtil.toIndentedString(originalAbbreviatedUnitName)).append("\n");
    sb.append("    abbreviatedUnitName: ").append(StringUtil.toIndentedString(abbreviatedUnitName)).append("\n");
    sb.append("    note: ").append(StringUtil.toIndentedString(note)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
