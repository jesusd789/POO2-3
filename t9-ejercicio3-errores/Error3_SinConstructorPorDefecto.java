// ERROR ESPERADO: constructor Persona in class Persona cannot be applied to given types
class Persona {
    protected String nombre;
    public Persona(String nombre) { this.nombre = nombre; } // no existe Persona()
}

public class Error3_SinConstructorPorDefecto extends Persona {
    public Error3_SinConstructorPorDefecto() {
        // Java inserta super() implícito, pero Persona no tiene constructor sin parámetros
    }
}
