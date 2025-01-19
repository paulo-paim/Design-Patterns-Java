package com.DesignPatterns.Adapter.Service;

import com.DesignPatterns.Adapter.Implementations.LegalPerson;
import com.DesignPatterns.Adapter.Implementations.PersonProcessor;
import com.DesignPatterns.Adapter.Implementations.PhysicalPerson;
import com.DesignPatterns.Adapter.Interfaces.PersonAdapter;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public PhysicalPerson createPhysicalPerson(){
        PhysicalPerson joao = new PhysicalPerson("123.456.789-00");
        return joao;
    }

    public LegalPerson createLegalPerson(){
        LegalPerson legalPerson = new LegalPerson(null);
        return legalPerson;
    }
}
