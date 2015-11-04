package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-03T22:24:11.560Z")
public class Connection   {
  
  private Integer id = null;
  private Integer userId = null;
  private Integer connectorId = null;
  private String connectStatus = null;
  private String connectError = null;
  private Date updateRequestedAt = null;
  private String updateStatus = null;
  private String updateError = null;
  private Date lastSuccessfulUpdatedAt = null;
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
  @ApiModelProperty(value = "user_id")
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
   * connect_status
   **/
  @ApiModelProperty(value = "connect_status")
  @JsonProperty("connect_status")
  public String getConnectStatus() {
    return connectStatus;
  }
  public void setConnectStatus(String connectStatus) {
    this.connectStatus = connectStatus;
  }

  
  /**
   * connect_error
   **/
  @ApiModelProperty(value = "connect_error")
  @JsonProperty("connect_error")
  public String getConnectError() {
    return connectError;
  }
  public void setConnectError(String connectError) {
    this.connectError = connectError;
  }

  
  /**
   * update_requested_at
   **/
  @ApiModelProperty(value = "update_requested_at")
  @JsonProperty("update_requested_at")
  public Date getUpdateRequestedAt() {
    return updateRequestedAt;
  }
  public void setUpdateRequestedAt(Date updateRequestedAt) {
    this.updateRequestedAt = updateRequestedAt;
  }

  
  /**
   * update_status
   **/
  @ApiModelProperty(value = "update_status")
  @JsonProperty("update_status")
  public String getUpdateStatus() {
    return updateStatus;
  }
  public void setUpdateStatus(String updateStatus) {
    this.updateStatus = updateStatus;
  }

  
  /**
   * update_error
   **/
  @ApiModelProperty(value = "update_error")
  @JsonProperty("update_error")
  public String getUpdateError() {
    return updateError;
  }
  public void setUpdateError(String updateError) {
    this.updateError = updateError;
  }

  
  /**
   * last_successful_updated_at
   **/
  @ApiModelProperty(value = "last_successful_updated_at")
  @JsonProperty("last_successful_updated_at")
  public Date getLastSuccessfulUpdatedAt() {
    return lastSuccessfulUpdatedAt;
  }
  public void setLastSuccessfulUpdatedAt(Date lastSuccessfulUpdatedAt) {
    this.lastSuccessfulUpdatedAt = lastSuccessfulUpdatedAt;
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
    sb.append("class Connection {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    connectorId: ").append(StringUtil.toIndentedString(connectorId)).append("\n");
    sb.append("    connectStatus: ").append(StringUtil.toIndentedString(connectStatus)).append("\n");
    sb.append("    connectError: ").append(StringUtil.toIndentedString(connectError)).append("\n");
    sb.append("    updateRequestedAt: ").append(StringUtil.toIndentedString(updateRequestedAt)).append("\n");
    sb.append("    updateStatus: ").append(StringUtil.toIndentedString(updateStatus)).append("\n");
    sb.append("    updateError: ").append(StringUtil.toIndentedString(updateError)).append("\n");
    sb.append("    lastSuccessfulUpdatedAt: ").append(StringUtil.toIndentedString(lastSuccessfulUpdatedAt)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(StringUtil.toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
