package RequestSpec;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ProductTestApi extends RequestSpecificationBuilder {
  
     public static RequestSpecification http;
     public static Response res;
     @Test
     public void getResponse() {
    	 http=RestAssured.given(getProducts());
    	 res=http.request(Method.GET);
    	 List<Map<String, Object>> data=
    			 res.as(new TypeRef<List<Map<String, Object>>>(){});
         System.out.println(data.get(0).get("title"));
     }
}
