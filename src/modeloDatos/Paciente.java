package modeloDatos;

import java.time.LocalDate;

public class Paciente {
    //Atributos
    String nif;
    String nombre;
    String apellidos;
    int telefono;
    LocalDate fechaNacimiento;//Investigar el uso de esta variable
    
    //métodos
    
    //método constructor vacio
    public Paciente() {
    }
    
    //método constructor inicializado
    public Paciente(String nif, String nombre, String apellidos, int telefono) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    //falta método getter y setter para fechaNacimiento
    
    public String toString(){
        String cadena=null;
        return cadena;
    }
}
