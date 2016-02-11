package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
public class VariableCategory   {
  
  private Integer id = null;
  private String name = null;
  private Float fillingValue = null;
  private Float maximumAllowedValue = null;
  private Float minimumAllowedValue = null;
  private Integer durationOfAction = null;
  private Integer onsetDelay = null;
  private String combinationOperation = null;
  private Integer updated = null;
  private Boolean causeOnly = null;
  private Integer _public = null;
  private Boolean outcome = null;
  private Date createdAt = null;
  private Date updatedAt = null;
  private String imageUrl = null;
  private Integer defaultUnitId = null;

  
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
   * Name of the category
   **/
  
  @ApiModelProperty(required = true, value = "Name of the category")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Value for replacing null measurements
   **/
  
  @ApiModelProperty(value = "Value for replacing null measurements")
  @JsonProperty("filling_value")
  public Float getFillingValue() {
    return fillingValue;
  }
  public void setFillingValue(Float fillingValue) {
    this.fillingValue = fillingValue;
  }

  
  /**
   * Maximum recorded value of this category
   **/
  
  @ApiModelProperty(value = "Maximum recorded value of this category")
  @JsonProperty("maximum_allowed_value")
  public Float getMaximumAllowedValue() {
    return maximumAllowedValue;
  }
  public void setMaximumAllowedValue(Float maximumAllowedValue) {
    this.maximumAllowedValue = maximumAllowedValue;
  }

  
  /**
   * Minimum recorded value of this category
   **/
  
  @ApiModelProperty(value = "Minimum recorded value of this category")
  @JsonProperty("minimum_allowed_value")
  public Float getMinimumAllowedValue() {
    return minimumAllowedValue;
  }
  public void setMinimumAllowedValue(Float minimumAllowedValue) {
    this.minimumAllowedValue = minimumAllowedValue;
  }

  
  /**
   * How long the effect of a measurement in this variable lasts
   **/
  
  @ApiModelProperty(value = "How long the effect of a measurement in this variable lasts")
  @JsonProperty("duration_of_action")
  public Integer getDurationOfAction() {
    return durationOfAction;
  }
  public void setDurationOfAction(Integer durationOfAction) {
    this.durationOfAction = durationOfAction;
  }

  
  /**
   * How long it takes for a measurement in this variable to take effect
   **/
  
  @ApiModelProperty(value = "How long it takes for a measurement in this variable to take effect")
  @JsonProperty("onset_delay")
  public Integer getOnsetDelay() {
    return onsetDelay;
  }
  public void setOnsetDelay(Integer onsetDelay) {
    this.onsetDelay = onsetDelay;
  }

  
  /**
   * How to combine values of this variable (for instance, to see a summary of the values over a month) 0 for sum OR 1 for mean
   **/
  
  @ApiModelProperty(value = "How to combine values of this variable (for instance, to see a summary of the values over a month) 0 for sum OR 1 for mean")
  @JsonProperty("combination_operation")
  public String getCombinationOperation() {
    return combinationOperation;
  }
  public void setCombinationOperation(String combinationOperation) {
    this.combinationOperation = combinationOperation;
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
   * A value of 1 indicates that this category is generally a cause in a causal relationship.  An example of a causeOnly category would be a category such as Work which would generally not be influenced by the behaviour of the user
   **/
  
  @ApiModelProperty(value = "A value of 1 indicates that this category is generally a cause in a causal relationship.  An example of a causeOnly category would be a category such as Work which would generally not be influenced by the behaviour of the user")
  @JsonProperty("cause_only")
  public Boolean getCauseOnly() {
    return causeOnly;
  }
  public void setCauseOnly(Boolean causeOnly) {
    this.causeOnly = causeOnly;
  }

  
  /**
   * Is category public
   **/
  
  @ApiModelProperty(value = "Is category public")
  @JsonProperty("public")
  public Integer getPublic() {
    return _public;
  }
  public void setPublic(Integer _public) {
    this._public = _public;
  }

  
  /**
   * outcome
   **/
  
  @ApiModelProperty(value = "outcome")
  @JsonProperty("outcome")
  public Boolean getOutcome() {
    return outcome;
  }
  public void setOutcome(Boolean outcome) {
    this.outcome = outcome;
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

  
  /**
   * Image URL
   **/
  
  @ApiModelProperty(value = "Image URL")
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  
  /**
   * ID of the default unit for the category
   **/
  
  @ApiModelProperty(value = "ID of the default unit for the category")
  @JsonProperty("default_unit_id")
  public Integer getDefaultUnitId() {
    return defaultUnitId;
  }
  public void setDefaultUnitId(Integer defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableCategory variableCategory = (VariableCategory) o;
    return Objects.equals(id, variableCategory.id) &&
        Objects.equals(name, variableCategory.name) &&
        Objects.equals(fillingValue, variableCategory.fillingValue) &&
        Objects.equals(maximumAllowedValue, variableCategory.maximumAllowedValue) &&
        Objects.equals(minimumAllowedValue, variableCategory.minimumAllowedValue) &&
        Objects.equals(durationOfAction, variableCategory.durationOfAction) &&
        Objects.equals(onsetDelay, variableCategory.onsetDelay) &&
        Objects.equals(combinationOperation, variableCategory.combinationOperation) &&
        Objects.equals(updated, variableCategory.updated) &&
        Objects.equals(causeOnly, variableCategory.causeOnly) &&
        Objects.equals(_public, variableCategory._public) &&
        Objects.equals(outcome, variableCategory.outcome) &&
        Objects.equals(createdAt, variableCategory.createdAt) &&
        Objects.equals(updatedAt, variableCategory.updatedAt) &&
        Objects.equals(imageUrl, variableCategory.imageUrl) &&
        Objects.equals(defaultUnitId, variableCategory.defaultUnitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fillingValue, maximumAllowedValue, minimumAllowedValue, durationOfAction, onsetDelay, combinationOperation, updated, causeOnly, _public, outcome, createdAt, updatedAt, imageUrl, defaultUnitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableCategory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fillingValue: ").append(toIndentedString(fillingValue)).append("\n");
    sb.append("    maximumAllowedValue: ").append(toIndentedString(maximumAllowedValue)).append("\n");
    sb.append("    minimumAllowedValue: ").append(toIndentedString(minimumAllowedValue)).append("\n");
    sb.append("    durationOfAction: ").append(toIndentedString(durationOfAction)).append("\n");
    sb.append("    onsetDelay: ").append(toIndentedString(onsetDelay)).append("\n");
    sb.append("    combinationOperation: ").append(toIndentedString(combinationOperation)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    causeOnly: ").append(toIndentedString(causeOnly)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    defaultUnitId: ").append(toIndentedString(defaultUnitId)).append("\n");
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

