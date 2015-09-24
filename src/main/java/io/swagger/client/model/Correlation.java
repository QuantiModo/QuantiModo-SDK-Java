package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.math.BigDecimal;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-24T00:56:42.474Z")
public class Correlation   {
  
  private BigDecimal correlationCoefficient = null;
  private String cause = null;
  private String originalCause = null;
  private String effect = null;
  private String originalEffect = null;
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
  private BigDecimal valuePredictingHighOutcome = null;
  private BigDecimal valuePredictingLowOutcome = null;
  private BigDecimal optimalPearsonProduct = null;
  private BigDecimal averageVote = null;
  private BigDecimal userVote = null;
  private String causeUnit = null;
  private Integer causeUnitId = null;

  
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
   * original name of the cause.
   **/
  @ApiModelProperty(value = "original name of the cause.")
  @JsonProperty("originalCause")
  public String getOriginalCause() {
    return originalCause;
  }
  public void setOriginalCause(String originalCause) {
    this.originalCause = originalCause;
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
   * effect variable original name.
   **/
  @ApiModelProperty(value = "effect variable original name.")
  @JsonProperty("originalEffect")
  public String getOriginalEffect() {
    return originalEffect;
  }
  public void setOriginalEffect(String originalEffect) {
    this.originalEffect = originalEffect;
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

  
  /**
   * cause value that predicts an above average effect value (in default unit for cause variable)
   **/
  @ApiModelProperty(value = "cause value that predicts an above average effect value (in default unit for cause variable)")
  @JsonProperty("valuePredictingHighOutcome")
  public BigDecimal getValuePredictingHighOutcome() {
    return valuePredictingHighOutcome;
  }
  public void setValuePredictingHighOutcome(BigDecimal valuePredictingHighOutcome) {
    this.valuePredictingHighOutcome = valuePredictingHighOutcome;
  }

  
  /**
   * cause value that predicts a below average effect value (in default unit for cause variable)
   **/
  @ApiModelProperty(value = "cause value that predicts a below average effect value (in default unit for cause variable)")
  @JsonProperty("valuePredictingLowOutcome")
  public BigDecimal getValuePredictingLowOutcome() {
    return valuePredictingLowOutcome;
  }
  public void setValuePredictingLowOutcome(BigDecimal valuePredictingLowOutcome) {
    this.valuePredictingLowOutcome = valuePredictingLowOutcome;
  }

  
  /**
   * Optimal Pearson Product
   **/
  @ApiModelProperty(value = "Optimal Pearson Product")
  @JsonProperty("optimalPearsonProduct")
  public BigDecimal getOptimalPearsonProduct() {
    return optimalPearsonProduct;
  }
  public void setOptimalPearsonProduct(BigDecimal optimalPearsonProduct) {
    this.optimalPearsonProduct = optimalPearsonProduct;
  }

  
  /**
   * Average Vote
   **/
  @ApiModelProperty(value = "Average Vote")
  @JsonProperty("averageVote")
  public BigDecimal getAverageVote() {
    return averageVote;
  }
  public void setAverageVote(BigDecimal averageVote) {
    this.averageVote = averageVote;
  }

  
  /**
   * User Vote
   **/
  @ApiModelProperty(value = "User Vote")
  @JsonProperty("userVote")
  public BigDecimal getUserVote() {
    return userVote;
  }
  public void setUserVote(BigDecimal userVote) {
    this.userVote = userVote;
  }

  
  /**
   * Unit of Cause
   **/
  @ApiModelProperty(value = "Unit of Cause")
  @JsonProperty("causeUnit")
  public String getCauseUnit() {
    return causeUnit;
  }
  public void setCauseUnit(String causeUnit) {
    this.causeUnit = causeUnit;
  }

  
  /**
   * Unit Id of Cause
   **/
  @ApiModelProperty(value = "Unit Id of Cause")
  @JsonProperty("causeUnitId")
  public Integer getCauseUnitId() {
    return causeUnitId;
  }
  public void setCauseUnitId(Integer causeUnitId) {
    this.causeUnitId = causeUnitId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Correlation {\n");
    
    sb.append("    correlationCoefficient: ").append(StringUtil.toIndentedString(correlationCoefficient)).append("\n");
    sb.append("    cause: ").append(StringUtil.toIndentedString(cause)).append("\n");
    sb.append("    originalCause: ").append(StringUtil.toIndentedString(originalCause)).append("\n");
    sb.append("    effect: ").append(StringUtil.toIndentedString(effect)).append("\n");
    sb.append("    originalEffect: ").append(StringUtil.toIndentedString(originalEffect)).append("\n");
    sb.append("    onsetDelay: ").append(StringUtil.toIndentedString(onsetDelay)).append("\n");
    sb.append("    durationOfAction: ").append(StringUtil.toIndentedString(durationOfAction)).append("\n");
    sb.append("    numberOfPairs: ").append(StringUtil.toIndentedString(numberOfPairs)).append("\n");
    sb.append("    effectSize: ").append(StringUtil.toIndentedString(effectSize)).append("\n");
    sb.append("    statisticalSignificance: ").append(StringUtil.toIndentedString(statisticalSignificance)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    reverseCorrelation: ").append(StringUtil.toIndentedString(reverseCorrelation)).append("\n");
    sb.append("    causalityFactor: ").append(StringUtil.toIndentedString(causalityFactor)).append("\n");
    sb.append("    causeCategory: ").append(StringUtil.toIndentedString(causeCategory)).append("\n");
    sb.append("    effectCategory: ").append(StringUtil.toIndentedString(effectCategory)).append("\n");
    sb.append("    valuePredictingHighOutcome: ").append(StringUtil.toIndentedString(valuePredictingHighOutcome)).append("\n");
    sb.append("    valuePredictingLowOutcome: ").append(StringUtil.toIndentedString(valuePredictingLowOutcome)).append("\n");
    sb.append("    optimalPearsonProduct: ").append(StringUtil.toIndentedString(optimalPearsonProduct)).append("\n");
    sb.append("    averageVote: ").append(StringUtil.toIndentedString(averageVote)).append("\n");
    sb.append("    userVote: ").append(StringUtil.toIndentedString(userVote)).append("\n");
    sb.append("    causeUnit: ").append(StringUtil.toIndentedString(causeUnit)).append("\n");
    sb.append("    causeUnitId: ").append(StringUtil.toIndentedString(causeUnitId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
