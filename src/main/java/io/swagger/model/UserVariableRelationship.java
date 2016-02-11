package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
public class UserVariableRelationship   {
  
  private Integer id = null;
  private String confidenceLevel = null;
  private Float confidenceScore = null;
  private String direction = null;
  private Integer durationOfAction = null;
  private String errorMessage = null;
  private Integer onsetDelay = null;
  private Integer outcomeVariableId = null;
  private Integer predictorVariableId = null;
  private Integer predictorUnitId = null;
  private Float sinnRank = null;
  private String strengthLevel = null;
  private Float strengthScore = null;
  private Integer userId = null;
  private String vote = null;
  private Float valuePredictingHighOutcome = null;
  private Float valuePredictingLowOutcome = null;

  
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
   * Our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors
   **/
  
  @ApiModelProperty(required = true, value = "Our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors")
  @JsonProperty("confidence_level")
  public String getConfidenceLevel() {
    return confidenceLevel;
  }
  public void setConfidenceLevel(String confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }

  
  /**
   * A quantitative representation of our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors
   **/
  
  @ApiModelProperty(required = true, value = "A quantitative representation of our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors")
  @JsonProperty("confidence_score")
  public Float getConfidenceScore() {
    return confidenceScore;
  }
  public void setConfidenceScore(Float confidenceScore) {
    this.confidenceScore = confidenceScore;
  }

  
  /**
   * Direction is positive if higher predictor values generally precede higher outcome values. Direction is negative if higher predictor values generally precede lower outcome values.
   **/
  
  @ApiModelProperty(required = true, value = "Direction is positive if higher predictor values generally precede higher outcome values. Direction is negative if higher predictor values generally precede lower outcome values.")
  @JsonProperty("direction")
  public String getDirection() {
    return direction;
  }
  public void setDirection(String direction) {
    this.direction = direction;
  }

  
  /**
   * Number of seconds over which the predictor variable event is expected to produce a perceivable effect following the onset delay
   **/
  
  @ApiModelProperty(required = true, value = "Number of seconds over which the predictor variable event is expected to produce a perceivable effect following the onset delay")
  @JsonProperty("duration_of_action")
  public Integer getDurationOfAction() {
    return durationOfAction;
  }
  public void setDurationOfAction(Integer durationOfAction) {
    this.durationOfAction = durationOfAction;
  }

  
  /**
   * error_message
   **/
  
  @ApiModelProperty(value = "error_message")
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   * User estimated (or default number of seconds) after cause measurement before a perceivable effect is observed
   **/
  
  @ApiModelProperty(value = "User estimated (or default number of seconds) after cause measurement before a perceivable effect is observed")
  @JsonProperty("onset_delay")
  public Integer getOnsetDelay() {
    return onsetDelay;
  }
  public void setOnsetDelay(Integer onsetDelay) {
    this.onsetDelay = onsetDelay;
  }

  
  /**
   * Variable ID for the outcome variable
   **/
  
  @ApiModelProperty(required = true, value = "Variable ID for the outcome variable")
  @JsonProperty("outcome_variable_id")
  public Integer getOutcomeVariableId() {
    return outcomeVariableId;
  }
  public void setOutcomeVariableId(Integer outcomeVariableId) {
    this.outcomeVariableId = outcomeVariableId;
  }

  
  /**
   * Variable ID for the predictor variable
   **/
  
  @ApiModelProperty(required = true, value = "Variable ID for the predictor variable")
  @JsonProperty("predictor_variable_id")
  public Integer getPredictorVariableId() {
    return predictorVariableId;
  }
  public void setPredictorVariableId(Integer predictorVariableId) {
    this.predictorVariableId = predictorVariableId;
  }

  
  /**
   * ID for default unit of the predictor variable
   **/
  
  @ApiModelProperty(required = true, value = "ID for default unit of the predictor variable")
  @JsonProperty("predictor_unit_id")
  public Integer getPredictorUnitId() {
    return predictorUnitId;
  }
  public void setPredictorUnitId(Integer predictorUnitId) {
    this.predictorUnitId = predictorUnitId;
  }

  
  /**
   * A value representative of the relevance of this predictor relative to other predictors of this outcome.  Usually used for relevancy sorting.
   **/
  
  @ApiModelProperty(required = true, value = "A value representative of the relevance of this predictor relative to other predictors of this outcome.  Usually used for relevancy sorting.")
  @JsonProperty("sinn_rank")
  public Float getSinnRank() {
    return sinnRank;
  }
  public void setSinnRank(Float sinnRank) {
    this.sinnRank = sinnRank;
  }

  
  /**
   * Can be weak, medium, or strong based on the size of the effect which the predictor appears to have on the outcome relative to other variable relationship strength scores.
   **/
  
  @ApiModelProperty(required = true, value = "Can be weak, medium, or strong based on the size of the effect which the predictor appears to have on the outcome relative to other variable relationship strength scores.")
  @JsonProperty("strength_level")
  public String getStrengthLevel() {
    return strengthLevel;
  }
  public void setStrengthLevel(String strengthLevel) {
    this.strengthLevel = strengthLevel;
  }

  
  /**
   * A value represented to the size of the effect which the predictor appears to have on the outcome.
   **/
  
  @ApiModelProperty(required = true, value = "A value represented to the size of the effect which the predictor appears to have on the outcome.")
  @JsonProperty("strength_score")
  public Float getStrengthScore() {
    return strengthScore;
  }
  public void setStrengthScore(Float strengthScore) {
    this.strengthScore = strengthScore;
  }

  
  /**
   * user_id
   **/
  
  @ApiModelProperty(value = "user_id")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  
  /**
   * vote
   **/
  
  @ApiModelProperty(value = "vote")
  @JsonProperty("vote")
  public String getVote() {
    return vote;
  }
  public void setVote(String vote) {
    this.vote = vote;
  }

  
  /**
   * Value for the predictor variable (in it's default unit) which typically precedes an above average outcome value
   **/
  
  @ApiModelProperty(required = true, value = "Value for the predictor variable (in it's default unit) which typically precedes an above average outcome value")
  @JsonProperty("value_predicting_high_outcome")
  public Float getValuePredictingHighOutcome() {
    return valuePredictingHighOutcome;
  }
  public void setValuePredictingHighOutcome(Float valuePredictingHighOutcome) {
    this.valuePredictingHighOutcome = valuePredictingHighOutcome;
  }

  
  /**
   * Value for the predictor variable (in it's default unit) which typically precedes a below average outcome value
   **/
  
  @ApiModelProperty(required = true, value = "Value for the predictor variable (in it's default unit) which typically precedes a below average outcome value")
  @JsonProperty("value_predicting_low_outcome")
  public Float getValuePredictingLowOutcome() {
    return valuePredictingLowOutcome;
  }
  public void setValuePredictingLowOutcome(Float valuePredictingLowOutcome) {
    this.valuePredictingLowOutcome = valuePredictingLowOutcome;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserVariableRelationship userVariableRelationship = (UserVariableRelationship) o;
    return Objects.equals(id, userVariableRelationship.id) &&
        Objects.equals(confidenceLevel, userVariableRelationship.confidenceLevel) &&
        Objects.equals(confidenceScore, userVariableRelationship.confidenceScore) &&
        Objects.equals(direction, userVariableRelationship.direction) &&
        Objects.equals(durationOfAction, userVariableRelationship.durationOfAction) &&
        Objects.equals(errorMessage, userVariableRelationship.errorMessage) &&
        Objects.equals(onsetDelay, userVariableRelationship.onsetDelay) &&
        Objects.equals(outcomeVariableId, userVariableRelationship.outcomeVariableId) &&
        Objects.equals(predictorVariableId, userVariableRelationship.predictorVariableId) &&
        Objects.equals(predictorUnitId, userVariableRelationship.predictorUnitId) &&
        Objects.equals(sinnRank, userVariableRelationship.sinnRank) &&
        Objects.equals(strengthLevel, userVariableRelationship.strengthLevel) &&
        Objects.equals(strengthScore, userVariableRelationship.strengthScore) &&
        Objects.equals(userId, userVariableRelationship.userId) &&
        Objects.equals(vote, userVariableRelationship.vote) &&
        Objects.equals(valuePredictingHighOutcome, userVariableRelationship.valuePredictingHighOutcome) &&
        Objects.equals(valuePredictingLowOutcome, userVariableRelationship.valuePredictingLowOutcome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, confidenceLevel, confidenceScore, direction, durationOfAction, errorMessage, onsetDelay, outcomeVariableId, predictorVariableId, predictorUnitId, sinnRank, strengthLevel, strengthScore, userId, vote, valuePredictingHighOutcome, valuePredictingLowOutcome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserVariableRelationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
    sb.append("    confidenceScore: ").append(toIndentedString(confidenceScore)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    durationOfAction: ").append(toIndentedString(durationOfAction)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    onsetDelay: ").append(toIndentedString(onsetDelay)).append("\n");
    sb.append("    outcomeVariableId: ").append(toIndentedString(outcomeVariableId)).append("\n");
    sb.append("    predictorVariableId: ").append(toIndentedString(predictorVariableId)).append("\n");
    sb.append("    predictorUnitId: ").append(toIndentedString(predictorUnitId)).append("\n");
    sb.append("    sinnRank: ").append(toIndentedString(sinnRank)).append("\n");
    sb.append("    strengthLevel: ").append(toIndentedString(strengthLevel)).append("\n");
    sb.append("    strengthScore: ").append(toIndentedString(strengthScore)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    vote: ").append(toIndentedString(vote)).append("\n");
    sb.append("    valuePredictingHighOutcome: ").append(toIndentedString(valuePredictingHighOutcome)).append("\n");
    sb.append("    valuePredictingLowOutcome: ").append(toIndentedString(valuePredictingLowOutcome)).append("\n");
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

