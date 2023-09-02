package br.com.abstractfactory.factories;

import br.com.abstractfactory.aircrafts.Airplane;
import br.com.abstractfactory.aircrafts.IAircraft;
import br.com.abstractfactory.landvehicles.Car;
import br.com.abstractfactory.landvehicles.ILandVehicle;
import br.com.abstractfactory.sea.ISea;

public class UberTransport implements  ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public ISea createTransportSea() {
        return null;
    }
}
