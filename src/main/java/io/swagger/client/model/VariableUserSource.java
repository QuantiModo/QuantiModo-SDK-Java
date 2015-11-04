package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-03T22:24:11.560Z")
public class VariableUserSource   {
  
  private Integer userId = null;
  private Integer variableId = null;
  private Integer sourceId = null;
  private Integer timestamp = null;
  private Integer earliestMeasurementTime = null;
  private Integer latestMeasurementTime = null;
  private Date createdAt = null;
  private Date updatedAt = null;

  
  /**
   * ID of User
   **/
  @ApiModelProperty(value = "ID of User")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  
  /**
   * ID of variable
   **/
  @ApiModelProperty(required = true, value = "ID of variable")
  @JsonProperty("variable_id")
  public Integer getVariableId() {
    return variableId;
  }
  public void setVariableId(Integer variableId) {
    this.variableId = variableId;
  }

  
  /**
   * ID of source
   **/
  @ApiModelProperty(required = true, value = "ID of source")
  @JsonProperty("source_id")
  public Integer getSourceId() {
    return sourceId;
  }
  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   * Time that this measurement occurred Uses epoch minute (epoch time divided by 60)
   **/
  @ApiModelProperty(required = true, value = "Time that this measurement occurred Uses epoch minute (epoch time divided by 60)")
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * Earliest measurement time
   **/
  @ApiModelProperty(required = true, value = "Earliest measurement time")
  @JsonProperty("earliest_measurement_time")
  public Integer getEarliestMeasurementTime() {
    return earliestMeasurementTime;
  }
  public void setEarliestMeasurementTime(Integer earliestMeasurementTime) {
    this.earliestMeasurementTime = earliestMeasurementTime;
  }

  
  /**
   * Latest measurement time
   **/
  @ApiModelProperty(required = true, value = "Latest measurement time")
  @JsonProperty("latest_measurement_time")
  public Integer getLatestMeasurementTime() {
    return latestMeasurementTime;
  }
  public void setLatestMeasurementTime(Integer latestMeasurementTime) {
    this.latestMeasurementTime = latestMeasurementTime;
  }

  
  /**
   * created_at
   **/
  @ApiModelProperty(value = "created_at")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * updated_at
   **/
  @ApiModelProperty(value = "updated_at")
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableUserSource {\n");
    
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    variableId: ").append(StringUtil.toIndentedString(variableId)).append("\n");
    sb.append("    sourceId: ").append(StringUtil.toIndentedString(sourceId)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    earliestMeasurementTime: ").append(StringUtil.toIndentedString(earliestMeasurementTime)).append("\n");
    sb.append("    latestMeasurementTime: ").append(StringUtil.toIndentedString(latestMeasurementTime)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(StringUtil.toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
