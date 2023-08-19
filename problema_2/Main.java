package tarea_2.problema_2;

import tarea_2.problema_2.orden.Orden;
import tarea_2.problema_2.strategies.PagoDigital;
import tarea_2.problema_2.strategies.PagoPayPal;
import tarea_2.problema_2.strategies.PagoStrategy;
import tarea_2.problema_2.strategies.PagoTarjetaCredito;
import tarea_2.problema_2.strategies.PagoTarjetaDebito;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Orden orden = new Orden();
    private static PagoStrategy strategy;

    public static void main(String[] args) throws IOException {
        int total;
        int totalPagar = 0;
        int prod;
        int count;
        String metodoPago;

        int precioElect = 100000;
        int precioRopa = 90000;
        int precioAlimentos = 500000;
        int precioLimpieza = 45000;
        int precioOtro = 30000;

        System.out.print(
            "Seleccione algun producto:" + "\n" +
            "1 - Electronicos" + "\n" +
            "2 - Ropa" + "\n" +
            "3 - Alimenticio" + "\n" +
            "4 - Limpieza" + "\n" +
            "5 - Otro" + "\n"
        );

        prod = Integer.parseInt(reader.readLine());

        System.out.print("Cantidad de dicho producto: ");
        count = Integer.parseInt(reader.readLine());

        if("1".equals(String.valueOf(prod))) { totalPagar = precioElect * count;}
        if("2".equals(String.valueOf(prod))) { totalPagar = precioRopa * count;}
        if("3".equals(String.valueOf(prod))) { totalPagar = precioAlimentos * count;}
        if("4".equals(String.valueOf(prod))) { totalPagar = precioLimpieza * count;}
        if("5".equals(String.valueOf(prod))) { totalPagar = precioOtro * count;}
        orden.setTotalCost(totalPagar);

        System.out.println(
            "Metodo de pago que se usara:" + "\n" +
            "1 - PalPay" + "\n" +
            "2 - Tarjeta Credito" + "\n" +
            "3 - Tarjeta Debito" + "\n" +
            "4 - Pago Digital"
        );

        metodoPago = reader.readLine();

        if ("1".equals(metodoPago)) { strategy = new PagoPayPal();} 
        if ("2".equals(metodoPago)) { strategy = new PagoTarjetaCredito();} 
        if ("3".equals(metodoPago)) { strategy = new PagoTarjetaDebito();} 
        else { strategy = new PagoDigital();}
        orden.procesarOrden(strategy);

        System.out.print("Paga un total de: " + orden.getTotalCost() + "\n");
        total = orden.getTotalCost();
        if (strategy.pagar(total)) {
            System.out.println("Pago exitoso.");
        } else {
            System.out.println("Fallo, verifique los datos.");
        }
    }
}
