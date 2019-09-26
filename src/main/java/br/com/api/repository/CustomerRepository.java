package br.com.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.api.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	List<Customer> findByAge(Integer age);

}
