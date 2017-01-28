import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("introsde.external-adapter")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("resources");
    }
}
