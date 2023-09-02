package br.com.chainofresponsibility.middlewares;

public class CheckPermissionMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if(email.equals("GabrielAlmeida")) {
            System.out.println("Seja bem vindo administrador.");
            return true;
        }
        System.out.println("Seja bem vindo");
        return checkNext(email, password);
    }
}
