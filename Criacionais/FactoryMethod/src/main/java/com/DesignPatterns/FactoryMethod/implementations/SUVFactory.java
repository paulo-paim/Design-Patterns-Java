package com.DesignPatterns.FactoryMethod.implementations;

import com.DesignPatterns.FactoryMethod.enuns.CarType;
import com.DesignPatterns.FactoryMethod.interfaces.CarFactory;
import com.DesignPatterns.FactoryMethod.model.Car;

public class SUVFactory implements CarFactory {
    @Override
    public Car createCar() {
        var car = new Car();
        car.setModel("Jeep Compass");
        car.setFuelCapacity("50");
        car.setNumberOfDoors("4");
        car.setType(CarType.SUV);
        return car;
    }
}
