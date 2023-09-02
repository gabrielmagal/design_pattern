package br.com.abstractfactory.factories;

import br.com.abstractfactory.aircrafts.IAircraft;
import br.com.abstractfactory.landvehicles.ILandVehicle;
import br.com.abstractfactory.sea.ISea;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    ISea createTransportSea();
}
