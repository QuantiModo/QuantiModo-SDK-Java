package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Connector
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
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
  public Connector id(Integer id) {
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
   * Connector lowercase system name
   **/
  public Connector name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Connector lowercase system name")
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
  public Connector displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Connector pretty display name")
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
  public Connector image(String image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "URL to the image of the connector logo")
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
  public Connector getItUrl(String getItUrl) {
    this.getItUrl = getItUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "URL to a site where one can get this device or application")
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
  public Connector connected(String connected) {
    this.connected = connected;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if the authenticated user has this connector enabled")
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
  public Connector connectInstructions(String connectInstructions) {
    this.connectInstructions = connectInstructions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "URL and parameters used when connecting to a service")
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
  public Connector lastUpdate(Integer lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Epoch timestamp of last sync")
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
  public Connector totalMeasurementsInLastUpdate(Integer totalMeasurementsInLastUpdate) {
    this.totalMeasurementsInLastUpdate = totalMeasurementsInLastUpdate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of measurements obtained during latest update")
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
  public Connector noDataYet(Boolean noDataYet) {
    this.noDataYet = noDataYet;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True if user has no measurements for this connector")
  @JsonProperty("noDataYet")
  public Boolean getNoDataYet() {
    return noDataYet;
  }
  public void setNoDataYet(Boolean noDataYet) {
    this.noDataYet = noDataYet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connector connector = (Connector) o;
    return Objects.equals(this.id, connector.id) &&
        Objects.equals(this.name, connector.name) &&
        Objects.equals(this.displayName, connector.displayName) &&
        Objects.equals(this.image, connector.image) &&
        Objects.equals(this.getItUrl, connector.getItUrl) &&
        Objects.equals(this.connected, connector.connected) &&
        Objects.equals(this.connectInstructions, connector.connectInstructions) &&
        Objects.equals(this.lastUpdate, connector.lastUpdate) &&
        Objects.equals(this.totalMeasurementsInLastUpdate, connector.totalMeasurementsInLastUpdate) &&
        Objects.equals(this.noDataYet, connector.noDataYet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, displayName, image, getItUrl, connected, connectInstructions, lastUpdate, totalMeasurementsInLastUpdate, noDataYet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connector {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    getItUrl: ").append(toIndentedString(getItUrl)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    connectInstructions: ").append(toIndentedString(connectInstructions)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    totalMeasurementsInLastUpdate: ").append(toIndentedString(totalMeasurementsInLastUpdate)).append("\n");
    sb.append("    noDataYet: ").append(toIndentedString(noDataYet)).append("\n");
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

