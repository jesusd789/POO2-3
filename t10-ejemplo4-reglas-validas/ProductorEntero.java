package taller10.ejemplo4_reglas_validas;

public class ProductorEntero extends Productor {
    // Regla 2: retorno COMPATIBLE (covariante): Integer es subtipo de Number
    // Regla 3: acceso MÁS amplio (public) que el de la base (protected) -> permitido
    @Override
    public Integer obtenerValor() {
        return 42;
    }
}
