package MOHANA_Maven.MOHANA_Maven;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class postmanapi {

	 
	 @Test
	public void GetGermanyCountryDetails() { 
		RestAssured.baseURI = "https://restcountries.com/v3.1/translation/germany"; 
		RequestSpecification httpRequest = RestAssured.given(); 
		Response response = httpRequest.request(Method.GET, "");
		System.out.println("Status received " + response.get()); 
		System.out.println("Response" + response.prettyPrint());
	    	
	}
	 @Test
		public void GetAlemaniaDetails() { 
		 RestAssured.baseURI = "https://restcountries.com/v3.1/translation/alemania"; 
			RequestSpecification httpRequest = RestAssured.given(); 
			Response response = httpRequest.request(Method.GET, "");
			System.out.println("Status received " + response.get()); 
			System.out.println("Response" + response.prettyPrint());
		    	
		}
	 @Test
		public void GetSaksamaaDetails() { 
		 RestAssured.baseURI = "https://restcountries.com/v3.1/translation/saksaama"; 
			RequestSpecification httpRequest = RestAssured.given(); 
			Response response = httpRequest.request(Method.GET, "");
			System.out.println("Status received " + response.get()); 
			System.out.println("Response" + response.prettyPrint());
		    	
		}
	}

