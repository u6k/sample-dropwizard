
package jp.gr.java_conf.u6k.sample_dropwizard;

import io.dropwizard.Configuration;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloConfiguration extends Configuration {

    @NotEmpty
    private String _template;

    @JsonProperty
    public String getTemplate() {
        return _template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        _template = template;
    }

}
