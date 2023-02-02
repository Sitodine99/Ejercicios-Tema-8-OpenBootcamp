import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona ();
        persona.setEdad(36);
        persona.setNombre("Josito");
        persona.setTeléfono(665376263);
        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        int teléfono = persona.getTeléfono();
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTeléfono());
    }
}

class Persona {
    private int edad;
    private String nombre;

    private int teléfono;
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }
    public int getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getTeléfono() {
        return this.teléfono;
    }
}