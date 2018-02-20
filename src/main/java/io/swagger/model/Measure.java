package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public class Measure   {
  
  private Integer piaId = null;
  private String title = null;
  private String content = null;
  private String placeholder = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pia_id")
  public Integer getPiaId() {
    return piaId;
  }
  public void setPiaId(Integer piaId) {
    this.piaId = piaId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("placeholder")
  public String getPlaceholder() {
    return placeholder;
  }
  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Measure measure = (Measure) o;
    return Objects.equals(piaId, measure.piaId) &&
        Objects.equals(title, measure.title) &&
        Objects.equals(content, measure.content) &&
        Objects.equals(placeholder, measure.placeholder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piaId, title, content, placeholder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measure {\n");
    
    sb.append("    piaId: ").append(toIndentedString(piaId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
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

