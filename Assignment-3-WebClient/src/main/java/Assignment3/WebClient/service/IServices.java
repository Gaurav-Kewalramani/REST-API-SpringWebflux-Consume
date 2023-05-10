package Assignment3.WebClient.service;

import Assignment3.WebClient.entity.Employees;
import Assignment3.WebClient.model.Response;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServices {

	Flux<Response> getEmployeeDataFromThirdAPI();
	Mono<Employees> addEmployee(Employees employee);
	Flux<Employees> getAllEmployees();

}