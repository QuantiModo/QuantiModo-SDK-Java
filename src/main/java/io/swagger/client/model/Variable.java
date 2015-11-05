package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-05T03:15:54.261Z")
public class Variable   {
  
  private Integer id = null;
  private String clientId = null;
  private Integer parentId = null;
  private String name = null;
  private Integer variableCategoryId = null;
  private Integer defaultUnitId = null;
  private String combinationOperation = null;
  private Float fillingValue = null;
  private Float maximumAllowedValue = null;
  private Float minimumAllowedValue = null;
  private Integer onsetDelay = null;
  private Integer durationOfAction = null;
  private Integer _public = null;
  private Boolean causeOnly = null;
  private Float mostCommonValue = null;
  private Integer mostCommonUnitId = null;
  private Float standardDeviation = null;
  private Float variance = null;
  private Float mean = null;
  private Float median = null;
  private Float numberOfMeasurements = null;
  private Float numberOfUniqueValues = null;
  private Float skewness = null;
  private Float kurtosis = null;
  private String status = null;
  private String errorMessage = null;
  private Date lastSuccessfulUpdateTime = null;
  private Date createdAt = null;
  private Date updatedAt = null;
  private String productUrl = null;
  private String imageUrl = null;
  private Float price = null;
  private Integer numberOfUserVariables = null;
  private Boolean outcome = null;
  private Float minimumRecordedValue = null;
  private Float maximumRecordedValue = null;

  
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
   * parent_id
   **/
  @ApiModelProperty(value = "parent_id")
  @JsonProperty("parent_id")
  public Integer getParentId() {
    return parentId;
  }
  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  
  /**
   * Name of the variable
   **/
  @ApiModelProperty(required = true, value = "Name of the variable")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Category of the variable
   **/
  @ApiModelProperty(required = true, value = "Category of the variable")
  @JsonProperty("variable_category_id")
  public Integer getVariableCategoryId() {
    return variableCategoryId;
  }
  public void setVariableCategoryId(Integer variableCategoryId) {
    this.variableCategoryId = variableCategoryId;
  }

  
  /**
   * ID of the default unit of measurement to use for this variable
   **/
  @ApiModelProperty(required = true, value = "ID of the default unit of measurement to use for this variable")
  @JsonProperty("default_unit_id")
  public Integer getDefaultUnitId() {
    return defaultUnitId;
  }
  public void setDefaultUnitId(Integer defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
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
   * filling_value
   **/
  @ApiModelProperty(value = "filling_value")
  @JsonProperty("filling_value")
  public Float getFillingValue() {
    return fillingValue;
  }
  public void setFillingValue(Float fillingValue) {
    this.fillingValue = fillingValue;
  }

  
  /**
   * maximum_allowed_value
   **/
  @ApiModelProperty(value = "maximum_allowed_value")
  @JsonProperty("maximum_allowed_value")
  public Float getMaximumAllowedValue() {
    return maximumAllowedValue;
  }
  public void setMaximumAllowedValue(Float maximumAllowedValue) {
    this.maximumAllowedValue = maximumAllowedValue;
  }

  
  /**
   * minimum_allowed_value
   **/
  @ApiModelProperty(value = "minimum_allowed_value")
  @JsonProperty("minimum_allowed_value")
  public Float getMinimumAllowedValue() {
    return minimumAllowedValue;
  }
  public void setMinimumAllowedValue(Float minimumAllowedValue) {
    this.minimumAllowedValue = minimumAllowedValue;
  }

  
  /**
   * onset_delay
   **/
  @ApiModelProperty(value = "onset_delay")
  @JsonProperty("onset_delay")
  public Integer getOnsetDelay() {
    return onsetDelay;
  }
  public void setOnsetDelay(Integer onsetDelay) {
    this.onsetDelay = onsetDelay;
  }

  
  /**
   * duration_of_action
   **/
  @ApiModelProperty(value = "duration_of_action")
  @JsonProperty("duration_of_action")
  public Integer getDurationOfAction() {
    return durationOfAction;
  }
  public void setDurationOfAction(Integer durationOfAction) {
    this.durationOfAction = durationOfAction;
  }

  
  /**
   * public
   **/
  @ApiModelProperty(value = "public")
  @JsonProperty("public")
  public Integer getPublic() {
    return _public;
  }
  public void setPublic(Integer _public) {
    this._public = _public;
  }

  
  /**
   * cause_only
   **/
  @ApiModelProperty(value = "cause_only")
  @JsonProperty("cause_only")
  public Boolean getCauseOnly() {
    return causeOnly;
  }
  public void setCauseOnly(Boolean causeOnly) {
    this.causeOnly = causeOnly;
  }

  
  /**
   * most_common_value
   **/
  @ApiModelProperty(value = "most_common_value")
  @JsonProperty("most_common_value")
  public Float getMostCommonValue() {
    return mostCommonValue;
  }
  public void setMostCommonValue(Float mostCommonValue) {
    this.mostCommonValue = mostCommonValue;
  }

  
  /**
   * most_common_unit_id
   **/
  @ApiModelProperty(value = "most_common_unit_id")
  @JsonProperty("most_common_unit_id")
  public Integer getMostCommonUnitId() {
    return mostCommonUnitId;
  }
  public void setMostCommonUnitId(Integer mostCommonUnitId) {
    this.mostCommonUnitId = mostCommonUnitId;
  }

  
  /**
   * standard_deviation
   **/
  @ApiModelProperty(value = "standard_deviation")
  @JsonProperty("standard_deviation")
  public Float getStandardDeviation() {
    return standardDeviation;
  }
  public void setStandardDeviation(Float standardDeviation) {
    this.standardDeviation = standardDeviation;
  }

  
  /**
   * variance
   **/
  @ApiModelProperty(value = "variance")
  @JsonProperty("variance")
  public Float getVariance() {
    return variance;
  }
  public void setVariance(Float variance) {
    this.variance = variance;
  }

  
  /**
   * mean
   **/
  @ApiModelProperty(value = "mean")
  @JsonProperty("mean")
  public Float getMean() {
    return mean;
  }
  public void setMean(Float mean) {
    this.mean = mean;
  }

  
  /**
   * median
   **/
  @ApiModelProperty(value = "median")
  @JsonProperty("median")
  public Float getMedian() {
    return median;
  }
  public void setMedian(Float median) {
    this.median = median;
  }

  
  /**
   * number_of_measurements
   **/
  @ApiModelProperty(value = "number_of_measurements")
  @JsonProperty("number_of_measurements")
  public Float getNumberOfMeasurements() {
    return numberOfMeasurements;
  }
  public void setNumberOfMeasurements(Float numberOfMeasurements) {
    this.numberOfMeasurements = numberOfMeasurements;
  }

  
  /**
   * number_of_unique_values
   **/
  @ApiModelProperty(value = "number_of_unique_values")
  @JsonProperty("number_of_unique_values")
  public Float getNumberOfUniqueValues() {
    return numberOfUniqueValues;
  }
  public void setNumberOfUniqueValues(Float numberOfUniqueValues) {
    this.numberOfUniqueValues = numberOfUniqueValues;
  }

  
  /**
   * skewness
   **/
  @ApiModelProperty(value = "skewness")
  @JsonProperty("skewness")
  public Float getSkewness() {
    return skewness;
  }
  public void setSkewness(Float skewness) {
    this.skewness = skewness;
  }

  
  /**
   * kurtosis
   **/
  @ApiModelProperty(value = "kurtosis")
  @JsonProperty("kurtosis")
  public Float getKurtosis() {
    return kurtosis;
  }
  public void setKurtosis(Float kurtosis) {
    this.kurtosis = kurtosis;
  }

  
  /**
   * status
   **/
  @ApiModelProperty(value = "status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * error_message
   **/
  @ApiModelProperty(value = "error_message")
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   * last_successful_update_time
   **/
  @ApiModelProperty(value = "last_successful_update_time")
  @JsonProperty("last_successful_update_time")
  public Date getLastSuccessfulUpdateTime() {
    return lastSuccessfulUpdateTime;
  }
  public void setLastSuccessfulUpdateTime(Date lastSuccessfulUpdateTime) {
    this.lastSuccessfulUpdateTime = lastSuccessfulUpdateTime;
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
   * product_url
   **/
  @ApiModelProperty(value = "product_url")
  @JsonProperty("product_url")
  public String getProductUrl() {
    return productUrl;
  }
  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }

  
  /**
   * image_url
   **/
  @ApiModelProperty(value = "image_url")
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  
  /**
   * price
   **/
  @ApiModelProperty(value = "price")
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }
  public void setPrice(Float price) {
    this.price = price;
  }

  
  /**
   * number_of_user_variables
   **/
  @ApiModelProperty(value = "number_of_user_variables")
  @JsonProperty("number_of_user_variables")
  public Integer getNumberOfUserVariables() {
    return numberOfUserVariables;
  }
  public void setNumberOfUserVariables(Integer numberOfUserVariables) {
    this.numberOfUserVariables = numberOfUserVariables;
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
   * minimum_recorded_value
   **/
  @ApiModelProperty(value = "minimum_recorded_value")
  @JsonProperty("minimum_recorded_value")
  public Float getMinimumRecordedValue() {
    return minimumRecordedValue;
  }
  public void setMinimumRecordedValue(Float minimumRecordedValue) {
    this.minimumRecordedValue = minimumRecordedValue;
  }

  
  /**
   * maximum_recorded_value
   **/
  @ApiModelProperty(value = "maximum_recorded_value")
  @JsonProperty("maximum_recorded_value")
  public Float getMaximumRecordedValue() {
    return maximumRecordedValue;
  }
  public void setMaximumRecordedValue(Float maximumRecordedValue) {
    this.maximumRecordedValue = maximumRecordedValue;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variable {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(StringUtil.toIndentedString(clientId)).append("\n");
    sb.append("    parentId: ").append(StringUtil.toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    variableCategoryId: ").append(StringUtil.toIndentedString(variableCategoryId)).append("\n");
    sb.append("    defaultUnitId: ").append(StringUtil.toIndentedString(defaultUnitId)).append("\n");
    sb.append("    combinationOperation: ").append(StringUtil.toIndentedString(combinationOperation)).append("\n");
    sb.append("    fillingValue: ").append(StringUtil.toIndentedString(fillingValue)).append("\n");
    sb.append("    maximumAllowedValue: ").append(StringUtil.toIndentedString(maximumAllowedValue)).append("\n");
    sb.append("    minimumAllowedValue: ").append(StringUtil.toIndentedString(minimumAllowedValue)).append("\n");
    sb.append("    onsetDelay: ").append(StringUtil.toIndentedString(onsetDelay)).append("\n");
    sb.append("    durationOfAction: ").append(StringUtil.toIndentedString(durationOfAction)).append("\n");
    sb.append("    _public: ").append(StringUtil.toIndentedString(_public)).append("\n");
    sb.append("    causeOnly: ").append(StringUtil.toIndentedString(causeOnly)).append("\n");
    sb.append("    mostCommonValue: ").append(StringUtil.toIndentedString(mostCommonValue)).append("\n");
    sb.append("    mostCommonUnitId: ").append(StringUtil.toIndentedString(mostCommonUnitId)).append("\n");
    sb.append("    standardDeviation: ").append(StringUtil.toIndentedString(standardDeviation)).append("\n");
    sb.append("    variance: ").append(StringUtil.toIndentedString(variance)).append("\n");
    sb.append("    mean: ").append(StringUtil.toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(StringUtil.toIndentedString(median)).append("\n");
    sb.append("    numberOfMeasurements: ").append(StringUtil.toIndentedString(numberOfMeasurements)).append("\n");
    sb.append("    numberOfUniqueValues: ").append(StringUtil.toIndentedString(numberOfUniqueValues)).append("\n");
    sb.append("    skewness: ").append(StringUtil.toIndentedString(skewness)).append("\n");
    sb.append("    kurtosis: ").append(StringUtil.toIndentedString(kurtosis)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    errorMessage: ").append(StringUtil.toIndentedString(errorMessage)).append("\n");
    sb.append("    lastSuccessfulUpdateTime: ").append(StringUtil.toIndentedString(lastSuccessfulUpdateTime)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(StringUtil.toIndentedString(updatedAt)).append("\n");
    sb.append("    productUrl: ").append(StringUtil.toIndentedString(productUrl)).append("\n");
    sb.append("    imageUrl: ").append(StringUtil.toIndentedString(imageUrl)).append("\n");
    sb.append("    price: ").append(StringUtil.toIndentedString(price)).append("\n");
    sb.append("    numberOfUserVariables: ").append(StringUtil.toIndentedString(numberOfUserVariables)).append("\n");
    sb.append("    outcome: ").append(StringUtil.toIndentedString(outcome)).append("\n");
    sb.append("    minimumRecordedValue: ").append(StringUtil.toIndentedString(minimumRecordedValue)).append("\n");
    sb.append("    maximumRecordedValue: ").append(StringUtil.toIndentedString(maximumRecordedValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
