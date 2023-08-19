package pedido_En_Linea;

public abstract class Pasos_Generales {

    String producto;
    String iD;
    String celular;
    int cantidadSolicitada;
    int cantidadProductos;
    Pasos_Generales() {}

    public char informar(){
        System.out.println("Tu compra se realizo correctamente");
        return 0;
    }
    abstract boolean verificarInventario(int cantidadSolicitada, int cantidadProductos);

    abstract void facturacion(String iD);
    abstract void notificarCliente(String celular,String iD);
}
