package co.edu.uniquindio;

public class Recaudador extends Persona{
    private double salario;
    public Recaudador(String nombre,String apellido,String id,
                      String fechaNacimineot,double salario) {
        super(nombre,apellido,id,fechaNacimineot);
        this.salario=salario;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String nombreCompleto(){
        return nombre+" "+apellido;
    }
}
