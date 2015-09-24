package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;
import io.swagger.client.model.ConnectorInfoHistoryItem;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-24T00:56:42.474Z")
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
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    connected: ").append(StringUtil.toIndentedString(connected)).append("\n");
    sb.append("    error: ").append(StringUtil.toIndentedString(error)).append("\n");
    sb.append("    history: ").append(StringUtil.toIndentedString(history)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
