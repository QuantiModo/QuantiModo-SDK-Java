package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
public class Measurement   {
  
  private Integer id = null;
  private Integer userId = null;
  private String clientId = null;
  private Integer connectorId = null;
  private Integer variableId = null;
  private Integer sourceId = null;
  private String startTime = null;
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
   * The id for the connector data source from which the measurement was obtained
   **/
  
  @ApiModelProperty(value = "The id for the connector data source from which the measurement was obtained")
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
   * Start Time for the measurement event. Use ISO 8601
   **/
  
  @ApiModelProperty(required = true, value = "Start Time for the measurement event. Use ISO 8601")
  @JsonProperty("start_time")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The value of the measurement after conversion to the default unit for that variable
   **/
  
  @ApiModelProperty(required = true, value = "The value of the measurement after conversion to the default unit for that variable")
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }
  public void setValue(Float value) {
    this.value = value;
  }

  
  /**
   * The default unit for the variable
   **/
  
  @ApiModelProperty(required = true, value = "The default unit for the variable")
  @JsonProperty("unit_id")
  public Integer getUnitId() {
    return unitId;
  }
  public void setUnitId(Integer unitId) {
    this.unitId = unitId;
  }

  
  /**
   * Value of measurement as originally posted (before conversion to default unit)
   **/
  
  @ApiModelProperty(value = "Value of measurement as originally posted (before conversion to default unit)")
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
   * Duration of the event being measurement in seconds
   **/
  
  @ApiModelProperty(value = "Duration of the event being measurement in seconds")
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
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

  
  /**
   * Latitude at which the measurement was taken
   **/
  
  @ApiModelProperty(value = "Latitude at which the measurement was taken")
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitude at which the measurement was taken
   **/
  
  @ApiModelProperty(value = "Longitude at which the measurement was taken")
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
   * When the record was first created. Use ISO 8601 datetime format
   **/
  
  @ApiModelProperty(value = "When the record was first created. Use ISO 8601 datetime format")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * When the record in the database was last updated. Use ISO 8601 datetime format
   **/
  
  @ApiModelProperty(value = "When the record in the database was last updated. Use ISO 8601 datetime format")
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Measurement measurement = (Measurement) o;
    return Objects.equals(id, measurement.id) &&
        Objects.equals(userId, measurement.userId) &&
        Objects.equals(clientId, measurement.clientId) &&
        Objects.equals(connectorId, measurement.connectorId) &&
        Objects.equals(variableId, measurement.variableId) &&
        Objects.equals(sourceId, measurement.sourceId) &&
        Objects.equals(startTime, measurement.startTime) &&
        Objects.equals(value, measurement.value) &&
        Objects.equals(unitId, measurement.unitId) &&
        Objects.equals(originalValue, measurement.originalValue) &&
        Objects.equals(originalUnitId, measurement.originalUnitId) &&
        Objects.equals(duration, measurement.duration) &&
        Objects.equals(note, measurement.note) &&
        Objects.equals(latitude, measurement.latitude) &&
        Objects.equals(longitude, measurement.longitude) &&
        Objects.equals(location, measurement.location) &&
        Objects.equals(createdAt, measurement.createdAt) &&
        Objects.equals(updatedAt, measurement.updatedAt) &&
        Objects.equals(error, measurement.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, clientId, connectorId, variableId, sourceId, startTime, value, unitId, originalValue, originalUnitId, duration, note, latitude, longitude, location, createdAt, updatedAt, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measurement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
    sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
    sb.append("    originalUnitId: ").append(toIndentedString(originalUnitId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

