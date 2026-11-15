package taller9.ejemplo_incorrecto_sin_error;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Uso incorrecto SIN error de compilación: super innecesario ---");
        new Bicicleta().mostrarTipo(); // Mismo resultado que sin sobrescribir: código redundante
    }
}
