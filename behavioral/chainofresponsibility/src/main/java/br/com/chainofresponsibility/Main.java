package br.com.chainofresponsibility;

import br.com.chainofresponsibility.middlewares.CheckPermissionMiddleware;
import br.com.chainofresponsibility.middlewares.CheckUserMiddleware;
import br.com.chainofresponsibility.middlewares.Middleware;
import br.com.chainofresponsibility.server.Server;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/authenticate")
public class Main {
    private static Server server;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("login")
    public void factoryMethodSedanCar() {
        server = new Server();
        server.registerUser("GabrielAlmeida", "ashyershywetvergdfh");
        server.registerUser("usuario", "123");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);

        server.Login("GabrielMagal", "ashyershywetvergdfh");
    }
}
