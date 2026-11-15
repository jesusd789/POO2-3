package taller9.ejemplo_incorrecto_sin_error;

/** Compila y funciona, pero es una MALA PRÁCTICA: la sobrescritura no aporta nada. */
public class Bicicleta extends Vehiculo {
    public Bicicleta() {
        super("bicicleta");
    }

    @Override
    public void mostrarTipo() {
        super.mostrarTipo(); // Uso innecesario: solo delega, el método no se especializa
    }
}
