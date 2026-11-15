// ERROR ESPERADO: tipo has private access in Base
class Base {
    private String tipo = "secreto";
}

public class Error2_AtributoPrivado extends Base {
    public void mostrar() {
        System.out.println(super.tipo); // Un atributo private no es visible en la hija, ni con super
    }
}
