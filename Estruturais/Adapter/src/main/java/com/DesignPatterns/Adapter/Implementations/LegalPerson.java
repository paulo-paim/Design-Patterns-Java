package com.DesignPatterns.Adapter.Implementations;

import com.DesignPatterns.Adapter.Interfaces.PersonAdapter;

public class LegalPerson implements PersonAdapter {

    private String cnpj;

    public LegalPerson(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String getRegister() {
        return this.getCnpj();
    }
}
