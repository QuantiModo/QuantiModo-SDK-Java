package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * Connection
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class Connection   {
  
  private Integer id = null;
  private Integer userId = null;
  private Integer connectorId = null;
  private String connectStatus = null;
  private String connectError = null;
  private DateTime updateRequestedAt = null;
  private String updateStatus = null;
  private String updateError = null;
  private DateTime lastSuccessfulUpdatedAt = null;
  private DateTime createdAt = null;
  private DateTime updatedAt = null;

  
  /**
   * id
   **/
  public Connection id(Integer id) {
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
   * ID of user that owns this correlation
   **/
  public Connection userId(Integer userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of user that owns this correlation")
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
  public Connection connectorId(Integer connectorId) {
    this.connectorId = connectorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id for the connector data source for which the connection is connected")
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
  public Connection connectStatus(String connectStatus) {
    this.connectStatus = connectStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether a connector is currently connected to a service for a user.")
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
  public Connection connectError(String connectError) {
    this.connectError = connectError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error message if there is a problem with authorizing this connection.")
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
  public Connection updateRequestedAt(DateTime updateRequestedAt) {
    this.updateRequestedAt = updateRequestedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time at which an update was requested by a user.")
  @JsonProperty("update_requested_at")
  public DateTime getUpdateRequestedAt() {
    return updateRequestedAt;
  }
  public void setUpdateRequestedAt(DateTime updateRequestedAt) {
    this.updateRequestedAt = updateRequestedAt;
  }


  /**
   * Indicates whether a connector is currently updated.
   **/
  public Connection updateStatus(String updateStatus) {
    this.updateStatus = updateStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether a connector is currently updated.")
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
  public Connection updateError(String updateError) {
    this.updateError = updateError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if there was an error during the update.")
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
  public Connection lastSuccessfulUpdatedAt(DateTime lastSuccessfulUpdatedAt) {
    this.lastSuccessfulUpdatedAt = lastSuccessfulUpdatedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time at which the connector was last successfully updated.")
  @JsonProperty("last_successful_updated_at")
  public DateTime getLastSuccessfulUpdatedAt() {
    return lastSuccessfulUpdatedAt;
  }
  public void setLastSuccessfulUpdatedAt(DateTime lastSuccessfulUpdatedAt) {
    this.lastSuccessfulUpdatedAt = lastSuccessfulUpdatedAt;
  }


  /**
   * When the record was first created. Use ISO 8601 datetime format
   **/
  public Connection createdAt(DateTime createdAt) {
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
  public Connection updatedAt(DateTime updatedAt) {
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
    Connection connection = (Connection) o;
    return Objects.equals(this.id, connection.id) &&
        Objects.equals(this.userId, connection.userId) &&
        Objects.equals(this.connectorId, connection.connectorId) &&
        Objects.equals(this.connectStatus, connection.connectStatus) &&
        Objects.equals(this.connectError, connection.connectError) &&
        Objects.equals(this.updateRequestedAt, connection.updateRequestedAt) &&
        Objects.equals(this.updateStatus, connection.updateStatus) &&
        Objects.equals(this.updateError, connection.updateError) &&
        Objects.equals(this.lastSuccessfulUpdatedAt, connection.lastSuccessfulUpdatedAt) &&
        Objects.equals(this.createdAt, connection.createdAt) &&
        Objects.equals(this.updatedAt, connection.updatedAt);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

