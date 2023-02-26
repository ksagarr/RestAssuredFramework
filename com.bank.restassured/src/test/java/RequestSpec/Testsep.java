package RequestSpec;



import org.testng.annotations.Test;

import com.bank.restassured.model.Customer;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Testsep extends RequestSpecificationBuilder{
	Response response;
	RequestSpecification http;
	@Test
	public void getResponse() {
		http=RestAssured.given(getRequest()).auth().basic("suraj", "12345");
		response=http.request(Method.GET);
		Customer[] res=response.getBody().as(Customer[].class);
	  
		System.out.println(res[0].getName());
		System.out.println(res[0].getBalance().getBalance());
	String header= response.getStatusLine();
	System.out.println(header);
	
	}

}
