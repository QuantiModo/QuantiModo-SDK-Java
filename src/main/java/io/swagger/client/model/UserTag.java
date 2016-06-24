package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;


/**
 * UserTag
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class UserTag   {
  
  private Integer taggedVariableId = null;
  private Integer tagVariableId = null;
  private BigDecimal conversionFactor = null;

  
  /**
   * This is the id of the variable being tagged with an ingredient or something.
   **/
  public UserTag taggedVariableId(Integer taggedVariableId) {
    this.taggedVariableId = taggedVariableId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the id of the variable being tagged with an ingredient or something.")
  @JsonProperty("taggedVariableId")
  public Integer getTaggedVariableId() {
    return taggedVariableId;
  }
  public void setTaggedVariableId(Integer taggedVariableId) {
    this.taggedVariableId = taggedVariableId;
  }


  /**
   * This is the id of the ingredient variable whose value is determined based on the value of the tagged variable.
   **/
  public UserTag tagVariableId(Integer tagVariableId) {
    this.tagVariableId = tagVariableId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the id of the ingredient variable whose value is determined based on the value of the tagged variable.")
  @JsonProperty("tagVariableId")
  public Integer getTagVariableId() {
    return tagVariableId;
  }
  public void setTagVariableId(Integer tagVariableId) {
    this.tagVariableId = tagVariableId;
  }


  /**
   * Number by which we multiply the tagged variable value to obtain the tag variable (ingredient) value
   **/
  public UserTag conversionFactor(BigDecimal conversionFactor) {
    this.conversionFactor = conversionFactor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number by which we multiply the tagged variable value to obtain the tag variable (ingredient) value")
  @JsonProperty("conversionFactor")
  public BigDecimal getConversionFactor() {
    return conversionFactor;
  }
  public void setConversionFactor(BigDecimal conversionFactor) {
    this.conversionFactor = conversionFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTag userTag = (UserTag) o;
    return Objects.equals(this.taggedVariableId, userTag.taggedVariableId) &&
        Objects.equals(this.tagVariableId, userTag.tagVariableId) &&
        Objects.equals(this.conversionFactor, userTag.conversionFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taggedVariableId, tagVariableId, conversionFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTag {\n");
    
    sb.append("    taggedVariableId: ").append(toIndentedString(taggedVariableId)).append("\n");
    sb.append("    tagVariableId: ").append(toIndentedString(tagVariableId)).append("\n");
    sb.append("    conversionFactor: ").append(toIndentedString(conversionFactor)).append("\n");
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

