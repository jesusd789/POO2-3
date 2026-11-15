package taller10.ejemplo_incorrecto_sin_error;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Uso incorrecto SIN error de compilación: omitir @Override ---");
        Animal gato = new Gato();
        Animal raton = new Raton();
        gato.hacerSonido();   // funciona: El gato maúlla.
        raton.hacerSonido();  // BUG silencioso: imprime el sonido genérico, no el del ratón
    }
}
