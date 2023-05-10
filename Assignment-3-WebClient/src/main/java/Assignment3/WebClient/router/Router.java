package Assignment3.WebClient.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;


import org.springframework.web.reactive.function.server.RouterFunction;
import static org.springframework.web.reactive.function.server.RouterFunctions.*;
import org.springframework.web.reactive.function.server.ServerResponse;

import Assignment3.WebClient.handler.Handler;

@Configuration
public class Router {
 
	
	@Bean
	public RouterFunction<ServerResponse> employeeAPIs(Handler handler){
		
		return route(POST("/store")
			.and(accept(MediaType.APPLICATION_JSON)), handler :: addEmployee)
				
				
				
			.andRoute(GET("/show")
			.and(accept(MediaType.APPLICATION_JSON)), handler :: getAllEmployees)
			
			
			
			.andRoute(GET("/consume")
			.and(accept(MediaType.APPLICATION_JSON)), handler :: consume);
	}		 
}