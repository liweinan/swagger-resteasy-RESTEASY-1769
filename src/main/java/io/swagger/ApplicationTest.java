package io.swagger;

import io.swagger.api.PiasApi;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class ApplicationTest extends Application {

    @Override
    public Set<Object> getSingletons() {
        HashSet<Object> set = new HashSet<Object>();

        set.add(new PiasApi());


        set.add(new io.swagger.jaxrs.listing.ApiListingResource());
        set.add(new io.swagger.jaxrs.listing.SwaggerSerializers());

        return set;
    }
}
