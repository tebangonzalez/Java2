
public class Principal {

    public static void main(String[] args) {

        Persona p1 = new Persona("Maria", 12, "F", "Jocotitlan");
        Estudiante e1 = new Estudiante("Juan", 17, "M", "Atlacomulco", "1256", "Paradigmas programación", "10");

        e1.mostrarInfo();
        e1.verCalificacion();
        e1.verCurso();
        p1.mostrarInfo();
    }
}
