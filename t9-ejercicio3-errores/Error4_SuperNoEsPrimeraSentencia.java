// ERROR ESPERADO: call to super must be first statement in constructor
class Vehiculo {
    protected String marca;
    public Vehiculo(String marca) { this.marca = marca; }
}

public class Error4_SuperNoEsPrimeraSentencia extends Vehiculo {
    public Error4_SuperNoEsPrimeraSentencia(String marca) {
        System.out.println("Creando objeto...");
        super(marca); // super(...) debe ser la primera sentencia del constructor
    }
}
