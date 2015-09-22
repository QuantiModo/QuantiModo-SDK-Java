package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-22T01:20:58.482Z")
public class ConversionStep   {
  

public enum OperationEnum {
  MULTIPLY("MULTIPLY"), ADD("ADD");

  private String value;

  OperationEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private OperationEnum operation = null;
  private Double value = null;

  
  /**
   * ADD or MULTIPLY
   **/
  @ApiModelProperty(required = true, value = "ADD or MULTIPLY")
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  
  /**
   * This specifies the order of conversion steps starting with 0
   **/
  @ApiModelProperty(required = true, value = "This specifies the order of conversion steps starting with 0")
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
    
    sb.append("    operation: ").append(StringUtil.toIndentedString(operation)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
