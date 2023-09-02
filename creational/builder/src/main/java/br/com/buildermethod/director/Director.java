package br.com.buildermethod.director;

import br.com.buildermethod.builders.IBuilder;
import br.com.buildermethod.components.CarType;
import br.com.buildermethod.components.Engine;
import br.com.buildermethod.components.Transmission;

public class Director {
    public void constructSedanCar(IBuilder iBuilder) {
        iBuilder.setCarType(CarType.SEDAN);
        iBuilder.setSeats(5);
        iBuilder.setTransmission(Transmission.AUTOMATIC);
        iBuilder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder iBuilder) {
        iBuilder.setCarType(CarType.TRUCK);
        iBuilder.setSeats(5);
        iBuilder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        iBuilder.setEngine(new Engine(13000));
    }

    public void constructSportCar(IBuilder iBuilder) {
        iBuilder.setCarType(CarType.SPORTCAR);
        iBuilder.setSeats(2);
        iBuilder.setTransmission(Transmission.AUTOMATIC);
        iBuilder.setEngine(new Engine(4000));
        iBuilder.setColor("Yellow");
    }
}
