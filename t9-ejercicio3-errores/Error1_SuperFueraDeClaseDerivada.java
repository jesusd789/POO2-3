// ERROR ESPERADO: non-static variable super cannot be referenced from a static context
class Planta {
    private String tipo;
    public Planta(String tipo) { this.tipo = tipo; }
}

public class Error1_SuperFueraDeClaseDerivada {
    public static void main(String[] args) {
        super.tipo = "Orquídea"; // super solo existe dentro de una clase derivada (y de instancia)
    }
}
