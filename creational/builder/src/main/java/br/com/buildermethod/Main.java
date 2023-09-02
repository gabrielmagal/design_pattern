package br.com.buildermethod;

import br.com.buildermethod.builders.CarBuilder;
import br.com.buildermethod.builders.TruckBuilder;
import br.com.buildermethod.cars.Car;
import br.com.buildermethod.cars.Truck;
import br.com.buildermethod.director.Director;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/vehicle")
public class Main {
    Director director = new Director();

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("sedancar")
    public void factoryMethodSedanCar() {
        CarBuilder carBuilder = new CarBuilder();
        director.constructSedanCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("sportcar")
    public void factoryMethodSportCar() {
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println(car.getCarType() + ", " + car.getColor() + " produzido com sucesso!");
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("truck")
    public void factoryMethodTruck() {
        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println(truck.getCarType() + " produzido com sucesso!");
    }
}
