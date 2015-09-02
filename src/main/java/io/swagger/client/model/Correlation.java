package io.swagger.client.model;

import java.math.BigDecimal;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-02T06:04:40.138Z")
public class Correlation   {
  
  private BigDecimal correlationCoefficient = null;
  private String cause = null;
  private String effect = null;
  private Double onsetDelay = null;
  private BigDecimal durationOfAction = null;
  private BigDecimal numberOfPairs = null;
  private String effectSize = null;
  private String statisticalSignificance = null;
  private BigDecimal timestamp = null;
  private BigDecimal reverseCorrelation = null;
  private BigDecimal causalityFactor = null;
  private String causeCategory = null;
  private String effectCategory = null;

  
  /**
   * Pearson correlation coefficient between cause and effect measurements
   **/
  @ApiModelProperty(required = true, value = "Pearson correlation coefficient between cause and effect measurements")
  @JsonProperty("correlationCoefficient")
  public BigDecimal getCorrelationCoefficient() {
    return correlationCoefficient;
  }
  public void setCorrelationCoefficient(BigDecimal correlationCoefficient) {
    this.correlationCoefficient = correlationCoefficient;
  }

  
  /**
   * ORIGINAL variable name of the cause variable for which the user desires correlations.
   **/
  @ApiModelProperty(required = true, value = "ORIGINAL variable name of the cause variable for which the user desires correlations.")
  @JsonProperty("cause")
  public String getCause() {
    return cause;
  }
  public void setCause(String cause) {
    this.cause = cause;
  }

  
  /**
   * ORIGINAL variable name of the effect variable for which the user desires correlations.
   **/
  @ApiModelProperty(required = true, value = "ORIGINAL variable name of the effect variable for which the user desires correlations.")
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }
  public void setEffect(String effect) {
    this.effect = effect;
  }

  
  /**
   * User estimated or default time after cause measurement before a perceivable effect is observed
   **/
  @ApiModelProperty(required = true, value = "User estimated or default time after cause measurement before a perceivable effect is observed")
  @JsonProperty("onsetDelay")
  public Double getOnsetDelay() {
    return onsetDelay;
  }
  public void setOnsetDelay(Double onsetDelay) {
    this.onsetDelay = onsetDelay;
  }

  
  /**
   * Time over which the cause is expected to produce a perceivable effect following the onset delay
   **/
  @ApiModelProperty(required = true, value = "Time over which the cause is expected to produce a perceivable effect following the onset delay")
  @JsonProperty("durationOfAction")
  public BigDecimal getDurationOfAction() {
    return durationOfAction;
  }
  public void setDurationOfAction(BigDecimal durationOfAction) {
    this.durationOfAction = durationOfAction;
  }

  
  /**
   * Number of points that went into the correlation calculation
   **/
  @ApiModelProperty(required = true, value = "Number of points that went into the correlation calculation")
  @JsonProperty("numberOfPairs")
  public BigDecimal getNumberOfPairs() {
    return numberOfPairs;
  }
  public void setNumberOfPairs(BigDecimal numberOfPairs) {
    this.numberOfPairs = numberOfPairs;
  }

  
  /**
   * Magnitude of the effects of a cause indicating whether it's practically meaningful.
   **/
  @ApiModelProperty(value = "Magnitude of the effects of a cause indicating whether it's practically meaningful.")
  @JsonProperty("effectSize")
  public String getEffectSize() {
    return effectSize;
  }
  public void setEffectSize(String effectSize) {
    this.effectSize = effectSize;
  }

  
  /**
   * A function of the effect size and sample size
   **/
  @ApiModelProperty(value = "A function of the effect size and sample size")
  @JsonProperty("statisticalSignificance")
  public String getStatisticalSignificance() {
    return statisticalSignificance;
  }
  public void setStatisticalSignificance(String statisticalSignificance) {
    this.statisticalSignificance = statisticalSignificance;
  }

  
  /**
   * Time at which correlation was calculated
   **/
  @ApiModelProperty(required = true, value = "Time at which correlation was calculated")
  @JsonProperty("timestamp")
  public BigDecimal getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation.
   **/
  @ApiModelProperty(value = "Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation.")
  @JsonProperty("reverseCorrelation")
  public BigDecimal getReverseCorrelation() {
    return reverseCorrelation;
  }
  public void setReverseCorrelation(BigDecimal reverseCorrelation) {
    this.reverseCorrelation = reverseCorrelation;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("causalityFactor")
  public BigDecimal getCausalityFactor() {
    return causalityFactor;
  }
  public void setCausalityFactor(BigDecimal causalityFactor) {
    this.causalityFactor = causalityFactor;
  }

  
  /**
   * Variable category of the cause variable.
   **/
  @ApiModelProperty(value = "Variable category of the cause variable.")
  @JsonProperty("causeCategory")
  public String getCauseCategory() {
    return causeCategory;
  }
  public void setCauseCategory(String causeCategory) {
    this.causeCategory = causeCategory;
  }

  
  /**
   * Variable category of the effect variable.
   **/
  @ApiModelProperty(value = "Variable category of the effect variable.")
  @JsonProperty("effectCategory")
  public String getEffectCategory() {
    return effectCategory;
  }
  public void setEffectCategory(String effectCategory) {
    this.effectCategory = effectCategory;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Correlation {\n");
    
    sb.append("  correlationCoefficient: ").append(correlationCoefficient).append("\n");
    sb.append("  cause: ").append(cause).append("\n");
    sb.append("  effect: ").append(effect).append("\n");
    sb.append("  onsetDelay: ").append(onsetDelay).append("\n");
    sb.append("  durationOfAction: ").append(durationOfAction).append("\n");
    sb.append("  numberOfPairs: ").append(numberOfPairs).append("\n");
    sb.append("  effectSize: ").append(effectSize).append("\n");
    sb.append("  statisticalSignificance: ").append(statisticalSignificance).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  reverseCorrelation: ").append(reverseCorrelation).append("\n");
    sb.append("  causalityFactor: ").append(causalityFactor).append("\n");
    sb.append("  causeCategory: ").append(causeCategory).append("\n");
    sb.append("  effectCategory: ").append(effectCategory).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
