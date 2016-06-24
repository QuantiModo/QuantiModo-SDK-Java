package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserTokenRequestInnerUserField;


/**
 * UserTokenRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class UserTokenRequest   {
  
  private UserTokenRequestInnerUserField user = null;
  private String organizationAccessToken = null;

  
  /**
   **/
  public UserTokenRequest user(UserTokenRequestInnerUserField user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public UserTokenRequest organizationAccessToken(String organizationAccessToken) {
    this.organizationAccessToken = organizationAccessToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Organization Access token")
  @JsonProperty("organizationAccessToken")
  public String getOrganizationAccessToken() {
    return organizationAccessToken;
  }
  public void setOrganizationAccessToken(String organizationAccessToken) {
    this.organizationAccessToken = organizationAccessToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTokenRequest userTokenRequest = (UserTokenRequest) o;
    return Objects.equals(this.user, userTokenRequest.user) &&
        Objects.equals(this.organizationAccessToken, userTokenRequest.organizationAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, organizationAccessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTokenRequest {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    organizationAccessToken: ").append(toIndentedString(organizationAccessToken)).append("\n");
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

