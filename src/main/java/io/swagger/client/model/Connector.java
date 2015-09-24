package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-24T00:56:42.474Z")
public class Connector   {
  
  private Integer id = null;
  private String name = null;
  private String displayName = null;
  private String image = null;
  private String getItUrl = null;
  private String connected = null;
  private String connectInstructions = null;
  private Integer lastUpdate = null;
  private Integer totalMeasurementsInLastUpdate = null;
  private Boolean noDataYet = null;

  
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
   * Connector lowercase system name
   **/
  @ApiModelProperty(required = true, value = "Connector lowercase system name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Connector pretty display name
   **/
  @ApiModelProperty(required = true, value = "Connector pretty display name")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * URL to the image of the connector logo
   **/
  @ApiModelProperty(required = true, value = "URL to the image of the connector logo")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
  /**
   * URL to a site where one can get this device or application
   **/
  @ApiModelProperty(required = true, value = "URL to a site where one can get this device or application")
  @JsonProperty("getItUrl")
  public String getGetItUrl() {
    return getItUrl;
  }
  public void setGetItUrl(String getItUrl) {
    this.getItUrl = getItUrl;
  }

  
  /**
   * True if the authenticated user has this connector enabled
   **/
  @ApiModelProperty(required = true, value = "True if the authenticated user has this connector enabled")
  @JsonProperty("connected")
  public String getConnected() {
    return connected;
  }
  public void setConnected(String connected) {
    this.connected = connected;
  }

  
  /**
   * URL and parameters used when connecting to a service
   **/
  @ApiModelProperty(required = true, value = "URL and parameters used when connecting to a service")
  @JsonProperty("connectInstructions")
  public String getConnectInstructions() {
    return connectInstructions;
  }
  public void setConnectInstructions(String connectInstructions) {
    this.connectInstructions = connectInstructions;
  }

  
  /**
   * Epoch timestamp of last sync
   **/
  @ApiModelProperty(required = true, value = "Epoch timestamp of last sync")
  @JsonProperty("lastUpdate")
  public Integer getLastUpdate() {
    return lastUpdate;
  }
  public void setLastUpdate(Integer lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  
  /**
   * Number of measurements obtained during latest update
   **/
  @ApiModelProperty(required = true, value = "Number of measurements obtained during latest update")
  @JsonProperty("totalMeasurementsInLastUpdate")
  public Integer getTotalMeasurementsInLastUpdate() {
    return totalMeasurementsInLastUpdate;
  }
  public void setTotalMeasurementsInLastUpdate(Integer totalMeasurementsInLastUpdate) {
    this.totalMeasurementsInLastUpdate = totalMeasurementsInLastUpdate;
  }

  
  /**
   * True if user has no measurements for this connector
   **/
  @ApiModelProperty(required = true, value = "True if user has no measurements for this connector")
  @JsonProperty("noDataYet")
  public Boolean getNoDataYet() {
    return noDataYet;
  }
  public void setNoDataYet(Boolean noDataYet) {
    this.noDataYet = noDataYet;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connector {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(StringUtil.toIndentedString(displayName)).append("\n");
    sb.append("    image: ").append(StringUtil.toIndentedString(image)).append("\n");
    sb.append("    getItUrl: ").append(StringUtil.toIndentedString(getItUrl)).append("\n");
    sb.append("    connected: ").append(StringUtil.toIndentedString(connected)).append("\n");
    sb.append("    connectInstructions: ").append(StringUtil.toIndentedString(connectInstructions)).append("\n");
    sb.append("    lastUpdate: ").append(StringUtil.toIndentedString(lastUpdate)).append("\n");
    sb.append("    totalMeasurementsInLastUpdate: ").append(StringUtil.toIndentedString(totalMeasurementsInLastUpdate)).append("\n");
    sb.append("    noDataYet: ").append(StringUtil.toIndentedString(noDataYet)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
