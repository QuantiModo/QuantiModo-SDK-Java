package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * Update
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class Update   {
  
  private Integer id = null;
  private Integer userId = null;
  private Integer connectorId = null;
  private Integer numberOfMeasurements = null;
  private Boolean success = null;
  private String message = null;
  private DateTime createdAt = null;
  private DateTime updatedAt = null;

  
  /**
   * id
   **/
  public Update id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * user_id
   **/
  public Update userId(Integer userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "user_id")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  /**
   * connector_id
   **/
  public Update connectorId(Integer connectorId) {
    this.connectorId = connectorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "connector_id")
  @JsonProperty("connector_id")
  public Integer getConnectorId() {
    return connectorId;
  }
  public void setConnectorId(Integer connectorId) {
    this.connectorId = connectorId;
  }


  /**
   * number_of_measurements
   **/
  public Update numberOfMeasurements(Integer numberOfMeasurements) {
    this.numberOfMeasurements = numberOfMeasurements;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "number_of_measurements")
  @JsonProperty("number_of_measurements")
  public Integer getNumberOfMeasurements() {
    return numberOfMeasurements;
  }
  public void setNumberOfMeasurements(Integer numberOfMeasurements) {
    this.numberOfMeasurements = numberOfMeasurements;
  }


  /**
   * success
   **/
  public Update success(Boolean success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "success")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  /**
   * message
   **/
  public Update message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "message")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * When the record was first created. Use ISO 8601 datetime format
   **/
  public Update createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the record was first created. Use ISO 8601 datetime format")
  @JsonProperty("created_at")
  public DateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * When the record in the database was last updated. Use ISO 8601 datetime format
   **/
  public Update updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the record in the database was last updated. Use ISO 8601 datetime format")
  @JsonProperty("updated_at")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Update update = (Update) o;
    return Objects.equals(this.id, update.id) &&
        Objects.equals(this.userId, update.userId) &&
        Objects.equals(this.connectorId, update.connectorId) &&
        Objects.equals(this.numberOfMeasurements, update.numberOfMeasurements) &&
        Objects.equals(this.success, update.success) &&
        Objects.equals(this.message, update.message) &&
        Objects.equals(this.createdAt, update.createdAt) &&
        Objects.equals(this.updatedAt, update.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, connectorId, numberOfMeasurements, success, message, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Update {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
    sb.append("    numberOfMeasurements: ").append(toIndentedString(numberOfMeasurements)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

