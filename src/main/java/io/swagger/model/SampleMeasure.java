package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Measure;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public class SampleMeasure   {
  
  private Measure measure = null;

  /**
   * test
   **/
  
  @ApiModelProperty(required = true, value = "test")
  @JsonProperty("measure")
  @NotNull
  public Measure getMeasure() {
    return measure;
  }
  public void setMeasure(Measure measure) {
    this.measure = measure;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SampleMeasure sampleMeasure = (SampleMeasure) o;
    return Objects.equals(measure, sampleMeasure.measure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampleMeasure {\n");
    
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
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

