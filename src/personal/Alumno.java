package personal;

public class Alumno extends PersonalAragon {
    private final String matricula;
    private final String carrera;

    public Alumno(String nombre, String apellido, String matricula, String carrera) {
        super(nombre, apellido);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public void getInfo() {
        System.out.println("ALUMNO");
        super.getInfo();
        System.out.println("Matricula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println("-------------------------");
    }
}
