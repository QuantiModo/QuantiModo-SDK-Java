package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.MeasurementSource;
import io.swagger.client.model.Measurement;
import io.swagger.client.model.MeasurementDelete;
import io.swagger.client.model.CommonResponse;
import io.swagger.client.model.MeasurementSet;
import io.swagger.client.model.MeasurementRange;
import java.io.File;
import io.swagger.client.model.InlineResponse20012;
import io.swagger.client.model.InlineResponse20011;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class MeasurementsApi {
  private ApiClient apiClient;

  public MeasurementsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MeasurementsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get measurement sources
   * Returns a list of all the apps from which measurement data is obtained.
   * @return MeasurementSource
   * @throws ApiException if fails to make API call
   */
  public MeasurementSource v1MeasurementSourcesGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/measurementSources".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<MeasurementSource> localVarReturnType = new GenericType<MeasurementSource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add a data source
   * Add a life-tracking app or device to the QuantiModo list of data sources.
   * @param body An array of names of data sources you want to add. (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @throws ApiException if fails to make API call
   */
  public void v1MeasurementSourcesPost(MeasurementSource body, String accessToken) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1MeasurementSourcesPost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/measurementSources".replaceAll("\\{format\\}","json");

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get daily measurements for this user
   * Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten. &lt;br&gt;Supported filter parameters:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;value&lt;/b&gt; - Value of measurement&lt;/li&gt;&lt;li&gt;&lt;b&gt;lastUpdated&lt;/b&gt; - The time that this measurement was created or last updated in the UTC format \&quot;YYYY-MM-DDThh:mm:ss\&quot;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;
   * @param variableName Name of the variable you want measurements for (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param abbreviatedUnitName The unit your want the measurements in (optional)
   * @param startTime The lower limit of measurements returned (Iso8601) (optional)
   * @param endTime The upper limit of measurements returned (Iso8601) (optional)
   * @param groupingWidth The time (in seconds) over which measurements are grouped together (optional)
   * @param groupingTimezone The time (in seconds) over which measurements are grouped together (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. (optional)
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#x60;-, it will sort in descending order. (optional)
   * @return Measurement
   * @throws ApiException if fails to make API call
   */
  public Measurement v1MeasurementsDailyGet(String variableName, String accessToken, String abbreviatedUnitName, String startTime, String endTime, Integer groupingWidth, String groupingTimezone, Integer limit, Integer offset, Integer sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
      throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1MeasurementsDailyGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/measurements/daily".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variableName", variableName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "abbreviatedUnitName", abbreviatedUnitName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupingWidth", groupingWidth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupingTimezone", groupingTimezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<Measurement> localVarReturnType = new GenericType<Measurement>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a measurement
   * Delete a previously submitted measurement
   * @param body The startTime and variableId of the measurement to be deleted. (required)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse v1MeasurementsDeletePost(MeasurementDelete body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1MeasurementsDeletePost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/measurements/delete".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
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
   * Get measurements for this user
   * Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten. &lt;br&gt;Supported filter parameters:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;value&lt;/b&gt; - Value of measurement&lt;/li&gt;&lt;li&gt;&lt;b&gt;lastUpdated&lt;/b&gt; - The time that this measurement was created or last updated in the UTC format \&quot;YYYY-MM-DDThh:mm:ss\&quot;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param variableName Name of the variable you want measurements for (optional)
   * @param variableCategoryName Name of the variable category you want measurements for (optional)
   * @param source Name of the source you want measurements for (supports exact name match only) (optional)
   * @param value Value of measurement (optional)
   * @param lastUpdated The time that this measurement was created or last updated in the format \&quot;YYYY-MM-DDThh:mm:ss\&quot; (optional)
   * @param unit The unit you want the measurements returned in (optional)
   * @param startTime The lower limit of measurements returned (Epoch) (optional)
   * @param createdAt The time the measurement record was first created in the format YYYY-MM-DDThh:mm:ss. Time zone should be UTC and not local. (optional)
   * @param updatedAt The time the measurement record was last changed in the format YYYY-MM-DDThh:mm:ss. Time zone should be UTC and not local. (optional)
   * @param endTime The upper limit of measurements returned (Epoch) (optional)
   * @param groupingWidth The time (in seconds) over which measurements are grouped together (optional)
   * @param groupingTimezone The time (in seconds) over which measurements are grouped together (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. (optional)
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#x60;-, it will sort in descending order. (optional)
   * @return Measurement
   * @throws ApiException if fails to make API call
   */
  public Measurement v1MeasurementsGet(String accessToken, String variableName, String variableCategoryName, String source, String value, String lastUpdated, String unit, String startTime, String createdAt, String updatedAt, String endTime, Integer groupingWidth, String groupingTimezone, Integer limit, Integer offset, Integer sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/measurements".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variableName", variableName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variableCategoryName", variableCategoryName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastUpdated", lastUpdated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unit", unit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdAt", createdAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updatedAt", updatedAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupingWidth", groupingWidth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupingTimezone", groupingTimezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<Measurement> localVarReturnType = new GenericType<Measurement>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Post a new set or update existing measurements to the database
   * You can submit or update multiple measurements in a \&quot;measurements\&quot; sub-array.  If the variable these measurements correspond to does not already exist in the database, it will be automatically added.  The request body should look something like [{\&quot;measurements\&quot;:[{\&quot;startTime\&quot;:1439389320,\&quot;value\&quot;:\&quot;3\&quot;}, {\&quot;startTime\&quot;:1439389319,\&quot;value\&quot;:\&quot;2\&quot;}],\&quot;name\&quot;:\&quot;Acne (out of 5)\&quot;,\&quot;source\&quot;:\&quot;QuantiModo\&quot;,\&quot;category\&quot;:\&quot;Symptoms\&quot;,\&quot;combinationOperation\&quot;:\&quot;MEAN\&quot;,\&quot;unit\&quot;:\&quot;/5\&quot;}]
   * @param body An array of measurements you want to insert. (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @throws ApiException if fails to make API call
   */
  public void v1MeasurementsPost(MeasurementSet body, String accessToken) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1MeasurementsPost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/measurements".replaceAll("\\{format\\}","json");

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get measurements range for this user
   * Get Unix time-stamp (epoch time) of the user&#39;s first and last measurements taken.
   * @param sources Enter source name to limit to specific source (varchar) (optional)
   * @param user If not specified, uses currently logged in user (bigint) (optional)
   * @return MeasurementRange
   * @throws ApiException if fails to make API call
   */
  public MeasurementRange v1MeasurementsRangeGet(String sources, Integer user) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/measurementsRange".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sources", sources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user", user));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<MeasurementRange> localVarReturnType = new GenericType<MeasurementRange>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Measurements CSV
   * Download a CSV containing all user measurements
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File v2MeasurementsCsvGet(String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/measurements/csv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "text/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "quantimodo_oauth2" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete Measurement
   * Delete Measurement
   * @param id id of Measurement (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20012 v2MeasurementsIdDelete(Integer id, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling v2MeasurementsIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/v2/measurements/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    String[] localVarAuthNames = new String[] { "quantimodo_oauth2" };

    GenericType<InlineResponse20012> localVarReturnType = new GenericType<InlineResponse20012>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Measurement
   * Get Measurement
   * @param id id of Measurement (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return InlineResponse20011
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20011 v2MeasurementsIdGet(Integer id, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling v2MeasurementsIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/v2/measurements/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    String[] localVarAuthNames = new String[] { "quantimodo_oauth2" };

    GenericType<InlineResponse20011> localVarReturnType = new GenericType<InlineResponse20011>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update Measurement
   * Update Measurement
   * @param id id of Measurement (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param body Measurement that should be updated (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20012 v2MeasurementsIdPut(Integer id, String accessToken, Measurement body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling v2MeasurementsIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/v2/measurements/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    String[] localVarAuthNames = new String[] { "quantimodo_oauth2" };

    GenericType<InlineResponse20012> localVarReturnType = new GenericType<InlineResponse20012>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Post Request for Measurements CSV
   * Use this endpoint to schedule a CSV export containing all user measurements to be emailed to the user within 24 hours.
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer v2MeasurementsRequestCsvPost(String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/measurements/request_csv".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] { "quantimodo_oauth2" };

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Post Request for Measurements PDF
   * Use this endpoint to schedule a PDF export containing all user measurements to be emailed to the user within 24 hours.
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer v2MeasurementsRequestPdfPost(String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/measurements/request_pdf".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] { "quantimodo_oauth2" };

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Post Request for Measurements XLS
   * Use this endpoint to schedule a XLS export containing all user measurements to be emailed to the user within 24 hours.
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer v2MeasurementsRequestXlsPost(String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/measurements/request_xls".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] { "quantimodo_oauth2" };

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
