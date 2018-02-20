package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Evaluation;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public class SampleEvaluation   {
  
  private Evaluation evaluation = null;

  /**
   * test
   **/
  
  @ApiModelProperty(required = true, value = "test")
  @JsonProperty("evaluation")
  @NotNull
  public Evaluation getEvaluation() {
    return evaluation;
  }
  public void setEvaluation(Evaluation evaluation) {
    this.evaluation = evaluation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SampleEvaluation sampleEvaluation = (SampleEvaluation) o;
    return Objects.equals(evaluation, sampleEvaluation.evaluation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampleEvaluation {\n");
    
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
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

