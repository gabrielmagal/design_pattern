package br.com.adapter.adapters;

import br.com.adapter.mercadopago.MercadoPago;
import br.com.adapter.paypal.IPayPalPayments;
import br.com.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {

    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando PayPal para mercado pago.");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayments() {
        mercadoPago.pagar();
    }

    @Override
    public void paypalReceive() {
        mercadoPago.receber();
    }
}
