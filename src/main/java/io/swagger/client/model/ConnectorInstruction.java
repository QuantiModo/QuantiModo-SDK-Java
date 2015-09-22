package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-22T01:20:58.482Z")
public class ConnectorInstruction   {
  
  private String url = null;
  private List<String> parameters = new ArrayList<String>();
  private Boolean usePopup = null;

  
  /**
   * url
   **/
  @ApiModelProperty(value = "url")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * parameters array
   **/
  @ApiModelProperty(value = "parameters array")
  @JsonProperty("parameters")
  public List<String> getParameters() {
    return parameters;
  }
  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }

  
  /**
   * usePopup
   **/
  @ApiModelProperty(value = "usePopup")
  @JsonProperty("usePopup")
  public Boolean getUsePopup() {
    return usePopup;
  }
  public void setUsePopup(Boolean usePopup) {
    this.usePopup = usePopup;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorInstruction {\n");
    
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("    parameters: ").append(StringUtil.toIndentedString(parameters)).append("\n");
    sb.append("    usePopup: ").append(StringUtil.toIndentedString(usePopup)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
