package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-03T22:24:11.560Z")
public class Update   {
  
  private Integer id = null;
  private Integer userId = null;
  private Integer connectorId = null;
  private Integer numberOfMeasurements = null;
  private Boolean success = null;
  private String message = null;
  private Date createdAt = null;
  private Date updatedAt = null;

  
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
   * user_id
   **/
  @ApiModelProperty(required = true, value = "user_id")
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
  @ApiModelProperty(required = true, value = "connector_id")
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
  @ApiModelProperty(required = true, value = "number_of_measurements")
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
  @ApiModelProperty(required = true, value = "success")
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
  @ApiModelProperty(required = true, value = "message")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
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
    sb.append("class Update {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    connectorId: ").append(StringUtil.toIndentedString(connectorId)).append("\n");
    sb.append("    numberOfMeasurements: ").append(StringUtil.toIndentedString(numberOfMeasurements)).append("\n");
    sb.append("    success: ").append(StringUtil.toIndentedString(success)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(StringUtil.toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
