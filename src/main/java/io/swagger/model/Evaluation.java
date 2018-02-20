package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public class Evaluation   {
  
  private Integer piaId = null;
  private Integer status = null;
  private String referenceTo = null;
  private String actionPlanComment = null;
  private String evaluationComment = null;
  private String evaluationDate = null;
  private Object gauges = null;
  private String estimatedImplementationDate = null;
  private String personInCharge = null;
  private Integer globalStatus = null;

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
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
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
  @JsonProperty("action_plan_comment")
  public String getActionPlanComment() {
    return actionPlanComment;
  }
  public void setActionPlanComment(String actionPlanComment) {
    this.actionPlanComment = actionPlanComment;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("evaluation_comment")
  public String getEvaluationComment() {
    return evaluationComment;
  }
  public void setEvaluationComment(String evaluationComment) {
    this.evaluationComment = evaluationComment;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("evaluation_date")
  public String getEvaluationDate() {
    return evaluationDate;
  }
  public void setEvaluationDate(String evaluationDate) {
    this.evaluationDate = evaluationDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gauges")
  public Object getGauges() {
    return gauges;
  }
  public void setGauges(Object gauges) {
    this.gauges = gauges;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimated_implementation_date")
  public String getEstimatedImplementationDate() {
    return estimatedImplementationDate;
  }
  public void setEstimatedImplementationDate(String estimatedImplementationDate) {
    this.estimatedImplementationDate = estimatedImplementationDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("person_in_charge")
  public String getPersonInCharge() {
    return personInCharge;
  }
  public void setPersonInCharge(String personInCharge) {
    this.personInCharge = personInCharge;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("global_status")
  public Integer getGlobalStatus() {
    return globalStatus;
  }
  public void setGlobalStatus(Integer globalStatus) {
    this.globalStatus = globalStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evaluation evaluation = (Evaluation) o;
    return Objects.equals(piaId, evaluation.piaId) &&
        Objects.equals(status, evaluation.status) &&
        Objects.equals(referenceTo, evaluation.referenceTo) &&
        Objects.equals(actionPlanComment, evaluation.actionPlanComment) &&
        Objects.equals(evaluationComment, evaluation.evaluationComment) &&
        Objects.equals(evaluationDate, evaluation.evaluationDate) &&
        Objects.equals(gauges, evaluation.gauges) &&
        Objects.equals(estimatedImplementationDate, evaluation.estimatedImplementationDate) &&
        Objects.equals(personInCharge, evaluation.personInCharge) &&
        Objects.equals(globalStatus, evaluation.globalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piaId, status, referenceTo, actionPlanComment, evaluationComment, evaluationDate, gauges, estimatedImplementationDate, personInCharge, globalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evaluation {\n");
    
    sb.append("    piaId: ").append(toIndentedString(piaId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceTo: ").append(toIndentedString(referenceTo)).append("\n");
    sb.append("    actionPlanComment: ").append(toIndentedString(actionPlanComment)).append("\n");
    sb.append("    evaluationComment: ").append(toIndentedString(evaluationComment)).append("\n");
    sb.append("    evaluationDate: ").append(toIndentedString(evaluationDate)).append("\n");
    sb.append("    gauges: ").append(toIndentedString(gauges)).append("\n");
    sb.append("    estimatedImplementationDate: ").append(toIndentedString(estimatedImplementationDate)).append("\n");
    sb.append("    personInCharge: ").append(toIndentedString(personInCharge)).append("\n");
    sb.append("    globalStatus: ").append(toIndentedString(globalStatus)).append("\n");
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

