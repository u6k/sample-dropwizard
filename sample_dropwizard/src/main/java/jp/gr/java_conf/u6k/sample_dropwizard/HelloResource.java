
package jp.gr.java_conf.u6k.sample_dropwizard;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloResource {

    private String _template;

    public HelloResource(String template) {
        _template = template;
    }

    @GET
    @Timed
    public Hello say(@QueryParam("name") String name) {
        String message = String.format(_template, name);
        Hello hello = new Hello(message);

        return hello;
    }

}
