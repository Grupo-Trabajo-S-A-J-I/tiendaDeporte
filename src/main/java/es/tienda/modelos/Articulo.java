package es.tienda.modelos;

public class Articulo {
    private String codigo;
    private String descripcion;
    private double precio;

    public Articulo(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void darAlta() {
        System.out.println("ARTÍCULO: " + descripcion + " guardado con código " + codigo);
    }

    public void visualizarDatos() {
        System.out.println("DATOS -> Código: " + codigo + " | Desc: " + descripcion + " | Precio: " + precio + "€");
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
}