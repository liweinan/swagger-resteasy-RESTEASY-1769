package io.swagger.api.factories;

import io.swagger.api.PiasApiService;
import io.swagger.api.impl.PiasApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-12-12T19:59:48.486+01:00")
public class PiasApiServiceFactory {

   private final static PiasApiService service = new PiasApiServiceImpl();

   public static PiasApiService getPiasApi()
   {
      return service;
   }
}
