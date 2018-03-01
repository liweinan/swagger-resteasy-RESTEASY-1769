package io.weli.from_resteasy;

import io.Runner;
import io.undertow.Undertow;
import io.undertow.servlet.api.DeploymentInfo;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;
import org.jboss.resteasy.spi.ResteasyDeployment;

public class MimeMultipartServer {
    public static void main(String[] args) throws Exception {
        UndertowJaxrsServer server = new UndertowJaxrsServer();

        ResteasyDeployment deployment = new ResteasyDeployment();
        deployment.setApplicationClass(MimeMultipartApp.class.getName());

        DeploymentInfo deploymentInfo = server.undertowDeployment(deployment, "/")
                .setClassLoader(Runner.class.getClassLoader())
                .setContextPath("/")
                .setDeploymentName("test");

        server.deploy(deploymentInfo);

        Undertow.Builder serverBuilder = Undertow.builder().addHttpListener(8080, "127.0.0.1");
        server.start(serverBuilder);
    }
}
