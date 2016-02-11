package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
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
   * Minimum value permitted for this unit
   **/
  
  @ApiModelProperty(value = "Minimum value permitted for this unit")
  @JsonProperty("minimum_value")
  public Float getMinimumValue() {
    return minimumValue;
  }
  public void setMinimumValue(Float minimumValue) {
    this.minimumValue = minimumValue;
  }

  
  /**
   * Maximum value permitted for this unit
   **/
  
  @ApiModelProperty(value = "Maximum value permitted for this unit")
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
   * ID of default unit for this units category
   **/
  
  @ApiModelProperty(value = "ID of default unit for this units category")
  @JsonProperty("default_unit_id")
  public Integer getDefaultUnitId() {
    return defaultUnitId;
  }
  public void setDefaultUnitId(Integer defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  
  /**
   * Value multiplied to convert to default unit in this unit category
   **/
  
  @ApiModelProperty(value = "Value multiplied to convert to default unit in this unit category")
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
    Unit unit = (Unit) o;
    return Objects.equals(id, unit.id) &&
        Objects.equals(clientId, unit.clientId) &&
        Objects.equals(name, unit.name) &&
        Objects.equals(abbreviatedName, unit.abbreviatedName) &&
        Objects.equals(categoryId, unit.categoryId) &&
        Objects.equals(minimumValue, unit.minimumValue) &&
        Objects.equals(maximumValue, unit.maximumValue) &&
        Objects.equals(updated, unit.updated) &&
        Objects.equals(defaultUnitId, unit.defaultUnitId) &&
        Objects.equals(multiply, unit.multiply) &&
        Objects.equals(add, unit.add) &&
        Objects.equals(createdAt, unit.createdAt) &&
        Objects.equals(updatedAt, unit.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, name, abbreviatedName, categoryId, minimumValue, maximumValue, updated, defaultUnitId, multiply, add, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    abbreviatedName: ").append(toIndentedString(abbreviatedName)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    defaultUnitId: ").append(toIndentedString(defaultUnitId)).append("\n");
    sb.append("    multiply: ").append(toIndentedString(multiply)).append("\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
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

