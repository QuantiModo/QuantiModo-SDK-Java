package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;


/**
 * Correlation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
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
  public Correlation correlationCoefficient(BigDecimal correlationCoefficient) {
    this.correlationCoefficient = correlationCoefficient;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Pearson correlation coefficient between cause and effect measurements")
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
  public Correlation cause(String cause) {
    this.cause = cause;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ORIGINAL variable name of the cause variable for which the user desires correlations.")
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
  public Correlation originalCause(String originalCause) {
    this.originalCause = originalCause;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "original name of the cause.")
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
  public Correlation effect(String effect) {
    this.effect = effect;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ORIGINAL variable name of the effect variable for which the user desires correlations.")
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
  public Correlation originalEffect(String originalEffect) {
    this.originalEffect = originalEffect;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "effect variable original name.")
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
  public Correlation onsetDelay(Double onsetDelay) {
    this.onsetDelay = onsetDelay;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User estimated or default time after cause measurement before a perceivable effect is observed")
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
  public Correlation durationOfAction(BigDecimal durationOfAction) {
    this.durationOfAction = durationOfAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Time over which the cause is expected to produce a perceivable effect following the onset delay")
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
  public Correlation numberOfPairs(BigDecimal numberOfPairs) {
    this.numberOfPairs = numberOfPairs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of points that went into the correlation calculation")
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
  public Correlation effectSize(String effectSize) {
    this.effectSize = effectSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Magnitude of the effects of a cause indicating whether it's practically meaningful.")
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
  public Correlation statisticalSignificance(String statisticalSignificance) {
    this.statisticalSignificance = statisticalSignificance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A function of the effect size and sample size")
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
  public Correlation timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Time at which correlation was calculated")
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
  public Correlation reverseCorrelation(BigDecimal reverseCorrelation) {
    this.reverseCorrelation = reverseCorrelation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation.")
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
  public Correlation causalityFactor(BigDecimal causalityFactor) {
    this.causalityFactor = causalityFactor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Correlation causeCategory(String causeCategory) {
    this.causeCategory = causeCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Variable category of the cause variable.")
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
  public Correlation effectCategory(String effectCategory) {
    this.effectCategory = effectCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Variable category of the effect variable.")
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
  public Correlation valuePredictingHighOutcome(BigDecimal valuePredictingHighOutcome) {
    this.valuePredictingHighOutcome = valuePredictingHighOutcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "cause value that predicts an above average effect value (in default unit for cause variable)")
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
  public Correlation valuePredictingLowOutcome(BigDecimal valuePredictingLowOutcome) {
    this.valuePredictingLowOutcome = valuePredictingLowOutcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "cause value that predicts a below average effect value (in default unit for cause variable)")
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
  public Correlation optimalPearsonProduct(BigDecimal optimalPearsonProduct) {
    this.optimalPearsonProduct = optimalPearsonProduct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optimal Pearson Product")
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
  public Correlation averageVote(BigDecimal averageVote) {
    this.averageVote = averageVote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Average Vote")
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
  public Correlation userVote(BigDecimal userVote) {
    this.userVote = userVote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Vote")
  @JsonProperty("userVote")
  public BigDecimal getUserVote() {
    return userVote;
  }
  public void setUserVote(BigDecimal userVote) {
    this.userVote = userVote;
  }


  /**
   * Unit of the predictor variable
   **/
  public Correlation causeUnit(String causeUnit) {
    this.causeUnit = causeUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unit of the predictor variable")
  @JsonProperty("causeUnit")
  public String getCauseUnit() {
    return causeUnit;
  }
  public void setCauseUnit(String causeUnit) {
    this.causeUnit = causeUnit;
  }


  /**
   * Unit Id of the predictor variable
   **/
  public Correlation causeUnitId(Integer causeUnitId) {
    this.causeUnitId = causeUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unit Id of the predictor variable")
  @JsonProperty("causeUnitId")
  public Integer getCauseUnitId() {
    return causeUnitId;
  }
  public void setCauseUnitId(Integer causeUnitId) {
    this.causeUnitId = causeUnitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Correlation correlation = (Correlation) o;
    return Objects.equals(this.correlationCoefficient, correlation.correlationCoefficient) &&
        Objects.equals(this.cause, correlation.cause) &&
        Objects.equals(this.originalCause, correlation.originalCause) &&
        Objects.equals(this.effect, correlation.effect) &&
        Objects.equals(this.originalEffect, correlation.originalEffect) &&
        Objects.equals(this.onsetDelay, correlation.onsetDelay) &&
        Objects.equals(this.durationOfAction, correlation.durationOfAction) &&
        Objects.equals(this.numberOfPairs, correlation.numberOfPairs) &&
        Objects.equals(this.effectSize, correlation.effectSize) &&
        Objects.equals(this.statisticalSignificance, correlation.statisticalSignificance) &&
        Objects.equals(this.timestamp, correlation.timestamp) &&
        Objects.equals(this.reverseCorrelation, correlation.reverseCorrelation) &&
        Objects.equals(this.causalityFactor, correlation.causalityFactor) &&
        Objects.equals(this.causeCategory, correlation.causeCategory) &&
        Objects.equals(this.effectCategory, correlation.effectCategory) &&
        Objects.equals(this.valuePredictingHighOutcome, correlation.valuePredictingHighOutcome) &&
        Objects.equals(this.valuePredictingLowOutcome, correlation.valuePredictingLowOutcome) &&
        Objects.equals(this.optimalPearsonProduct, correlation.optimalPearsonProduct) &&
        Objects.equals(this.averageVote, correlation.averageVote) &&
        Objects.equals(this.userVote, correlation.userVote) &&
        Objects.equals(this.causeUnit, correlation.causeUnit) &&
        Objects.equals(this.causeUnitId, correlation.causeUnitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationCoefficient, cause, originalCause, effect, originalEffect, onsetDelay, durationOfAction, numberOfPairs, effectSize, statisticalSignificance, timestamp, reverseCorrelation, causalityFactor, causeCategory, effectCategory, valuePredictingHighOutcome, valuePredictingLowOutcome, optimalPearsonProduct, averageVote, userVote, causeUnit, causeUnitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Correlation {\n");
    
    sb.append("    correlationCoefficient: ").append(toIndentedString(correlationCoefficient)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    originalCause: ").append(toIndentedString(originalCause)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    originalEffect: ").append(toIndentedString(originalEffect)).append("\n");
    sb.append("    onsetDelay: ").append(toIndentedString(onsetDelay)).append("\n");
    sb.append("    durationOfAction: ").append(toIndentedString(durationOfAction)).append("\n");
    sb.append("    numberOfPairs: ").append(toIndentedString(numberOfPairs)).append("\n");
    sb.append("    effectSize: ").append(toIndentedString(effectSize)).append("\n");
    sb.append("    statisticalSignificance: ").append(toIndentedString(statisticalSignificance)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    reverseCorrelation: ").append(toIndentedString(reverseCorrelation)).append("\n");
    sb.append("    causalityFactor: ").append(toIndentedString(causalityFactor)).append("\n");
    sb.append("    causeCategory: ").append(toIndentedString(causeCategory)).append("\n");
    sb.append("    effectCategory: ").append(toIndentedString(effectCategory)).append("\n");
    sb.append("    valuePredictingHighOutcome: ").append(toIndentedString(valuePredictingHighOutcome)).append("\n");
    sb.append("    valuePredictingLowOutcome: ").append(toIndentedString(valuePredictingLowOutcome)).append("\n");
    sb.append("    optimalPearsonProduct: ").append(toIndentedString(optimalPearsonProduct)).append("\n");
    sb.append("    averageVote: ").append(toIndentedString(averageVote)).append("\n");
    sb.append("    userVote: ").append(toIndentedString(userVote)).append("\n");
    sb.append("    causeUnit: ").append(toIndentedString(causeUnit)).append("\n");
    sb.append("    causeUnitId: ").append(toIndentedString(causeUnitId)).append("\n");
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

