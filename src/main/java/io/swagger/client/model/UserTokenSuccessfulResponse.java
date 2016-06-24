package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserTokenSuccessfulResponseInnerUserField;


/**
 * UserTokenSuccessfulResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class UserTokenSuccessfulResponse   {
  
  private Integer code = null;
  private String message = null;
  private UserTokenSuccessfulResponseInnerUserField user = null;

  
  /**
   * Status code
   **/
  public UserTokenSuccessfulResponse code(Integer code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Status code")
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
  public UserTokenSuccessfulResponse message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Message")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   **/
  public UserTokenSuccessfulResponse user(UserTokenSuccessfulResponseInnerUserField user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("user")
  public UserTokenSuccessfulResponseInnerUserField getUser() {
    return user;
  }
  public void setUser(UserTokenSuccessfulResponseInnerUserField user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTokenSuccessfulResponse userTokenSuccessfulResponse = (UserTokenSuccessfulResponse) o;
    return Objects.equals(this.code, userTokenSuccessfulResponse.code) &&
        Objects.equals(this.message, userTokenSuccessfulResponse.message) &&
        Objects.equals(this.user, userTokenSuccessfulResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTokenSuccessfulResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

