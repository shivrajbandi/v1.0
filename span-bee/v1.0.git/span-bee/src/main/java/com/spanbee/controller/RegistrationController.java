package com.spanbee.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;


/**
 * @author sucheth.s
 *
 */
@Path("login")
public class RegistrationController {
  
  
  private static final Logger LOGGER = Logger.getLogger(RegistrationController.class);
  
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/register")
  public String register(String request){
    
    
    System.out.println("*********Inside the authenticate method*********");
    return "{\"name\":\"value\"}";
  }

}

