package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
public class Credential   {
  
  private Integer userId = null;
  private Integer connectorId = null;
  private String attrKey = null;
  private String attrValue = null;
  private Date createdAt = null;
  private Date updatedAt = null;

  
  /**
   * ID of user that owns this credential
   **/
  
  @ApiModelProperty(value = "ID of user that owns this credential")
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
  
  @ApiModelProperty(required = true, value = "The id for the connector data source from which the credential was obtained")
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
  
  @ApiModelProperty(value = "Attribute name such as token, userid, username, or password")
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
  
  @ApiModelProperty(value = "Encrypted value for the attribute specified")
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
    Credential credential = (Credential) o;
    return Objects.equals(userId, credential.userId) &&
        Objects.equals(connectorId, credential.connectorId) &&
        Objects.equals(attrKey, credential.attrKey) &&
        Objects.equals(attrValue, credential.attrValue) &&
        Objects.equals(createdAt, credential.createdAt) &&
        Objects.equals(updatedAt, credential.updatedAt);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

