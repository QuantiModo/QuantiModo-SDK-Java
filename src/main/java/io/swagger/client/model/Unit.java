package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-05T03:15:54.261Z")
public class Unit   {
  
  private Integer id = null;
  private String clientId = null;
  private String name = null;
  private String abbreviatedName = null;
  private Integer categoryId = null;
  private Float minimumValue = null;
  private Float maximumValue = null;
  private Integer updated = null;
  private Integer defaultUnitId = null;
  private Float multiply = null;
  private Float add = null;
  private Date createdAt = null;
  private Date updatedAt = null;

  
  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * client_id
   **/
  @ApiModelProperty(value = "client_id")
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   * Unit name
   **/
  @ApiModelProperty(required = true, value = "Unit name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Unit abbreviation
   **/
  @ApiModelProperty(required = true, value = "Unit abbreviation")
  @JsonProperty("abbreviated_name")
  public String getAbbreviatedName() {
    return abbreviatedName;
  }
  public void setAbbreviatedName(String abbreviatedName) {
    this.abbreviatedName = abbreviatedName;
  }

  
  /**
   * Unit category ID
   **/
  @ApiModelProperty(required = true, value = "Unit category ID")
  @JsonProperty("category_id")
  public Integer getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  
  /**
   * Unit minimum value
   **/
  @ApiModelProperty(value = "Unit minimum value")
  @JsonProperty("minimum_value")
  public Float getMinimumValue() {
    return minimumValue;
  }
  public void setMinimumValue(Float minimumValue) {
    this.minimumValue = minimumValue;
  }

  
  /**
   * Unit maximum value
   **/
  @ApiModelProperty(value = "Unit maximum value")
  @JsonProperty("maximum_value")
  public Float getMaximumValue() {
    return maximumValue;
  }
  public void setMaximumValue(Float maximumValue) {
    this.maximumValue = maximumValue;
  }

  
  /**
   * updated
   **/
  @ApiModelProperty(value = "updated")
  @JsonProperty("updated")
  public Integer getUpdated() {
    return updated;
  }
  public void setUpdated(Integer updated) {
    this.updated = updated;
  }

  
  /**
   * ID of default unit
   **/
  @ApiModelProperty(value = "ID of default unit")
  @JsonProperty("default_unit_id")
  public Integer getDefaultUnitId() {
    return defaultUnitId;
  }
  public void setDefaultUnitId(Integer defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  
  /**
   * Value multiplied to
   **/
  @ApiModelProperty(value = "Value multiplied to")
  @JsonProperty("multiply")
  public Float getMultiply() {
    return multiply;
  }
  public void setMultiply(Float multiply) {
    this.multiply = multiply;
  }

  
  /**
   * Value which should be added to convert to default unit
   **/
  @ApiModelProperty(value = "Value which should be added to convert to default unit")
  @JsonProperty("add")
  public Float getAdd() {
    return add;
  }
  public void setAdd(Float add) {
    this.add = add;
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
    sb.append("class Unit {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(StringUtil.toIndentedString(clientId)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    abbreviatedName: ").append(StringUtil.toIndentedString(abbreviatedName)).append("\n");
    sb.append("    categoryId: ").append(StringUtil.toIndentedString(categoryId)).append("\n");
    sb.append("    minimumValue: ").append(StringUtil.toIndentedString(minimumValue)).append("\n");
    sb.append("    maximumValue: ").append(StringUtil.toIndentedString(maximumValue)).append("\n");
    sb.append("    updated: ").append(StringUtil.toIndentedString(updated)).append("\n");
    sb.append("    defaultUnitId: ").append(StringUtil.toIndentedString(defaultUnitId)).append("\n");
    sb.append("    multiply: ").append(StringUtil.toIndentedString(multiply)).append("\n");
    sb.append("    add: ").append(StringUtil.toIndentedString(add)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(StringUtil.toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
