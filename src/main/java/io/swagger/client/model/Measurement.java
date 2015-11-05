package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-05T03:15:54.261Z")
public class Measurement   {
  
  private Integer id = null;
  private Integer userId = null;
  private String clientId = null;
  private Integer connectorId = null;
  private Integer variableId = null;
  private Integer sourceId = null;
  private Integer startTime = null;
  private Float value = null;
  private Integer unitId = null;
  private Float originalValue = null;
  private Integer originalUnitId = null;
  private Integer duration = null;
  private String note = null;
  private Float latitude = null;
  private Float longitude = null;
  private String location = null;
  private Date createdAt = null;
  private Date updatedAt = null;
  private String error = null;

  
  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * ID of user that owns this measurement
   **/
  @ApiModelProperty(value = "ID of user that owns this measurement")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  
  /**
   * client_id
   **/
  @ApiModelProperty(value = "client_id")
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   * Connector ID
   **/
  @ApiModelProperty(value = "Connector ID")
  @JsonProperty("connector_id")
  public Integer getConnectorId() {
    return connectorId;
  }
  public void setConnectorId(Integer connectorId) {
    this.connectorId = connectorId;
  }

  
  /**
   * ID of the variable for which we are creating the measurement records
   **/
  @ApiModelProperty(required = true, value = "ID of the variable for which we are creating the measurement records")
  @JsonProperty("variable_id")
  public Integer getVariableId() {
    return variableId;
  }
  public void setVariableId(Integer variableId) {
    this.variableId = variableId;
  }

  
  /**
   * Application or device used to record the measurement values
   **/
  @ApiModelProperty(required = true, value = "Application or device used to record the measurement values")
  @JsonProperty("source_id")
  public Integer getSourceId() {
    return sourceId;
  }
  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   * Start Time for the measurement event in ISO 8601
   **/
  @ApiModelProperty(required = true, value = "Start Time for the measurement event in ISO 8601")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  
  /**
   * Converted measurement value in requested unit
   **/
  @ApiModelProperty(required = true, value = "Converted measurement value in requested unit")
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }
  public void setValue(Float value) {
    this.value = value;
  }

  
  /**
   * Unit ID of measurement as requested in GET request
   **/
  @ApiModelProperty(required = true, value = "Unit ID of measurement as requested in GET request")
  @JsonProperty("unit_id")
  public Integer getUnitId() {
    return unitId;
  }
  public void setUnitId(Integer unitId) {
    this.unitId = unitId;
  }

  
  /**
   * Original value
   **/
  @ApiModelProperty(value = "Original value")
  @JsonProperty("original_value")
  public Float getOriginalValue() {
    return originalValue;
  }
  public void setOriginalValue(Float originalValue) {
    this.originalValue = originalValue;
  }

  
  /**
   * Unit ID of measurement as originally submitted
   **/
  @ApiModelProperty(value = "Unit ID of measurement as originally submitted")
  @JsonProperty("original_unit_id")
  public Integer getOriginalUnitId() {
    return originalUnitId;
  }
  public void setOriginalUnitId(Integer originalUnitId) {
    this.originalUnitId = originalUnitId;
  }

  
  /**
   * duration of measurement in seconds
   **/
  @ApiModelProperty(value = "duration of measurement in seconds")
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
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

  
  /**
   * latitude
   **/
  @ApiModelProperty(value = "latitude")
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  
  /**
   * longitude
   **/
  @ApiModelProperty(value = "longitude")
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  
  /**
   * location
   **/
  @ApiModelProperty(value = "location")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
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

  
  /**
   * error
   **/
  @ApiModelProperty(value = "error")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measurement {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    clientId: ").append(StringUtil.toIndentedString(clientId)).append("\n");
    sb.append("    connectorId: ").append(StringUtil.toIndentedString(connectorId)).append("\n");
    sb.append("    variableId: ").append(StringUtil.toIndentedString(variableId)).append("\n");
    sb.append("    sourceId: ").append(StringUtil.toIndentedString(sourceId)).append("\n");
    sb.append("    startTime: ").append(StringUtil.toIndentedString(startTime)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("    unitId: ").append(StringUtil.toIndentedString(unitId)).append("\n");
    sb.append("    originalValue: ").append(StringUtil.toIndentedString(originalValue)).append("\n");
    sb.append("    originalUnitId: ").append(StringUtil.toIndentedString(originalUnitId)).append("\n");
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("    note: ").append(StringUtil.toIndentedString(note)).append("\n");
    sb.append("    latitude: ").append(StringUtil.toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(StringUtil.toIndentedString(longitude)).append("\n");
    sb.append("    location: ").append(StringUtil.toIndentedString(location)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(StringUtil.toIndentedString(updatedAt)).append("\n");
    sb.append("    error: ").append(StringUtil.toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
