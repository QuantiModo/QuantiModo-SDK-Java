package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * Credential
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class Credential   {
  
  private Integer userId = null;
  private Integer connectorId = null;
  private String attrKey = null;
  private String attrValue = null;
  private DateTime createdAt = null;
  private DateTime updatedAt = null;

  
  /**
   * ID of user that owns this credential
   **/
  public Credential userId(Integer userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of user that owns this credential")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  /**
   * The id for the connector data source from which the credential was obtained
   **/
  public Credential connectorId(Integer connectorId) {
    this.connectorId = connectorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id for the connector data source from which the credential was obtained")
  @JsonProperty("connector_id")
  public Integer getConnectorId() {
    return connectorId;
  }
  public void setConnectorId(Integer connectorId) {
    this.connectorId = connectorId;
  }


  /**
   * Attribute name such as token, userid, username, or password
   **/
  public Credential attrKey(String attrKey) {
    this.attrKey = attrKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Attribute name such as token, userid, username, or password")
  @JsonProperty("attr_key")
  public String getAttrKey() {
    return attrKey;
  }
  public void setAttrKey(String attrKey) {
    this.attrKey = attrKey;
  }


  /**
   * Encrypted value for the attribute specified
   **/
  public Credential attrValue(String attrValue) {
    this.attrValue = attrValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Encrypted value for the attribute specified")
  @JsonProperty("attr_value")
  public String getAttrValue() {
    return attrValue;
  }
  public void setAttrValue(String attrValue) {
    this.attrValue = attrValue;
  }


  /**
   * When the record was first created. Use ISO 8601 datetime format
   **/
  public Credential createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the record was first created. Use ISO 8601 datetime format")
  @JsonProperty("created_at")
  public DateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * When the record in the database was last updated. Use ISO 8601 datetime format
   **/
  public Credential updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the record in the database was last updated. Use ISO 8601 datetime format")
  @JsonProperty("updated_at")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credential credential = (Credential) o;
    return Objects.equals(this.userId, credential.userId) &&
        Objects.equals(this.connectorId, credential.connectorId) &&
        Objects.equals(this.attrKey, credential.attrKey) &&
        Objects.equals(this.attrValue, credential.attrValue) &&
        Objects.equals(this.createdAt, credential.createdAt) &&
        Objects.equals(this.updatedAt, credential.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, connectorId, attrKey, attrValue, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credential {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
    sb.append("    attrKey: ").append(toIndentedString(attrKey)).append("\n");
    sb.append("    attrValue: ").append(toIndentedString(attrValue)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

