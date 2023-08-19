package pedido_En_Linea;

public class Electronicos extends Pasos_Generales{

    public Electronicos(String iD, String celular) {
        this.iD = iD;
        this.celular = celular;
    }

    public void televisor(int cantidadSolicitada, int cantidadProductos) {
        if (verificarInventario(cantidadSolicitada, cantidadProductos)) {
            System.out.println("Se ha agregado el televisor al pedido.");
        } else {
            System.out.println("No hay suficientes televisores disponibles en el inventario.");
        }
    }
    @Override
    boolean verificarInventario(int cantidadSolicitada, int cantidadProductos) {
        return cantidadProductos >= cantidadSolicitada;
    }

    @Override
    void facturacion(String iD) {
        System.out.println("Se facturara la compra a este ID: " + this.iD);
        simulateNetworkLatency();
    }

    @Override
    void notificarCliente(String celular,String iD) {
        System.out.println("\n Usuario con ID: "+ this.iD + ", a continuacion se mandara a su Whatsapp su factura");
        simulateNetworkLatency();
        System.out.println("\n Listo, todo correcto");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
