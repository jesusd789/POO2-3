package taller10.ejemplo3_sobrecarga_vs_sobrescritura;

/** SOBRESCRITURA: misma firma, clase DERIVADA. Se resuelve en ejecución. */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}
