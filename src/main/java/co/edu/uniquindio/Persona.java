package co.edu.uniquindio;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String id;
    protected String fechaNacimiento;

    public Persona(String nombre, String apellido, String id, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}