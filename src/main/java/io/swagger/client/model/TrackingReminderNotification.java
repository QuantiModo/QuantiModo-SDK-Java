package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * TrackingReminderNotification
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class TrackingReminderNotification   {
  
  private Integer id = null;
  private Integer trackingReminderId = null;
  private String clientId = null;
  private Integer userId = null;
  private Integer variableId = null;
  private DateTime pendingReminderTime = null;
  private Float defaultValue = null;
  private String reminderSound = null;
  private Boolean popUp = null;
  private Boolean sms = null;
  private Boolean email = null;
  private Boolean notificationBar = null;
  private DateTime updatedAt = null;
  private String variableName = null;
  private String variableCategoryName = null;
  private String abbreviatedUnitName = null;

  /**
   * The way multiple measurements are aggregated over time
   */
  public enum CombinationOperationEnum {
    MEAN("MEAN"),
    SUM("SUM");

    private String value;

    CombinationOperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CombinationOperationEnum combinationOperation = null;

  
  /**
   * id for the specific PENDING tracking remidner
   **/
  public TrackingReminderNotification id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "id for the specific PENDING tracking remidner")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * id for the repeating tracking remidner
   **/
  public TrackingReminderNotification trackingReminderId(Integer trackingReminderId) {
    this.trackingReminderId = trackingReminderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "id for the repeating tracking remidner")
  @JsonProperty("trackingReminderId")
  public Integer getTrackingReminderId() {
    return trackingReminderId;
  }
  public void setTrackingReminderId(Integer trackingReminderId) {
    this.trackingReminderId = trackingReminderId;
  }


  /**
   * clientId
   **/
  public TrackingReminderNotification clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "clientId")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  /**
   * ID of User
   **/
  public TrackingReminderNotification userId(Integer userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of User")
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  /**
   * Id for the variable to be tracked
   **/
  public TrackingReminderNotification variableId(Integer variableId) {
    this.variableId = variableId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id for the variable to be tracked")
  @JsonProperty("variableId")
  public Integer getVariableId() {
    return variableId;
  }
  public void setVariableId(Integer variableId) {
    this.variableId = variableId;
  }


  /**
   * ISO 8601 timestamp for the specific time the variable should be tracked in UTC.  This will be used for the measurement startTime if the track endpoint is used.
   **/
  public TrackingReminderNotification pendingReminderTime(DateTime pendingReminderTime) {
    this.pendingReminderTime = pendingReminderTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ISO 8601 timestamp for the specific time the variable should be tracked in UTC.  This will be used for the measurement startTime if the track endpoint is used.")
  @JsonProperty("pendingReminderTime")
  public DateTime getPendingReminderTime() {
    return pendingReminderTime;
  }
  public void setPendingReminderTime(DateTime pendingReminderTime) {
    this.pendingReminderTime = pendingReminderTime;
  }


  /**
   * Default value to use for the measurement when tracking
   **/
  public TrackingReminderNotification defaultValue(Float defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default value to use for the measurement when tracking")
  @JsonProperty("defaultValue")
  public Float getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(Float defaultValue) {
    this.defaultValue = defaultValue;
  }


  /**
   * String identifier for the sound to accompany the reminder
   **/
  public TrackingReminderNotification reminderSound(String reminderSound) {
    this.reminderSound = reminderSound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "String identifier for the sound to accompany the reminder")
  @JsonProperty("reminderSound")
  public String getReminderSound() {
    return reminderSound;
  }
  public void setReminderSound(String reminderSound) {
    this.reminderSound = reminderSound;
  }


  /**
   * True if the reminders should appear as a popup notification
   **/
  public TrackingReminderNotification popUp(Boolean popUp) {
    this.popUp = popUp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the reminders should appear as a popup notification")
  @JsonProperty("popUp")
  public Boolean getPopUp() {
    return popUp;
  }
  public void setPopUp(Boolean popUp) {
    this.popUp = popUp;
  }


  /**
   * True if the reminders should be delivered via SMS
   **/
  public TrackingReminderNotification sms(Boolean sms) {
    this.sms = sms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the reminders should be delivered via SMS")
  @JsonProperty("sms")
  public Boolean getSms() {
    return sms;
  }
  public void setSms(Boolean sms) {
    this.sms = sms;
  }


  /**
   * True if the reminders should be delivered via email
   **/
  public TrackingReminderNotification email(Boolean email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the reminders should be delivered via email")
  @JsonProperty("email")
  public Boolean getEmail() {
    return email;
  }
  public void setEmail(Boolean email) {
    this.email = email;
  }


  /**
   * True if the reminders should appear in the notification bar
   **/
  public TrackingReminderNotification notificationBar(Boolean notificationBar) {
    this.notificationBar = notificationBar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the reminders should appear in the notification bar")
  @JsonProperty("notificationBar")
  public Boolean getNotificationBar() {
    return notificationBar;
  }
  public void setNotificationBar(Boolean notificationBar) {
    this.notificationBar = notificationBar;
  }


  /**
   * When the record in the database was last updated. Use ISO 8601 datetime format. Time zone should be UTC and not local.
   **/
  public TrackingReminderNotification updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the record in the database was last updated. Use ISO 8601 datetime format. Time zone should be UTC and not local.")
  @JsonProperty("updatedAt")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Name of the variable to be used when sending measurements
   **/
  public TrackingReminderNotification variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the variable to be used when sending measurements")
  @JsonProperty("variableName")
  public String getVariableName() {
    return variableName;
  }
  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }


  /**
   * Name of the variable category to be used when sending measurements
   **/
  public TrackingReminderNotification variableCategoryName(String variableCategoryName) {
    this.variableCategoryName = variableCategoryName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the variable category to be used when sending measurements")
  @JsonProperty("variableCategoryName")
  public String getVariableCategoryName() {
    return variableCategoryName;
  }
  public void setVariableCategoryName(String variableCategoryName) {
    this.variableCategoryName = variableCategoryName;
  }


  /**
   * Abbreviated name of the unit to be used when sending measurements
   **/
  public TrackingReminderNotification abbreviatedUnitName(String abbreviatedUnitName) {
    this.abbreviatedUnitName = abbreviatedUnitName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Abbreviated name of the unit to be used when sending measurements")
  @JsonProperty("abbreviatedUnitName")
  public String getAbbreviatedUnitName() {
    return abbreviatedUnitName;
  }
  public void setAbbreviatedUnitName(String abbreviatedUnitName) {
    this.abbreviatedUnitName = abbreviatedUnitName;
  }


  /**
   * The way multiple measurements are aggregated over time
   **/
  public TrackingReminderNotification combinationOperation(CombinationOperationEnum combinationOperation) {
    this.combinationOperation = combinationOperation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The way multiple measurements are aggregated over time")
  @JsonProperty("combinationOperation")
  public CombinationOperationEnum getCombinationOperation() {
    return combinationOperation;
  }
  public void setCombinationOperation(CombinationOperationEnum combinationOperation) {
    this.combinationOperation = combinationOperation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingReminderNotification trackingReminderNotification = (TrackingReminderNotification) o;
    return Objects.equals(this.id, trackingReminderNotification.id) &&
        Objects.equals(this.trackingReminderId, trackingReminderNotification.trackingReminderId) &&
        Objects.equals(this.clientId, trackingReminderNotification.clientId) &&
        Objects.equals(this.userId, trackingReminderNotification.userId) &&
        Objects.equals(this.variableId, trackingReminderNotification.variableId) &&
        Objects.equals(this.pendingReminderTime, trackingReminderNotification.pendingReminderTime) &&
        Objects.equals(this.defaultValue, trackingReminderNotification.defaultValue) &&
        Objects.equals(this.reminderSound, trackingReminderNotification.reminderSound) &&
        Objects.equals(this.popUp, trackingReminderNotification.popUp) &&
        Objects.equals(this.sms, trackingReminderNotification.sms) &&
        Objects.equals(this.email, trackingReminderNotification.email) &&
        Objects.equals(this.notificationBar, trackingReminderNotification.notificationBar) &&
        Objects.equals(this.updatedAt, trackingReminderNotification.updatedAt) &&
        Objects.equals(this.variableName, trackingReminderNotification.variableName) &&
        Objects.equals(this.variableCategoryName, trackingReminderNotification.variableCategoryName) &&
        Objects.equals(this.abbreviatedUnitName, trackingReminderNotification.abbreviatedUnitName) &&
        Objects.equals(this.combinationOperation, trackingReminderNotification.combinationOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, trackingReminderId, clientId, userId, variableId, pendingReminderTime, defaultValue, reminderSound, popUp, sms, email, notificationBar, updatedAt, variableName, variableCategoryName, abbreviatedUnitName, combinationOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingReminderNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    trackingReminderId: ").append(toIndentedString(trackingReminderId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
    sb.append("    pendingReminderTime: ").append(toIndentedString(pendingReminderTime)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    reminderSound: ").append(toIndentedString(reminderSound)).append("\n");
    sb.append("    popUp: ").append(toIndentedString(popUp)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    notificationBar: ").append(toIndentedString(notificationBar)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    variableCategoryName: ").append(toIndentedString(variableCategoryName)).append("\n");
    sb.append("    abbreviatedUnitName: ").append(toIndentedString(abbreviatedUnitName)).append("\n");
    sb.append("    combinationOperation: ").append(toIndentedString(combinationOperation)).append("\n");
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

