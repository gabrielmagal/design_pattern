package br.com.adapter.mercadopago;

import br.com.adapter.utils.Token;

public class MercadoPago implements IMercadoPago {
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento com mercado pago.");
    }

    @Override
    public void receber() {
        System.out.println("Recebendo pelo mercado pago.");
    }
}
