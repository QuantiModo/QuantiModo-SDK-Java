package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-03T22:24:11.560Z")
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
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableCategory {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    fillingValue: ").append(StringUtil.toIndentedString(fillingValue)).append("\n");
    sb.append("    maximumAllowedValue: ").append(StringUtil.toIndentedString(maximumAllowedValue)).append("\n");
    sb.append("    minimumAllowedValue: ").append(StringUtil.toIndentedString(minimumAllowedValue)).append("\n");
    sb.append("    durationOfAction: ").append(StringUtil.toIndentedString(durationOfAction)).append("\n");
    sb.append("    onsetDelay: ").append(StringUtil.toIndentedString(onsetDelay)).append("\n");
    sb.append("    combinationOperation: ").append(StringUtil.toIndentedString(combinationOperation)).append("\n");
    sb.append("    updated: ").append(StringUtil.toIndentedString(updated)).append("\n");
    sb.append("    causeOnly: ").append(StringUtil.toIndentedString(causeOnly)).append("\n");
    sb.append("    _public: ").append(StringUtil.toIndentedString(_public)).append("\n");
    sb.append("    outcome: ").append(StringUtil.toIndentedString(outcome)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(StringUtil.toIndentedString(updatedAt)).append("\n");
    sb.append("    imageUrl: ").append(StringUtil.toIndentedString(imageUrl)).append("\n");
    sb.append("    defaultUnitId: ").append(StringUtil.toIndentedString(defaultUnitId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
