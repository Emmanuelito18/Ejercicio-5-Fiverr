package modeloDatos;

import java.time.LocalDate;

public class Receta extends Paciente{
    //Atributos
    String identificador;
    //Espacio para atributo heredado
    String medicamento;
    char formato;//p=pastilla i=inyectable s=supositorio
    String  psologia;
    LocalDate fechaReceta=LocalDate.now();//obtiene la fecha actual
    int numColegiado;
    int totalRecetas;
    
    //Métodos

    //Métodos cosntructores
    public Receta() {
    }

    public Receta(String identificador, String medicamento, char formato, String psologia, int numColegiado, int totalRecetas, String nif, String nombre, String apellidos, int telefono) {
        super(nif, nombre, apellidos, telefono);
        this.identificador = identificador;
        this.medicamento = medicamento;
        this.formato = formato;
        this.psologia = psologia;
        this.numColegiado = numColegiado;
        this.totalRecetas = totalRecetas;
    }
    
    //métodos getter y setters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public char getFormato() {
        return formato;
    }

    public void setFormato(char formato) {
        this.formato = formato;
    }

    public String getPsologia() {
        return psologia;
    }

    public void setPsologia(String psologia) {
        this.psologia = psologia;
    }

    public int getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(int numColegiado) {
        this.numColegiado = numColegiado;
    }

    public int getTotalRecetas() {
        return totalRecetas;
    }

    public void setTotalRecetas(int totalRecetas) {
        this.totalRecetas = totalRecetas;
    }
    
}
