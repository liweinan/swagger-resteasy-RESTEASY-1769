package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Attachment;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public class SampleAttachment   {
  
  private Attachment attachment = null;

  /**
   * test
   **/
  
  @ApiModelProperty(required = true, value = "test")
  @JsonProperty("attachment")
  @NotNull
  public Attachment getAttachment() {
    return attachment;
  }
  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SampleAttachment sampleAttachment = (SampleAttachment) o;
    return Objects.equals(attachment, sampleAttachment.attachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampleAttachment {\n");
    
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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

