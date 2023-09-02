package br.com.bridge.transmission;

import br.com.bridge.plataforms.IPlatform;

public class AdvancedLive extends Live {
    public AdvancedLive(IPlatform iPlatform) {
        super(iPlatform);
    }

    public void subtitles() {
        System.out.println("Legendas ativadas na transmissão.");
    }

    public void comments() {
        System.out.println("Comentários ativados na transmissão.");
    }

    public void recordLive() {
        System.out.println("Essa live está sendo gravada.");
    }
}
