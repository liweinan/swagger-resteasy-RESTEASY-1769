package io.weli.container;

import io.Runner;
import io.swagger.ApplicationTest;
import io.undertow.Undertow;
import io.undertow.servlet.api.DeploymentInfo;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;
import org.jboss.resteasy.spi.ResteasyDeployment;

public class UndertowContainerTwo {
    public static void main(String[] args) {
        UndertowJaxrsServer server = new UndertowJaxrsServer();

        ResteasyDeployment deployment = new ResteasyDeployment();
        deployment.setApplicationClass(ApplicationTest.class.getName());

        DeploymentInfo deploymentInfo = server.undertowDeployment(deployment, "/")
                .setClassLoader(Runner.class.getClassLoader())
                .setContextPath("/api/")
                .setDeploymentName("test");
        server.deploy(deploymentInfo);
        Undertow.Builder serverBuilder = Undertow.builder().addHttpListener(8080, "0.0.0.0");
        server.start(serverBuilder);
    }
}
