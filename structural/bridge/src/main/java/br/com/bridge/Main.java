package br.com.bridge;

import br.com.bridge.plataforms.*;
import br.com.bridge.transmission.AdvancedLive;
import br.com.bridge.transmission.Live;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/live")
public class Main {
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/youtube")
    public void bridgeYoutube() {
        startLive(new Youtube());
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/twitch")
    public void bridgeTwitch() {
        startLive(new Twitch());
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/facebook")
    public void bridgeFacebook() {
        startLive(new Facebook());
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/disneyplus")
    public void bridgeDisneyPlus() {
        startLive(new DisneyPlus());
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/todasplataformassimples")
    public void bridgeAllPlatforms() {
        startLive(new Youtube());
        startLive(new Twitch());
        startLive(new Facebook());
        startLive(new DisneyPlus());
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/todasplataformascompleta")
    public void bridgeAllPlatformsComplete() {
        startAdvancedLive(new Youtube());
        startAdvancedLive(new Twitch());
        startAdvancedLive(new Facebook());
        startAdvancedLive(new DisneyPlus());
    }

    public static void startLive (IPlatform iPlatform) {
        Live live = new Live(iPlatform);
        live.broadcasting();
        live.result();
    }

    public static void startAdvancedLive (IPlatform iPlatform) {
        AdvancedLive advancedLive = new AdvancedLive(iPlatform);
        advancedLive.broadcasting();
        advancedLive.recordLive();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }
}
