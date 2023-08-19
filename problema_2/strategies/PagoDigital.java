package tarea_2.problema_2.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PagoDigital implements PagoStrategy{

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Digital digital;

    @Override
    public void detallesDePago() {
        try {
            System.out.print("Numero Digital: ");
            String number = reader.readLine();
            System.out.print("mm/yy: ");
            String date = reader.readLine();
            System.out.print("CVV: ");
            String cvv = reader.readLine();
            digital = new Digital(number, date, cvv);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pagar(int paymentAmount) {
        if ( digital != null) {
            System.out.println("Pagando " + paymentAmount + ".");
            return true;
        } else {
            return false;
        }
    }
}
