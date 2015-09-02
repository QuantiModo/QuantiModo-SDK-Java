package io.swagger.client.model;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-02T06:04:40.138Z")
public class UserTokenSuccessfulResponseInnerUserField   {
  
  private Integer id = null;
  private String accessToken = null;

  
  /**
   * WordPress user ID
   **/
  @ApiModelProperty(required = true, value = "WordPress user ID")
  @JsonProperty("_id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * User token
   **/
  @ApiModelProperty(required = true, value = "User token")
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTokenSuccessfulResponseInnerUserField {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
