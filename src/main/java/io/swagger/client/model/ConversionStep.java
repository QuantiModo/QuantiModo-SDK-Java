package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ConversionStep
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class ConversionStep   {
  

  /**
   * ADD or MULTIPLY
   */
  public enum OperationEnum {
    MULTIPLY("MULTIPLY"),
    ADD("ADD");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private OperationEnum operation = null;
  private Double value = null;

  
  /**
   * ADD or MULTIPLY
   **/
  public ConversionStep operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ADD or MULTIPLY")
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
  public ConversionStep value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This specifies the order of conversion steps starting with 0")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionStep conversionStep = (ConversionStep) o;
    return Objects.equals(this.operation, conversionStep.operation) &&
        Objects.equals(this.value, conversionStep.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionStep {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

