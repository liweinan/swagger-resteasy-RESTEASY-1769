package io.weli.from_resteasy;

import io.swagger.model.SamplePia;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/mime2")
public class MimeResourceTwo {

    @POST
    @Consumes("multipart/form-data")
    @Produces("text/plain")
    public String post(MultipartFormDataInput input, @MultipartForm SamplePia body) {
        System.out.println("MultipartFormDataInput: " + input);
        System.out.println("MultipartForm: " + body);
        return null;
    }
}
