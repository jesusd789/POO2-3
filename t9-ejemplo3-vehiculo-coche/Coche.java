package taller9.ejemplo3_vehiculo_coche;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, int numeroDePuertas) {
        super(marca); // Llama al constructor de la clase base
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrar() {
        System.out.println("Marca: " + marca + " | Puertas: " + numeroDePuertas);
    }
}
