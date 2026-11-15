package taller10.ejemplo4_reglas_validas;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejemplo 4: reglas válidas (retorno covariante y acceso más amplio) ---");
        Productor p = new ProductorEntero();
        System.out.println("Valor: " + p.obtenerValor());
    }
}
