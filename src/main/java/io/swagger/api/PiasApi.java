package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.api.factories.PiasApiServiceFactory;
import io.swagger.jaxrs.PATCH;
import io.swagger.model.*;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartInput;

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

//    @POST
//    @Consumes({"multipart/form-data"})
//    @Produces({"application/json"})
//    public Response addPia(@MultipartForm SamplePia body)
//            throws NotFoundException {
//        System.out.println("------- START OF ADD PIA -------");
//        System.out.println(body);
//        System.out.println("------- END OF ADD PIA -------");
//        return Response.status(200).build();
//
//    }

    @POST
    @Consumes({"multipart/form-data"})
    @Produces({"application/json"})
    public Response addPia(MultipartInput input)
            throws NotFoundException {
        System.out.println("------- START OF ADD PIA -------");
        System.out.println(input);
        System.out.println("------- END OF ADD PIA -------");
        return Response.status(200).build();

    }
}
