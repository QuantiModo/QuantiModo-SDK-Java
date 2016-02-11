package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
public class UnitConversion   {
  
  private Integer unitId = null;
  private Boolean stepNumber = null;
  private Boolean operation = null;
  private Float value = null;
  private Date createdAt = null;
  private Date updatedAt = null;

  
  /**
   * unit_id
   **/
  
  @ApiModelProperty(required = true, value = "unit_id")
  @JsonProperty("unit_id")
  public Integer getUnitId() {
    return unitId;
  }
  public void setUnitId(Integer unitId) {
    this.unitId = unitId;
  }

  
  /**
   * step in the conversion process
   **/
  
  @ApiModelProperty(required = true, value = "step in the conversion process")
  @JsonProperty("step_number")
  public Boolean getStepNumber() {
    return stepNumber;
  }
  public void setStepNumber(Boolean stepNumber) {
    this.stepNumber = stepNumber;
  }

  
  /**
   * 0 is add and 1 is multiply
   **/
  
  @ApiModelProperty(required = true, value = "0 is add and 1 is multiply")
  @JsonProperty("operation")
  public Boolean getOperation() {
    return operation;
  }
  public void setOperation(Boolean operation) {
    this.operation = operation;
  }

  
  /**
   * number used in the operation
   **/
  
  @ApiModelProperty(required = true, value = "number used in the operation")
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }
  public void setValue(Float value) {
    this.value = value;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitConversion unitConversion = (UnitConversion) o;
    return Objects.equals(unitId, unitConversion.unitId) &&
        Objects.equals(stepNumber, unitConversion.stepNumber) &&
        Objects.equals(operation, unitConversion.operation) &&
        Objects.equals(value, unitConversion.value) &&
        Objects.equals(createdAt, unitConversion.createdAt) &&
        Objects.equals(updatedAt, unitConversion.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitId, stepNumber, operation, value, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitConversion {\n");
    
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    stepNumber: ").append(toIndentedString(stepNumber)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

