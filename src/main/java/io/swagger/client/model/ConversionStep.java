package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class ConversionStep  {
  
  public enum OperationEnum {
     MULTIPLY,  ADD, 
  };
  private OperationEnum operation = null;
  private Double value = null;

  
  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionStep {\n");
    
    sb.append("  operation: ").append(operation).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
