package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-05T03:15:54.261Z")
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
   * created_at
   **/
  @ApiModelProperty(value = "created_at")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * updated_at
   **/
  @ApiModelProperty(value = "updated_at")
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitConversion {\n");
    
    sb.append("    unitId: ").append(StringUtil.toIndentedString(unitId)).append("\n");
    sb.append("    stepNumber: ").append(StringUtil.toIndentedString(stepNumber)).append("\n");
    sb.append("    operation: ").append(StringUtil.toIndentedString(operation)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(StringUtil.toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
