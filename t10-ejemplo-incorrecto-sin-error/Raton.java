package taller10.ejemplo_incorrecto_sin_error;

/**
 * Peligro real de omitir @Override: un error de escritura (hacerSonidos)
 * NO sobrescribe nada, crea un método nuevo y el compilador no avisa.
 * Con @Override el compilador habría marcado el error.
 */
public class Raton extends Animal {
    public void hacerSonidos() {   // typo: debía ser hacerSonido()
        System.out.println("El ratón chilla.");
    }
}
