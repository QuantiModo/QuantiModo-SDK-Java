package io.swagger.client.model;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-02T06:04:40.138Z")
public class ConversionStep   {
  
  public enum OperationEnum {
     MULTIPLY,  ADD, 
  };
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
    
    sb.append("  operation: ").append(operation).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
