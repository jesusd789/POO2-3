// ERROR ESPERADO: valor() ... cannot override valor() in Contador; return type String is not compatible with int
class Contador {
    public int valor() { return 1; }
}

public class Error4_RetornoIncompatible extends Contador {
    @Override
    public String valor() { return "uno"; } // String no es compatible con int
}
