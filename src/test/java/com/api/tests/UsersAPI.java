package com.api.tests;

import org.json.simple.JSONObject;
import org.testng.Assert;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class UsersAPI {
	
	 private String jsonbody;
	//private ResponseBody<Response> response;
	//private Validatable<ValidatableResponse, Response> response;

	@Test
	 public void getSingleUser() {
	        RestAssured.baseURI = "https://reqres.in/";
	        Response response = given().header("accept", "application/json").when().get("/api/users/2");
	   
	        System.out.println(response.prettyPrint());
	        response.then().statusCode(200).and().contentType("application/json");        
}
	 @Test
	 public void getListOfUser() {
	        RestAssured.baseURI = "https://reqres.in/";
	        Response response = given().header("accept", "application/json").when().get("/api/users?/page=2");
	   
	        System.out.println(response.prettyPrint());
	        response.then().statusCode(200).and().contentType("application/json"); 
	        
}

	 @Test
	    public void CreateUser() {

		        RestAssured.baseURI = "https://reqres.in/";
		        JSONObject request=new JSONObject();
		        request.put("name", "morpheus"); 
		       request.put("job", "leader");
	
		       System.out.println(request);
		       System.out.println(request.toJSONString());
		       
		              given().
		              header("accept", "application/json").
		              contentType("application/json").
		    		  body(request.toJSONString()).
		    		  when().
		    		  post("/api/users").
		    		  then().statusCode(201). 
                      log().all();
	 }
	 @Test
	    public void UpdateUser() {

		        RestAssured.baseURI = "https://reqres.in/";
		        JSONObject request=new JSONObject();
		        request.put("name", "morpheus"); 
		       request.put("job", "zion resident");
	
		       System.out.println(request);
		       System.out.println(request.toJSONString());
		       
		              given().
		              header("accept", "application/json").
		              contentType("application/json").
		    		  body(request.toJSONString()).
		    		  when().
		    		  put("/api/users/2").
		    		  then().statusCode(200). 
		    		  log().all();
}
	 @Test
	    public void DeleteUser() {

		        RestAssured.baseURI = "https://reqres.in/";
		        JSONObject request=new JSONObject();
		        request.put("name", "morpheus"); 
		       request.put("job", "zion resident");
	
		       System.out.println(request);
		       System.out.println(request.toJSONString());
		       
		              given().
		              header("accept", "application/json").
		              contentType("application/json").
		    		  body(request.toJSONString()).
		    		  when().
		    		  delete("/api/users/2").
		    		  then().statusCode(204).
		    		  log().all();
		    		  
}
	 @Test
	    public void RegisterSuccessUser() {

		        RestAssured.baseURI = "https://reqres.in/";
		        JSONObject request=new JSONObject();
		        request.put("email", "eve.holt@reqres.in"); 
		       request.put( "password", "pistol");
	
		       System.out.println(request);
		       System.out.println(request.toJSONString());
		       
		              given().
		              header("accept", "application/json").
		              contentType("application/json").
		    		  body(request.toJSONString()).
		    		  when().
		    		  post("/api/register").     
                      then().statusCode(200).
                      log().all();
	 }
	 

	 
     @Test
      public void RegisterUnSuccessUser() {

    RestAssured.baseURI = "https://reqres.in/";
    JSONObject request=new JSONObject();
    request.put("email", "sydney@fife"); 
   

   System.out.println(request);
   System.out.println(request.toJSONString());
   
          given().
          header("accept", "application/json").
          contentType("application/json").
		  body(request.toJSONString()).
		  when().
		  post("/api/register").     
          then().statusCode(400).
          log().all();
          
	       
     
}
     
     @Test
      public void LoginUnSuccessUser() {

    RestAssured.baseURI = "https://reqres.in/";
    JSONObject request=new JSONObject();
    request.put("email", "peter@klaven"); 
   

   System.out.println(request);
   System.out.println(request.toJSONString());
   
          given().
          header("accept", "application/json").
          contentType("application/json").
		  body(request.toJSONString()).
		  when().
		  post("/api/login").
		  then().statusCode(400).and().contentType("application/json");
          
     }
     
    		 @Test
    		 public void DelayedResponseUser() {
    		        RestAssured.baseURI = "https://reqres.in/";
    		        Response response = given().header("accept", "application/json").when().get("/api/users?delay=3");
    		   
    		        System.out.println(response.prettyPrint());
    		        response.then().statusCode(200).and().contentType("application/json"); 
    		 }
}
		           
		        	        			
		      

		        
		       

	 


