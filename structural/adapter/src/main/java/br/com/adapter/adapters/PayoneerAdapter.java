package br.com.adapter.adapters;

import br.com.adapter.payoneer.PayOneer;
import br.com.adapter.paypal.IPayPalPayments;
import br.com.adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {
    private Token token;
    private PayOneer payOneer;

    public PayoneerAdapter(PayOneer payOneer) {
        this.payOneer = payOneer;
        System.out.println("Adaptando o Payoneer usando os métodos padrões do paypal.");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayments() {
        payOneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        payOneer.receivePayment();
    }
}
