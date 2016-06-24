package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.HumanTime;


/**
 * Measurement
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class Measurement   {
  
  private String variable = null;
  private String source = null;
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
  public Measurement variable(String variable) {
    this.variable = variable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ORIGINAL Name of the variable for which we are creating the measurement records")
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
  public Measurement source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Application or device used to record the measurement values")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }


  /**
   * Start Time for the measurement event in ISO 8601
   **/
  public Measurement startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start Time for the measurement event in ISO 8601")
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
  public Measurement humanTime(HumanTime humanTime) {
    this.humanTime = humanTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start Time for the measurement event in ISO 8601")
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
  public Measurement value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Converted measurement value in requested unit")
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
  public Measurement unit(String unit) {
    this.unit = unit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unit of measurement as requested in GET request")
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
  public Measurement originalValue(Integer originalValue) {
    this.originalValue = originalValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Original value")
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
  public Measurement storedValue(Double storedValue) {
    this.storedValue = storedValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Measurement value in the unit as orignally submitted")
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
  public Measurement storedAbbreviatedUnitName(String storedAbbreviatedUnitName) {
    this.storedAbbreviatedUnitName = storedAbbreviatedUnitName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unit of measurement as originally submitted")
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
  public Measurement originalAbbreviatedUnitName(String originalAbbreviatedUnitName) {
    this.originalAbbreviatedUnitName = originalAbbreviatedUnitName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Original Unit of measurement as originally submitted")
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
  public Measurement abbreviatedUnitName(String abbreviatedUnitName) {
    this.abbreviatedUnitName = abbreviatedUnitName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unit of measurement as originally submitted")
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
  public Measurement note(String note) {
    this.note = note;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Note of measurement")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Measurement measurement = (Measurement) o;
    return Objects.equals(this.variable, measurement.variable) &&
        Objects.equals(this.source, measurement.source) &&
        Objects.equals(this.startTime, measurement.startTime) &&
        Objects.equals(this.humanTime, measurement.humanTime) &&
        Objects.equals(this.value, measurement.value) &&
        Objects.equals(this.unit, measurement.unit) &&
        Objects.equals(this.originalValue, measurement.originalValue) &&
        Objects.equals(this.storedValue, measurement.storedValue) &&
        Objects.equals(this.storedAbbreviatedUnitName, measurement.storedAbbreviatedUnitName) &&
        Objects.equals(this.originalAbbreviatedUnitName, measurement.originalAbbreviatedUnitName) &&
        Objects.equals(this.abbreviatedUnitName, measurement.abbreviatedUnitName) &&
        Objects.equals(this.note, measurement.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variable, source, startTime, humanTime, value, unit, originalValue, storedValue, storedAbbreviatedUnitName, originalAbbreviatedUnitName, abbreviatedUnitName, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measurement {\n");
    
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    humanTime: ").append(toIndentedString(humanTime)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
    sb.append("    storedValue: ").append(toIndentedString(storedValue)).append("\n");
    sb.append("    storedAbbreviatedUnitName: ").append(toIndentedString(storedAbbreviatedUnitName)).append("\n");
    sb.append("    originalAbbreviatedUnitName: ").append(toIndentedString(originalAbbreviatedUnitName)).append("\n");
    sb.append("    abbreviatedUnitName: ").append(toIndentedString(abbreviatedUnitName)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

