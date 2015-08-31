package io.swagger.client.model;

import java.util.*;
import io.swagger.client.model.ConnectorInfoHistoryItem;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-08-31T05:51:00.313Z")
public class ConnectorInfo   {
  
  private Integer id = null;
  private Boolean connected = null;
  private String error = null;
  private List<ConnectorInfoHistoryItem> history = new ArrayList<ConnectorInfoHistoryItem>();

  
  /**
   * Connector ID number
   **/
  @ApiModelProperty(required = true, value = "Connector ID number")
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
  @ApiModelProperty(required = true, value = "True if the authenticated user has this connector enabled")
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
  @ApiModelProperty(required = true, value = "Error message. Empty if connected.")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("history")
  public List<ConnectorInfoHistoryItem> getHistory() {
    return history;
  }
  public void setHistory(List<ConnectorInfoHistoryItem> history) {
    this.history = history;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorInfo {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  connected: ").append(connected).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  history: ").append(history).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
