package personal;

public class Personal extends PersonalAragon {
    private final String noEmpleado;
    private final String departamento;

    public Personal(String nombre, String apellido, String noEmpleado, String departamento) {
        super(nombre, apellido);
        this.noEmpleado = noEmpleado;
        this.departamento = departamento;
    }

    public String getNoEmpleado() {
        return noEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void getInfo() {
        System.out.println("PERSONAL");
        super.getInfo();
        System.out.println("No. Empleado: " + noEmpleado);
        System.out.println("Departamento: " + departamento);
        System.out.println("-------------------------");
    }
}
