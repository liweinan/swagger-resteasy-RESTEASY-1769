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
}
