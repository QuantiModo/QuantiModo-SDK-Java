package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableUserSource variableUserSource = (VariableUserSource) o;
    return Objects.equals(userId, variableUserSource.userId) &&
        Objects.equals(variableId, variableUserSource.variableId) &&
        Objects.equals(sourceId, variableUserSource.sourceId) &&
        Objects.equals(timestamp, variableUserSource.timestamp) &&
        Objects.equals(earliestMeasurementTime, variableUserSource.earliestMeasurementTime) &&
        Objects.equals(latestMeasurementTime, variableUserSource.latestMeasurementTime) &&
        Objects.equals(createdAt, variableUserSource.createdAt) &&
        Objects.equals(updatedAt, variableUserSource.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, variableId, sourceId, timestamp, earliestMeasurementTime, latestMeasurementTime, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableUserSource {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    earliestMeasurementTime: ").append(toIndentedString(earliestMeasurementTime)).append("\n");
    sb.append("    latestMeasurementTime: ").append(toIndentedString(latestMeasurementTime)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

