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
import io.swagger.client.model.MeasurementSource;
import io.swagger.client.model.Measurement;
import io.swagger.client.model.MeasurementDelete;
import io.swagger.client.model.CommonResponse;
import io.swagger.client.model.MeasurementSet;
import io.swagger.client.model.MeasurementRange;
import java.io.File;
import io.swagger.client.model.InlineResponse20012;
import io.swagger.client.model.InlineResponse20011;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MeasurementsApi
 */
public class MeasurementsApiTest {

    private final MeasurementsApi api = new MeasurementsApi();

    
    /**
     * Get measurement sources
     *
     * Returns a list of all the apps from which measurement data is obtained.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MeasurementSourcesGetTest() throws ApiException {
        // MeasurementSource response = api.v1MeasurementSourcesGet();

        // TODO: test validations
    }
    
    /**
     * Add a data source
     *
     * Add a life-tracking app or device to the QuantiModo list of data sources.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MeasurementSourcesPostTest() throws ApiException {
        MeasurementSource body = null;
        String accessToken = null;
        // api.v1MeasurementSourcesPost(body, accessToken);

        // TODO: test validations
    }
    
    /**
     * Get daily measurements for this user
     *
     * Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten. &lt;br&gt;Supported filter parameters:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;value&lt;/b&gt; - Value of measurement&lt;/li&gt;&lt;li&gt;&lt;b&gt;lastUpdated&lt;/b&gt; - The time that this measurement was created or last updated in the UTC format \&quot;YYYY-MM-DDThh:mm:ss\&quot;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MeasurementsDailyGetTest() throws ApiException {
        String variableName = null;
        String accessToken = null;
        String abbreviatedUnitName = null;
        String startTime = null;
        String endTime = null;
        Integer groupingWidth = null;
        String groupingTimezone = null;
        Integer limit = null;
        Integer offset = null;
        Integer sort = null;
        // Measurement response = api.v1MeasurementsDailyGet(variableName, accessToken, abbreviatedUnitName, startTime, endTime, groupingWidth, groupingTimezone, limit, offset, sort);

        // TODO: test validations
    }
    
    /**
     * Delete a measurement
     *
     * Delete a previously submitted measurement
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MeasurementsDeletePostTest() throws ApiException {
        MeasurementDelete body = null;
        // CommonResponse response = api.v1MeasurementsDeletePost(body);

        // TODO: test validations
    }
    
    /**
     * Get measurements for this user
     *
     * Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten. &lt;br&gt;Supported filter parameters:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;value&lt;/b&gt; - Value of measurement&lt;/li&gt;&lt;li&gt;&lt;b&gt;lastUpdated&lt;/b&gt; - The time that this measurement was created or last updated in the UTC format \&quot;YYYY-MM-DDThh:mm:ss\&quot;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MeasurementsGetTest() throws ApiException {
        String accessToken = null;
        String variableName = null;
        String variableCategoryName = null;
        String source = null;
        String value = null;
        String lastUpdated = null;
        String unit = null;
        String startTime = null;
        String createdAt = null;
        String updatedAt = null;
        String endTime = null;
        Integer groupingWidth = null;
        String groupingTimezone = null;
        Integer limit = null;
        Integer offset = null;
        Integer sort = null;
        // Measurement response = api.v1MeasurementsGet(accessToken, variableName, variableCategoryName, source, value, lastUpdated, unit, startTime, createdAt, updatedAt, endTime, groupingWidth, groupingTimezone, limit, offset, sort);

        // TODO: test validations
    }
    
    /**
     * Post a new set or update existing measurements to the database
     *
     * You can submit or update multiple measurements in a \&quot;measurements\&quot; sub-array.  If the variable these measurements correspond to does not already exist in the database, it will be automatically added.  The request body should look something like [{\&quot;measurements\&quot;:[{\&quot;startTime\&quot;:1439389320,\&quot;value\&quot;:\&quot;3\&quot;}, {\&quot;startTime\&quot;:1439389319,\&quot;value\&quot;:\&quot;2\&quot;}],\&quot;name\&quot;:\&quot;Acne (out of 5)\&quot;,\&quot;source\&quot;:\&quot;QuantiModo\&quot;,\&quot;category\&quot;:\&quot;Symptoms\&quot;,\&quot;combinationOperation\&quot;:\&quot;MEAN\&quot;,\&quot;unit\&quot;:\&quot;/5\&quot;}]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MeasurementsPostTest() throws ApiException {
        MeasurementSet body = null;
        String accessToken = null;
        // api.v1MeasurementsPost(body, accessToken);

        // TODO: test validations
    }
    
    /**
     * Get measurements range for this user
     *
     * Get Unix time-stamp (epoch time) of the user&#39;s first and last measurements taken.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MeasurementsRangeGetTest() throws ApiException {
        String sources = null;
        Integer user = null;
        // MeasurementRange response = api.v1MeasurementsRangeGet(sources, user);

        // TODO: test validations
    }
    
    /**
     * Get Measurements CSV
     *
     * Download a CSV containing all user measurements
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2MeasurementsCsvGetTest() throws ApiException {
        String accessToken = null;
        // File response = api.v2MeasurementsCsvGet(accessToken);

        // TODO: test validations
    }
    
    /**
     * Delete Measurement
     *
     * Delete Measurement
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2MeasurementsIdDeleteTest() throws ApiException {
        Integer id = null;
        String accessToken = null;
        // InlineResponse20012 response = api.v2MeasurementsIdDelete(id, accessToken);

        // TODO: test validations
    }
    
    /**
     * Get Measurement
     *
     * Get Measurement
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2MeasurementsIdGetTest() throws ApiException {
        Integer id = null;
        String accessToken = null;
        // InlineResponse20011 response = api.v2MeasurementsIdGet(id, accessToken);

        // TODO: test validations
    }
    
    /**
     * Update Measurement
     *
     * Update Measurement
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2MeasurementsIdPutTest() throws ApiException {
        Integer id = null;
        String accessToken = null;
        Measurement body = null;
        // InlineResponse20012 response = api.v2MeasurementsIdPut(id, accessToken, body);

        // TODO: test validations
    }
    
    /**
     * Post Request for Measurements CSV
     *
     * Use this endpoint to schedule a CSV export containing all user measurements to be emailed to the user within 24 hours.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2MeasurementsRequestCsvPostTest() throws ApiException {
        String accessToken = null;
        // Integer response = api.v2MeasurementsRequestCsvPost(accessToken);

        // TODO: test validations
    }
    
    /**
     * Post Request for Measurements PDF
     *
     * Use this endpoint to schedule a PDF export containing all user measurements to be emailed to the user within 24 hours.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2MeasurementsRequestPdfPostTest() throws ApiException {
        String accessToken = null;
        // Integer response = api.v2MeasurementsRequestPdfPost(accessToken);

        // TODO: test validations
    }
    
    /**
     * Post Request for Measurements XLS
     *
     * Use this endpoint to schedule a XLS export containing all user measurements to be emailed to the user within 24 hours.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2MeasurementsRequestXlsPostTest() throws ApiException {
        String accessToken = null;
        // Integer response = api.v2MeasurementsRequestXlsPost(accessToken);

        // TODO: test validations
    }
    
}
