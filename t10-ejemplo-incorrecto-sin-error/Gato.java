package taller10.ejemplo_incorrecto_sin_error;

/** Sobrescribe SIN @Override: compila, pero es mala práctica. */
public class Gato extends Animal {
    public void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}
