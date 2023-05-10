package Assignment3.WebClient.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.google.gson.Gson;
import Assignment3.WebClient.entity.Employees;
import Assignment3.WebClient.model.Response;
import Assignment3.WebClient.repository.EmpRepository;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
 
@Service
public class Services implements IServices{
	
	
	@Autowired
	private EmpRepository empRepository;
	private static final String URL = "http://dummy.restapiexample.com/api/v1/employee/1";
	
	@Override
	public Flux<Response> getEmployeeDataFromThirdAPI() {


		
		WebClient webClient = WebClient.create();
		return webClient.get()
				.uri(URL)
				.retrieve()
				.bodyToFlux(String.class)
				.flatMap(r->{
					Gson gson= new Gson();
					return Flux.just(gson.fromJson(r, Response.class));
				}
				);
	}

	public Mono<Employees> addEmployee(Employees employee) {
		return empRepository.save(employee);
	}
	
	public Flux<Employees> getAllEmployees() {
		return empRepository.findAll();
	}
}