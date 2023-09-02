package br.com.abstractfactory.factories;

import br.com.abstractfactory.aircrafts.Helicopter;
import br.com.abstractfactory.aircrafts.IAircraft;
import br.com.abstractfactory.landvehicles.ILandVehicle;
import br.com.abstractfactory.landvehicles.Motorcycle;
import br.com.abstractfactory.sea.ISea;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public ISea createTransportSea() {
        return null;
    }
}
