package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public class Pia   {
  
  private String name = null;
  private Integer status = null;
  private String authorName = null;
  private String evaluatorName = null;
  private String validatorName = null;
  private Integer dpoStatus = null;
  private String dpoOption = null;
  private String dposName = null;
  private String peopleName = null;
  private String concernedPeopleOpinion = null;
  private Integer concernedPeopleStatus = null;
  private String rejectionReason = null;
  private String appliedAdjustments = null;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("author_name")
  public String getAuthorName() {
    return authorName;
  }
  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("evaluator_name")
  public String getEvaluatorName() {
    return evaluatorName;
  }
  public void setEvaluatorName(String evaluatorName) {
    this.evaluatorName = evaluatorName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("validator_name")
  public String getValidatorName() {
    return validatorName;
  }
  public void setValidatorName(String validatorName) {
    this.validatorName = validatorName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dpo_status")
  public Integer getDpoStatus() {
    return dpoStatus;
  }
  public void setDpoStatus(Integer dpoStatus) {
    this.dpoStatus = dpoStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dpo_option")
  public String getDpoOption() {
    return dpoOption;
  }
  public void setDpoOption(String dpoOption) {
    this.dpoOption = dpoOption;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dpos_name")
  public String getDposName() {
    return dposName;
  }
  public void setDposName(String dposName) {
    this.dposName = dposName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("people_name")
  public String getPeopleName() {
    return peopleName;
  }
  public void setPeopleName(String peopleName) {
    this.peopleName = peopleName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("concerned_people_opinion")
  public String getConcernedPeopleOpinion() {
    return concernedPeopleOpinion;
  }
  public void setConcernedPeopleOpinion(String concernedPeopleOpinion) {
    this.concernedPeopleOpinion = concernedPeopleOpinion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("concerned_people_status")
  public Integer getConcernedPeopleStatus() {
    return concernedPeopleStatus;
  }
  public void setConcernedPeopleStatus(Integer concernedPeopleStatus) {
    this.concernedPeopleStatus = concernedPeopleStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rejection_reason")
  public String getRejectionReason() {
    return rejectionReason;
  }
  public void setRejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("applied_adjustments")
  public String getAppliedAdjustments() {
    return appliedAdjustments;
  }
  public void setAppliedAdjustments(String appliedAdjustments) {
    this.appliedAdjustments = appliedAdjustments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pia pia = (Pia) o;
    return Objects.equals(name, pia.name) &&
        Objects.equals(status, pia.status) &&
        Objects.equals(authorName, pia.authorName) &&
        Objects.equals(evaluatorName, pia.evaluatorName) &&
        Objects.equals(validatorName, pia.validatorName) &&
        Objects.equals(dpoStatus, pia.dpoStatus) &&
        Objects.equals(dpoOption, pia.dpoOption) &&
        Objects.equals(dposName, pia.dposName) &&
        Objects.equals(peopleName, pia.peopleName) &&
        Objects.equals(concernedPeopleOpinion, pia.concernedPeopleOpinion) &&
        Objects.equals(concernedPeopleStatus, pia.concernedPeopleStatus) &&
        Objects.equals(rejectionReason, pia.rejectionReason) &&
        Objects.equals(appliedAdjustments, pia.appliedAdjustments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, authorName, evaluatorName, validatorName, dpoStatus, dpoOption, dposName, peopleName, concernedPeopleOpinion, concernedPeopleStatus, rejectionReason, appliedAdjustments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pia {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    evaluatorName: ").append(toIndentedString(evaluatorName)).append("\n");
    sb.append("    validatorName: ").append(toIndentedString(validatorName)).append("\n");
    sb.append("    dpoStatus: ").append(toIndentedString(dpoStatus)).append("\n");
    sb.append("    dpoOption: ").append(toIndentedString(dpoOption)).append("\n");
    sb.append("    dposName: ").append(toIndentedString(dposName)).append("\n");
    sb.append("    peopleName: ").append(toIndentedString(peopleName)).append("\n");
    sb.append("    concernedPeopleOpinion: ").append(toIndentedString(concernedPeopleOpinion)).append("\n");
    sb.append("    concernedPeopleStatus: ").append(toIndentedString(concernedPeopleStatus)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
    sb.append("    appliedAdjustments: ").append(toIndentedString(appliedAdjustments)).append("\n");
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

