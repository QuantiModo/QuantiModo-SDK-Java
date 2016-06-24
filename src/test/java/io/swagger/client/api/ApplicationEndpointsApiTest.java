/**
 * QuantiModo
 * Welcome to QuantiModo API! QuantiModo makes it easy to retrieve normalized user data from a wide array of devices and applications. [Learn about QuantiModo](https://quantimo.do) or contact us at <api@quantimo.do>.         Before you get started, you will need to: * Sign in/Sign up, and add some data at [https://app.quantimo.do/api/v2/account/connectors](https://app.quantimo.do/api/v2/account/connectors) to try out the API for yourself * Create an app to get your client id and secret at [https://app.quantimo.do/api/v2/apps](https://app.quantimo.do/api/v2/apps) * As long as you're signed in, it will use your browser's cookie for authentication.  However, client applications must use OAuth2 tokens to access the API.     ## Application Endpoints These endpoints give you access to all authorized users' data for that application. ### Getting Application Token Make a `POST` request to `/api/v2/oauth/access_token`         * `grant_type` Must be `client_credentials`.         * `clientId` Your application's clientId.         * `client_secret` Your application's client_secret.         * `redirect_uri` Your application's redirect url.                ## Example Queries ### Query Options The standard query options for QuantiModo API are as described in the table below. These are the available query options in QuantiModo API: <table>            <thead>                <tr>                    <th>Parameter</th>                    <th>Description</th>                </tr>            </thead>            <tbody>                <tr>                    <td>limit</td>                    <td>The LIMIT is used to limit the number of results returned.  So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.</td>                </tr>                <tr>                    <td>offset</td>                    <td>Suppose you wanted to show results 11-20. You'd set the    offset to 10 and the limit to 10.</td>                </tr>                <tr>                    <td>sort</td>                    <td>Sort by given field. If the field is prefixed with '-', it    will sort in descending order.</td>                </tr>            </tbody>        </table>         ### Pagination Conventions Since the maximum limit is 200 records, to get more than that you'll have to make multiple API calls and page through the results. To retrieve all the data, you can iterate through data by using the `limit` and `offset` query parameters.For example, if you want to retrieve data from 61-80 then you can use a query with the following parameters,         `/v2/variables?limit=20&offset=60`         Generally, you'll be retrieving new or updated user data. To avoid unnecessary API calls, you'll want to store your last refresh time locally.  Initially, it should be set to 0. Then whenever you make a request to get new data, you should limit the returned results to those updated since your last refresh by appending append         `?lastUpdated=(ge)&quot2013-01-D01T01:01:01&quot`         to your request.         Also for better pagination, you can get link to the records of first, last, next and previous page from response headers: * `Total-Count` - Total number of results for given query * `Link-First` - Link to get first page records * `Link-Last` - Link to get last page records * `Link-Prev` - Link to get previous records set * `Link-Next` - Link to get next records set         Remember, response header will be only sent when the record set is available. e.g. You will not get a ```Link-Last``` & ```Link-Next``` when you query for the last page.         ### Filter operators support API supports the following operators with filter parameters: <br> **Comparison operators**         Comparison operators allow you to limit results to those greater than, less than, or equal to a specified value for a specified attribute. These operators can be used with strings, numbers, and dates. The following comparison operators are available: * `gt` for `greater than` comparison * `ge` for `greater than or equal` comparison * `lt` for `less than` comparison * `le` for `less than or equal` comparison         They are included in queries using the following format:         `(<operator>)<value>`         For example, in order to filter value which is greater than 21, the following query parameter should be used:         `?value=(gt)21` <br><br> **Equals/In Operators**         It also allows filtering by the exact value of an attribute or by a set of values, depending on the type of value passed as a query parameter. If the value contains commas, the parameter is split on commas and used as array input for `IN` filtering, otherwise the exact match is applied. In order to only show records which have the value 42, the following query should be used:         `?value=42`         In order to filter records which have value 42 or 43, the following query should be used:         `?value=42,43` <br><br> **Like operators**         Like operators allow filtering using `LIKE` query. This operator is triggered if exact match operator is used, but value contains `%` sign as the first or last character. In order to filter records which category that start with `Food`, the following query should be used:         `?category=Food%` <br><br> **Negation operator**         It is possible to get negated results of a query by prefixed the operator with `!`. Some examples:         `//filter records except those with value are not 42 or 43`<br> `?value=!42,43`         `//filter records with value not greater than 21`<br> `?value=!(ge)21` <br><br> **Multiple constraints for single attribute**         It is possible to apply multiple constraints by providing an array of query filters:         Filter all records which value is greater than 20.2 and less than 20.3<br> `?value[]=(gt)20.2&value[]=(lt)20.3`         Filter all records which value is greater than 20.2 and less than 20.3 but not 20.2778<br> `?value[]=(gt)20.2&value[]=(lt)20.3&value[]=!20.2778`<br><br> 
 *
 * OpenAPI spec version: 2.0.6
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2004;
import java.math.BigDecimal;
import io.swagger.client.model.InlineResponse2005;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2006;
import io.swagger.client.model.InlineResponse2007;
import io.swagger.client.model.InlineResponse2008;
import io.swagger.client.model.InlineResponse2009;
import io.swagger.client.model.InlineResponse20010;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationEndpointsApi
 */
public class ApplicationEndpointsApiTest {

    private final ApplicationEndpointsApi api = new ApplicationEndpointsApi();

    
    /**
     * Get all Connections
     *
     * Get all Connections
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2ApplicationConnectionsGetTest() throws ApiException {
        String accessToken = null;
        Integer connectorId = null;
        String connectStatus = null;
        String connectError = null;
        String updateRequestedAt = null;
        String updateStatus = null;
        String updateError = null;
        String lastSuccessfulUpdatedAt = null;
        String createdAt = null;
        String updatedAt = null;
        Integer limit = null;
        Integer offset = null;
        String sort = null;
        // InlineResponse2003 response = api.v2ApplicationConnectionsGet(accessToken, connectorId, connectStatus, connectError, updateRequestedAt, updateStatus, updateError, lastSuccessfulUpdatedAt, createdAt, updatedAt, limit, offset, sort);

        // TODO: test validations
    }
    
    /**
     * Get all Credentials
     *
     * Get all Credentials
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2ApplicationCredentialsGetTest() throws ApiException {
        String accessToken = null;
        Integer connectorId = null;
        String attrKey = null;
        String attrValue = null;
        String createdAt = null;
        String updatedAt = null;
        Integer limit = null;
        Integer offset = null;
        String sort = null;
        // InlineResponse2004 response = api.v2ApplicationCredentialsGet(accessToken, connectorId, attrKey, attrValue, createdAt, updatedAt, limit, offset, sort);

        // TODO: test validations
    }
    
    /**
     * Get measurements for all users using your application
     *
     * Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2ApplicationMeasurementsGetTest() throws ApiException {
        String accessToken = null;
        String clientId = null;
        Integer connectorId = null;
        Integer variableId = null;
        Integer sourceId = null;
        String startTime = null;
        BigDecimal value = null;
        Integer unitId = null;
        BigDecimal originalValue = null;
        Integer originalUnitId = null;
        Integer duration = null;
        String note = null;
        BigDecimal latitude = null;
        BigDecimal longitude = null;
        String location = null;
        String createdAt = null;
        String updatedAt = null;
        String error = null;
        Integer limit = null;
        Integer offset = null;
        String sort = null;
        // InlineResponse2005 response = api.v2ApplicationMeasurementsGet(accessToken, clientId, connectorId, variableId, sourceId, startTime, value, unitId, originalValue, originalUnitId, duration, note, latitude, longitude, location, createdAt, updatedAt, error, limit, offset, sort);

        // TODO: test validations
    }
    
    /**
     * Get tracking reminders
     *
     * Get the variable id, frequency, and default value for the user tracking reminders 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2ApplicationTrackingRemindersGetTest() throws ApiException {
        String accessToken = null;
        String clientId = null;
        String createdAt = null;
        String updatedAt = null;
        Integer limit = null;
        Integer offset = null;
        String sort = null;
        // InlineResponse2001 response = api.v2ApplicationTrackingRemindersGet(accessToken, clientId, createdAt, updatedAt, limit, offset, sort);

        // TODO: test validations
    }
    
    /**
     * Get all Updates
     *
     * Get all Updates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2ApplicationUpdatesGetTest() throws ApiException {
        String accessToken = null;
        Integer connectorId = null;
        Integer numberOfMeasurements = null;
        Boolean success = null;
        String message = null;
        String createdAt = null;
        String updatedAt = null;
        Integer limit = null;
        Integer offset = null;
        String sort = null;
        // InlineResponse2006 response = api.v2ApplicationUpdatesGet(accessToken, connectorId, numberOfMeasurements, success, message, createdAt, updatedAt, limit, offset, sort);

        // TODO: test validations
    }
    
    /**
     * Get all UserVariableRelationships
     *
     * Get all UserVariableRelationships
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2ApplicationUserVariableRelationshipsGetTest() throws ApiException {
        String accessToken = null;
        Integer id = null;
        String confidenceLevel = null;
        BigDecimal confidenceScore = null;
        String direction = null;
        Integer durationOfAction = null;
        String errorMessage = null;
        Integer onsetDelay = null;
        Integer outcomeVariableId = null;
        Integer predictorVariableId = null;
        Integer predictorUnitId = null;
        BigDecimal sinnRank = null;
        String strengthLevel = null;
        BigDecimal strengthScore = null;
        String vote = null;
        BigDecimal valuePredictingHighOutcome = null;
        BigDecimal valuePredictingLowOutcome = null;
        Integer limit = null;
        Integer offset = null;
        String sort = null;
        // InlineResponse2007 response = api.v2ApplicationUserVariableRelationshipsGet(accessToken, id, confidenceLevel, confidenceScore, direction, durationOfAction, errorMessage, onsetDelay, outcomeVariableId, predictorVariableId, predictorUnitId, sinnRank, strengthLevel, strengthScore, vote, valuePredictingHighOutcome, valuePredictingLowOutcome, limit, offset, sort);

        // TODO: test validations
    }
    
    /**
     * Get all UserVariables
     *
     * Get all UserVariables
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2ApplicationUserVariablesGetTest() throws ApiException {
        String accessToken = null;
        String clientId = null;
        Integer parentId = null;
        Integer variableId = null;
        Integer defaultUnitId = null;
        BigDecimal minimumAllowedValue = null;
        BigDecimal maximumAllowedValue = null;
        BigDecimal fillingValue = null;
        Integer joinWith = null;
        Integer onsetDelay = null;
        Integer durationOfAction = null;
        Integer variableCategoryId = null;
        Integer updated = null;
        Integer _public = null;
        Boolean causeOnly = null;
        String fillingType = null;
        Integer numberOfMeasurements = null;
        Integer numberOfProcessedMeasurements = null;
        Integer measurementsAtLastAnalysis = null;
        Integer lastUnitId = null;
        Integer lastOriginalUnitId = null;
        Integer lastOriginalValue = null;
        BigDecimal lastValue = null;
        Integer lastSourceId = null;
        Integer numberOfCorrelations = null;
        String status = null;
        String errorMessage = null;
        String lastSuccessfulUpdateTime = null;
        BigDecimal standardDeviation = null;
        BigDecimal variance = null;
        BigDecimal minimumRecordedValue = null;
        BigDecimal maximumRecordedValue = null;
        BigDecimal mean = null;
        BigDecimal median = null;
        Integer mostCommonUnitId = null;
        BigDecimal mostCommonValue = null;
        BigDecimal numberOfUniqueDailyValues = null;
        Integer numberOfChanges = null;
        BigDecimal skewness = null;
        BigDecimal kurtosis = null;
        BigDecimal latitude = null;
        BigDecimal longitude = null;
        String location = null;
        String createdAt = null;
        String updatedAt = null;
        Boolean outcome = null;
        String sources = null;
        Integer earliestSourceTime = null;
        Integer latestSourceTime = null;
        Integer earliestMeasurementTime = null;
        Integer latestMeasurementTime = null;
        Integer earliestFillingTime = null;
        Integer latestFillingTime = null;
        Integer limit = null;
        Integer offset = null;
        String sort = null;
        // InlineResponse2008 response = api.v2ApplicationUserVariablesGet(accessToken, clientId, parentId, variableId, defaultUnitId, minimumAllowedValue, maximumAllowedValue, fillingValue, joinWith, onsetDelay, durationOfAction, variableCategoryId, updated, _public, causeOnly, fillingType, numberOfMeasurements, numberOfProcessedMeasurements, measurementsAtLastAnalysis, lastUnitId, lastOriginalUnitId, lastOriginalValue, lastValue, lastSourceId, numberOfCorrelations, status, errorMessage, lastSuccessfulUpdateTime, standardDeviation, variance, minimumRecordedValue, maximumRecordedValue, mean, median, mostCommonUnitId, mostCommonValue, numberOfUniqueDailyValues, numberOfChanges, skewness, kurtosis, latitude, longitude, location, createdAt, updatedAt, outcome, sources, earliestSourceTime, latestSourceTime, earliestMeasurementTime, latestMeasurementTime, earliestFillingTime, latestFillingTime, limit, offset, sort);

        // TODO: test validations
    }
    
    /**
     * Get all VariableUserSources
     *
     * Get all VariableUserSources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2ApplicationVariableUserSourcesGetTest() throws ApiException {
        String accessToken = null;
        Integer variableId = null;
        Integer timestamp = null;
        Integer earliestMeasurementTime = null;
        Integer latestMeasurementTime = null;
        String createdAt = null;
        String updatedAt = null;
        Integer limit = null;
        Integer offset = null;
        String sort = null;
        // InlineResponse2009 response = api.v2ApplicationVariableUserSourcesGet(accessToken, variableId, timestamp, earliestMeasurementTime, latestMeasurementTime, createdAt, updatedAt, limit, offset, sort);

        // TODO: test validations
    }
    
    /**
     * Get all Votes
     *
     * Get all Votes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2ApplicationVotesGetTest() throws ApiException {
        String accessToken = null;
        String clientId = null;
        Integer causeId = null;
        Integer effectId = null;
        Integer value = null;
        String createdAt = null;
        String updatedAt = null;
        Integer limit = null;
        Integer offset = null;
        String sort = null;
        // InlineResponse20010 response = api.v2ApplicationVotesGet(accessToken, clientId, causeId, effectId, value, createdAt, updatedAt, limit, offset, sort);

        // TODO: test validations
    }
    
}
