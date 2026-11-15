// ERROR ESPERADO: attempting to assign weaker access privileges; was public
class Animal {
    public void hacerSonido() { System.out.println("Sonido"); }
}

public class Error2_AccesoMasRestrictivo extends Animal {
    @Override
    protected void hacerSonido() { // protected es más restrictivo que public
        System.out.println("Ladra");
    }
}
