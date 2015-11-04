package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-03T22:24:11.560Z")
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
   * Short description
   **/
  @ApiModelProperty(required = true, value = "Short description")
  @JsonProperty("short_description")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  
  /**
   * Long description
   **/
  @ApiModelProperty(required = true, value = "Long description")
  @JsonProperty("long_description")
  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  
  /**
   * enabled
   **/
  @ApiModelProperty(required = true, value = "enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * oauth
   **/
  @ApiModelProperty(required = true, value = "oauth")
  @JsonProperty("oauth")
  public Boolean getOauth() {
    return oauth;
  }
  public void setOauth(Boolean oauth) {
    this.oauth = oauth;
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
    sb.append("    shortDescription: ").append(StringUtil.toIndentedString(shortDescription)).append("\n");
    sb.append("    longDescription: ").append(StringUtil.toIndentedString(longDescription)).append("\n");
    sb.append("    enabled: ").append(StringUtil.toIndentedString(enabled)).append("\n");
    sb.append("    oauth: ").append(StringUtil.toIndentedString(oauth)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
