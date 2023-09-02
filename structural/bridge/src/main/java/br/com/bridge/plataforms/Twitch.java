package br.com.bridge.plataforms;

public class Twitch implements IPlatform {
    public Twitch() {
        configureRMTP();
        System.out.println("Twitch Transmissão iniciada.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Twitch: Conta autenticada com sucesso.");
    }

    @Override
    public void authToken() {
        System.out.println("Twitch: Autorizando aplicação.");
    }
}
