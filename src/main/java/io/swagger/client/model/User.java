package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * User
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
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
  public User id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User id")
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
  public User wpId(Integer wpId) {
    this.wpId = wpId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Wordpress user id")
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
  public User displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User display name")
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
  public User loginName(String loginName) {
    this.loginName = loginName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User login name")
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
  public User email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User email")
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
  public User token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User token")
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
  public User administrator(Boolean administrator) {
    this.administrator = administrator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Is user administrator")
  @JsonProperty("administrator")
  public Boolean getAdministrator() {
    return administrator;
  }
  public void setAdministrator(Boolean administrator) {
    this.administrator = administrator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.wpId, user.wpId) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.loginName, user.loginName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.token, user.token) &&
        Objects.equals(this.administrator, user.administrator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, wpId, displayName, loginName, email, token, administrator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    wpId: ").append(toIndentedString(wpId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    loginName: ").append(toIndentedString(loginName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    administrator: ").append(toIndentedString(administrator)).append("\n");
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

