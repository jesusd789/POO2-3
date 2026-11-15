package taller9.ejemplo1_constructor;

/** Clase derivada: usa super(...) para inicializar la parte heredada. */
public class Perro extends Animal {
    private String raza;

    public Perro(String especie, String raza) {
        super(especie); // Llama al constructor de la clase base (debe ser la 1.ª sentencia)
        this.raza = raza;
    }

    public void mostrar() {
        System.out.println("Especie: " + especie + " | Raza: " + raza);
    }
}
