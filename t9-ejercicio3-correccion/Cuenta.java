package taller9.ejercicio3_correccion;

public class Cuenta {
    private double saldo;            // privado: NO accesible con super.saldo desde la hija
    protected String titular;        // protected: accesible desde la hija

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {       // forma correcta de acceder a un atributo privado
        return saldo;
    }
}
