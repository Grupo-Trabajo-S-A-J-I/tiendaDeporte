package es.tienda.modelos;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Proveedor> proveedores = new ArrayList<>();

        System.out.println("--- FORMULARIO COMPLETO (EXAMEN) ---");

        // Datos del Cliente
        System.out.println("\n> Datos del Cliente:");
        System.out.print("Nombre: "); String nomC = sc.nextLine();
        System.out.print("Apellido: "); String apeC = sc.nextLine();
        System.out.print("DNI: "); String dniC = sc.nextLine();
        clientes.add(new Cliente(nomC, apeC, dniC, Cliente.Tipo.NUEVO));

        // Datos del Proveedor (Si sigue en rojo, es que el archivo Proveedor.java no está)
        System.out.println("\n> Datos del Proveedor:");
        System.out.print("Empresa: "); String nomP = sc.nextLine();
        System.out.print("Responsable: "); String apeP = sc.nextLine();
        System.out.print("CIF/DNI: "); String dniP = sc.nextLine();
        proveedores.add(new Proveedor(nomP, apeP, dniP, null));

        System.out.println("\n\n========================================");
        System.out.println("      INFORME FINAL DE LA TIENDA");
        System.out.println("========================================");

        for (Cliente c : clientes) {
            c.mostrarDatos();
        }

        for (Proveedor p : proveedores) {
            // Usamos mostrarDatos si la clase Proveedor lo tiene
            p.mostrarDatos();
        }

        System.out.println("\n*** PROCESO FINALIZADO ***");
        sc.close();
    }
}