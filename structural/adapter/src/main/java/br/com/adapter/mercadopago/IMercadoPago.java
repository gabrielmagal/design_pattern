package br.com.adapter.mercadopago;

import br.com.adapter.utils.Token;

public interface IMercadoPago {
    Token authToken();
    void pagar();
    void receber();
}
