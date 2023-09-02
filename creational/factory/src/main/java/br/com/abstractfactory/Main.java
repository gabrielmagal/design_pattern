package br.com.abstractfactory;

import br.com.abstractfactory.aircrafts.IAircraft;
import br.com.abstractfactory.factories.BoatTransport;
import br.com.abstractfactory.factories.ITransportFactory;
import br.com.abstractfactory.factories.NineNineTransport;
import br.com.abstractfactory.factories.UberTransport;
import br.com.abstractfactory.landvehicles.ILandVehicle;
import br.com.abstractfactory.sea.ISea;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/transport")
public class Main {
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/uber/car")
    public void factoryMethodUberCar() {
        ITransportFactory iTransportFactory = new UberTransport();
        ILandVehicle iLandVehicle = iTransportFactory.createTransportVehicle();
        iLandVehicle.startRoute();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/uber/airplane")
    public void factoryMethodUberAirplane() {
        ITransportFactory iTransportFactory = new UberTransport();
        IAircraft iAircraft = iTransportFactory.createTransportAircraft();
        iAircraft.startRoute();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/ninenine/motorcycle")
    public void factoryMethodNineNineMotorcycle() {
        ITransportFactory iTransportFactory = new NineNineTransport();
        ILandVehicle iLandVehicle = iTransportFactory.createTransportVehicle();
        iLandVehicle.startRoute();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/ninenine/helicopter")
    public void factoryMethodNineNineHelicopter() {
        ITransportFactory iTransportFactory = new NineNineTransport();
        IAircraft iLandVehicle = iTransportFactory.createTransportAircraft();
        iLandVehicle.startRoute();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/sea/boat")
    public void factoryMethodSeaBoat() {
        ITransportFactory iTransportFactory = new BoatTransport();
        ISea iSea = iTransportFactory.createTransportSea();
        iSea.startRoute();
    }
}
