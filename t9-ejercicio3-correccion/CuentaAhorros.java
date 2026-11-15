package taller9.ejercicio3_correccion;

public class CuentaAhorros extends Cuenta {
    public CuentaAhorros(String titular, double saldo) {
        super(titular, saldo);
    }

    public void mostrar() {
        System.out.println("Titular (protected, super.titular): " + super.titular);
        // System.out.println(super.saldo);   // ERROR: saldo has private access in Cuenta
        System.out.println("Saldo (vía getter, super.getSaldo()): " + super.getSaldo());
    }
}
