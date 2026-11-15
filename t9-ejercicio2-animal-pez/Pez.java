package taller9.ejercicio2_animal_pez;

public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // super invoca el constructor de Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // super invoca el método de Animal
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
