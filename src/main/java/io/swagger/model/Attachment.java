package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AttachedFile;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public class Attachment   {
  
  private Integer piaId = null;
  private String description = null;
  private String referenceTo = null;
  private Boolean forMeasure = null;
  private AttachedFile attachedFile = null;

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
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("reference_to")
  @NotNull
  public String getReferenceTo() {
    return referenceTo;
  }
  public void setReferenceTo(String referenceTo) {
    this.referenceTo = referenceTo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("for_measure")
  public Boolean getForMeasure() {
    return forMeasure;
  }
  public void setForMeasure(Boolean forMeasure) {
    this.forMeasure = forMeasure;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attached_file")
  public AttachedFile getAttachedFile() {
    return attachedFile;
  }
  public void setAttachedFile(AttachedFile attachedFile) {
    this.attachedFile = attachedFile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(piaId, attachment.piaId) &&
        Objects.equals(description, attachment.description) &&
        Objects.equals(referenceTo, attachment.referenceTo) &&
        Objects.equals(forMeasure, attachment.forMeasure) &&
        Objects.equals(attachedFile, attachment.attachedFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piaId, description, referenceTo, forMeasure, attachedFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    piaId: ").append(toIndentedString(piaId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    referenceTo: ").append(toIndentedString(referenceTo)).append("\n");
    sb.append("    forMeasure: ").append(toIndentedString(forMeasure)).append("\n");
    sb.append("    attachedFile: ").append(toIndentedString(attachedFile)).append("\n");
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

