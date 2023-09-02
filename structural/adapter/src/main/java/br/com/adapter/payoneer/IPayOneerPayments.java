package br.com.adapter.payoneer;

import br.com.adapter.utils.Token;

public interface IPayOneerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
