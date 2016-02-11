package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
public class Connector   {
  
  private Integer id = null;
  private String name = null;
  private String displayName = null;
  private String image = null;
  private String getItUrl = null;
  private String shortDescription = null;
  private String longDescription = null;
  private Boolean enabled = null;
  private Boolean oauth = null;
  private Date createdAt = null;
  private Date updatedAt = null;

  
  /**
   * Connector ID number
   **/
  
  @ApiModelProperty(value = "Connector ID number")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * Lowercase system name for the data source
   **/
  
  @ApiModelProperty(required = true, value = "Lowercase system name for the data source")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Pretty display name for the data source
   **/
  
  @ApiModelProperty(required = true, value = "Pretty display name for the data source")
  @JsonProperty("display_name")
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
  @JsonProperty("get_it_url")
  public String getGetItUrl() {
    return getItUrl;
  }
  public void setGetItUrl(String getItUrl) {
    this.getItUrl = getItUrl;
  }

  
  /**
   * Short description of the service (such as the categories it tracks)
   **/
  
  @ApiModelProperty(required = true, value = "Short description of the service (such as the categories it tracks)")
  @JsonProperty("short_description")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  
  /**
   * Longer paragraph description of the data provider
   **/
  
  @ApiModelProperty(required = true, value = "Longer paragraph description of the data provider")
  @JsonProperty("long_description")
  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  
  /**
   * Set to 1 if the connector should be returned when listing connectors
   **/
  
  @ApiModelProperty(required = true, value = "Set to 1 if the connector should be returned when listing connectors")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Set to 1 if the connector uses OAuth authentication as opposed to username/password
   **/
  
  @ApiModelProperty(required = true, value = "Set to 1 if the connector uses OAuth authentication as opposed to username/password")
  @JsonProperty("oauth")
  public Boolean getOauth() {
    return oauth;
  }
  public void setOauth(Boolean oauth) {
    this.oauth = oauth;
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
    Connector connector = (Connector) o;
    return Objects.equals(id, connector.id) &&
        Objects.equals(name, connector.name) &&
        Objects.equals(displayName, connector.displayName) &&
        Objects.equals(image, connector.image) &&
        Objects.equals(getItUrl, connector.getItUrl) &&
        Objects.equals(shortDescription, connector.shortDescription) &&
        Objects.equals(longDescription, connector.longDescription) &&
        Objects.equals(enabled, connector.enabled) &&
        Objects.equals(oauth, connector.oauth) &&
        Objects.equals(createdAt, connector.createdAt) &&
        Objects.equals(updatedAt, connector.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, displayName, image, getItUrl, shortDescription, longDescription, enabled, oauth, createdAt, updatedAt);
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
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
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

