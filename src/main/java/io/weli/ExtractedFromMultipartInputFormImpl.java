package io.weli;

import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartInputImpl;

import javax.ws.rs.core.MediaType;
import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExtractedFromMultipartInputFormImpl {
    public static void main(String[] args) throws Exception {
        String input = "URLSTR: file:/Users/billburke/jboss/resteasy-jaxrs/resteasy-jaxrs/src/test/test-data/data.txt\r\n"
                + "--B98hgCmKsQ-B5AUFnm2FnDRCgHPDE3\r\n"
                + "Content-Disposition: form-data; name=\"part1\"\r\n"
                + "Content-Type: text/plain; charset=US-ASCII\r\n"
                + "Conotent-Transfer-Encoding: 8bit\r\n"
                + "\r\n"
                + "This is Value 1\r\n"
                + "--B98hgCmKsQ-B5AUFnm2FnDRCgHPDE3\r\n"
                + "Content-Disposition: form-data; name=\"part2\"\r\n"
                + "Content-Type: text/plain; charset=US-ASCII\r\n"
                + "Content-Transfer-Encoding: 8bit\r\n"
                + "\r\n"
                + "This is Value 2\r\n"
                + "--B98hgCmKsQ-B5AUFnm2FnDRCgHPDE3\r\n"
                + "Content-Disposition: form-data; name=\"data.txt\"; filename=\"data.txt\"\r\n"
                + "Content-Type: application/octet-stream; charset=ISO-8859-1\r\n"
                + "Content-Transfer-Encoding: binary\r\n"
                + "\r\n"
                + "hello world\r\n" + "--B98hgCmKsQ-B5AUFnm2FnDRCgHPDE3--";

        System.out.println(input);

        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("boundary", "B98hgCmKsQ-B5AUFnm2FnDRCgHPDE3");
        MediaType contentType = new MediaType("multipart", "form-data",
                parameters);
        MultipartInputImpl multipart = new MultipartInputImpl(contentType, null);
        multipart.parse(bais);

        System.out.println(multipart.getPreamble());
        System.out.println("**********");
        for (InputPart part : multipart.getParts()) {
            System.out.println("--");
            System.out.println("\"" + part.getBodyAsString() + "\"");
        }
        System.out.println("done");
    }
}


