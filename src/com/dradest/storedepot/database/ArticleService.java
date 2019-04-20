package com.dradest.storedepot.database;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ArticleService") 

public class ArticleService {  
   ArticleDao articleDao = new ArticleDao();  
   @GET 
   @Path("/articles") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<Article> getUsers(){ 
      return articleDao.getAllArticles(); 
   }  
}
