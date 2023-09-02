package br.com.adapter.payoneer;

import br.com.adapter.utils.Token;

public class PayOneer implements IPayOneerPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via payoneer");
    }
}
