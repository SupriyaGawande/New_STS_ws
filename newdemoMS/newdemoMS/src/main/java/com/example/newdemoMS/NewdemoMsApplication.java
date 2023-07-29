package com.example.newdemoMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewdemoMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewdemoMsApplication.class, args);
	}
	@Autowired ProductRepository productRepo;
	
	public void run(String... args) throws Exception {
		productRepo.save(new Projects("LG", 345.0));
		productRepo.save(new Projects("NOKIA", 366.0));
		productRepo.save(new Projects("OPPO", 567.0));
		productRepo.save(new Projects("BOAT", 799.0));
	}

}
