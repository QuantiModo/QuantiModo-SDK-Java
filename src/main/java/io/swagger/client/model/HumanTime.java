package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-22T01:20:58.482Z")
public class HumanTime   {
  
  private String date = null;
  private Integer timezoneType = null;
  private String timezone = null;

  
  /**
   * date time
   **/
  @ApiModelProperty(value = "date time")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timezone_type")
  public Integer getTimezoneType() {
    return timezoneType;
  }
  public void setTimezoneType(Integer timezoneType) {
    this.timezoneType = timezoneType;
  }

  
  /**
   * timezone of date time
   **/
  @ApiModelProperty(value = "timezone of date time")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HumanTime {\n");
    
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("    timezoneType: ").append(StringUtil.toIndentedString(timezoneType)).append("\n");
    sb.append("    timezone: ").append(StringUtil.toIndentedString(timezone)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
