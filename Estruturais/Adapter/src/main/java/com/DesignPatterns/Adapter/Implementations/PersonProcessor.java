package com.DesignPatterns.Adapter.Implementations;

import com.DesignPatterns.Adapter.Interfaces.PersonAdapter;

import java.util.Objects;

public class PersonProcessor {

    public String process(PersonAdapter adapter){
        if(Objects.isNull(adapter.getRegister())){
            return "Esta nulo";
        }
        return adapter.getRegister();
    }
}
