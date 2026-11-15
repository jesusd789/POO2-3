package taller10.ejemplo2_polimorfismo;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejemplo 2: polimorfismo gracias a la sobrescritura ---");
        Empleado empleado = new Empleado();
        Empleado gerente = new Gerente(); // Referencia de la base, objeto de la derivada

        empleado.trabajar(); // El empleado está trabajando.
        gerente.trabajar();  // El gerente está gestionando el equipo. (enlace dinámico)
    }
}
