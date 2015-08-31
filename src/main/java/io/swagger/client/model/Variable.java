package io.swagger.client.model;

import io.swagger.client.model.Variable;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-08-31T05:51:00.313Z")
public class Variable   {
  
  private Integer id = null;
  private String name = null;
  private String originalName = null;
  private String category = null;
  private String unit = null;
  private String sources = null;
  private Double minimumValue = null;
  private Double maximumValue = null;
  public enum CombinationOperationEnum {
     MEAN,  SUM, 
  };
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
  private Integer lastUnit = null;
  private Integer lastValue = null;
  private Integer mostCommonValue = null;
  private Integer mostCommonUnit = null;
  private Integer lastSource = null;

  
  /**
   * Variable ID
   **/
  @ApiModelProperty(value = "Variable ID")
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
  @ApiModelProperty(required = true, value = "User-defined variable display name.")
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
  @ApiModelProperty(required = true, value = "Name used when the variable was originally created in the `variables` table.")
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
  @ApiModelProperty(required = true, value = "Variable category like Mood, Sleep, Physical Activity, Treatment, Symptom, etc.")
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
  @ApiModelProperty(required = true, value = "Abbreviated name of the default unit for the variable")
  @JsonProperty("unit")
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }

  
  /**
   * Comma-separated list of source names to limit variables to those sources
   **/
  @ApiModelProperty(required = true, value = "Comma-separated list of source names to limit variables to those sources")
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
  @ApiModelProperty(required = true, value = "Minimum reasonable value for this variable (uses default unit)")
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
  @ApiModelProperty(required = true, value = "Maximum reasonable value for this variable (uses default unit)")
  @JsonProperty("maximumValue")
  public Double getMaximumValue() {
    return maximumValue;
  }
  public void setMaximumValue(Double maximumValue) {
    this.maximumValue = maximumValue;
  }

  
  /**
   * How to aggregate measurements over time.
   **/
  @ApiModelProperty(required = true, value = "How to aggregate measurements over time.")
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
  @ApiModelProperty(required = true, value = "Value for replacing null measurements")
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
  @ApiModelProperty(required = true, value = "The Variable this Variable should be joined with. If the variable is joined with some other variable then it is not shown to user in the list of variables.")
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
  @ApiModelProperty(required = true, value = "Array of Variables that are joined with this Variable")
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
  @ApiModelProperty(required = true, value = "Id of the parent variable if this variable has any parent")
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
  @ApiModelProperty(required = true, value = "Array of Variables that are sub variables to this Variable")
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
  @ApiModelProperty(required = true, value = "How long it takes for a measurement in this variable to take effect")
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
  @ApiModelProperty(required = true, value = "How long the effect of a measurement in this variable lasts")
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
  @ApiModelProperty(required = true, value = "Earliest measurement time")
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
  @ApiModelProperty(required = true, value = "Latest measurement time")
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
  @ApiModelProperty(required = true, value = "When this variable or its settings were last updated")
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
  @ApiModelProperty(required = true, value = "A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user.")
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
  @ApiModelProperty(required = true, value = "Number of correlations")
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
  @ApiModelProperty(required = true, value = "Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables.")
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
  @ApiModelProperty(required = true, value = "The number of measurements that a given user had for this variable the last time a correlation calculation was performed. Generally correlation values are only updated once the current number of measurements for a variable is more than 10% greater than the measurementsAtLastAnalysis.  This avoids a computationally-demanding recalculation when there's not enough new data to make a significant difference in the correlation.")
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
  @ApiModelProperty(required = true, value = "Number of measurements")
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
  @ApiModelProperty(required = true, value = "Last unit")
  @JsonProperty("lastUnit")
  public Integer getLastUnit() {
    return lastUnit;
  }
  public void setLastUnit(Integer lastUnit) {
    this.lastUnit = lastUnit;
  }

  
  /**
   * Last value
   **/
  @ApiModelProperty(required = true, value = "Last value")
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
  @ApiModelProperty(required = true, value = "Most common value")
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
  @ApiModelProperty(required = true, value = "Most common unit")
  @JsonProperty("mostCommonUnit")
  public Integer getMostCommonUnit() {
    return mostCommonUnit;
  }
  public void setMostCommonUnit(Integer mostCommonUnit) {
    this.mostCommonUnit = mostCommonUnit;
  }

  
  /**
   * Last source
   **/
  @ApiModelProperty(required = true, value = "Last source")
  @JsonProperty("lastSource")
  public Integer getLastSource() {
    return lastSource;
  }
  public void setLastSource(Integer lastSource) {
    this.lastSource = lastSource;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variable {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  originalName: ").append(originalName).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  unit: ").append(unit).append("\n");
    sb.append("  sources: ").append(sources).append("\n");
    sb.append("  minimumValue: ").append(minimumValue).append("\n");
    sb.append("  maximumValue: ").append(maximumValue).append("\n");
    sb.append("  combinationOperation: ").append(combinationOperation).append("\n");
    sb.append("  fillingValue: ").append(fillingValue).append("\n");
    sb.append("  joinWith: ").append(joinWith).append("\n");
    sb.append("  joinedVariables: ").append(joinedVariables).append("\n");
    sb.append("  parent: ").append(parent).append("\n");
    sb.append("  subVariables: ").append(subVariables).append("\n");
    sb.append("  onsetDelay: ").append(onsetDelay).append("\n");
    sb.append("  durationOfAction: ").append(durationOfAction).append("\n");
    sb.append("  earliestMeasurementTime: ").append(earliestMeasurementTime).append("\n");
    sb.append("  latestMeasurementTime: ").append(latestMeasurementTime).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  causeOnly: ").append(causeOnly).append("\n");
    sb.append("  numberOfCorrelations: ").append(numberOfCorrelations).append("\n");
    sb.append("  outcome: ").append(outcome).append("\n");
    sb.append("  measurementsAtLastAnalysis: ").append(measurementsAtLastAnalysis).append("\n");
    sb.append("  numberOfMeasurements: ").append(numberOfMeasurements).append("\n");
    sb.append("  lastUnit: ").append(lastUnit).append("\n");
    sb.append("  lastValue: ").append(lastValue).append("\n");
    sb.append("  mostCommonValue: ").append(mostCommonValue).append("\n");
    sb.append("  mostCommonUnit: ").append(mostCommonUnit).append("\n");
    sb.append("  lastSource: ").append(lastSource).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
