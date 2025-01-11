package com.DesignPatterns.FactoryMethod.implementations;

import com.DesignPatterns.FactoryMethod.enuns.CarType;
import com.DesignPatterns.FactoryMethod.interfaces.CarFactory;
import com.DesignPatterns.FactoryMethod.model.Car;

public class HATCHFactory implements CarFactory {
    @Override
    public Car createCar() {
        var car = new Car();
        car.setModel("POLO");
        car.setFuelCapacity("40");
        car.setNumberOfDoors("4");
        car.setType(CarType.HATCH);
        return car;
    }
}
