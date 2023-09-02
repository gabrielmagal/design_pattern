package br.com.abstractfactory.sea;

public class Boat implements ISea {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando transporte pelo mar.");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros já na embarcação");
    }
}
