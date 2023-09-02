package br.com.factorymethod.vehicles;

public class Motorcycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega.");
    }

    @Override
    public void getCargo() {
        System.out.println("Ja pegamos a encomenda.");
    }
}
