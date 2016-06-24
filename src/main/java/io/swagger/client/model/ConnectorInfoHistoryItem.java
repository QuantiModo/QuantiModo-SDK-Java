package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ConnectorInfoHistoryItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class ConnectorInfoHistoryItem   {
  
  private Integer numberOfMeasurements = null;
  private Boolean success = null;
  private String message = null;
  private String createdAt = null;

  
  /**
   * Number of measurements
   **/
  public ConnectorInfoHistoryItem numberOfMeasurements(Integer numberOfMeasurements) {
    this.numberOfMeasurements = numberOfMeasurements;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of measurements")
  @JsonProperty("numberOfMeasurements")
  public Integer getNumberOfMeasurements() {
    return numberOfMeasurements;
  }
  public void setNumberOfMeasurements(Integer numberOfMeasurements) {
    this.numberOfMeasurements = numberOfMeasurements;
  }


  /**
   * True if the update was successfull
   **/
  public ConnectorInfoHistoryItem success(Boolean success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the update was successfull")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  /**
   * Error message.
   **/
  public ConnectorInfoHistoryItem message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Error message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Date and time of the update in UTC time zone
   **/
  public ConnectorInfoHistoryItem createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date and time of the update in UTC time zone")
  @JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorInfoHistoryItem connectorInfoHistoryItem = (ConnectorInfoHistoryItem) o;
    return Objects.equals(this.numberOfMeasurements, connectorInfoHistoryItem.numberOfMeasurements) &&
        Objects.equals(this.success, connectorInfoHistoryItem.success) &&
        Objects.equals(this.message, connectorInfoHistoryItem.message) &&
        Objects.equals(this.createdAt, connectorInfoHistoryItem.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfMeasurements, success, message, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorInfoHistoryItem {\n");
    
    sb.append("    numberOfMeasurements: ").append(toIndentedString(numberOfMeasurements)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

