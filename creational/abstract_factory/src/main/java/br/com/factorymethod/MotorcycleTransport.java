package br.com.factorymethod;

import br.com.factorymethod.vehicles.IVehicle;
import br.com.factorymethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
