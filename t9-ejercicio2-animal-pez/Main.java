package taller9.ejercicio2_animal_pez;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 2: Animal y Pez ---");
        new Pez("Pez payaso", "salada").mostrarEspecie();
        System.out.println();
        new Pez("Trucha", "dulce").mostrarEspecie();
    }
}
