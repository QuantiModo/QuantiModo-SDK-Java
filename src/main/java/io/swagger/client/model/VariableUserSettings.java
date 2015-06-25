package io.swagger.client.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class VariableUserSettings  {
  
  private Integer user = null;
  private String variable = null;
  private Integer durationOfAction = null;
  private Integer fillingValue = null;
  private String joinWith = null;
  private Float maximumValue = null;
  private Float minimumValue = null;
  private String name = null;
  private Integer onsetDelay = null;
  private String unit = null;

  
  /**
   * User ID
   **/
  @ApiModelProperty(required = true, value = "User ID")
  @JsonProperty("user")
  public Integer getUser() {
    return user;
  }
  public void setUser(Integer user) {
    this.user = user;
  }

  
  /**
   * Variable DISPLAY name
   **/
  @ApiModelProperty(required = true, value = "Variable DISPLAY name")
  @JsonProperty("variable")
  public String getVariable() {
    return variable;
  }
  public void setVariable(String variable) {
    this.variable = variable;
  }

  
  /**
   * Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect
   **/
  @ApiModelProperty(required = true, value = "Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect")
  @JsonProperty("durationOfAction")
  public Integer getDurationOfAction() {
    return durationOfAction;
  }
  public void setDurationOfAction(Integer durationOfAction) {
    this.durationOfAction = durationOfAction;
  }

  
  /**
   * fillingValue
   **/
  @ApiModelProperty(required = true, value = "fillingValue")
  @JsonProperty("fillingValue")
  public Integer getFillingValue() {
    return fillingValue;
  }
  public void setFillingValue(Integer fillingValue) {
    this.fillingValue = fillingValue;
  }

  
  /**
   * joinWith
   **/
  @ApiModelProperty(required = true, value = "joinWith")
  @JsonProperty("joinWith")
  public String getJoinWith() {
    return joinWith;
  }
  public void setJoinWith(String joinWith) {
    this.joinWith = joinWith;
  }

  
  /**
   * maximumValue
   **/
  @ApiModelProperty(required = true, value = "maximumValue")
  @JsonProperty("maximumValue")
  public Float getMaximumValue() {
    return maximumValue;
  }
  public void setMaximumValue(Float maximumValue) {
    this.maximumValue = maximumValue;
  }

  
  /**
   * minimumValue
   **/
  @ApiModelProperty(required = true, value = "minimumValue")
  @JsonProperty("minimumValue")
  public Float getMinimumValue() {
    return minimumValue;
  }
  public void setMinimumValue(Float minimumValue) {
    this.minimumValue = minimumValue;
  }

  
  /**
   * name
   **/
  @ApiModelProperty(required = true, value = "name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * onsetDelay
   **/
  @ApiModelProperty(required = true, value = "onsetDelay")
  @JsonProperty("onsetDelay")
  public Integer getOnsetDelay() {
    return onsetDelay;
  }
  public void setOnsetDelay(Integer onsetDelay) {
    this.onsetDelay = onsetDelay;
  }

  
  /**
   * unit
   **/
  @ApiModelProperty(required = true, value = "unit")
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
    sb.append("class VariableUserSettings {\n");
    
    sb.append("  user: ").append(user).append("\n");
    sb.append("  variable: ").append(variable).append("\n");
    sb.append("  durationOfAction: ").append(durationOfAction).append("\n");
    sb.append("  fillingValue: ").append(fillingValue).append("\n");
    sb.append("  joinWith: ").append(joinWith).append("\n");
    sb.append("  maximumValue: ").append(maximumValue).append("\n");
    sb.append("  minimumValue: ").append(minimumValue).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  onsetDelay: ").append(onsetDelay).append("\n");
    sb.append("  unit: ").append(unit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
