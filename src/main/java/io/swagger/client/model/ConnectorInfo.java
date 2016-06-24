package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ConnectorInfoHistoryItem;
import java.util.ArrayList;
import java.util.List;


/**
 * ConnectorInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class ConnectorInfo   {
  
  private Integer id = null;
  private Boolean connected = null;
  private String error = null;
  private List<ConnectorInfoHistoryItem> history = new ArrayList<ConnectorInfoHistoryItem>();

  
  /**
   * Connector ID number
   **/
  public ConnectorInfo id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Connector ID number")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * True if the authenticated user has this connector enabled
   **/
  public ConnectorInfo connected(Boolean connected) {
    this.connected = connected;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the authenticated user has this connector enabled")
  @JsonProperty("connected")
  public Boolean getConnected() {
    return connected;
  }
  public void setConnected(Boolean connected) {
    this.connected = connected;
  }


  /**
   * Error message. Empty if connected.
   **/
  public ConnectorInfo error(String error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Error message. Empty if connected.")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }


  /**
   **/
  public ConnectorInfo history(List<ConnectorInfoHistoryItem> history) {
    this.history = history;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("history")
  public List<ConnectorInfoHistoryItem> getHistory() {
    return history;
  }
  public void setHistory(List<ConnectorInfoHistoryItem> history) {
    this.history = history;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorInfo connectorInfo = (ConnectorInfo) o;
    return Objects.equals(this.id, connectorInfo.id) &&
        Objects.equals(this.connected, connectorInfo.connected) &&
        Objects.equals(this.error, connectorInfo.error) &&
        Objects.equals(this.history, connectorInfo.history);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connected, error, history);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

