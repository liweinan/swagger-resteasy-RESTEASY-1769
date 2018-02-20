package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.api.factories.PiasApiServiceFactory;
import io.swagger.jaxrs.PATCH;
import io.swagger.model.*;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/pias")
@Consumes({"multipart/form-data"})
@Produces({"application/json"})
@io.swagger.annotations.Api(description = "the pias API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public class PiasApi {
    private final PiasApiService delegate = PiasApiServiceFactory.getPiasApi();

    @POST
    @Path("/{pia_id}/answers")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Creates a new answer", response = Answer.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "answer response", response = Answer.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Answer.class)})
    public Response addAnswer(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @ApiParam(value = "answer to add", required = true) SampleAnswer body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.addAnswer(input, piaId, body, securityContext);
    }

    @POST
    @Path("/{pia_id}/attachments")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Creates a new attachment", response = Attachment.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "attachment response", response = Attachment.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Attachment.class)})
    public Response addAttachment(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @ApiParam(value = "attachment to add", required = true) SampleAttachment body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.addAttachment(input, piaId, body, securityContext);
    }

    @POST
    @Path("/{pia_id}/comments")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Creates a new comment", response = Comment.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "comment response", response = Comment.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Comment.class)})
    public Response addComment(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @ApiParam(value = "comment to add", required = true) SampleComment body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.addComment(input, piaId, body, securityContext);
    }

    @POST
    @Path("/{pia_id}/evaluations")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Creates a new evaluation", response = Evaluation.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "evaluation response", response = Evaluation.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Evaluation.class)})
    public Response addEvaluation(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @ApiParam(value = "evaluation to add", required = true) SampleEvaluation body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.addEvaluation(input, piaId, body, securityContext);
    }

    @POST
    @Path("/{pia_id}/measures")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Creates a new measure", response = Measure.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "measure response", response = Measure.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Measure.class)})
    public Response addMeasure(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @ApiParam(value = "measure to add", required = true) SampleMeasure body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.addMeasure(input, piaId, body, securityContext);
    }

    @POST

    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Creates a new PIA", response = Pia.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "PIA response", response = Pia.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Pia.class)})
    public Response addPia(MultipartFormDataInput input, @ApiParam(value = "PIA to add", required = true) @MultipartForm SamplePia body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.addPia(input, body, securityContext);
    }

    @DELETE
    @Path("/{pia_id}/answers/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "deletes a single answer based on the ID supplied", response = Void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "answer deleted", response = Void.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Void.class)})
    public Response deleteAnswer(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Long id, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.deleteAnswer(input, piaId, id, securityContext);
    }

    @DELETE
    @Path("/{pia_id}/attachments/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "deletes a single attachment based on the ID supplied", response = Void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "attachment deleted", response = Void.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Void.class)})
    public Response deleteAttachment(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Long id, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.deleteAttachment(input, piaId, id, securityContext);
    }

    @DELETE
    @Path("/{pia_id}/comments/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "deletes a single comment based on the ID supplied", response = Void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "comment deleted", response = Void.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Void.class)})
    public Response deleteComment(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Long id, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.deleteComment(input, piaId, id, securityContext);
    }

    @DELETE
    @Path("/{pia_id}/evaluations/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "deletes a single evaluation based on the ID supplied", response = Void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "evaluation deleted", response = Void.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Void.class)})
    public Response deleteEvaluation(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Long id, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.deleteEvaluation(input, piaId, id, securityContext);
    }

    @DELETE
    @Path("/{pia_id}/measures/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "deletes a single measure based on the ID supplied", response = Void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "measure deleted", response = Void.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Void.class)})
    public Response deleteMeasure(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Long id, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.deleteMeasure(input, piaId, id, securityContext);
    }

    @DELETE
    @Path("/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "deletes a single PIA based on the ID supplied", response = Void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "PIA deleted", response = Void.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Void.class)})
    public Response deletePia(MultipartFormDataInput input, @PathParam("id") Long id, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.deletePia(input, id, securityContext);
    }

    @POST
    @Path("/{id}/duplicate")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Duplicate a PIA", response = Pia.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "PIA response", response = Pia.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Pia.class)})
    public Response duplicateId(MultipartFormDataInput input, @PathParam("id") Long id, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.duplicateId(input, id, securityContext);
    }

    @GET
    @Path("/{pia_id}/answers/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns an answer", response = Answer.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "answer response", response = Answer.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Answer.class)})
    public Response findAnAnswerById(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Long id, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.findAnAnswerById(input, piaId, id, securityContext);
    }

    @GET
    @Path("/{pia_id}/attachments/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns an attachment", response = Attachment.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "attachment response", response = Attachment.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Attachment.class)})
    public Response findAnAttachmentById(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Long id, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.findAnAttachmentById(input, piaId, id, securityContext);
    }

    @GET
    @Path("/{pia_id}/comments/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns an comment", response = Comment.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "comment response", response = Comment.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Comment.class)})
    public Response findAnCommentById(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Long id, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.findAnCommentById(input, piaId, id, securityContext);
    }

    @GET
    @Path("/{pia_id}/evaluations/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns an evaluation", response = Evaluation.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "evaluation response", response = Evaluation.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Evaluation.class)})
    public Response findAnEvaluationById(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Long id, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.findAnEvaluationById(input, piaId, id, securityContext);
    }

    @GET
    @Path("/{pia_id}/measures/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns an measure", response = Measure.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "measure response", response = Measure.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Measure.class)})
    public Response findAnMeasureById(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Long id, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.findAnMeasureById(input, piaId, id, securityContext);
    }

    @GET
    @Path("/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a PIA", response = Pia.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "pia response", response = Pia.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Pia.class)})
    public Response findPIAById(MultipartFormDataInput input, @PathParam("id") Long id, @QueryParam("export") Boolean export, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.findPIAById(input, id, export, securityContext);
    }

    @POST
    @Path("/import")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Import PIA from a json export", response = Pia.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "PIA response", response = Pia.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Pia.class)})
    public Response importPias(MultipartFormDataInput input, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.importPias(input, securityContext);
    }

    @GET
    @Path("/{pia_id}/answers")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns all answers. ", response = Answer.class, responseContainer = "List", tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "all answers index", response = Answer.class, responseContainer = "List"),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Answer.class, responseContainer = "List")})
    public Response listAnswers(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.listAnswers(input, piaId, securityContext);
    }

    @GET
    @Path("/{pia_id}/attachments")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns all attachments. ", response = Attachment.class, responseContainer = "List", tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "all attachments index", response = Attachment.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Attachment.class, responseContainer = "List")})
    public Response listAttachments(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.listAttachments(input, piaId, securityContext);
    }

    @GET
    @Path("/{pia_id}/comments")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns all comments. ", response = Comment.class, responseContainer = "List", tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "all comments index", response = Comment.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Comment.class, responseContainer = "List")})
    public Response listComments(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.listComments(input, piaId, securityContext);
    }

    @GET
    @Path("/{pia_id}/evaluations")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns all evaluations. ", response = Evaluation.class, responseContainer = "List", tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "all evaluations index", response = Evaluation.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Evaluation.class, responseContainer = "List")})
    public Response listEvaluations(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.listEvaluations(input, piaId, securityContext);
    }

    @GET
    @Path("/{pia_id}/measures")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns all measures. ", response = Measure.class, responseContainer = "List", tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "all measures index", response = Measure.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Measure.class, responseContainer = "List")})
    public Response listMeasures(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.listMeasures(input, piaId, securityContext);
    }

    @GET

    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns all PIAs.", response = Pia.class, responseContainer = "List", tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "all PIAs index", response = Pia.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Pia.class, responseContainer = "List")})
    public Response listPias(MultipartFormDataInput input, @QueryParam("export") Boolean export, @QueryParam("sorting[column]") String sortingColumn, @QueryParam("sorting[direction]") String sortingDirection, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.listPias(input, export, sortingColumn, sortingDirection, securityContext);
    }

    @PATCH
    @Path("/{pia_id}/answers/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update a answer", response = Answer.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "answer response", response = Answer.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Answer.class)})
    public Response updateAnswer(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Integer id, @ApiParam(value = "fields to update", required = true) SampleAnswer body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.updateAnswer(input, piaId, id, body, securityContext);
    }

    @PATCH
    @Path("/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update a PIA", response = Pia.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "PIA response", response = Pia.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Pia.class)})
    public Response updatePia(MultipartFormDataInput input, @PathParam("id") Integer id, @ApiParam(value = "fields to update", required = true) SamplePia body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.updatePia(input, id, body, securityContext);
    }

    @PATCH
    @Path("/{pia_id}/comments/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update a comment", response = Comment.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "comment response", response = Comment.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Comment.class)})
    public Response updatecomment(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Integer id, @ApiParam(value = "fields to update", required = true) SampleComment body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.updatecomment(input, piaId, id, body, securityContext);
    }

    @PATCH
    @Path("/{pia_id}/evaluations/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update a evaluation", response = Evaluation.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "evaluation response", response = Evaluation.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Evaluation.class)})
    public Response updateevaluation(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Integer id, @ApiParam(value = "fields to update", required = true) SampleEvaluation body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.updateevaluation(input, piaId, id, body, securityContext);
    }

    @PATCH
    @Path("/{pia_id}/measures/{id}")
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update a measure", response = Measure.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "measure response", response = Measure.class),

            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Measure.class)})
    public Response updatemeasure(MultipartFormDataInput input, @PathParam("pia_id") Long piaId, @PathParam("id") Integer id, @ApiParam(value = "fields to update", required = true) SampleMeasure body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.updatemeasure(input, piaId, id, body, securityContext);
    }
}
