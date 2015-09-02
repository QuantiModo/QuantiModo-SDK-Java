package io.swagger.client.model;

import io.swagger.client.model.UserTokenSuccessfulResponseInnerUserField;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-02T06:04:40.138Z")
public class UserTokenSuccessfulResponse   {
  
  private Integer code = null;
  private String message = null;
  private UserTokenSuccessfulResponseInnerUserField user = null;

  
  /**
   * Status code
   **/
  @ApiModelProperty(required = true, value = "Status code")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  
  /**
   * Message
   **/
  @ApiModelProperty(required = true, value = "Message")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("user")
  public UserTokenSuccessfulResponseInnerUserField getUser() {
    return user;
  }
  public void setUser(UserTokenSuccessfulResponseInnerUserField user) {
    this.user = user;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTokenSuccessfulResponse {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
