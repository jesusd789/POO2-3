// ERROR ESPERADO: hacerSonido() in ... cannot override hacerSonido() in Animal; overridden method is final
class Animal {
    public final void hacerSonido() { System.out.println("Sonido"); }
}

public class Error3_MetodoFinal extends Animal {
    @Override
    public void hacerSonido() { System.out.println("Ladra"); }
}
