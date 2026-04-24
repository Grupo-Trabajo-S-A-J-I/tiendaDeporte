package es.tienda.modelos;

public class Cliente extends Persona {
    @Override
    public void mostrarDatos() {

    }

    public enum Tipo { POTENCIAL, NUEVO, VIP, MOROSO }
    private Tipo tipoCliente;

    public Cliente(String nombre, String apellido, String dni, Tipo tipo) {
        super(nombre, apellido, dni);
        this.tipoCliente = tipo;
    }

    public void darAlta() {
        System.out.println("ALTA: El cliente " + getNombre() + " ha sido registrado como " + tipoCliente);
    }

    // Getters y Setters (obligatorios para la refactorización)
    public Tipo getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(Tipo tipoCliente) { this.tipoCliente = tipoCliente; }
}