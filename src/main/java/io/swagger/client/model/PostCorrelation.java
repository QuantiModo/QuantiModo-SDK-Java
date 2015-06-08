package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class PostCorrelation  {
  
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
    
    sb.append("  cause: ").append(cause).append("\n");
    sb.append("  effect: ").append(effect).append("\n");
    sb.append("  correlation: ").append(correlation).append("\n");
    sb.append("  vote: ").append(vote).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
