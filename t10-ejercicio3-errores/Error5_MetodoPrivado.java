// ERROR ESPERADO: method does not override or implement a method from a supertype
// (un método private no se hereda, por lo tanto no puede sobrescribirse)
class Base {
    private void secreto() { System.out.println("Base"); }
}

public class Error5_MetodoPrivado extends Base {
    @Override
    private void secreto() { System.out.println("Derivada"); }
}
