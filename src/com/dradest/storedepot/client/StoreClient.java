package com.dradest.storedepot.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import com.dradest.storedepot.database.Article;


public class StoreClient {
	   private Client client;
	   private String REST_SERVICE_URL = "http://localhost:8080/StoreDepot/rest/ArticleService/articles";
	   private static final String SUCCESS_RESULT="<result>success</result>";
	   private static final String PASS = "pass";
	   private static final String FAIL = "fail";
	   
	   private void init(){
		      this.client = ClientBuilder.newClient();
	   }
	   
	   public static void main(String[] args){
		      StoreClient tester = new StoreClient();
		      //initialize the tester
		      tester.init();
		      //test get all users Web Service Method
		      tester.testGetAllArticles();
	  }
	   //Test: Get list of all users
	   //Test: Check if list is not empty
	   private void testGetAllArticles(){
	      GenericType<List<Article>> list = new GenericType<List<Article>>() {};
	      List<Article> articles = client
	         .target(REST_SERVICE_URL)
	         .request(MediaType.APPLICATION_XML)
	         .get(list);
	      String result = PASS;
	      if(articles.isEmpty()){
	         result = FAIL;
	      }
	      System.out.println("Test case name: testGetAllArticles, Result: " + result );
	   }

}
