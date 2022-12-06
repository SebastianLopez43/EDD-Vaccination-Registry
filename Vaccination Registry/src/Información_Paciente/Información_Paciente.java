package Información_Paciente;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 * Andrés Sáenz Olivas
 */

public class Información_Paciente {
    
    // Variables globales
    private String nombre, vacuna, fecha, edad, peso, estatura, tipoSangre;

    public Información_Paciente() {
    }

    public Información_Paciente(String nombre, String vacuna, String fecha, String edad, 
             String peso, String estatura, String tipoSangre) {
        this.nombre = nombre;
        this.vacuna = vacuna;
        this.fecha = fecha;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.tipoSangre = tipoSangre;
    }         

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVacuna() {
        return vacuna;
    }
    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEstatura() {
        return estatura;
    }
    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }      
}