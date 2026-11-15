package taller10.ejercicio2_vehiculo_bicicleta;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 2: Vehiculo y Bicicleta ---");
        Vehiculo v = new Vehiculo();
        Vehiculo b = new Bicicleta(); // polimorfismo
        v.moverse();
        b.moverse();
    }
}
