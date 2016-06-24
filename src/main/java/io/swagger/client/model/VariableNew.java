package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * VariableNew
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class VariableNew   {
  
  private String name = null;
  private String category = null;
  private String unit = null;

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
  private String parent = null;

  
  /**
   * User-defined variable display name.
   **/
  public VariableNew name(String name) {
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
   * Variable category like Mood, Sleep, Physical Activity, Treatment, Symptom, etc.
   **/
  public VariableNew category(String category) {
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
  public VariableNew unit(String unit) {
    this.unit = unit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Abbreviated name of the default unit for the variable")
  @JsonProperty("unit")
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }


  /**
   * Way to aggregate measurements over time. Options are \"MEAN\" or \"SUM\".  SUM should be used for things like minutes of exercise.  If you use MEAN for exercise, then a person might exercise more minutes in one day but add separate measurements that were smaller.  So when we are doing correlational analysis, we would think that the person exercised less that day even though they exercised more.  Conversely, we must use MEAN for things such as ratings which cannot be SUMMED.
   **/
  public VariableNew combinationOperation(CombinationOperationEnum combinationOperation) {
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
   * Parent
   **/
  public VariableNew parent(String parent) {
    this.parent = parent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Parent")
  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }
  public void setParent(String parent) {
    this.parent = parent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableNew variableNew = (VariableNew) o;
    return Objects.equals(this.name, variableNew.name) &&
        Objects.equals(this.category, variableNew.category) &&
        Objects.equals(this.unit, variableNew.unit) &&
        Objects.equals(this.combinationOperation, variableNew.combinationOperation) &&
        Objects.equals(this.parent, variableNew.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category, unit, combinationOperation, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableNew {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    combinationOperation: ").append(toIndentedString(combinationOperation)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

