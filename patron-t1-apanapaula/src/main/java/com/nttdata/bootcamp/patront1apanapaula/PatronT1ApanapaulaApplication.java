package com.nttdata.bootcamp.patront1apanapaula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.patron.singelton.PersonSingelton;

@SpringBootApplication
public class PatronT1ApanapaulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronT1ApanapaulaApplication.class, args);
		
		 PersonSingelton ana = PersonSingelton.getSingletonInstance("Ana Abad");
		 PersonSingelton ramon = PersonSingelton.getSingletonInstance("Ramón Invarato");
	        
	       
	}

}
