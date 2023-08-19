package pedido_En_Linea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TiendaVirtual {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pasos_Generales pasosGenerales = null;
        System.out.println("Ingresa tu ID");
        String iD = reader.readLine();
        System.out.println("Ingresa tu numero telefonico");
        String celular = reader.readLine();

        System.out.println("\nEscoge que deseas comprar el dia de hoy.\n" +
                "1 - Televisores\n" +
                "2 - Blusas\n"+
                "3 - Bananas\n");
        int eleccion = Integer.parseInt(reader.readLine());
        switch (eleccion){
            case 1:
                pasosGenerales = new Electronicos(iD, celular);
                ((Electronicos) pasosGenerales).televisor(11, 10); // Puedes ajustar la cantidad solicitada y la cantidad de productos
                pasosGenerales.facturacion(iD);
                pasosGenerales.notificarCliente(celular, iD);
                break;
            case 2:
                pasosGenerales = new Ropa(iD, celular);
                ((Ropa) pasosGenerales).blusa(1, 10); // Puedes ajustar la cantidad solicitada y la cantidad de productos
                pasosGenerales.facturacion(iD);
                pasosGenerales.notificarCliente(celular, iD);
                break;
            case 3:
                pasosGenerales = new Productos_Alimenticios(iD, celular);
                ((Productos_Alimenticios) pasosGenerales).banana(1, 10); // Puedes ajustar la cantidad solicitada y la cantidad de productos
                pasosGenerales.facturacion(iD);
                pasosGenerales.notificarCliente(celular, iD);
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
