package com.DesignPatterns.Adapter.Implementations;

import com.DesignPatterns.Adapter.Interfaces.PersonAdapter;

public class PhysicalPerson implements PersonAdapter {

    String cpf;

    public PhysicalPerson(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String getRegister() {
        return this.getCpf();
    }
}
