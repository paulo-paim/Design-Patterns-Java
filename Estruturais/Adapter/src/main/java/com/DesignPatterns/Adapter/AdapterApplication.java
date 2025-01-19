package com.DesignPatterns.Adapter;

import com.DesignPatterns.Adapter.Implementations.LegalPerson;
import com.DesignPatterns.Adapter.Implementations.PersonProcessor;
import com.DesignPatterns.Adapter.Implementations.PhysicalPerson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdapterApplication.class, args);

		var joao = new PhysicalPerson("123.456.789-00");
		var empresa = new LegalPerson("11.111.111/0001-11");

		var personProcessor = new PersonProcessor();
		personProcessor.process(joao);
	}

}
