package tarea_2.problema_2.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PagoTarjetaCredito implements PagoStrategy {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private TarjetaCredito card;

    @Override
    public void detallesDePago() {
        try {
            System.out.print("Numero Tarjeta: ");
            String number = reader.readLine();
            System.out.print("mm/yy: ");
            String date = reader.readLine();
            System.out.print("CVV: ");
            String cvv = reader.readLine();
            card = new TarjetaCredito(number, date, cvv);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pagar(int paymentAmount) {
        if (paymentAmount > 0 && card !=null) {
            System.out.println("Paga " + paymentAmount + ".");
            return true;
        } else {
            return false;
        }
    }
}