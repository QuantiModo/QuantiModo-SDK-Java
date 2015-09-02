package io.swagger.client.model;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-02T06:04:40.138Z")
public class VariableNew   {
  
  private String name = null;
  private String category = null;
  private String unit = null;
  public enum CombinationOperationEnum {
     MEAN,  SUM, 
  };
  private CombinationOperationEnum combinationOperation = null;
  private String parent = null;

  
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
   * Parent
   **/
  @ApiModelProperty(required = true, value = "Parent")
  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }
  public void setParent(String parent) {
    this.parent = parent;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableNew {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  unit: ").append(unit).append("\n");
    sb.append("  combinationOperation: ").append(combinationOperation).append("\n");
    sb.append("  parent: ").append(parent).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
