package com.DesignPatterns.FactoryMethod.controller;

import com.DesignPatterns.FactoryMethod.enuns.CarType;
import com.DesignPatterns.FactoryMethod.model.Car;
import com.DesignPatterns.FactoryMethod.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/{type}")
    public ResponseEntity<Car> createCar(@PathVariable("type") CarType carType) throws Exception {
        return new ResponseEntity<>(carService.createCar(carType), HttpStatus.CREATED);
    }
}
