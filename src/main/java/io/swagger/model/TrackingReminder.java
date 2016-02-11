package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
public class TrackingReminder   {
  
  private Integer id = null;
  private String clientId = null;
  private Integer userId = null;
  private Integer variableId = null;
  private Float defaultValue = null;
  private String reminderStartTime = null;
  private String reminderEndTime = null;
  private String reminderSound = null;
  private Integer reminderFrequency = null;
  private Boolean popUp = null;
  private Boolean sms = null;
  private Boolean email = null;
  private Boolean notificationBar = null;
  private Date lastReminded = null;
  private Date lastTracked = null;
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
   * ID of User
   **/
  
  @ApiModelProperty(value = "ID of User")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  
  /**
   * Id for the variable to be tracked
   **/
  
  @ApiModelProperty(required = true, value = "Id for the variable to be tracked")
  @JsonProperty("variable_id")
  public Integer getVariableId() {
    return variableId;
  }
  public void setVariableId(Integer variableId) {
    this.variableId = variableId;
  }

  
  /**
   * Default value to use for the measurement when tracking
   **/
  
  @ApiModelProperty(value = "Default value to use for the measurement when tracking")
  @JsonProperty("default_value")
  public Float getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(Float defaultValue) {
    this.defaultValue = defaultValue;
  }

  
  /**
   * Earliest time of day at which reminders should appear
   **/
  
  @ApiModelProperty(value = "Earliest time of day at which reminders should appear")
  @JsonProperty("reminder_start_time")
  public String getReminderStartTime() {
    return reminderStartTime;
  }
  public void setReminderStartTime(String reminderStartTime) {
    this.reminderStartTime = reminderStartTime;
  }

  
  /**
   * Latest time of day at which reminders should appear
   **/
  
  @ApiModelProperty(value = "Latest time of day at which reminders should appear")
  @JsonProperty("reminder_end_time")
  public String getReminderEndTime() {
    return reminderEndTime;
  }
  public void setReminderEndTime(String reminderEndTime) {
    this.reminderEndTime = reminderEndTime;
  }

  
  /**
   * String identifier for the sound to accompany the reminder
   **/
  
  @ApiModelProperty(value = "String identifier for the sound to accompany the reminder")
  @JsonProperty("reminder_sound")
  public String getReminderSound() {
    return reminderSound;
  }
  public void setReminderSound(String reminderSound) {
    this.reminderSound = reminderSound;
  }

  
  /**
   * Number of seconds between one reminder and the next
   **/
  
  @ApiModelProperty(value = "Number of seconds between one reminder and the next")
  @JsonProperty("reminder_frequency")
  public Integer getReminderFrequency() {
    return reminderFrequency;
  }
  public void setReminderFrequency(Integer reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
  }

  
  /**
   * True if the reminders should appear as a popup notification
   **/
  
  @ApiModelProperty(value = "True if the reminders should appear as a popup notification")
  @JsonProperty("pop_up")
  public Boolean getPopUp() {
    return popUp;
  }
  public void setPopUp(Boolean popUp) {
    this.popUp = popUp;
  }

  
  /**
   * True if the reminders should be delivered via SMS
   **/
  
  @ApiModelProperty(value = "True if the reminders should be delivered via SMS")
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
  
  @ApiModelProperty(value = "True if the reminders should be delivered via email")
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
  
  @ApiModelProperty(value = "True if the reminders should appear in the notification bar")
  @JsonProperty("notification_bar")
  public Boolean getNotificationBar() {
    return notificationBar;
  }
  public void setNotificationBar(Boolean notificationBar) {
    this.notificationBar = notificationBar;
  }

  
  /**
   * ISO 8601 timestamp for the last time a reminder was sent
   **/
  
  @ApiModelProperty(value = "ISO 8601 timestamp for the last time a reminder was sent")
  @JsonProperty("last_reminded")
  public Date getLastReminded() {
    return lastReminded;
  }
  public void setLastReminded(Date lastReminded) {
    this.lastReminded = lastReminded;
  }

  
  /**
   * ISO 8601 timestamp for the last time a measurement was received for this user and variable
   **/
  
  @ApiModelProperty(value = "ISO 8601 timestamp for the last time a measurement was received for this user and variable")
  @JsonProperty("last_tracked")
  public Date getLastTracked() {
    return lastTracked;
  }
  public void setLastTracked(Date lastTracked) {
    this.lastTracked = lastTracked;
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
    TrackingReminder trackingReminder = (TrackingReminder) o;
    return Objects.equals(id, trackingReminder.id) &&
        Objects.equals(clientId, trackingReminder.clientId) &&
        Objects.equals(userId, trackingReminder.userId) &&
        Objects.equals(variableId, trackingReminder.variableId) &&
        Objects.equals(defaultValue, trackingReminder.defaultValue) &&
        Objects.equals(reminderStartTime, trackingReminder.reminderStartTime) &&
        Objects.equals(reminderEndTime, trackingReminder.reminderEndTime) &&
        Objects.equals(reminderSound, trackingReminder.reminderSound) &&
        Objects.equals(reminderFrequency, trackingReminder.reminderFrequency) &&
        Objects.equals(popUp, trackingReminder.popUp) &&
        Objects.equals(sms, trackingReminder.sms) &&
        Objects.equals(email, trackingReminder.email) &&
        Objects.equals(notificationBar, trackingReminder.notificationBar) &&
        Objects.equals(lastReminded, trackingReminder.lastReminded) &&
        Objects.equals(lastTracked, trackingReminder.lastTracked) &&
        Objects.equals(createdAt, trackingReminder.createdAt) &&
        Objects.equals(updatedAt, trackingReminder.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, userId, variableId, defaultValue, reminderStartTime, reminderEndTime, reminderSound, reminderFrequency, popUp, sms, email, notificationBar, lastReminded, lastTracked, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingReminder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    reminderStartTime: ").append(toIndentedString(reminderStartTime)).append("\n");
    sb.append("    reminderEndTime: ").append(toIndentedString(reminderEndTime)).append("\n");
    sb.append("    reminderSound: ").append(toIndentedString(reminderSound)).append("\n");
    sb.append("    reminderFrequency: ").append(toIndentedString(reminderFrequency)).append("\n");
    sb.append("    popUp: ").append(toIndentedString(popUp)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    notificationBar: ").append(toIndentedString(notificationBar)).append("\n");
    sb.append("    lastReminded: ").append(toIndentedString(lastReminded)).append("\n");
    sb.append("    lastTracked: ").append(toIndentedString(lastTracked)).append("\n");
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

