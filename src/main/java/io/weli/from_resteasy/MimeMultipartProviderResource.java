package io.weli.from_resteasy;


import junit.framework.Assert;
import org.jboss.logging.Logger;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.jboss.resteasy.annotations.providers.multipart.PartType;
import org.jboss.resteasy.annotations.providers.multipart.XopWithMultipartRelated;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartConstants;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartRelatedInput;

import javax.activation.DataHandler;
import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Path("/mime")
public class MimeMultipartProviderResource {
    @PUT
    @Consumes("multipart/form-data")
    @Produces("text/plain")
    public String putData(MimeMultipart multipart) {
        StringBuilder b = new StringBuilder("Count: ");
        try {
            b.append(multipart.getCount());
            for (int i = 0; i < multipart.getCount(); i++) {
                try {
                    logger.debug(multipart.getBodyPart(i).getContent().toString());
                    logger.debug("bytes available {0}" + multipart.getBodyPart(i).getInputStream().available());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    logger.info(e.getCause());
                }
            }
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            logger.info(e.getCause());
        }
        return b.toString();
    }

    public static class Form {
        @FormParam("bill")
        @PartType("application/xml")
        private MimeMultipartProviderCustomer bill;

        @FormParam("monica")
        @PartType("application/xml")
        private MimeMultipartProviderCustomer monica;

        public Form() {
        }

        public Form(final MimeMultipartProviderCustomer bill, final MimeMultipartProviderCustomer monica) {
            this.bill = bill;
            this.monica = monica;
        }

        public MimeMultipartProviderCustomer getBill() {
            return bill;
        }

        public MimeMultipartProviderCustomer getMonica() {
            return monica;
        }
    }

    @XmlRootElement
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Xop {
        private MimeMultipartProviderCustomer bill;

        private MimeMultipartProviderCustomer monica;

        @XmlMimeType(MediaType.APPLICATION_OCTET_STREAM)
        private byte[] myBinary;

        @XmlMimeType(MediaType.APPLICATION_OCTET_STREAM)
        private DataHandler myDataHandler;

        public Xop() {
        }

        public Xop(final MimeMultipartProviderCustomer bill, final MimeMultipartProviderCustomer monica, final byte[] myBinary,
                   final DataHandler myDataHandler) {
            this.bill = bill;
            this.monica = monica;
            this.myBinary = myBinary;
            this.myDataHandler = myDataHandler;
        }

        public MimeMultipartProviderCustomer getBill() {
            return bill;
        }

        public MimeMultipartProviderCustomer getMonica() {
            return monica;
        }

        public byte[] getMyBinary() {
            return myBinary;
        }

        public DataHandler getMyDataHandler() {
            return myDataHandler;
        }
    }

    public static class Form2 {
        @FormParam("submit-name")
        public String name;

        @FormParam("files")
        public byte[] file;
    }

    private static Logger logger = Logger.getLogger(MimeMultipartProviderResource.class);
    private static final String ERR_MULTIPART_PROPERTY = "Property from multipart is not correct";
    private static final String ERR_MULTIPART_FORM = "Multipart form value is incorrect";
    private static final String ERR_NUMBER = "The number of enclosed bodypart objects doesn't match to the expectation";
    private static final String ERR_CUST_NULL = "The customer entity is not expected to be null";
    private static final String ERR_VALUE = "Unexpected value";

    private MimeBodyPart createPart(String value, String type,
                                    String description) throws MessagingException {
        MimeBodyPart part = new MimeBodyPart();
        part.setDescription(description);
        part.setContent(value, type);
        return part;
    }
}