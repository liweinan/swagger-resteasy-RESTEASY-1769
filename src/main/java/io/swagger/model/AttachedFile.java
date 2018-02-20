package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public class AttachedFile   {
  
  private Integer piaId = null;
  private String file = null;
  private String name = null;
  private String mimeType = null;

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
  @JsonProperty("file")
  public String getFile() {
    return file;
  }
  public void setFile(String file) {
    this.file = file;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mime_type")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachedFile attachedFile = (AttachedFile) o;
    return Objects.equals(piaId, attachedFile.piaId) &&
        Objects.equals(file, attachedFile.file) &&
        Objects.equals(name, attachedFile.name) &&
        Objects.equals(mimeType, attachedFile.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piaId, file, name, mimeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachedFile {\n");
    
    sb.append("    piaId: ").append(toIndentedString(piaId)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

