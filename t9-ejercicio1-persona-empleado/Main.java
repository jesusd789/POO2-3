package taller9.ejercicio1_persona_empleado;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 1: Persona y Empleado ---");
        Persona p = new Persona("Laura", 30);
        Empleado e = new Empleado("Jesús", 22, "Sistemas");
        p.mostrarDetalles();
        System.out.println();
        e.mostrarDetalles();
    }
}
