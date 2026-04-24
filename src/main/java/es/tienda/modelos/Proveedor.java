package es.tienda.modelos;
public class Proveedor extends Persona {
    @Override
    public void mostrarDatos() {

    }

    public enum Tipo { SERVICIO, RECURSOS, FABRICANTE }
    private Tipo tipoProveedor;

    public Proveedor(String nombre, String apellido, String dni, Tipo tipo) {
        super(nombre, apellido, dni);
        this.tipoProveedor = tipo;
    }

    public void darAlta() {
        System.out.println("ALTA: El proveedor " + getNombre() + " (" + tipoProveedor + ") ya está en el sistema.");
    }

    public Tipo getTipoProveedor() { return tipoProveedor; }
    public void setTipoProveedor(Tipo tipoProveedor) { this.tipoProveedor = tipoProveedor; }
}