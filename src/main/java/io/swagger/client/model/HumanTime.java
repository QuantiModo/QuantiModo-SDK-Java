package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * HumanTime
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class HumanTime   {
  
  private String date = null;
  private Integer timezoneType = null;
  private String timezone = null;

  
  /**
   * date time
   **/
  public HumanTime date(String date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "date time")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }


  /**
   **/
  public HumanTime timezoneType(Integer timezoneType) {
    this.timezoneType = timezoneType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public HumanTime timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "timezone of date time")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HumanTime humanTime = (HumanTime) o;
    return Objects.equals(this.date, humanTime.date) &&
        Objects.equals(this.timezoneType, humanTime.timezoneType) &&
        Objects.equals(this.timezone, humanTime.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, timezoneType, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HumanTime {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    timezoneType: ").append(toIndentedString(timezoneType)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

