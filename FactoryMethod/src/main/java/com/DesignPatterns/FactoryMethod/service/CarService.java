package com.DesignPatterns.FactoryMethod.service;

import com.DesignPatterns.FactoryMethod.enuns.CarType;
import com.DesignPatterns.FactoryMethod.implementations.HATCHFactory;
import com.DesignPatterns.FactoryMethod.implementations.SEDANFactory;
import com.DesignPatterns.FactoryMethod.implementations.SUVFactory;
import com.DesignPatterns.FactoryMethod.interfaces.CarFactory;
import com.DesignPatterns.FactoryMethod.model.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CarService {

    private final Map<CarType, CarFactory> factoryMap;

    public CarService() {
        factoryMap = new HashMap<>();
        factoryMap.put(CarType.HATCH, new HATCHFactory());
        factoryMap.put(CarType.SUV, new SUVFactory());
        factoryMap.put(CarType.SEDAN, new SEDANFactory());
    }

    public Car createCar(CarType carType) throws Exception {
        CarFactory carFactory = factoryMap.get(carType);

        if(carFactory != null)
            return carFactory.createCar();

        throw new Exception("Modelo não encontrado");
    }
}
