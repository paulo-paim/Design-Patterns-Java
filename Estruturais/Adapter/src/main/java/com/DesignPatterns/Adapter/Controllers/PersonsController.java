package com.DesignPatterns.Adapter.Controllers;

import com.DesignPatterns.Adapter.Implementations.LegalPerson;
import com.DesignPatterns.Adapter.Implementations.PersonProcessor;
import com.DesignPatterns.Adapter.Implementations.PhysicalPerson;
import com.DesignPatterns.Adapter.Service.PersonService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")
public class PersonsController {

    @Autowired
    private PersonService personService;

    @GetMapping("/physical")
    public ResponseEntity<String> getPhysicalPerson(){
        PhysicalPerson pf = personService.createPhysicalPerson();
        PersonProcessor processor = new PersonProcessor();
        return new ResponseEntity<>(processor.process(pf), HttpStatus.OK);
    }

    @GetMapping("/legal")
    public ResponseEntity<String> getLegalPerson(){
        LegalPerson pj = personService.createLegalPerson();
        PersonProcessor processor = new PersonProcessor();
        return new ResponseEntity<>(processor.process(pj), HttpStatus.OK);
    }
}
