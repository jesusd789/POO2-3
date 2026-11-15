package taller9.ejemplo4_animal_gato;

public class Gato extends Animal {
    private String color;

    public Gato(String especie, String color) {
        super(especie); // Constructor de la clase base
        this.color = color;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // Método de la clase base
        System.out.println("Color: " + color);
    }
}
