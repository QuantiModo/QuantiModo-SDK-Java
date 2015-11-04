package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Credential;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-03T22:24:11.560Z")
public class InlineResponse2009   {
  
  private List<Credential> data = new ArrayList<Credential>();
  private Boolean success = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public List<Credential> getData() {
    return data;
  }
  public void setData(List<Credential> data) {
    this.data = data;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
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
    sb.append("class InlineResponse2009 {\n");
    
    sb.append("    data: ").append(StringUtil.toIndentedString(data)).append("\n");
    sb.append("    success: ").append(StringUtil.toIndentedString(success)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
