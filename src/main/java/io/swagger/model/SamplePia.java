package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Pia;

import javax.validation.constraints.*;

import io.swagger.annotations.*;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public class SamplePia {

    private Pia pia = null;

    /**
     * test
     **/

    @ApiModelProperty(required = true, value = "test")
    @JsonProperty("pia")
    @NotNull
    public Pia getPia() {
        return pia;
    }

    public void setPia(Pia pia) {
        this.pia = pia;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SamplePia samplePia = (SamplePia) o;
        return Objects.equals(pia, samplePia.pia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pia);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SamplePia {\n");

        sb.append("    pia: ").append(toIndentedString(pia)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

