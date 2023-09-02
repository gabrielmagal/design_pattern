package br.com.factorymethod;

import br.com.factorymethod.vehicles.IVehicle;

public abstract class Transport {
    void startTransport() {
        IVehicle iVehicle = createTransport();
        iVehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
