package taller10.ejemplo3_sobrecarga_vs_sobrescritura;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejemplo 3: sobrecarga vs sobrescritura ---");
        Calculadora c = new Calculadora();
        System.out.println("Sobrecarga sumar(int,int)        = " + c.sumar(2, 3));
        System.out.println("Sobrecarga sumar(double,double)  = " + c.sumar(2.5, 3.5));
        System.out.println("Sobrecarga sumar(int,int,int)    = " + c.sumar(1, 2, 3));

        Figura f = new Circulo(2);
        System.out.printf("Sobrescritura area() de Circulo  = %.2f%n", f.area());
    }
}
