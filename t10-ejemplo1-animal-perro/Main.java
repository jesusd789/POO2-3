package taller10.ejemplo1_animal_perro;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejemplo 1: sobrescritura básica ---");
        new Animal().hacerSonido();
        new Perro().hacerSonido();
    }
}
