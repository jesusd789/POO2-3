package taller10.ejemplo3_sobrecarga_vs_sobrescritura;

/** SOBRECARGA: mismo nombre, distinta firma, MISMA clase. Se resuelve en compilación. */
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
