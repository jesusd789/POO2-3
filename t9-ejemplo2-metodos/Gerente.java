package taller9.ejemplo2_metodos;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, String departamento) {
        super(nombre);
        this.departamento = departamento;
    }

    @Override
    public void mostrarNombre() {
        super.mostrarNombre(); // Reutiliza el comportamiento de la clase base
        System.out.println("Departamento: " + departamento);
    }
}
