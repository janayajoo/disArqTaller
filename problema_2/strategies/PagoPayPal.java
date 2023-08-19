package tarea_2.problema_2.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PagoPayPal implements PagoStrategy {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    @Override
    public void detallesDePago() {
        try {
            while (!signedIn) {
                System.out.print("Email: ");
                email = reader.readLine();
                System.out.print("Password: ");
                password = reader.readLine();
                if (verify()) {
                    System.out.println("Verificacion correcta.");
                } else {
                    System.out.println("Algunos ratos estan erroneos o faltando.");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        return email.contains("@");
    }

    @Override
    public boolean pagar(int paymentAmount) {
        if (paymentAmount > 0 && email != null && password != null) {
            System.out.println("Paga " + paymentAmount + ".");
            return true;
        } else {
            return false;
        }
    }
}
