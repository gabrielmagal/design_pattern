package br.com.factorymethod.vehicles;

public class Bicycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando trajeto!");
    }

    @Override
    public void getCargo() {
        System.out.println("Ja estou com seu alimento.");
    }
}
