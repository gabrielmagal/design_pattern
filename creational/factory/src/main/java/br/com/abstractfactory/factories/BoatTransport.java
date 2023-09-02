package br.com.abstractfactory.factories;

import br.com.abstractfactory.aircrafts.IAircraft;
import br.com.abstractfactory.landvehicles.ILandVehicle;
import br.com.abstractfactory.sea.Boat;
import br.com.abstractfactory.sea.ISea;

public class BoatTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return null;
    }

    @Override
    public IAircraft createTransportAircraft() {
        return null;
    }

    @Override
    public ISea createTransportSea() {
        return new Boat();
    }
}
