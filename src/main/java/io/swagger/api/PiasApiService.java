package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import io.swagger.model.Answer;
import io.swagger.model.Attachment;
import io.swagger.model.Comment;
import io.swagger.model.Error;
import io.swagger.model.Evaluation;
import java.io.File;
import io.swagger.model.Measure;
import io.swagger.model.Pia;
import io.swagger.model.SampleAnswer;
import io.swagger.model.SampleAttachment;
import io.swagger.model.SampleComment;
import io.swagger.model.SampleEvaluation;
import io.swagger.model.SampleMeasure;
import io.swagger.model.SamplePia;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public abstract class PiasApiService {
      public abstract Response addAnswer(MultipartFormDataInput input,Long piaId,SampleAnswer body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response addAttachment(MultipartFormDataInput input,Long piaId,SampleAttachment body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response addComment(MultipartFormDataInput input,Long piaId,SampleComment body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response addEvaluation(MultipartFormDataInput input,Long piaId,SampleEvaluation body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response addMeasure(MultipartFormDataInput input,Long piaId,SampleMeasure body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response addPia(MultipartFormDataInput input,SamplePia body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deleteAnswer(MultipartFormDataInput input,Long piaId,Long id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deleteAttachment(MultipartFormDataInput input,Long piaId,Long id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deleteComment(MultipartFormDataInput input,Long piaId,Long id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deleteEvaluation(MultipartFormDataInput input,Long piaId,Long id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deleteMeasure(MultipartFormDataInput input,Long piaId,Long id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deletePia(MultipartFormDataInput input,Long id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response duplicateId(MultipartFormDataInput input,Long id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findAnAnswerById(MultipartFormDataInput input,Long piaId,Long id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findAnAttachmentById(MultipartFormDataInput input,Long piaId,Long id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findAnCommentById(MultipartFormDataInput input,Long piaId,Long id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findAnEvaluationById(MultipartFormDataInput input,Long piaId,Long id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findAnMeasureById(MultipartFormDataInput input,Long piaId,Long id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findPIAById(MultipartFormDataInput input,Long id,Boolean export,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response importPias(MultipartFormDataInput input,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listAnswers(MultipartFormDataInput input,Long piaId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listAttachments(MultipartFormDataInput input,Long piaId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listComments(MultipartFormDataInput input,Long piaId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listEvaluations(MultipartFormDataInput input,Long piaId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listMeasures(MultipartFormDataInput input,Long piaId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listPias(MultipartFormDataInput input,Boolean export,String sortingColumn,String sortingDirection,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updateAnswer(MultipartFormDataInput input,Long piaId,Integer id,SampleAnswer body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updatePia(MultipartFormDataInput input,Integer id,SamplePia body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updatecomment(MultipartFormDataInput input,Long piaId,Integer id,SampleComment body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updateevaluation(MultipartFormDataInput input,Long piaId,Integer id,SampleEvaluation body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updatemeasure(MultipartFormDataInput input,Long piaId,Integer id,SampleMeasure body,SecurityContext securityContext)
      throws NotFoundException;
}
