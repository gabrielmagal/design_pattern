package br.com.buildermethod.builders;

import br.com.buildermethod.cars.Car;
import br.com.buildermethod.components.CarType;
import br.com.buildermethod.components.Engine;
import br.com.buildermethod.components.Transmission;

public class CarBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private String color;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public Car getResult() {
        return new Car(carType, seats, engine, transmission, color);
    }
}
