package io.swagger.client.model;

import java.util.*;
import io.swagger.client.model.ValueObject;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class MeasurementSet  {
  
  private List<ValueObject> measurements = new ArrayList<ValueObject>();
  private String name = null;
  private String source = null;
  private String category = null;
  public enum CombinationOperationEnum {
     MEAN,  SUM, 
  };
  private CombinationOperationEnum combinationOperation = null;
  private String unit = null;

  
  /**
   * Array of timestamps, values, and optional notes
   **/
  @ApiModelProperty(required = true, value = "Array of timestamps, values, and optional notes")
  @JsonProperty("measurements")
  public List<ValueObject> getMeasurements() {
    return measurements;
  }
  public void setMeasurements(List<ValueObject> measurements) {
    this.measurements = measurements;
  }

  
  /**
   * ORIGINAL name of the variable for which we are creating the measurement records
   **/
  @ApiModelProperty(required = true, value = "ORIGINAL name of the variable for which we are creating the measurement records")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Name of the application or device used to record the measurement values
   **/
  @ApiModelProperty(required = true, value = "Name of the application or device used to record the measurement values")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * Variable category name
   **/
  @ApiModelProperty(value = "Variable category name")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * Way to aggregate measurements over time. Options are \"MEAN\" or \"SUM\"
   **/
  @ApiModelProperty(value = "Way to aggregate measurements over time. Options are \"MEAN\" or \"SUM\"")
  @JsonProperty("combinationOperation")
  public CombinationOperationEnum getCombinationOperation() {
    return combinationOperation;
  }
  public void setCombinationOperation(CombinationOperationEnum combinationOperation) {
    this.combinationOperation = combinationOperation;
  }

  
  /**
   * Unit of measurement
   **/
  @ApiModelProperty(required = true, value = "Unit of measurement")
  @JsonProperty("unit")
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementSet {\n");
    
    sb.append("  measurements: ").append(measurements).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  combinationOperation: ").append(combinationOperation).append("\n");
    sb.append("  unit: ").append(unit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
