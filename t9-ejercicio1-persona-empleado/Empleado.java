package taller9.ejercicio1_persona_empleado;

public class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Reutiliza nombre y edad
        System.out.println("Departamento: " + departamento);
    }
}
