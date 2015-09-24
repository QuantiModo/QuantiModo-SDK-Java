package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-24T00:56:42.474Z")
public class MeasurementRange   {
  
  private Integer lowerLimit = null;
  private Integer upperLimit = null;

  
  /**
   * The timestamp of the earliest measurement for a user.
   **/
  @ApiModelProperty(required = true, value = "The timestamp of the earliest measurement for a user.")
  @JsonProperty("lowerLimit")
  public Integer getLowerLimit() {
    return lowerLimit;
  }
  public void setLowerLimit(Integer lowerLimit) {
    this.lowerLimit = lowerLimit;
  }

  
  /**
   * The timestamp of the most recent measurement for a user.
   **/
  @ApiModelProperty(value = "The timestamp of the most recent measurement for a user.")
  @JsonProperty("upperLimit")
  public Integer getUpperLimit() {
    return upperLimit;
  }
  public void setUpperLimit(Integer upperLimit) {
    this.upperLimit = upperLimit;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementRange {\n");
    
    sb.append("    lowerLimit: ").append(StringUtil.toIndentedString(lowerLimit)).append("\n");
    sb.append("    upperLimit: ").append(StringUtil.toIndentedString(upperLimit)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
