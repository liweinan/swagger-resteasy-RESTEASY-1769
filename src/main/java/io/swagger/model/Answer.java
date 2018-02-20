package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public class Answer   {
  
  private Integer piaId = null;
  private Object data = null;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pia_id")
  @NotNull
  public Integer getPiaId() {
    return piaId;
  }
  public void setPiaId(Integer piaId) {
    this.piaId = piaId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Answer answer = (Answer) o;
    return Objects.equals(piaId, answer.piaId) &&
        Objects.equals(data, answer.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piaId, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Answer {\n");
    
    sb.append("    piaId: ").append(toIndentedString(piaId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

