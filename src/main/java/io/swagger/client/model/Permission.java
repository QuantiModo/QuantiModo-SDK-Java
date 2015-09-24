package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-24T00:56:42.474Z")
public class Permission   {
  
  private Integer target = null;
  private String variableName = null;
  private Integer minTimestamp = null;
  private Integer maxTimestamp = null;
  private Integer minTimeOfDay = null;
  private Integer maxTimeOfDay = null;
  private String week = null;

  
  /**
   * Grant permission to target user or public so they may access measurements within the given parameters. TODO: Rename target to something more intuitive.
   **/
  @ApiModelProperty(required = true, value = "Grant permission to target user or public so they may access measurements within the given parameters. TODO: Rename target to something more intuitive.")
  @JsonProperty("target")
  public Integer getTarget() {
    return target;
  }
  public void setTarget(Integer target) {
    this.target = target;
  }

  
  /**
   * ORIGINAL Variable name
   **/
  @ApiModelProperty(required = true, value = "ORIGINAL Variable name")
  @JsonProperty("variableName")
  public String getVariableName() {
    return variableName;
  }
  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  
  /**
   * Earliest time when measurements will be accessible in epoch seconds
   **/
  @ApiModelProperty(required = true, value = "Earliest time when measurements will be accessible in epoch seconds")
  @JsonProperty("min_timestamp")
  public Integer getMinTimestamp() {
    return minTimestamp;
  }
  public void setMinTimestamp(Integer minTimestamp) {
    this.minTimestamp = minTimestamp;
  }

  
  /**
   * Latest time when measurements will be accessible in epoch seconds
   **/
  @ApiModelProperty(required = true, value = "Latest time when measurements will be accessible in epoch seconds")
  @JsonProperty("max_timestamp")
  public Integer getMaxTimestamp() {
    return maxTimestamp;
  }
  public void setMaxTimestamp(Integer maxTimestamp) {
    this.maxTimestamp = maxTimestamp;
  }

  
  /**
   * Earliest time of day when measurements will be accessible in epoch seconds
   **/
  @ApiModelProperty(required = true, value = "Earliest time of day when measurements will be accessible in epoch seconds")
  @JsonProperty("min_time_of_day")
  public Integer getMinTimeOfDay() {
    return minTimeOfDay;
  }
  public void setMinTimeOfDay(Integer minTimeOfDay) {
    this.minTimeOfDay = minTimeOfDay;
  }

  
  /**
   * Latest time of day when measurements will be accessible in epoch seconds
   **/
  @ApiModelProperty(required = true, value = "Latest time of day when measurements will be accessible in epoch seconds")
  @JsonProperty("max_time_of_day")
  public Integer getMaxTimeOfDay() {
    return maxTimeOfDay;
  }
  public void setMaxTimeOfDay(Integer maxTimeOfDay) {
    this.maxTimeOfDay = maxTimeOfDay;
  }

  
  /**
   * Maybe specifies if only weekday measurements should be accessible
   **/
  @ApiModelProperty(required = true, value = "Maybe specifies if only weekday measurements should be accessible")
  @JsonProperty("week")
  public String getWeek() {
    return week;
  }
  public void setWeek(String week) {
    this.week = week;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    
    sb.append("    target: ").append(StringUtil.toIndentedString(target)).append("\n");
    sb.append("    variableName: ").append(StringUtil.toIndentedString(variableName)).append("\n");
    sb.append("    minTimestamp: ").append(StringUtil.toIndentedString(minTimestamp)).append("\n");
    sb.append("    maxTimestamp: ").append(StringUtil.toIndentedString(maxTimestamp)).append("\n");
    sb.append("    minTimeOfDay: ").append(StringUtil.toIndentedString(minTimeOfDay)).append("\n");
    sb.append("    maxTimeOfDay: ").append(StringUtil.toIndentedString(maxTimeOfDay)).append("\n");
    sb.append("    week: ").append(StringUtil.toIndentedString(week)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
