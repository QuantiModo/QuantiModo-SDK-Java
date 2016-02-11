package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
public class Correlation   {
  
  private Integer id = null;
  private Integer timestamp = null;
  private Integer userId = null;
  private Float correlation = null;
  private Integer causeId = null;
  private Integer effectId = null;
  private Integer onsetDelay = null;
  private Integer durationOfAction = null;
  private Integer numberOfPairs = null;
  private Float valuePredictingHighOutcome = null;
  private Float valuePredictingLowOutcome = null;
  private Float optimalPearsonProduct = null;
  private Float vote = null;
  private Float statisticalSignificance = null;
  private String causeUnit = null;
  private Integer causeUnitId = null;
  private Integer causeChanges = null;
  private Integer effectChanges = null;
  private Float qmScore = null;
  private String error = null;
  private Date createdAt = null;
  private Date updatedAt = null;
  private Float reversePearsonCorrelationCoefficient = null;
  private Float predictivePearsonCorrelationCoefficient = null;

  
  /**
   * id
   **/
  
  @ApiModelProperty(value = "id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * Time at which correlation was calculated
   **/
  
  @ApiModelProperty(required = true, value = "Time at which correlation was calculated")
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * ID of user that owns this correlation
   **/
  
  @ApiModelProperty(required = true, value = "ID of user that owns this correlation")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  
  /**
   * Pearson correlation coefficient between cause and effect measurements
   **/
  
  @ApiModelProperty(required = true, value = "Pearson correlation coefficient between cause and effect measurements")
  @JsonProperty("correlation")
  public Float getCorrelation() {
    return correlation;
  }
  public void setCorrelation(Float correlation) {
    this.correlation = correlation;
  }

  
  /**
   * variable ID of the cause variable for which the user desires correlations
   **/
  
  @ApiModelProperty(required = true, value = "variable ID of the cause variable for which the user desires correlations")
  @JsonProperty("cause_id")
  public Integer getCauseId() {
    return causeId;
  }
  public void setCauseId(Integer causeId) {
    this.causeId = causeId;
  }

  
  /**
   * variable ID of the effect variable for which the user desires correlations
   **/
  
  @ApiModelProperty(required = true, value = "variable ID of the effect variable for which the user desires correlations")
  @JsonProperty("effect_id")
  public Integer getEffectId() {
    return effectId;
  }
  public void setEffectId(Integer effectId) {
    this.effectId = effectId;
  }

  
  /**
   * User estimated or default time after cause measurement before a perceivable effect is observed
   **/
  
  @ApiModelProperty(required = true, value = "User estimated or default time after cause measurement before a perceivable effect is observed")
  @JsonProperty("onset_delay")
  public Integer getOnsetDelay() {
    return onsetDelay;
  }
  public void setOnsetDelay(Integer onsetDelay) {
    this.onsetDelay = onsetDelay;
  }

  
  /**
   * Time over which the cause is expected to produce a perceivable effect following the onset delay
   **/
  
  @ApiModelProperty(required = true, value = "Time over which the cause is expected to produce a perceivable effect following the onset delay")
  @JsonProperty("duration_of_action")
  public Integer getDurationOfAction() {
    return durationOfAction;
  }
  public void setDurationOfAction(Integer durationOfAction) {
    this.durationOfAction = durationOfAction;
  }

  
  /**
   * Number of points that went into the correlation calculation
   **/
  
  @ApiModelProperty(required = true, value = "Number of points that went into the correlation calculation")
  @JsonProperty("number_of_pairs")
  public Integer getNumberOfPairs() {
    return numberOfPairs;
  }
  public void setNumberOfPairs(Integer numberOfPairs) {
    this.numberOfPairs = numberOfPairs;
  }

  
  /**
   * cause value that predicts an above average effect value (in default unit for cause variable)
   **/
  
  @ApiModelProperty(required = true, value = "cause value that predicts an above average effect value (in default unit for cause variable)")
  @JsonProperty("value_predicting_high_outcome")
  public Float getValuePredictingHighOutcome() {
    return valuePredictingHighOutcome;
  }
  public void setValuePredictingHighOutcome(Float valuePredictingHighOutcome) {
    this.valuePredictingHighOutcome = valuePredictingHighOutcome;
  }

  
  /**
   * cause value that predicts a below average effect value (in default unit for cause variable)
   **/
  
  @ApiModelProperty(required = true, value = "cause value that predicts a below average effect value (in default unit for cause variable)")
  @JsonProperty("value_predicting_low_outcome")
  public Float getValuePredictingLowOutcome() {
    return valuePredictingLowOutcome;
  }
  public void setValuePredictingLowOutcome(Float valuePredictingLowOutcome) {
    this.valuePredictingLowOutcome = valuePredictingLowOutcome;
  }

  
  /**
   * Optimal Pearson Product
   **/
  
  @ApiModelProperty(required = true, value = "Optimal Pearson Product")
  @JsonProperty("optimal_pearson_product")
  public Float getOptimalPearsonProduct() {
    return optimalPearsonProduct;
  }
  public void setOptimalPearsonProduct(Float optimalPearsonProduct) {
    this.optimalPearsonProduct = optimalPearsonProduct;
  }

  
  /**
   * Vote
   **/
  
  @ApiModelProperty(required = true, value = "Vote")
  @JsonProperty("vote")
  public Float getVote() {
    return vote;
  }
  public void setVote(Float vote) {
    this.vote = vote;
  }

  
  /**
   * A function of the effect size and sample size
   **/
  
  @ApiModelProperty(required = true, value = "A function of the effect size and sample size")
  @JsonProperty("statistical_significance")
  public Float getStatisticalSignificance() {
    return statisticalSignificance;
  }
  public void setStatisticalSignificance(Float statisticalSignificance) {
    this.statisticalSignificance = statisticalSignificance;
  }

  
  /**
   * Unit of the predictor variable
   **/
  
  @ApiModelProperty(required = true, value = "Unit of the predictor variable")
  @JsonProperty("cause_unit")
  public String getCauseUnit() {
    return causeUnit;
  }
  public void setCauseUnit(String causeUnit) {
    this.causeUnit = causeUnit;
  }

  
  /**
   * Unit ID of the predictor variable
   **/
  
  @ApiModelProperty(required = true, value = "Unit ID of the predictor variable")
  @JsonProperty("cause_unit_id")
  public Integer getCauseUnitId() {
    return causeUnitId;
  }
  public void setCauseUnitId(Integer causeUnitId) {
    this.causeUnitId = causeUnitId;
  }

  
  /**
   * Cause changes
   **/
  
  @ApiModelProperty(required = true, value = "Cause changes")
  @JsonProperty("cause_changes")
  public Integer getCauseChanges() {
    return causeChanges;
  }
  public void setCauseChanges(Integer causeChanges) {
    this.causeChanges = causeChanges;
  }

  
  /**
   * Effect changes
   **/
  
  @ApiModelProperty(required = true, value = "Effect changes")
  @JsonProperty("effect_changes")
  public Integer getEffectChanges() {
    return effectChanges;
  }
  public void setEffectChanges(Integer effectChanges) {
    this.effectChanges = effectChanges;
  }

  
  /**
   * QM Score
   **/
  
  @ApiModelProperty(required = true, value = "QM Score")
  @JsonProperty("qm_score")
  public Float getQmScore() {
    return qmScore;
  }
  public void setQmScore(Float qmScore) {
    this.qmScore = qmScore;
  }

  
  /**
   * error
   **/
  
  @ApiModelProperty(required = true, value = "error")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  
  /**
   * When the record was first created. Use ISO 8601 datetime format
   **/
  
  @ApiModelProperty(value = "When the record was first created. Use ISO 8601 datetime format")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * When the record in the database was last updated. Use ISO 8601 datetime format
   **/
  
  @ApiModelProperty(value = "When the record in the database was last updated. Use ISO 8601 datetime format")
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  /**
   * Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation
   **/
  
  @ApiModelProperty(required = true, value = "Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation")
  @JsonProperty("reverse_pearson_correlation_coefficient")
  public Float getReversePearsonCorrelationCoefficient() {
    return reversePearsonCorrelationCoefficient;
  }
  public void setReversePearsonCorrelationCoefficient(Float reversePearsonCorrelationCoefficient) {
    this.reversePearsonCorrelationCoefficient = reversePearsonCorrelationCoefficient;
  }

  
  /**
   * Predictive Pearson Correlation Coefficient
   **/
  
  @ApiModelProperty(required = true, value = "Predictive Pearson Correlation Coefficient")
  @JsonProperty("predictive_pearson_correlation_coefficient")
  public Float getPredictivePearsonCorrelationCoefficient() {
    return predictivePearsonCorrelationCoefficient;
  }
  public void setPredictivePearsonCorrelationCoefficient(Float predictivePearsonCorrelationCoefficient) {
    this.predictivePearsonCorrelationCoefficient = predictivePearsonCorrelationCoefficient;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Correlation correlation = (Correlation) o;
    return Objects.equals(id, correlation.id) &&
        Objects.equals(timestamp, correlation.timestamp) &&
        Objects.equals(userId, correlation.userId) &&
        Objects.equals(correlation, correlation.correlation) &&
        Objects.equals(causeId, correlation.causeId) &&
        Objects.equals(effectId, correlation.effectId) &&
        Objects.equals(onsetDelay, correlation.onsetDelay) &&
        Objects.equals(durationOfAction, correlation.durationOfAction) &&
        Objects.equals(numberOfPairs, correlation.numberOfPairs) &&
        Objects.equals(valuePredictingHighOutcome, correlation.valuePredictingHighOutcome) &&
        Objects.equals(valuePredictingLowOutcome, correlation.valuePredictingLowOutcome) &&
        Objects.equals(optimalPearsonProduct, correlation.optimalPearsonProduct) &&
        Objects.equals(vote, correlation.vote) &&
        Objects.equals(statisticalSignificance, correlation.statisticalSignificance) &&
        Objects.equals(causeUnit, correlation.causeUnit) &&
        Objects.equals(causeUnitId, correlation.causeUnitId) &&
        Objects.equals(causeChanges, correlation.causeChanges) &&
        Objects.equals(effectChanges, correlation.effectChanges) &&
        Objects.equals(qmScore, correlation.qmScore) &&
        Objects.equals(error, correlation.error) &&
        Objects.equals(createdAt, correlation.createdAt) &&
        Objects.equals(updatedAt, correlation.updatedAt) &&
        Objects.equals(reversePearsonCorrelationCoefficient, correlation.reversePearsonCorrelationCoefficient) &&
        Objects.equals(predictivePearsonCorrelationCoefficient, correlation.predictivePearsonCorrelationCoefficient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, userId, correlation, causeId, effectId, onsetDelay, durationOfAction, numberOfPairs, valuePredictingHighOutcome, valuePredictingLowOutcome, optimalPearsonProduct, vote, statisticalSignificance, causeUnit, causeUnitId, causeChanges, effectChanges, qmScore, error, createdAt, updatedAt, reversePearsonCorrelationCoefficient, predictivePearsonCorrelationCoefficient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Correlation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    correlation: ").append(toIndentedString(correlation)).append("\n");
    sb.append("    causeId: ").append(toIndentedString(causeId)).append("\n");
    sb.append("    effectId: ").append(toIndentedString(effectId)).append("\n");
    sb.append("    onsetDelay: ").append(toIndentedString(onsetDelay)).append("\n");
    sb.append("    durationOfAction: ").append(toIndentedString(durationOfAction)).append("\n");
    sb.append("    numberOfPairs: ").append(toIndentedString(numberOfPairs)).append("\n");
    sb.append("    valuePredictingHighOutcome: ").append(toIndentedString(valuePredictingHighOutcome)).append("\n");
    sb.append("    valuePredictingLowOutcome: ").append(toIndentedString(valuePredictingLowOutcome)).append("\n");
    sb.append("    optimalPearsonProduct: ").append(toIndentedString(optimalPearsonProduct)).append("\n");
    sb.append("    vote: ").append(toIndentedString(vote)).append("\n");
    sb.append("    statisticalSignificance: ").append(toIndentedString(statisticalSignificance)).append("\n");
    sb.append("    causeUnit: ").append(toIndentedString(causeUnit)).append("\n");
    sb.append("    causeUnitId: ").append(toIndentedString(causeUnitId)).append("\n");
    sb.append("    causeChanges: ").append(toIndentedString(causeChanges)).append("\n");
    sb.append("    effectChanges: ").append(toIndentedString(effectChanges)).append("\n");
    sb.append("    qmScore: ").append(toIndentedString(qmScore)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    reversePearsonCorrelationCoefficient: ").append(toIndentedString(reversePearsonCorrelationCoefficient)).append("\n");
    sb.append("    predictivePearsonCorrelationCoefficient: ").append(toIndentedString(predictivePearsonCorrelationCoefficient)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

