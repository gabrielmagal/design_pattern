package br.com.bridge.plataforms;

public class DisneyPlus implements IPlatform {
    public DisneyPlus() {
        configureRMTP();
        System.out.println("DisneyPlus Transmissão iniciada.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: Conta autenticada com sucesso.");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Autorizando aplicação.");
    }
}
