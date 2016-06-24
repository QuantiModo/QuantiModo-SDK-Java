package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ConversionStep;
import java.util.ArrayList;
import java.util.List;


/**
 * Unit
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class Unit   {
  
  private String name = null;
  private String abbreviatedName = null;

  /**
   * Unit category
   */
  public enum CategoryEnum {
    DISTANCE("Distance"),
    DURATION("Duration"),
    ENERGY("Energy"),
    FREQUENCY("Frequency"),
    MISCELLANY("Miscellany"),
    PRESSURE("Pressure"),
    PROPORTION("Proportion"),
    RATING("Rating"),
    TEMPERATURE("Temperature"),
    VOLUME("Volume"),
    WEIGHT("Weight");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CategoryEnum category = null;
  private Double minimumValue = null;
  private Double maximumValue = null;
  private List<ConversionStep> conversionSteps = new ArrayList<ConversionStep>();

  
  /**
   * Unit name
   **/
  public Unit name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unit name")
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
  public Unit abbreviatedName(String abbreviatedName) {
    this.abbreviatedName = abbreviatedName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unit abbreviation")
  @JsonProperty("abbreviatedName")
  public String getAbbreviatedName() {
    return abbreviatedName;
  }
  public void setAbbreviatedName(String abbreviatedName) {
    this.abbreviatedName = abbreviatedName;
  }


  /**
   * Unit category
   **/
  public Unit category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unit category")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  /**
   * The smallest acceptable value for measurements using this unit
   **/
  public Unit minimumValue(Double minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The smallest acceptable value for measurements using this unit")
  @JsonProperty("minimumValue")
  public Double getMinimumValue() {
    return minimumValue;
  }
  public void setMinimumValue(Double minimumValue) {
    this.minimumValue = minimumValue;
  }


  /**
   * The largest acceptable value for measurements using this unit
   **/
  public Unit maximumValue(Double maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The largest acceptable value for measurements using this unit")
  @JsonProperty("maximumValue")
  public Double getMaximumValue() {
    return maximumValue;
  }
  public void setMaximumValue(Double maximumValue) {
    this.maximumValue = maximumValue;
  }


  /**
   * Conversion steps list
   **/
  public Unit conversionSteps(List<ConversionStep> conversionSteps) {
    this.conversionSteps = conversionSteps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Conversion steps list")
  @JsonProperty("conversionSteps")
  public List<ConversionStep> getConversionSteps() {
    return conversionSteps;
  }
  public void setConversionSteps(List<ConversionStep> conversionSteps) {
    this.conversionSteps = conversionSteps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Unit unit = (Unit) o;
    return Objects.equals(this.name, unit.name) &&
        Objects.equals(this.abbreviatedName, unit.abbreviatedName) &&
        Objects.equals(this.category, unit.category) &&
        Objects.equals(this.minimumValue, unit.minimumValue) &&
        Objects.equals(this.maximumValue, unit.maximumValue) &&
        Objects.equals(this.conversionSteps, unit.conversionSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, abbreviatedName, category, minimumValue, maximumValue, conversionSteps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unit {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    abbreviatedName: ").append(toIndentedString(abbreviatedName)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    conversionSteps: ").append(toIndentedString(conversionSteps)).append("\n");
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

