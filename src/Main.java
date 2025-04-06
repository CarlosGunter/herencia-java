import personal.Alumno;
import personal.Exalumno;
import personal.Personal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Crear instancias de las clases que usan herencia
        var alumno = new Alumno(
                "Juan",
                "Pérez",
                "123456",
                "Ingeniería en Sistemas"
        );
        var exalumno = new Exalumno(
                "María",
                "Gómez",
                "654321",
                "Ingeniería en Sistemas",
                "2022-05-15"
        );
        var personal = new Personal(
                "Carlos",
                "López",
                "987654",
                "Recursos Humanos"
        );

        // Mostrar información de las instancias
        alumno.getInfo();
        exalumno.getInfo();
        personal.getInfo();
    }
}