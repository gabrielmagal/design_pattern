package br.com.buildermethod.cars;

import br.com.buildermethod.components.CarType;
import br.com.buildermethod.components.Engine;
import br.com.buildermethod.components.Transmission;

public class Truck {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final String color;

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Truck(CarType carType, int seats, Engine engine, Transmission transmission, String color) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public String result() {
        return "Truck with motor: " + engine.getPower() + "\n" + "Transmission: " + transmission;
    }
}
