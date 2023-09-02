package br.com.bridge.plataforms;

public class Youtube implements IPlatform{
    public Youtube() {
        configureRMTP();
        System.out.println("Youtube Transmissão iniciada.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Youtube: Conta autenticada com sucesso.");
    }

    @Override
    public void authToken() {
        System.out.println("Youtube: Autorizando aplicação.");
    }
}
