package br.com.factorymethod;

import br.com.factorymethod.vehicles.Bicycle;
import br.com.factorymethod.vehicles.IVehicle;

public class BicycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bicycle();
    }
}
