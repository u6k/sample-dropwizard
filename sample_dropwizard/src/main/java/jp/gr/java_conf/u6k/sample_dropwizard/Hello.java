
package jp.gr.java_conf.u6k.sample_dropwizard;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hello {

    private String _message;

    public Hello() {
    }

    public Hello(String message) {
        _message = message;
    }

    @JsonProperty
    public String getMessage() {
        return _message;
    }

}
