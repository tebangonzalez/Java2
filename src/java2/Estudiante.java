public class Estudiante extends Persona {
    String NoCuenta;
    String curso;
    String calificacion;

    public Estudiante(String nombre, int edad, String sexo, String direccion, String NoCuenta, String curso, String calificacion) {
        super(nombre, edad, sexo, direccion);
        this.NoCuenta = NoCuenta;
        this.curso = curso;
        this.calificacion = calificacion;

    }
    public void verCalificacion(){
        System.out.println("La calificacion es :"+calificacion);
    }
    public void verCurso(){
        System.out.println("El curso es :"+curso);
    }
}
