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
//            Collection<MimeMapping> mimeTypes = new ArrayList<MimeMapping>();
//
//            // au besoin : http://www.webmaster-toolkit.com/mime-types.shtml
//            mimeTypes.add(new MimeMapping("css", "text/css"));
//
//            mimeTypes.add(new MimeMapping("jpg", "image/jpeg"));
//            mimeTypes.add(new MimeMapping("jpeg", "image/jpeg"));
//            mimeTypes.add(new MimeMapping("gif", "image/gif"));
//            mimeTypes.add(new MimeMapping("png", "image/png"));
//            mimeTypes.add(new MimeMapping("xml", "text/xml"));
//            mimeTypes.add(new MimeMapping("js", "application/javascript"));
//            mimeTypes.add(new MimeMapping("dart", "application/dart"));
//            mimeTypes.add(new MimeMapping("json", "application/json"));
//            mimeTypes.add(new MimeMapping("mp4", "video/mp4"));
//            mimeTypes.add(new MimeMapping("ogv", "video/ogg"));
//            mimeTypes.add(new MimeMapping("ogg", "video/ogg"));
//            mimeTypes.add(new MimeMapping("webm", "video/webm"));

            UndertowJaxrsServer server = new UndertowJaxrsServer();

            ResteasyDeployment deployment = new ResteasyDeployment();
            deployment.setApplicationClass(ApplicationTest.class.getName());

//            DeploymentInfo deploymentInfo = server.undertowDeployment(deployment, "/")
//                    .setClassLoader(Runner.class.getClassLoader())
//                    .setContextPath("/api/")
//                    .setDeploymentName("test")
//                    .addMimeMappings(mimeTypes);

            DeploymentInfo deploymentInfo = server.undertowDeployment(deployment, "/")
                    .setClassLoader(Runner.class.getClassLoader())
                    .setContextPath("/api/")
                    .setDeploymentName("test");

            server.deploy(deploymentInfo);

            Undertow.Builder serverBuilder = Undertow.builder().addHttpListener(8080, "0.0.0.0");
            server.start(serverBuilder);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}