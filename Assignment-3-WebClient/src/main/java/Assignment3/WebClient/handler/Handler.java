package Assignment3.WebClient.handler;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import Assignment3.WebClient.entity.Employees;
import Assignment3.WebClient.model.Response;
import Assignment3.WebClient.service.Services;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class Handler {
	@Autowired
	private Services service;
	
	public Mono<ServerResponse> consume (ServerRequest serverRequest) {
		Flux<Response> responseMono= service.getEmployeeDataFromThirdAPI();
		return ServerResponse.ok() 
				.body(responseMono, Response.class);
	}
	
	
	
	public Mono<ServerResponse> addEmployee(ServerRequest serverRequest){
		Mono<Employees> studentMono= serverRequest.bodyToMono(Employees.class);	
		return studentMono.flatMap(r -> ServerResponse.ok()
										.body(service.addEmployee(r), Employees.class));
	} 
	
	
	
	 
	public Mono<ServerResponse> getAllEmployees(ServerRequest serverRequest){
		Flux<Employees> studentFlux= service.getAllEmployees();
		return ServerResponse.ok() 
				.body(studentFlux, Employees.class);
	}

}