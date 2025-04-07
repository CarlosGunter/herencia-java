package personal;

import interfaces.IPersonalAragon;

public class PersonalAragon implements IPersonalAragon {
    private final String nombre;
    private final String apellido;
    private static int cuenta = 0;

    public PersonalAragon(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        ++cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public static int getCuenta() {
        return cuenta;
    }

    public void getInfo() {
        String name = nombre + " " + apellido;
        System.out.println(getCuenta() + ": " + name);
    }
}
