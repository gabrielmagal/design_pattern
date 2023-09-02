package br.com.factorymethod;

import br.com.factorymethod.vehicles.Car;
import br.com.factorymethod.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
