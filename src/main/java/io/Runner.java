package io;

import io.swagger.ApplicationTest;
import io.undertow.Undertow;
import io.undertow.servlet.api.DeploymentInfo;
import io.undertow.servlet.api.MimeMapping;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;
import org.jboss.resteasy.spi.ResteasyDeployment;

import java.util.ArrayList;
import java.util.Collection;

public class Runner {

    public static void main(String[] args) {
        try {
            UndertowJaxrsServer server = new UndertowJaxrsServer();

            ResteasyDeployment deployment = new ResteasyDeployment();
            deployment.setApplicationClass(ApplicationTest.class.getName());

            DeploymentInfo deploymentInfo = server.undertowDeployment(deployment, "/")
                    .setClassLoader(Runner.class.getClassLoader())
                    .setContextPath("/api/")
                    .setDeploymentName("test");



            // 这行代码以后，下面的代码就不会抛出NullPointerException。
            // 说明这里的过程会把providers注册进ProviderFactory。
            server.deploy(deploymentInfo);

            {
                System.out.println("=== PROVIDER CLASSES ===");

                for (Class clazz : deployment.getProviderFactory().getProviderClasses()) {
                    System.out.println(clazz);
                }

                System.out.println("\n=== PROVIDER INSTANCES ===");

                for (Object obj : deployment.getProviderFactory().getProviderInstances()) {
                    System.out.println(obj);
                }
            }

            Undertow.Builder serverBuilder = Undertow.builder().addHttpListener(8080, "127.0.0.1");

            server.start(serverBuilder);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}