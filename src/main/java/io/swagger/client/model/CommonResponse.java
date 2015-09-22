package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-22T01:20:58.482Z")
public class CommonResponse   {
  
  private Integer status = null;
  private String message = null;
  private Boolean success = null;

  
  /**
   * Status code
   **/
  @ApiModelProperty(required = true, value = "Status code")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Message
   **/
  @ApiModelProperty(value = "Message")
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
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponse {\n");
    
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    success: ").append(StringUtil.toIndentedString(success)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
