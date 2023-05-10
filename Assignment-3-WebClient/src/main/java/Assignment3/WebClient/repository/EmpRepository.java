package Assignment3.WebClient.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import Assignment3.WebClient.entity.Employees;

@Repository
public interface EmpRepository extends ReactiveMongoRepository<Employees, Integer> {

}