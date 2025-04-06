package personal;

public class Exalumno extends PersonalAragon {
    private final String matricula;
    private final String carrera;
    private final String fechaEgreso;

    public Exalumno(String nombre, String apellido, String matricula, String carrera, String fechaEgreso) {
        super(nombre, apellido);
        this.matricula = matricula;
        this.carrera = carrera;
        this.fechaEgreso = fechaEgreso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    @Override
    public void getInfo() {
        System.out.println("EXALUMNO");
        super.getInfo();
        System.out.println("Matricula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println("Fecha de Egreso: " + fechaEgreso);
        System.out.println("-------------------------");
    }
}
