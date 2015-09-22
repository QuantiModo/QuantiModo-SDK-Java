package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-22T01:20:58.482Z")
public class PostCorrelation   {
  
  private String cause = null;
  private String effect = null;
  private Double correlation = null;
  private Integer vote = null;

  
  /**
   * Cause variable name
   **/
  @ApiModelProperty(required = true, value = "Cause variable name")
  @JsonProperty("cause")
  public String getCause() {
    return cause;
  }
  public void setCause(String cause) {
    this.cause = cause;
  }

  
  /**
   * Effect variable name
   **/
  @ApiModelProperty(required = true, value = "Effect variable name")
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }
  public void setEffect(String effect) {
    this.effect = effect;
  }

  
  /**
   * Correlation value
   **/
  @ApiModelProperty(required = true, value = "Correlation value")
  @JsonProperty("correlation")
  public Double getCorrelation() {
    return correlation;
  }
  public void setCorrelation(Double correlation) {
    this.correlation = correlation;
  }

  
  /**
   * Vote: 0 or 1
   **/
  @ApiModelProperty(value = "Vote: 0 or 1")
  @JsonProperty("vote")
  public Integer getVote() {
    return vote;
  }
  public void setVote(Integer vote) {
    this.vote = vote;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCorrelation {\n");
    
    sb.append("    cause: ").append(StringUtil.toIndentedString(cause)).append("\n");
    sb.append("    effect: ").append(StringUtil.toIndentedString(effect)).append("\n");
    sb.append("    correlation: ").append(StringUtil.toIndentedString(correlation)).append("\n");
    sb.append("    vote: ").append(StringUtil.toIndentedString(vote)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
