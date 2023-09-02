package br.com.adapter;

import br.com.adapter.adapters.MercadoPagoAdapter;
import br.com.adapter.adapters.PayoneerAdapter;
import br.com.adapter.mercadopago.IMercadoPago;
import br.com.adapter.mercadopago.MercadoPago;
import br.com.adapter.payoneer.IPayOneerPayments;
import br.com.adapter.payoneer.PayOneer;
import br.com.adapter.paypal.IPayPalPayments;
import br.com.adapter.paypal.PayPal;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/payment")
public class Main {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/paypal")
    public void adapterPaypal() {
        IPayPalPayments iPayPalPayments = new PayPal();
        iPayPalPayments.paypalPayments();
        iPayPalPayments.paypalReceive();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/payoneer")
    public void adapterPayoneer() {
        IPayOneerPayments iPayOneerPayments = new PayOneer();
        iPayOneerPayments.sendPayment();
        iPayOneerPayments.receivePayment();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/mercadopago")
    public void adapterMercadoPago() {
        IMercadoPago iMercadoPago = new MercadoPago();
        iMercadoPago.pagar();
        iMercadoPago.receber();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/payoneeradapter")
    public void adapterPayoneerPaypal() {
        IPayPalPayments iPayPalPayments = new PayoneerAdapter(new PayOneer());
        iPayPalPayments.paypalReceive();
        iPayPalPayments.paypalReceive();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/paypaladapter")
    public void adapterMercadoPagoPaypal() {
        IPayPalPayments iPayPalPayments = new MercadoPagoAdapter(new MercadoPago());
        iPayPalPayments.paypalReceive();
        iPayPalPayments.paypalReceive();
    }
}
