package taller10.ejemplo2_polimorfismo;

public class Gerente extends Empleado {
    @Override
    public void trabajar() {
        System.out.println("El gerente está gestionando el equipo.");
    }
}
