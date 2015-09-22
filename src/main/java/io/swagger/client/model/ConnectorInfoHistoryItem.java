package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-22T01:20:58.482Z")
public class ConnectorInfoHistoryItem   {
  
  private Integer numberOfMeasurements = null;
  private Boolean success = null;
  private String message = null;
  private String createdAt = null;

  
  /**
   * Number of measurements
   **/
  @ApiModelProperty(required = true, value = "Number of measurements")
  @JsonProperty("number_of_measurements")
  public Integer getNumberOfMeasurements() {
    return numberOfMeasurements;
  }
  public void setNumberOfMeasurements(Integer numberOfMeasurements) {
    this.numberOfMeasurements = numberOfMeasurements;
  }

  
  /**
   * True if the update was successfull
   **/
  @ApiModelProperty(required = true, value = "True if the update was successfull")
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
  @ApiModelProperty(required = true, value = "Error message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * Date and time of the update
   **/
  @ApiModelProperty(required = true, value = "Date and time of the update")
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorInfoHistoryItem {\n");
    
    sb.append("    numberOfMeasurements: ").append(StringUtil.toIndentedString(numberOfMeasurements)).append("\n");
    sb.append("    success: ").append(StringUtil.toIndentedString(success)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
