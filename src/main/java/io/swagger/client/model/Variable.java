package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Variable  {
  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variable {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  originalName: ").append(originalName).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  unit: ").append(unit).append("\n");
    sb.append("  sources: ").append(sources).append("\n");
    sb.append("  minimumValue: ").append(minimumValue).append("\n");
    sb.append("  maximumValue: ").append(maximumValue).append("\n");
    sb.append("  combinationOperation: ").append(combinationOperation).append("\n");
    sb.append("  fillingValue: ").append(fillingValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
