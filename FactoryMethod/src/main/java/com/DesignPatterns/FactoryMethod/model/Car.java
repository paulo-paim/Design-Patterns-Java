package com.DesignPatterns.FactoryMethod.model;

import com.DesignPatterns.FactoryMethod.enuns.CarType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Car {
    private String model;
    private String numberOfDoors;
    private String fuelCapacity;
    private CarType type;

    public Car() {
    }

    public Car(String model, CarType type, String fuelCapacity, String numberOfDoors) {
        this.model = model;
        this.type = type;
        this.fuelCapacity = fuelCapacity;
        this.numberOfDoors = numberOfDoors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(String fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
