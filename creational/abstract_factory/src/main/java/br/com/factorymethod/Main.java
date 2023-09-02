package br.com.factorymethod;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/transport")
public class Main {
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/motorcycle")
    public void factoryMethodMotorcycle() {
        Transport transport = new MotorcycleTransport();
        transport.startTransport();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/car")
    public void factoryMethodCar() {
        Transport transport = new CarTransport();
        transport.startTransport();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/bicycle")
    public void factoryMethodBicycle() {
        Transport transport = new BicycleTransport();
        transport.startTransport();
    }
}
