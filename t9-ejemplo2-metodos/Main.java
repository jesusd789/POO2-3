package taller9.ejemplo2_metodos;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejemplo 2: super.metodo() para reutilizar un método sobrescrito ---");
        Empleado e = new Empleado("Ana");
        Gerente g = new Gerente("Carlos", "Ventas");
        e.mostrarNombre();
        System.out.println();
        g.mostrarNombre();
    }
}
