package com.DesignPatterns.Singleton;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping
    public ResponseEntity<Object> getInstance(){
        var config1 = ConfigorationAPI.getInstance();
        var config2 = ConfigorationAPI.getInstance();

        Object retorno = new Object(){
          String instancia1 = config1.toString();
            String instancia2 = config2.toString();

          public List<String> getConfigurations(){
              List<String> lista = new ArrayList<>();
              lista.add(config1.toString());
              lista.add(config2.toString());
              return lista;
          }
        };

        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }
}
