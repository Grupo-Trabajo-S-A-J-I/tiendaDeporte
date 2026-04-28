package es.tienda.modelos;

public class Cliente extends Persona {

    // El enum debe ir dentro de la clase o en su propio archivo
    public enum Tipo { POTENCIAL, NUEVO, VIP, MOROSO }

    private Tipo tipoCliente;

    // Constructor
    public Cliente(String nombre, String apellido, String dni, Tipo tipo) {
        super(nombre, apellido, dni);
        this.tipoCliente = tipo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("========================================");
        System.out.println("          FICHA DE CLIENTE");
        System.out.println("========================================");
        System.out.println("Nombre completo: " + getNombre() + " " + getApellidos());
        System.out.println("DNI:             " + getDni());

        // Verificamos si el tipo es null
        if (this.tipoCliente != null) {
            System.out.println("Categoría:      " + this.tipoCliente);
        } else {
            System.out.println("Categoría:      CLIENTE ESTÁNDAR");
        }
        System.out.println("========================================\n");
    }

    public void darAlta() {
        System.out.println("ALTA: El cliente " + getNombre() + " ha sido registrado como " + tipoCliente);
    }

    // Getters y Setters
    public Tipo getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Tipo tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}