// ERROR ESPERADO: method does not override or implement a method from a supertype
class Vehiculo {
    public void acelerar(int velocidad) {
        System.out.println("El vehículo acelera a " + velocidad + " km/h.");
    }
}

public class Error1_FirmaDiferente extends Vehiculo {
    @Override
    public void acelerar() { // distinta lista de parámetros: no es sobrescritura
        System.out.println("El coche acelera.");
    }
}
