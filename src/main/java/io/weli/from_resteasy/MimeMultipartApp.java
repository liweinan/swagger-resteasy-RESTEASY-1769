package io.weli.from_resteasy;

import io.swagger.api.PiasApi;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class MimeMultipartApp extends Application {

    @Override
    public Set<Object> getSingletons() {
        HashSet<Object> set = new HashSet<Object>();

        set.add(new MimeMultipartProviderResource());
        set.add(new MimeResourceTwo());
        return set;
    }
}
