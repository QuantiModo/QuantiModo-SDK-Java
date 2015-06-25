package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Correlation;
import io.swagger.client.model.PostCorrelation;
import io.swagger.client.model.JsonErrorResponse;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class CorrelationsApi {
  private ApiClient apiClient;

  public CorrelationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CorrelationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get correlations
   * Get correlations
   * @param effect ORIGINAL variable name of the effect variable for which the user desires correlations
   * @param cause ORIGINAL variable name of the cause variable for which the user desires correlations
   * @return List<Correlation>
   */
  public List<Correlation> correlationsGet (String effect, String cause) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/correlations".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (effect != null)
      queryParams.put("effect", apiClient.parameterToString(effect));
    if (cause != null)
      queryParams.put("cause", apiClient.parameterToString(cause));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Correlation>) apiClient.deserialize(response, "array", Correlation.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get average correlations for variables containing search term
   * Returns the average correlations from all users for all public variables that contain the characters in the search query. Returns average of all users public variable correlations with a specified cause or effect.
   * @param search Name of the variable that you want to know the causes or effects of.
   * @param effectOrCause Specifies whether to return the effects or causes of the searched variable.
   * @return List<Correlation>
   */
  public List<Correlation> publicCorrelationsSearchSearchGet (String search, String effectOrCause) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'search' is set
    if (search == null) {
       throw new ApiException(400, "Missing the required parameter 'search' when calling publicCorrelationsSearchSearchGet");
    }
    
    // verify the required parameter 'effectOrCause' is set
    if (effectOrCause == null) {
       throw new ApiException(400, "Missing the required parameter 'effectOrCause' when calling publicCorrelationsSearchSearchGet");
    }
    

    // create path and map variables
    String path = "/public/correlations/search/{search}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "search" + "\\}", apiClient.escapeString(search.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (effectOrCause != null)
      queryParams.put("effectOrCause", apiClient.parameterToString(effectOrCause));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Correlation>) apiClient.deserialize(response, "array", Correlation.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Add correlation or/and vote for it
   * Add correlation or/and vote for it
   * @param body Provides correlation data
   * @return void
   */
  public void v1CorrelationsPost (PostCorrelation body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling v1CorrelationsPost");
    }
    

    // create path and map variables
    String path = "/v1/correlations".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Search user correlations for a given effect
   * Returns average of all correlations and votes for all user cause variables for a given effect. If parameter \&quot;include_public\&quot; is used, it also returns public correlations. User correlation overwrites or supersedes public correlation.
   * @param organizationId Organization ID
   * @param userId User id
   * @param variableName Effect variable name
   * @param organizationToken Organization access token
   * @param includePublic Include bublic correlations, Can be \&quot;1\&quot; or empty.
   * @return List<Correlation>
   */
  public List<Correlation> v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet (Integer organizationId, Integer userId, String variableName, String organizationToken, String includePublic) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
       throw new ApiException(400, "Missing the required parameter 'organizationId' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
       throw new ApiException(400, "Missing the required parameter 'userId' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet");
    }
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
       throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet");
    }
    
    // verify the required parameter 'organizationToken' is set
    if (organizationToken == null) {
       throw new ApiException(400, "Missing the required parameter 'organizationToken' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet");
    }
    

    // create path and map variables
    String path = "/v1/organizations/{organizationId}/users/{userId}/variables/{variableName}/causes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "variableName" + "\\}", apiClient.escapeString(variableName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (organizationToken != null)
      queryParams.put("organization_token", apiClient.parameterToString(organizationToken));
    if (includePublic != null)
      queryParams.put("include_public", apiClient.parameterToString(includePublic));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Correlation>) apiClient.deserialize(response, "array", Correlation.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Search user correlations for a given cause
   * Returns average of all correlations and votes for all user cause variables for a given effect. If parameter \&quot;include_public\&quot; is used, it also returns public correlations. User correlation overwrites or supersedes public correlation.
   * @param organizationId Organization ID
   * @param userId User id
   * @param variableName Cause variable name
   * @param organizationToken Organization access token
   * @param includePublic Include bublic correlations, Can be \&quot;1\&quot; or empty.
   * @return List<Correlation>
   */
  public List<Correlation> v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet (Integer organizationId, Integer userId, String variableName, String organizationToken, String includePublic) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
       throw new ApiException(400, "Missing the required parameter 'organizationId' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
       throw new ApiException(400, "Missing the required parameter 'userId' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet");
    }
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
       throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet");
    }
    
    // verify the required parameter 'organizationToken' is set
    if (organizationToken == null) {
       throw new ApiException(400, "Missing the required parameter 'organizationToken' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet");
    }
    

    // create path and map variables
    String path = "/v1/organizations/{organizationId}/users/{userId}/variables/{variableName}/effects".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "variableName" + "\\}", apiClient.escapeString(variableName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (organizationToken != null)
      queryParams.put("organization_token", apiClient.parameterToString(organizationToken));
    if (includePublic != null)
      queryParams.put("include_public", apiClient.parameterToString(includePublic));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Correlation>) apiClient.deserialize(response, "array", Correlation.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Search user correlations for a given effect
   * Returns average of all correlations and votes for all user cause variables for a given effect
   * @param variableName Effect variable name
   * @return List<Correlation>
   */
  public List<Correlation> v1VariablesVariableNameCausesGet (String variableName) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
       throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1VariablesVariableNameCausesGet");
    }
    

    // create path and map variables
    String path = "/v1/variables/{variableName}/causes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "variableName" + "\\}", apiClient.escapeString(variableName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Correlation>) apiClient.deserialize(response, "array", Correlation.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Search user correlations for a given cause
   * Returns average of all correlations and votes for all user effect variables for a given cause
   * @param variableName Cause variable name
   * @return List<Correlation>
   */
  public List<Correlation> v1VariablesVariableNameEffectsGet (String variableName) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
       throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1VariablesVariableNameEffectsGet");
    }
    

    // create path and map variables
    String path = "/v1/variables/{variableName}/effects".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "variableName" + "\\}", apiClient.escapeString(variableName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Correlation>) apiClient.deserialize(response, "array", Correlation.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Search public correlations for a given effect
   * Returns average of all correlations and votes for all public cause variables for a given effect
   * @param variableName Effect variable name
   * @return List<Correlation>
   */
  public List<Correlation> v1VariablesVariableNamePublicCausesGet (String variableName) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
       throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1VariablesVariableNamePublicCausesGet");
    }
    

    // create path and map variables
    String path = "/v1/variables/{variableName}/public/causes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "variableName" + "\\}", apiClient.escapeString(variableName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Correlation>) apiClient.deserialize(response, "array", Correlation.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Search public correlations for a given cause
   * Returns average of all correlations and votes for all public cause variables for a given cause
   * @param variableName Cause variable name
   * @return List<Correlation>
   */
  public List<Correlation> v1VariablesVariableNamePublicEffectsGet (String variableName) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
       throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1VariablesVariableNamePublicEffectsGet");
    }
    

    // create path and map variables
    String path = "/v1/variables/{variableName}/public/effects".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "variableName" + "\\}", apiClient.escapeString(variableName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Correlation>) apiClient.deserialize(response, "array", Correlation.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
