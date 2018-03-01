package io.weli.from_resteasy;

import io.Runner;
import io.swagger.ApplicationTest;
import io.undertow.Undertow;
import io.undertow.servlet.api.DeploymentInfo;
import junit.framework.Assert;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;
import org.jboss.resteasy.spi.ResteasyDeployment;
import org.jboss.resteasy.util.HttpResponseCodes;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class MimeMultipartProviderTest {
    static Client client;
    private static final String ERR_MSG = "The number of enclosed bodypart objects doesn't match to the expectation";

    public static void main(String[] args) {
        client = ClientBuilder.newClient();

        try {
            MultipartFormDataOutput mpfdo = new MultipartFormDataOutput();
            mpfdo.addFormData("part1", "This is Value 1", MediaType.TEXT_PLAIN_TYPE);
            mpfdo.addFormData("part2", "This is Value 2", MediaType.TEXT_PLAIN_TYPE);

            Response response = client.target("http://0.0.0.0:8080/mime").request()
                    .put(Entity.entity(mpfdo, MediaType.MULTIPART_FORM_DATA_TYPE));
            Assert.assertEquals(HttpResponseCodes.SC_OK, response.getStatus());
            String responseBody = response.readEntity(String.class);
            Assert.assertEquals(ERR_MSG, responseBody, "Count: 2");
        } finally {
            client.close();
        }
    }
}
