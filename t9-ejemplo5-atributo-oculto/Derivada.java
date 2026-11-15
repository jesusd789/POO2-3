package taller9.ejemplo5_atributo_oculto;

/** Declara un atributo con el mismo nombre: oculta (hides) el de Base. */
public class Derivada extends Base {
    protected String nombre = "nombre de Derivada";

    public void mostrar() {
        System.out.println("this.nombre  -> " + this.nombre);
        System.out.println("super.nombre -> " + super.nombre); // acceso explícito al atributo oculto
    }
}
