package br.com.chainofresponsibility.middlewares;

import br.com.chainofresponsibility.server.Server;

public class CheckUserMiddleware extends Middleware {
    private Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)) {
            System.out.println("Email inválido.");
            return false;
        }
        if(!server.passwordIsValid(email, password)) {
            System.out.println("Email ou senha inválido.");
            return false;
        }
        return checkNext(email, password);
    }
}
