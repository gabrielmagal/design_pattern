package br.com.bridge.transmission;

import br.com.bridge.plataforms.IPlatform;

public class Live implements ITransmission {

    protected IPlatform iPlatform;

    public Live() {
    }

    public Live(IPlatform iPlatform) {
        this.iPlatform = iPlatform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando a transmissão.");
    }

    @Override
    public void result() {
        System.out.println("*** No ar ***");
    }
}
