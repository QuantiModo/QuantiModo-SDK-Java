package io.swagger.client.model;

import io.swagger.client.model.UserTokenRequestInnerUserField;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-02T06:04:40.138Z")
public class UserTokenRequest   {
  
  private UserTokenRequestInnerUserField user = null;
  private String organizationAccessToken = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("user")
  public UserTokenRequestInnerUserField getUser() {
    return user;
  }
  public void setUser(UserTokenRequestInnerUserField user) {
    this.user = user;
  }

  
  /**
   * Organization Access token
   **/
  @ApiModelProperty(required = true, value = "Organization Access token")
  @JsonProperty("organization_access_token")
  public String getOrganizationAccessToken() {
    return organizationAccessToken;
  }
  public void setOrganizationAccessToken(String organizationAccessToken) {
    this.organizationAccessToken = organizationAccessToken;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTokenRequest {\n");
    
    sb.append("  user: ").append(user).append("\n");
    sb.append("  organizationAccessToken: ").append(organizationAccessToken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
