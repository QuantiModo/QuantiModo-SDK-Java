package io.swagger.handler;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import io.swagger.model.*;

import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.InlineResponse2009;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.InlineResponse20011;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-02-09T02:16:46.349Z")
public class ApplicationController  {
  /** 
   * Uncomment and implement as you see fit.  These operations will map
   * Direclty to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext applicationConnectionsGet(RequestContext request , String accessToken, Integer connectorId, String connectStatus, String connectError, String updateRequestedAt, String updateStatus, String updateError, String lastSuccessfulUpdatedAt, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext applicationCredentialsGet(RequestContext request , String accessToken, Integer connectorId, String attrKey, String attrValue, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext applicationMeasurementsGet(RequestContext request , String accessToken, String clientId, Integer connectorId, Integer variableId, Integer sourceId, String startTime, BigDecimal value, Integer unitId, BigDecimal originalValue, Integer originalUnitId, Integer duration, String note, BigDecimal latitude, BigDecimal longitude, String location, String createdAt, String updatedAt, String error, Integer limit, Integer offset, String sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext applicationTrackingRemindersGet(RequestContext request , String accessToken, String clientId, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext applicationUpdatesGet(RequestContext request , String accessToken, Integer connectorId, Integer numberOfMeasurements, Boolean success, String message, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext applicationUserVariableRelationshipsGet(RequestContext request , String accessToken, Integer id, String confidenceLevel, BigDecimal confidenceScore, String direction, Integer durationOfAction, String errorMessage, Integer onsetDelay, Integer outcomeVariableId, Integer predictorVariableId, Integer predictorUnitId, BigDecimal sinnRank, String strengthLevel, BigDecimal strengthScore, String vote, BigDecimal valuePredictingHighOutcome, BigDecimal valuePredictingLowOutcome, Integer limit, Integer offset, String sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext applicationUserVariablesGet(RequestContext request , String accessToken, String clientId, Integer parentId, Integer variableId, Integer defaultUnitId, BigDecimal minimumAllowedValue, BigDecimal maximumAllowedValue, BigDecimal fillingValue, Integer joinWith, Integer onsetDelay, Integer durationOfAction, Integer variableCategoryId, Integer updated, Integer _public, Boolean causeOnly, String fillingType, Integer numberOfMeasurements, Integer numberOfProcessedMeasurements, Integer measurementsAtLastAnalysis, Integer lastUnitId, Integer lastOriginalUnitId, Integer lastOriginalValue, BigDecimal lastValue, BigDecimal lastOriginalValue2, Integer lastSourceId, Integer numberOfCorrelations, String status, String errorMessage, String lastSuccessfulUpdateTime, BigDecimal standardDeviation, BigDecimal variance, BigDecimal minimumRecordedValue, BigDecimal maximumRecordedValue, BigDecimal mean, BigDecimal median, Integer mostCommonUnitId, BigDecimal mostCommonValue, BigDecimal numberOfUniqueDailyValues, Integer numberOfChanges, BigDecimal skewness, BigDecimal kurtosis, BigDecimal latitude, BigDecimal longitude, String location, String createdAt, String updatedAt, Boolean outcome, String sources, Integer earliestSourceTime, Integer latestSourceTime, Integer earliestMeasurementTime, Integer latestMeasurementTime, Integer earliestFillingTime, Integer latestFillingTime, Integer limit, Integer offset, String sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext applicationVariableUserSourcesGet(RequestContext request , String accessToken, Integer variableId, Integer timestamp, Integer earliestMeasurementTime, Integer latestMeasurementTime, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext applicationVotesGet(RequestContext request , String accessToken, String clientId, Integer causeId, Integer effectId, Integer value, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}

