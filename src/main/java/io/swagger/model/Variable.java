package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
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
   * ID of the parent variable if this variable has any parent
   **/
  
  @ApiModelProperty(value = "ID of the parent variable if this variable has any parent")
  @JsonProperty("parent_id")
  public Integer getParentId() {
    return parentId;
  }
  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  
  /**
   * User-defined variable display name
   **/
  
  @ApiModelProperty(required = true, value = "User-defined variable display name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Variable category ID
   **/
  
  @ApiModelProperty(required = true, value = "Variable category ID")
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
   * How to combine values of this variable (for instance, to see a summary of the values over a month) SUM or MEAN
   **/
  
  @ApiModelProperty(value = "How to combine values of this variable (for instance, to see a summary of the values over a month) SUM or MEAN")
  @JsonProperty("combination_operation")
  public String getCombinationOperation() {
    return combinationOperation;
  }
  public void setCombinationOperation(String combinationOperation) {
    this.combinationOperation = combinationOperation;
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
   * Maximum reasonable value for this variable (uses default unit)
   **/
  
  @ApiModelProperty(value = "Maximum reasonable value for this variable (uses default unit)")
  @JsonProperty("maximum_allowed_value")
  public Float getMaximumAllowedValue() {
    return maximumAllowedValue;
  }
  public void setMaximumAllowedValue(Float maximumAllowedValue) {
    this.maximumAllowedValue = maximumAllowedValue;
  }

  
  /**
   * Minimum reasonable value for this variable (uses default unit)
   **/
  
  @ApiModelProperty(value = "Minimum reasonable value for this variable (uses default unit)")
  @JsonProperty("minimum_allowed_value")
  public Float getMinimumAllowedValue() {
    return minimumAllowedValue;
  }
  public void setMinimumAllowedValue(Float minimumAllowedValue) {
    this.minimumAllowedValue = minimumAllowedValue;
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
   * Is variable public
   **/
  
  @ApiModelProperty(value = "Is variable public")
  @JsonProperty("public")
  public Integer getPublic() {
    return _public;
  }
  public void setPublic(Integer _public) {
    this._public = _public;
  }

  
  /**
   * A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user
   **/
  
  @ApiModelProperty(value = "A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user")
  @JsonProperty("cause_only")
  public Boolean getCauseOnly() {
    return causeOnly;
  }
  public void setCauseOnly(Boolean causeOnly) {
    this.causeOnly = causeOnly;
  }

  
  /**
   * Most common value
   **/
  
  @ApiModelProperty(value = "Most common value")
  @JsonProperty("most_common_value")
  public Float getMostCommonValue() {
    return mostCommonValue;
  }
  public void setMostCommonValue(Float mostCommonValue) {
    this.mostCommonValue = mostCommonValue;
  }

  
  /**
   * Most common Unit
   **/
  
  @ApiModelProperty(value = "Most common Unit")
  @JsonProperty("most_common_unit_id")
  public Integer getMostCommonUnitId() {
    return mostCommonUnitId;
  }
  public void setMostCommonUnitId(Integer mostCommonUnitId) {
    this.mostCommonUnitId = mostCommonUnitId;
  }

  
  /**
   * Standard Deviation
   **/
  
  @ApiModelProperty(value = "Standard Deviation")
  @JsonProperty("standard_deviation")
  public Float getStandardDeviation() {
    return standardDeviation;
  }
  public void setStandardDeviation(Float standardDeviation) {
    this.standardDeviation = standardDeviation;
  }

  
  /**
   * Variance
   **/
  
  @ApiModelProperty(value = "Variance")
  @JsonProperty("variance")
  public Float getVariance() {
    return variance;
  }
  public void setVariance(Float variance) {
    this.variance = variance;
  }

  
  /**
   * Mean
   **/
  
  @ApiModelProperty(value = "Mean")
  @JsonProperty("mean")
  public Float getMean() {
    return mean;
  }
  public void setMean(Float mean) {
    this.mean = mean;
  }

  
  /**
   * Median
   **/
  
  @ApiModelProperty(value = "Median")
  @JsonProperty("median")
  public Float getMedian() {
    return median;
  }
  public void setMedian(Float median) {
    this.median = median;
  }

  
  /**
   * Number of measurements
   **/
  
  @ApiModelProperty(value = "Number of measurements")
  @JsonProperty("number_of_measurements")
  public Float getNumberOfMeasurements() {
    return numberOfMeasurements;
  }
  public void setNumberOfMeasurements(Float numberOfMeasurements) {
    this.numberOfMeasurements = numberOfMeasurements;
  }

  
  /**
   * Number of unique values
   **/
  
  @ApiModelProperty(value = "Number of unique values")
  @JsonProperty("number_of_unique_values")
  public Float getNumberOfUniqueValues() {
    return numberOfUniqueValues;
  }
  public void setNumberOfUniqueValues(Float numberOfUniqueValues) {
    this.numberOfUniqueValues = numberOfUniqueValues;
  }

  
  /**
   * Skewness
   **/
  
  @ApiModelProperty(value = "Skewness")
  @JsonProperty("skewness")
  public Float getSkewness() {
    return skewness;
  }
  public void setSkewness(Float skewness) {
    this.skewness = skewness;
  }

  
  /**
   * Kurtosis
   **/
  
  @ApiModelProperty(value = "Kurtosis")
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
   * When this variable or its settings were last updated
   **/
  
  @ApiModelProperty(value = "When this variable or its settings were last updated")
  @JsonProperty("last_successful_update_time")
  public Date getLastSuccessfulUpdateTime() {
    return lastSuccessfulUpdateTime;
  }
  public void setLastSuccessfulUpdateTime(Date lastSuccessfulUpdateTime) {
    this.lastSuccessfulUpdateTime = lastSuccessfulUpdateTime;
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
   * Product URL
   **/
  
  @ApiModelProperty(value = "Product URL")
  @JsonProperty("product_url")
  public String getProductUrl() {
    return productUrl;
  }
  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
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
   * Price
   **/
  
  @ApiModelProperty(value = "Price")
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }
  public void setPrice(Float price) {
    this.price = price;
  }

  
  /**
   * Number of variables
   **/
  
  @ApiModelProperty(value = "Number of variables")
  @JsonProperty("number_of_user_variables")
  public Integer getNumberOfUserVariables() {
    return numberOfUserVariables;
  }
  public void setNumberOfUserVariables(Integer numberOfUserVariables) {
    this.numberOfUserVariables = numberOfUserVariables;
  }

  
  /**
   * Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables.
   **/
  
  @ApiModelProperty(value = "Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables.")
  @JsonProperty("outcome")
  public Boolean getOutcome() {
    return outcome;
  }
  public void setOutcome(Boolean outcome) {
    this.outcome = outcome;
  }

  
  /**
   * Minimum recorded value of this variable
   **/
  
  @ApiModelProperty(value = "Minimum recorded value of this variable")
  @JsonProperty("minimum_recorded_value")
  public Float getMinimumRecordedValue() {
    return minimumRecordedValue;
  }
  public void setMinimumRecordedValue(Float minimumRecordedValue) {
    this.minimumRecordedValue = minimumRecordedValue;
  }

  
  /**
   * Maximum recorded value of this variable
   **/
  
  @ApiModelProperty(value = "Maximum recorded value of this variable")
  @JsonProperty("maximum_recorded_value")
  public Float getMaximumRecordedValue() {
    return maximumRecordedValue;
  }
  public void setMaximumRecordedValue(Float maximumRecordedValue) {
    this.maximumRecordedValue = maximumRecordedValue;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Variable variable = (Variable) o;
    return Objects.equals(id, variable.id) &&
        Objects.equals(clientId, variable.clientId) &&
        Objects.equals(parentId, variable.parentId) &&
        Objects.equals(name, variable.name) &&
        Objects.equals(variableCategoryId, variable.variableCategoryId) &&
        Objects.equals(defaultUnitId, variable.defaultUnitId) &&
        Objects.equals(combinationOperation, variable.combinationOperation) &&
        Objects.equals(fillingValue, variable.fillingValue) &&
        Objects.equals(maximumAllowedValue, variable.maximumAllowedValue) &&
        Objects.equals(minimumAllowedValue, variable.minimumAllowedValue) &&
        Objects.equals(onsetDelay, variable.onsetDelay) &&
        Objects.equals(durationOfAction, variable.durationOfAction) &&
        Objects.equals(_public, variable._public) &&
        Objects.equals(causeOnly, variable.causeOnly) &&
        Objects.equals(mostCommonValue, variable.mostCommonValue) &&
        Objects.equals(mostCommonUnitId, variable.mostCommonUnitId) &&
        Objects.equals(standardDeviation, variable.standardDeviation) &&
        Objects.equals(variance, variable.variance) &&
        Objects.equals(mean, variable.mean) &&
        Objects.equals(median, variable.median) &&
        Objects.equals(numberOfMeasurements, variable.numberOfMeasurements) &&
        Objects.equals(numberOfUniqueValues, variable.numberOfUniqueValues) &&
        Objects.equals(skewness, variable.skewness) &&
        Objects.equals(kurtosis, variable.kurtosis) &&
        Objects.equals(status, variable.status) &&
        Objects.equals(errorMessage, variable.errorMessage) &&
        Objects.equals(lastSuccessfulUpdateTime, variable.lastSuccessfulUpdateTime) &&
        Objects.equals(createdAt, variable.createdAt) &&
        Objects.equals(updatedAt, variable.updatedAt) &&
        Objects.equals(productUrl, variable.productUrl) &&
        Objects.equals(imageUrl, variable.imageUrl) &&
        Objects.equals(price, variable.price) &&
        Objects.equals(numberOfUserVariables, variable.numberOfUserVariables) &&
        Objects.equals(outcome, variable.outcome) &&
        Objects.equals(minimumRecordedValue, variable.minimumRecordedValue) &&
        Objects.equals(maximumRecordedValue, variable.maximumRecordedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, parentId, name, variableCategoryId, defaultUnitId, combinationOperation, fillingValue, maximumAllowedValue, minimumAllowedValue, onsetDelay, durationOfAction, _public, causeOnly, mostCommonValue, mostCommonUnitId, standardDeviation, variance, mean, median, numberOfMeasurements, numberOfUniqueValues, skewness, kurtosis, status, errorMessage, lastSuccessfulUpdateTime, createdAt, updatedAt, productUrl, imageUrl, price, numberOfUserVariables, outcome, minimumRecordedValue, maximumRecordedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variable {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    variableCategoryId: ").append(toIndentedString(variableCategoryId)).append("\n");
    sb.append("    defaultUnitId: ").append(toIndentedString(defaultUnitId)).append("\n");
    sb.append("    combinationOperation: ").append(toIndentedString(combinationOperation)).append("\n");
    sb.append("    fillingValue: ").append(toIndentedString(fillingValue)).append("\n");
    sb.append("    maximumAllowedValue: ").append(toIndentedString(maximumAllowedValue)).append("\n");
    sb.append("    minimumAllowedValue: ").append(toIndentedString(minimumAllowedValue)).append("\n");
    sb.append("    onsetDelay: ").append(toIndentedString(onsetDelay)).append("\n");
    sb.append("    durationOfAction: ").append(toIndentedString(durationOfAction)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    causeOnly: ").append(toIndentedString(causeOnly)).append("\n");
    sb.append("    mostCommonValue: ").append(toIndentedString(mostCommonValue)).append("\n");
    sb.append("    mostCommonUnitId: ").append(toIndentedString(mostCommonUnitId)).append("\n");
    sb.append("    standardDeviation: ").append(toIndentedString(standardDeviation)).append("\n");
    sb.append("    variance: ").append(toIndentedString(variance)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    numberOfMeasurements: ").append(toIndentedString(numberOfMeasurements)).append("\n");
    sb.append("    numberOfUniqueValues: ").append(toIndentedString(numberOfUniqueValues)).append("\n");
    sb.append("    skewness: ").append(toIndentedString(skewness)).append("\n");
    sb.append("    kurtosis: ").append(toIndentedString(kurtosis)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    lastSuccessfulUpdateTime: ").append(toIndentedString(lastSuccessfulUpdateTime)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    numberOfUserVariables: ").append(toIndentedString(numberOfUserVariables)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    minimumRecordedValue: ").append(toIndentedString(minimumRecordedValue)).append("\n");
    sb.append("    maximumRecordedValue: ").append(toIndentedString(maximumRecordedValue)).append("\n");
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

