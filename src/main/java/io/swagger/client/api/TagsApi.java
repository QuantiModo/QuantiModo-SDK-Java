package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.CommonResponse;
import io.swagger.client.model.UserTag;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class TagsApi {
  private ApiClient apiClient;

  public TagsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TagsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete user tag or ingredient
   * Delete previously created user tags or ingredients.
   * @param taggedVariableId This is the id of the variable being tagged with an ingredient or something. (required)
   * @param tagVariableId This is the id of the ingredient variable whose value is determined based on the value of the tagged variable. (required)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse v1UserTagsDeletePost(Integer taggedVariableId, Integer tagVariableId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taggedVariableId' is set
    if (taggedVariableId == null) {
      throw new ApiException(400, "Missing the required parameter 'taggedVariableId' when calling v1UserTagsDeletePost");
    }
    
    // verify the required parameter 'tagVariableId' is set
    if (tagVariableId == null) {
      throw new ApiException(400, "Missing the required parameter 'tagVariableId' when calling v1UserTagsDeletePost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/userTags/delete".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taggedVariableId", taggedVariableId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tagVariableId", tagVariableId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<CommonResponse> localVarReturnType = new GenericType<CommonResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Post or update user tags or ingredients
   * This endpoint allows users to tag foods with their ingredients.  This information will then be used to infer the user intake of the different ingredients by just entering the foods. The inferred intake levels will then be used to determine the effects of different nutrients on the user during analysis.
   * @param body Contains the new user tag data (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse v1UserTagsPost(UserTag body, String accessToken) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1UserTagsPost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/userTags".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<CommonResponse> localVarReturnType = new GenericType<CommonResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
