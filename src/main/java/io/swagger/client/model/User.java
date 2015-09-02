package io.swagger.client.model;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-02T06:04:40.138Z")
public class User   {
  
  private Integer id = null;
  private Integer wpId = null;
  private String displayName = null;
  private String loginName = null;
  private String email = null;
  private String token = null;
  private Boolean administrator = null;

  
  /**
   * User id
   **/
  @ApiModelProperty(required = true, value = "User id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * Wordpress user id
   **/
  @ApiModelProperty(required = true, value = "Wordpress user id")
  @JsonProperty("wpId")
  public Integer getWpId() {
    return wpId;
  }
  public void setWpId(Integer wpId) {
    this.wpId = wpId;
  }

  
  /**
   * User display name
   **/
  @ApiModelProperty(required = true, value = "User display name")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * User login name
   **/
  @ApiModelProperty(required = true, value = "User login name")
  @JsonProperty("loginName")
  public String getLoginName() {
    return loginName;
  }
  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  
  /**
   * User email
   **/
  @ApiModelProperty(required = true, value = "User email")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * User token
   **/
  @ApiModelProperty(required = true, value = "User token")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Is user administrator
   **/
  @ApiModelProperty(required = true, value = "Is user administrator")
  @JsonProperty("administrator")
  public Boolean getAdministrator() {
    return administrator;
  }
  public void setAdministrator(Boolean administrator) {
    this.administrator = administrator;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  wpId: ").append(wpId).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  loginName: ").append(loginName).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  administrator: ").append(administrator).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
