package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Variable;
import java.util.ArrayList;
import java.util.List;


/**
 * Variable
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class Variable   {
  
  private Integer id = null;
  private String name = null;
  private String originalName = null;
  private String category = null;
  private String abbreviatedUnitName = null;
  private Integer abbreviatedUnitId = null;
  private String sources = null;
  private Double minimumValue = null;
  private Double maximumValue = null;

  /**
   * Way to aggregate measurements over time. Options are \"MEAN\" or \"SUM\".  SUM should be used for things like minutes of exercise.  If you use MEAN for exercise, then a person might exercise more minutes in one day but add separate measurements that were smaller.  So when we are doing correlational analysis, we would think that the person exercised less that day even though they exercised more.  Conversely, we must use MEAN for things such as ratings which cannot be SUMMED.
   */
  public enum CombinationOperationEnum {
    MEAN("MEAN"),
    SUM("SUM");

    private String value;

    CombinationOperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CombinationOperationEnum combinationOperation = null;
  private Double fillingValue = null;
  private String joinWith = null;
  private List<Variable> joinedVariables = new ArrayList<Variable>();
  private Integer parent = null;
  private List<Variable> subVariables = new ArrayList<Variable>();
  private Integer onsetDelay = null;
  private Integer durationOfAction = null;
  private Integer earliestMeasurementTime = null;
  private Integer latestMeasurementTime = null;
  private Integer updated = null;
  private Integer causeOnly = null;
  private Integer numberOfCorrelations = null;
  private Integer outcome = null;
  private Integer measurementsAtLastAnalysis = null;
  private Integer numberOfMeasurements = null;
  private String lastUnit = null;
  private Integer lastValue = null;
  private Integer mostCommonValue = null;
  private String mostCommonUnit = null;
  private Integer lastSource = null;

  
  /**
   * Variable ID
   **/
  public Variable id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Variable ID")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * User-defined variable display name.
   **/
  public Variable name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User-defined variable display name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Name used when the variable was originally created in the `variables` table.
   **/
  public Variable originalName(String originalName) {
    this.originalName = originalName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name used when the variable was originally created in the `variables` table.")
  @JsonProperty("originalName")
  public String getOriginalName() {
    return originalName;
  }
  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }


  /**
   * Variable category like Mood, Sleep, Physical Activity, Treatment, Symptom, etc.
   **/
  public Variable category(String category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Variable category like Mood, Sleep, Physical Activity, Treatment, Symptom, etc.")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }


  /**
   * Abbreviated name of the default unit for the variable
   **/
  public Variable abbreviatedUnitName(String abbreviatedUnitName) {
    this.abbreviatedUnitName = abbreviatedUnitName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Abbreviated name of the default unit for the variable")
  @JsonProperty("abbreviatedUnitName")
  public String getAbbreviatedUnitName() {
    return abbreviatedUnitName;
  }
  public void setAbbreviatedUnitName(String abbreviatedUnitName) {
    this.abbreviatedUnitName = abbreviatedUnitName;
  }


  /**
   * Id of the default unit for the variable
   **/
  public Variable abbreviatedUnitId(Integer abbreviatedUnitId) {
    this.abbreviatedUnitId = abbreviatedUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id of the default unit for the variable")
  @JsonProperty("abbreviatedUnitId")
  public Integer getAbbreviatedUnitId() {
    return abbreviatedUnitId;
  }
  public void setAbbreviatedUnitId(Integer abbreviatedUnitId) {
    this.abbreviatedUnitId = abbreviatedUnitId;
  }


  /**
   * Comma-separated list of source names to limit variables to those sources
   **/
  public Variable sources(String sources) {
    this.sources = sources;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Comma-separated list of source names to limit variables to those sources")
  @JsonProperty("sources")
  public String getSources() {
    return sources;
  }
  public void setSources(String sources) {
    this.sources = sources;
  }


  /**
   * Minimum reasonable value for this variable (uses default unit)
   **/
  public Variable minimumValue(Double minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Minimum reasonable value for this variable (uses default unit)")
  @JsonProperty("minimumValue")
  public Double getMinimumValue() {
    return minimumValue;
  }
  public void setMinimumValue(Double minimumValue) {
    this.minimumValue = minimumValue;
  }


  /**
   * Maximum reasonable value for this variable (uses default unit)
   **/
  public Variable maximumValue(Double maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum reasonable value for this variable (uses default unit)")
  @JsonProperty("maximumValue")
  public Double getMaximumValue() {
    return maximumValue;
  }
  public void setMaximumValue(Double maximumValue) {
    this.maximumValue = maximumValue;
  }


  /**
   * Way to aggregate measurements over time. Options are \"MEAN\" or \"SUM\".  SUM should be used for things like minutes of exercise.  If you use MEAN for exercise, then a person might exercise more minutes in one day but add separate measurements that were smaller.  So when we are doing correlational analysis, we would think that the person exercised less that day even though they exercised more.  Conversely, we must use MEAN for things such as ratings which cannot be SUMMED.
   **/
  public Variable combinationOperation(CombinationOperationEnum combinationOperation) {
    this.combinationOperation = combinationOperation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Way to aggregate measurements over time. Options are \"MEAN\" or \"SUM\".  SUM should be used for things like minutes of exercise.  If you use MEAN for exercise, then a person might exercise more minutes in one day but add separate measurements that were smaller.  So when we are doing correlational analysis, we would think that the person exercised less that day even though they exercised more.  Conversely, we must use MEAN for things such as ratings which cannot be SUMMED.")
  @JsonProperty("combinationOperation")
  public CombinationOperationEnum getCombinationOperation() {
    return combinationOperation;
  }
  public void setCombinationOperation(CombinationOperationEnum combinationOperation) {
    this.combinationOperation = combinationOperation;
  }


  /**
   * Value for replacing null measurements
   **/
  public Variable fillingValue(Double fillingValue) {
    this.fillingValue = fillingValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value for replacing null measurements")
  @JsonProperty("fillingValue")
  public Double getFillingValue() {
    return fillingValue;
  }
  public void setFillingValue(Double fillingValue) {
    this.fillingValue = fillingValue;
  }


  /**
   * The Variable this Variable should be joined with. If the variable is joined with some other variable then it is not shown to user in the list of variables.
   **/
  public Variable joinWith(String joinWith) {
    this.joinWith = joinWith;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Variable this Variable should be joined with. If the variable is joined with some other variable then it is not shown to user in the list of variables.")
  @JsonProperty("joinWith")
  public String getJoinWith() {
    return joinWith;
  }
  public void setJoinWith(String joinWith) {
    this.joinWith = joinWith;
  }


  /**
   * Array of Variables that are joined with this Variable
   **/
  public Variable joinedVariables(List<Variable> joinedVariables) {
    this.joinedVariables = joinedVariables;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Array of Variables that are joined with this Variable")
  @JsonProperty("joinedVariables")
  public List<Variable> getJoinedVariables() {
    return joinedVariables;
  }
  public void setJoinedVariables(List<Variable> joinedVariables) {
    this.joinedVariables = joinedVariables;
  }


  /**
   * Id of the parent variable if this variable has any parent
   **/
  public Variable parent(Integer parent) {
    this.parent = parent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id of the parent variable if this variable has any parent")
  @JsonProperty("parent")
  public Integer getParent() {
    return parent;
  }
  public void setParent(Integer parent) {
    this.parent = parent;
  }


  /**
   * Array of Variables that are sub variables to this Variable
   **/
  public Variable subVariables(List<Variable> subVariables) {
    this.subVariables = subVariables;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Array of Variables that are sub variables to this Variable")
  @JsonProperty("subVariables")
  public List<Variable> getSubVariables() {
    return subVariables;
  }
  public void setSubVariables(List<Variable> subVariables) {
    this.subVariables = subVariables;
  }


  /**
   * How long it takes for a measurement in this variable to take effect
   **/
  public Variable onsetDelay(Integer onsetDelay) {
    this.onsetDelay = onsetDelay;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "How long it takes for a measurement in this variable to take effect")
  @JsonProperty("onsetDelay")
  public Integer getOnsetDelay() {
    return onsetDelay;
  }
  public void setOnsetDelay(Integer onsetDelay) {
    this.onsetDelay = onsetDelay;
  }


  /**
   * How long the effect of a measurement in this variable lasts
   **/
  public Variable durationOfAction(Integer durationOfAction) {
    this.durationOfAction = durationOfAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "How long the effect of a measurement in this variable lasts")
  @JsonProperty("durationOfAction")
  public Integer getDurationOfAction() {
    return durationOfAction;
  }
  public void setDurationOfAction(Integer durationOfAction) {
    this.durationOfAction = durationOfAction;
  }


  /**
   * Earliest measurement time
   **/
  public Variable earliestMeasurementTime(Integer earliestMeasurementTime) {
    this.earliestMeasurementTime = earliestMeasurementTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Earliest measurement time")
  @JsonProperty("earliestMeasurementTime")
  public Integer getEarliestMeasurementTime() {
    return earliestMeasurementTime;
  }
  public void setEarliestMeasurementTime(Integer earliestMeasurementTime) {
    this.earliestMeasurementTime = earliestMeasurementTime;
  }


  /**
   * Latest measurement time
   **/
  public Variable latestMeasurementTime(Integer latestMeasurementTime) {
    this.latestMeasurementTime = latestMeasurementTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Latest measurement time")
  @JsonProperty("latestMeasurementTime")
  public Integer getLatestMeasurementTime() {
    return latestMeasurementTime;
  }
  public void setLatestMeasurementTime(Integer latestMeasurementTime) {
    this.latestMeasurementTime = latestMeasurementTime;
  }


  /**
   * When this variable or its settings were last updated
   **/
  public Variable updated(Integer updated) {
    this.updated = updated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When this variable or its settings were last updated")
  @JsonProperty("updated")
  public Integer getUpdated() {
    return updated;
  }
  public void setUpdated(Integer updated) {
    this.updated = updated;
  }


  /**
   * A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user.
   **/
  public Variable causeOnly(Integer causeOnly) {
    this.causeOnly = causeOnly;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user.")
  @JsonProperty("causeOnly")
  public Integer getCauseOnly() {
    return causeOnly;
  }
  public void setCauseOnly(Integer causeOnly) {
    this.causeOnly = causeOnly;
  }


  /**
   * Number of correlations
   **/
  public Variable numberOfCorrelations(Integer numberOfCorrelations) {
    this.numberOfCorrelations = numberOfCorrelations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of correlations")
  @JsonProperty("numberOfCorrelations")
  public Integer getNumberOfCorrelations() {
    return numberOfCorrelations;
  }
  public void setNumberOfCorrelations(Integer numberOfCorrelations) {
    this.numberOfCorrelations = numberOfCorrelations;
  }


  /**
   * Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables.
   **/
  public Variable outcome(Integer outcome) {
    this.outcome = outcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables.")
  @JsonProperty("outcome")
  public Integer getOutcome() {
    return outcome;
  }
  public void setOutcome(Integer outcome) {
    this.outcome = outcome;
  }


  /**
   * The number of measurements that a given user had for this variable the last time a correlation calculation was performed. Generally correlation values are only updated once the current number of measurements for a variable is more than 10% greater than the measurementsAtLastAnalysis.  This avoids a computationally-demanding recalculation when there's not enough new data to make a significant difference in the correlation.
   **/
  public Variable measurementsAtLastAnalysis(Integer measurementsAtLastAnalysis) {
    this.measurementsAtLastAnalysis = measurementsAtLastAnalysis;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of measurements that a given user had for this variable the last time a correlation calculation was performed. Generally correlation values are only updated once the current number of measurements for a variable is more than 10% greater than the measurementsAtLastAnalysis.  This avoids a computationally-demanding recalculation when there's not enough new data to make a significant difference in the correlation.")
  @JsonProperty("measurementsAtLastAnalysis")
  public Integer getMeasurementsAtLastAnalysis() {
    return measurementsAtLastAnalysis;
  }
  public void setMeasurementsAtLastAnalysis(Integer measurementsAtLastAnalysis) {
    this.measurementsAtLastAnalysis = measurementsAtLastAnalysis;
  }


  /**
   * Number of measurements
   **/
  public Variable numberOfMeasurements(Integer numberOfMeasurements) {
    this.numberOfMeasurements = numberOfMeasurements;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of measurements")
  @JsonProperty("numberOfMeasurements")
  public Integer getNumberOfMeasurements() {
    return numberOfMeasurements;
  }
  public void setNumberOfMeasurements(Integer numberOfMeasurements) {
    this.numberOfMeasurements = numberOfMeasurements;
  }


  /**
   * Last unit
   **/
  public Variable lastUnit(String lastUnit) {
    this.lastUnit = lastUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Last unit")
  @JsonProperty("lastUnit")
  public String getLastUnit() {
    return lastUnit;
  }
  public void setLastUnit(String lastUnit) {
    this.lastUnit = lastUnit;
  }


  /**
   * Last value
   **/
  public Variable lastValue(Integer lastValue) {
    this.lastValue = lastValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Last value")
  @JsonProperty("lastValue")
  public Integer getLastValue() {
    return lastValue;
  }
  public void setLastValue(Integer lastValue) {
    this.lastValue = lastValue;
  }


  /**
   * Most common value
   **/
  public Variable mostCommonValue(Integer mostCommonValue) {
    this.mostCommonValue = mostCommonValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Most common value")
  @JsonProperty("mostCommonValue")
  public Integer getMostCommonValue() {
    return mostCommonValue;
  }
  public void setMostCommonValue(Integer mostCommonValue) {
    this.mostCommonValue = mostCommonValue;
  }


  /**
   * Most common unit
   **/
  public Variable mostCommonUnit(String mostCommonUnit) {
    this.mostCommonUnit = mostCommonUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Most common unit")
  @JsonProperty("mostCommonUnit")
  public String getMostCommonUnit() {
    return mostCommonUnit;
  }
  public void setMostCommonUnit(String mostCommonUnit) {
    this.mostCommonUnit = mostCommonUnit;
  }


  /**
   * Last source
   **/
  public Variable lastSource(Integer lastSource) {
    this.lastSource = lastSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Last source")
  @JsonProperty("lastSource")
  public Integer getLastSource() {
    return lastSource;
  }
  public void setLastSource(Integer lastSource) {
    this.lastSource = lastSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Variable variable = (Variable) o;
    return Objects.equals(this.id, variable.id) &&
        Objects.equals(this.name, variable.name) &&
        Objects.equals(this.originalName, variable.originalName) &&
        Objects.equals(this.category, variable.category) &&
        Objects.equals(this.abbreviatedUnitName, variable.abbreviatedUnitName) &&
        Objects.equals(this.abbreviatedUnitId, variable.abbreviatedUnitId) &&
        Objects.equals(this.sources, variable.sources) &&
        Objects.equals(this.minimumValue, variable.minimumValue) &&
        Objects.equals(this.maximumValue, variable.maximumValue) &&
        Objects.equals(this.combinationOperation, variable.combinationOperation) &&
        Objects.equals(this.fillingValue, variable.fillingValue) &&
        Objects.equals(this.joinWith, variable.joinWith) &&
        Objects.equals(this.joinedVariables, variable.joinedVariables) &&
        Objects.equals(this.parent, variable.parent) &&
        Objects.equals(this.subVariables, variable.subVariables) &&
        Objects.equals(this.onsetDelay, variable.onsetDelay) &&
        Objects.equals(this.durationOfAction, variable.durationOfAction) &&
        Objects.equals(this.earliestMeasurementTime, variable.earliestMeasurementTime) &&
        Objects.equals(this.latestMeasurementTime, variable.latestMeasurementTime) &&
        Objects.equals(this.updated, variable.updated) &&
        Objects.equals(this.causeOnly, variable.causeOnly) &&
        Objects.equals(this.numberOfCorrelations, variable.numberOfCorrelations) &&
        Objects.equals(this.outcome, variable.outcome) &&
        Objects.equals(this.measurementsAtLastAnalysis, variable.measurementsAtLastAnalysis) &&
        Objects.equals(this.numberOfMeasurements, variable.numberOfMeasurements) &&
        Objects.equals(this.lastUnit, variable.lastUnit) &&
        Objects.equals(this.lastValue, variable.lastValue) &&
        Objects.equals(this.mostCommonValue, variable.mostCommonValue) &&
        Objects.equals(this.mostCommonUnit, variable.mostCommonUnit) &&
        Objects.equals(this.lastSource, variable.lastSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, originalName, category, abbreviatedUnitName, abbreviatedUnitId, sources, minimumValue, maximumValue, combinationOperation, fillingValue, joinWith, joinedVariables, parent, subVariables, onsetDelay, durationOfAction, earliestMeasurementTime, latestMeasurementTime, updated, causeOnly, numberOfCorrelations, outcome, measurementsAtLastAnalysis, numberOfMeasurements, lastUnit, lastValue, mostCommonValue, mostCommonUnit, lastSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variable {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    abbreviatedUnitName: ").append(toIndentedString(abbreviatedUnitName)).append("\n");
    sb.append("    abbreviatedUnitId: ").append(toIndentedString(abbreviatedUnitId)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    combinationOperation: ").append(toIndentedString(combinationOperation)).append("\n");
    sb.append("    fillingValue: ").append(toIndentedString(fillingValue)).append("\n");
    sb.append("    joinWith: ").append(toIndentedString(joinWith)).append("\n");
    sb.append("    joinedVariables: ").append(toIndentedString(joinedVariables)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    subVariables: ").append(toIndentedString(subVariables)).append("\n");
    sb.append("    onsetDelay: ").append(toIndentedString(onsetDelay)).append("\n");
    sb.append("    durationOfAction: ").append(toIndentedString(durationOfAction)).append("\n");
    sb.append("    earliestMeasurementTime: ").append(toIndentedString(earliestMeasurementTime)).append("\n");
    sb.append("    latestMeasurementTime: ").append(toIndentedString(latestMeasurementTime)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    causeOnly: ").append(toIndentedString(causeOnly)).append("\n");
    sb.append("    numberOfCorrelations: ").append(toIndentedString(numberOfCorrelations)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    measurementsAtLastAnalysis: ").append(toIndentedString(measurementsAtLastAnalysis)).append("\n");
    sb.append("    numberOfMeasurements: ").append(toIndentedString(numberOfMeasurements)).append("\n");
    sb.append("    lastUnit: ").append(toIndentedString(lastUnit)).append("\n");
    sb.append("    lastValue: ").append(toIndentedString(lastValue)).append("\n");
    sb.append("    mostCommonValue: ").append(toIndentedString(mostCommonValue)).append("\n");
    sb.append("    mostCommonUnit: ").append(toIndentedString(mostCommonUnit)).append("\n");
    sb.append("    lastSource: ").append(toIndentedString(lastSource)).append("\n");
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

