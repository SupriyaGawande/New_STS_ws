package com.example.newdemoMS;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;




@RestResource(path="products")
public interface ProductRepository extends JpaRepository<Projects, Integer> {
	@RestResource(path="name")
	List<Projects> findByName(@Param("name") String name);

	
	@RestResource(path="price")
	List<Projects> findByPrice(@Param("price") Double price);
}
