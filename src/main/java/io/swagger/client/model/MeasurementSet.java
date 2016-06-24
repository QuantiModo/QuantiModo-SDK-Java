package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ValueObject;
import java.util.ArrayList;
import java.util.List;


/**
 * MeasurementSet
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class MeasurementSet   {
  
  private List<ValueObject> measurements = new ArrayList<ValueObject>();
  private String variableName = null;
  private String sourceName = null;
  private String variableCategoryName = null;

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
  private String abbreviatedUnitName = null;

  
  /**
   * Array of timestamps, values, and optional notes
   **/
  public MeasurementSet measurements(List<ValueObject> measurements) {
    this.measurements = measurements;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Array of timestamps, values, and optional notes")
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
  public MeasurementSet variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ORIGINAL name of the variable for which we are creating the measurement records")
  @JsonProperty("variableName")
  public String getVariableName() {
    return variableName;
  }
  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }


  /**
   * Name of the application or device used to record the measurement values
   **/
  public MeasurementSet sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the application or device used to record the measurement values")
  @JsonProperty("sourceName")
  public String getSourceName() {
    return sourceName;
  }
  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  /**
   * Variable category name
   **/
  public MeasurementSet variableCategoryName(String variableCategoryName) {
    this.variableCategoryName = variableCategoryName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Variable category name")
  @JsonProperty("variableCategoryName")
  public String getVariableCategoryName() {
    return variableCategoryName;
  }
  public void setVariableCategoryName(String variableCategoryName) {
    this.variableCategoryName = variableCategoryName;
  }


  /**
   * Way to aggregate measurements over time. Options are \"MEAN\" or \"SUM\".  SUM should be used for things like minutes of exercise.  If you use MEAN for exercise, then a person might exercise more minutes in one day but add separate measurements that were smaller.  So when we are doing correlational analysis, we would think that the person exercised less that day even though they exercised more.  Conversely, we must use MEAN for things such as ratings which cannot be SUMMED.
   **/
  public MeasurementSet combinationOperation(CombinationOperationEnum combinationOperation) {
    this.combinationOperation = combinationOperation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Way to aggregate measurements over time. Options are \"MEAN\" or \"SUM\".  SUM should be used for things like minutes of exercise.  If you use MEAN for exercise, then a person might exercise more minutes in one day but add separate measurements that were smaller.  So when we are doing correlational analysis, we would think that the person exercised less that day even though they exercised more.  Conversely, we must use MEAN for things such as ratings which cannot be SUMMED.")
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
  public MeasurementSet abbreviatedUnitName(String abbreviatedUnitName) {
    this.abbreviatedUnitName = abbreviatedUnitName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unit of measurement")
  @JsonProperty("abbreviatedUnitName")
  public String getAbbreviatedUnitName() {
    return abbreviatedUnitName;
  }
  public void setAbbreviatedUnitName(String abbreviatedUnitName) {
    this.abbreviatedUnitName = abbreviatedUnitName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementSet measurementSet = (MeasurementSet) o;
    return Objects.equals(this.measurements, measurementSet.measurements) &&
        Objects.equals(this.variableName, measurementSet.variableName) &&
        Objects.equals(this.sourceName, measurementSet.sourceName) &&
        Objects.equals(this.variableCategoryName, measurementSet.variableCategoryName) &&
        Objects.equals(this.combinationOperation, measurementSet.combinationOperation) &&
        Objects.equals(this.abbreviatedUnitName, measurementSet.abbreviatedUnitName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurements, variableName, sourceName, variableCategoryName, combinationOperation, abbreviatedUnitName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementSet {\n");
    
    sb.append("    measurements: ").append(toIndentedString(measurements)).append("\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    variableCategoryName: ").append(toIndentedString(variableCategoryName)).append("\n");
    sb.append("    combinationOperation: ").append(toIndentedString(combinationOperation)).append("\n");
    sb.append("    abbreviatedUnitName: ").append(toIndentedString(abbreviatedUnitName)).append("\n");
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

