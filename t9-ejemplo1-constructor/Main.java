package taller9.ejemplo1_constructor;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejemplo 1: super para invocar el constructor de la clase base ---");
        Perro p = new Perro("Canis lupus familiaris", "Labrador");
        p.mostrar();
    }
}
