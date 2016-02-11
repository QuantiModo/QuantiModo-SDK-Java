package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
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
   * ID of user that owns this correlation
   **/
  
  @ApiModelProperty(value = "ID of user that owns this correlation")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  
  /**
   * The id for the connector data source for which the connection is connected
   **/
  
  @ApiModelProperty(required = true, value = "The id for the connector data source for which the connection is connected")
  @JsonProperty("connector_id")
  public Integer getConnectorId() {
    return connectorId;
  }
  public void setConnectorId(Integer connectorId) {
    this.connectorId = connectorId;
  }

  
  /**
   * Indicates whether a connector is currently connected to a service for a user.
   **/
  
  @ApiModelProperty(value = "Indicates whether a connector is currently connected to a service for a user.")
  @JsonProperty("connect_status")
  public String getConnectStatus() {
    return connectStatus;
  }
  public void setConnectStatus(String connectStatus) {
    this.connectStatus = connectStatus;
  }

  
  /**
   * Error message if there is a problem with authorizing this connection.
   **/
  
  @ApiModelProperty(value = "Error message if there is a problem with authorizing this connection.")
  @JsonProperty("connect_error")
  public String getConnectError() {
    return connectError;
  }
  public void setConnectError(String connectError) {
    this.connectError = connectError;
  }

  
  /**
   * Time at which an update was requested by a user.
   **/
  
  @ApiModelProperty(value = "Time at which an update was requested by a user.")
  @JsonProperty("update_requested_at")
  public Date getUpdateRequestedAt() {
    return updateRequestedAt;
  }
  public void setUpdateRequestedAt(Date updateRequestedAt) {
    this.updateRequestedAt = updateRequestedAt;
  }

  
  /**
   * Indicates whether a connector is currently updated.
   **/
  
  @ApiModelProperty(value = "Indicates whether a connector is currently updated.")
  @JsonProperty("update_status")
  public String getUpdateStatus() {
    return updateStatus;
  }
  public void setUpdateStatus(String updateStatus) {
    this.updateStatus = updateStatus;
  }

  
  /**
   * Indicates if there was an error during the update.
   **/
  
  @ApiModelProperty(value = "Indicates if there was an error during the update.")
  @JsonProperty("update_error")
  public String getUpdateError() {
    return updateError;
  }
  public void setUpdateError(String updateError) {
    this.updateError = updateError;
  }

  
  /**
   * The time at which the connector was last successfully updated.
   **/
  
  @ApiModelProperty(value = "The time at which the connector was last successfully updated.")
  @JsonProperty("last_successful_updated_at")
  public Date getLastSuccessfulUpdatedAt() {
    return lastSuccessfulUpdatedAt;
  }
  public void setLastSuccessfulUpdatedAt(Date lastSuccessfulUpdatedAt) {
    this.lastSuccessfulUpdatedAt = lastSuccessfulUpdatedAt;
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
    Connection connection = (Connection) o;
    return Objects.equals(id, connection.id) &&
        Objects.equals(userId, connection.userId) &&
        Objects.equals(connectorId, connection.connectorId) &&
        Objects.equals(connectStatus, connection.connectStatus) &&
        Objects.equals(connectError, connection.connectError) &&
        Objects.equals(updateRequestedAt, connection.updateRequestedAt) &&
        Objects.equals(updateStatus, connection.updateStatus) &&
        Objects.equals(updateError, connection.updateError) &&
        Objects.equals(lastSuccessfulUpdatedAt, connection.lastSuccessfulUpdatedAt) &&
        Objects.equals(createdAt, connection.createdAt) &&
        Objects.equals(updatedAt, connection.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, connectorId, connectStatus, connectError, updateRequestedAt, updateStatus, updateError, lastSuccessfulUpdatedAt, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
    sb.append("    connectStatus: ").append(toIndentedString(connectStatus)).append("\n");
    sb.append("    connectError: ").append(toIndentedString(connectError)).append("\n");
    sb.append("    updateRequestedAt: ").append(toIndentedString(updateRequestedAt)).append("\n");
    sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
    sb.append("    updateError: ").append(toIndentedString(updateError)).append("\n");
    sb.append("    lastSuccessfulUpdatedAt: ").append(toIndentedString(lastSuccessfulUpdatedAt)).append("\n");
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

