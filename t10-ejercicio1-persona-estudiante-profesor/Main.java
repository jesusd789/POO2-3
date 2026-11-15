package taller10.ejercicio1_persona_estudiante_profesor;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 1: Persona, Estudiante y Profesor ---");
        Persona p = new Persona();
        Estudiante e = new Estudiante();
        Profesor pr = new Profesor();
        p.presentarse();
        e.presentarse();
        pr.presentarse();

        System.out.println("\n-- Polimorfismo: arreglo de tipo Persona --");
        Persona[] personas = { new Persona(), new Estudiante(), new Profesor() };
        for (Persona x : personas) {
            x.presentarse(); // el método ejecutado depende del objeto real
        }
    }
}
