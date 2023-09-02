package br.com.buildermethod.builders;

import br.com.buildermethod.components.CarType;
import br.com.buildermethod.components.Engine;
import br.com.buildermethod.components.Transmission;

public interface IBuilder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
    void setColor(String color);
}
