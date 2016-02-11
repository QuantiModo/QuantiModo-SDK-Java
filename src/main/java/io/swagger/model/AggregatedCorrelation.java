package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
public class AggregatedCorrelation   {
  
  private Integer id = null;
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
  private Integer numberOfUsers = null;
  private Integer numberOfCorrelations = null;
  private Float statisticalSignificance = null;
  private String causeUnit = null;
  private Integer causeUnitId = null;
  private Integer causeChanges = null;
  private Integer effectChanges = null;
  private Float aggregateQmScore = null;
  private Date createdAt = null;
  private Date updatedAt = null;
  private String status = null;
  private String errorMessage = null;
  private Date lastSuccessfulUpdateTime = null;
  private Float reversePearsonCorrelationCoefficient = null;
  private Float predictivePearsonCorrelationCoefficient = null;
  private String dataSource = null;

  
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
   * Number of Users by which correlation is aggregated
   **/
  
  @ApiModelProperty(required = true, value = "Number of Users by which correlation is aggregated")
  @JsonProperty("number_of_users")
  public Integer getNumberOfUsers() {
    return numberOfUsers;
  }
  public void setNumberOfUsers(Integer numberOfUsers) {
    this.numberOfUsers = numberOfUsers;
  }

  
  /**
   * Number of Correlations by which correlation is aggregated
   **/
  
  @ApiModelProperty(required = true, value = "Number of Correlations by which correlation is aggregated")
  @JsonProperty("number_of_correlations")
  public Integer getNumberOfCorrelations() {
    return numberOfCorrelations;
  }
  public void setNumberOfCorrelations(Integer numberOfCorrelations) {
    this.numberOfCorrelations = numberOfCorrelations;
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
   * Aggregated QM Score
   **/
  
  @ApiModelProperty(required = true, value = "Aggregated QM Score")
  @JsonProperty("aggregate_qm_score")
  public Float getAggregateQmScore() {
    return aggregateQmScore;
  }
  public void setAggregateQmScore(Float aggregateQmScore) {
    this.aggregateQmScore = aggregateQmScore;
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
   * Status
   **/
  
  @ApiModelProperty(required = true, value = "Status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Error Message
   **/
  
  @ApiModelProperty(required = true, value = "Error Message")
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   * Last Successful update time
   **/
  
  @ApiModelProperty(required = true, value = "Last Successful update time")
  @JsonProperty("last_successful_update_time")
  public Date getLastSuccessfulUpdateTime() {
    return lastSuccessfulUpdateTime;
  }
  public void setLastSuccessfulUpdateTime(Date lastSuccessfulUpdateTime) {
    this.lastSuccessfulUpdateTime = lastSuccessfulUpdateTime;
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

  
  /**
   * Source of data for this correlation
   **/
  
  @ApiModelProperty(value = "Source of data for this correlation")
  @JsonProperty("data_source")
  public String getDataSource() {
    return dataSource;
  }
  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedCorrelation aggregatedCorrelation = (AggregatedCorrelation) o;
    return Objects.equals(id, aggregatedCorrelation.id) &&
        Objects.equals(correlation, aggregatedCorrelation.correlation) &&
        Objects.equals(causeId, aggregatedCorrelation.causeId) &&
        Objects.equals(effectId, aggregatedCorrelation.effectId) &&
        Objects.equals(onsetDelay, aggregatedCorrelation.onsetDelay) &&
        Objects.equals(durationOfAction, aggregatedCorrelation.durationOfAction) &&
        Objects.equals(numberOfPairs, aggregatedCorrelation.numberOfPairs) &&
        Objects.equals(valuePredictingHighOutcome, aggregatedCorrelation.valuePredictingHighOutcome) &&
        Objects.equals(valuePredictingLowOutcome, aggregatedCorrelation.valuePredictingLowOutcome) &&
        Objects.equals(optimalPearsonProduct, aggregatedCorrelation.optimalPearsonProduct) &&
        Objects.equals(vote, aggregatedCorrelation.vote) &&
        Objects.equals(numberOfUsers, aggregatedCorrelation.numberOfUsers) &&
        Objects.equals(numberOfCorrelations, aggregatedCorrelation.numberOfCorrelations) &&
        Objects.equals(statisticalSignificance, aggregatedCorrelation.statisticalSignificance) &&
        Objects.equals(causeUnit, aggregatedCorrelation.causeUnit) &&
        Objects.equals(causeUnitId, aggregatedCorrelation.causeUnitId) &&
        Objects.equals(causeChanges, aggregatedCorrelation.causeChanges) &&
        Objects.equals(effectChanges, aggregatedCorrelation.effectChanges) &&
        Objects.equals(aggregateQmScore, aggregatedCorrelation.aggregateQmScore) &&
        Objects.equals(createdAt, aggregatedCorrelation.createdAt) &&
        Objects.equals(updatedAt, aggregatedCorrelation.updatedAt) &&
        Objects.equals(status, aggregatedCorrelation.status) &&
        Objects.equals(errorMessage, aggregatedCorrelation.errorMessage) &&
        Objects.equals(lastSuccessfulUpdateTime, aggregatedCorrelation.lastSuccessfulUpdateTime) &&
        Objects.equals(reversePearsonCorrelationCoefficient, aggregatedCorrelation.reversePearsonCorrelationCoefficient) &&
        Objects.equals(predictivePearsonCorrelationCoefficient, aggregatedCorrelation.predictivePearsonCorrelationCoefficient) &&
        Objects.equals(dataSource, aggregatedCorrelation.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, correlation, causeId, effectId, onsetDelay, durationOfAction, numberOfPairs, valuePredictingHighOutcome, valuePredictingLowOutcome, optimalPearsonProduct, vote, numberOfUsers, numberOfCorrelations, statisticalSignificance, causeUnit, causeUnitId, causeChanges, effectChanges, aggregateQmScore, createdAt, updatedAt, status, errorMessage, lastSuccessfulUpdateTime, reversePearsonCorrelationCoefficient, predictivePearsonCorrelationCoefficient, dataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedCorrelation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    numberOfUsers: ").append(toIndentedString(numberOfUsers)).append("\n");
    sb.append("    numberOfCorrelations: ").append(toIndentedString(numberOfCorrelations)).append("\n");
    sb.append("    statisticalSignificance: ").append(toIndentedString(statisticalSignificance)).append("\n");
    sb.append("    causeUnit: ").append(toIndentedString(causeUnit)).append("\n");
    sb.append("    causeUnitId: ").append(toIndentedString(causeUnitId)).append("\n");
    sb.append("    causeChanges: ").append(toIndentedString(causeChanges)).append("\n");
    sb.append("    effectChanges: ").append(toIndentedString(effectChanges)).append("\n");
    sb.append("    aggregateQmScore: ").append(toIndentedString(aggregateQmScore)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    lastSuccessfulUpdateTime: ").append(toIndentedString(lastSuccessfulUpdateTime)).append("\n");
    sb.append("    reversePearsonCorrelationCoefficient: ").append(toIndentedString(reversePearsonCorrelationCoefficient)).append("\n");
    sb.append("    predictivePearsonCorrelationCoefficient: ").append(toIndentedString(predictivePearsonCorrelationCoefficient)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
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

