package Paciente;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 * Andrés Sáenz Olivas
 */

public class Paciente { 
    
    // Variables globales
    private String nombre, apellido, curp, edad, genero, calle, numCalle, colonia, codPost, municipio;
    
    public Paciente() {        
    }

    public Paciente(String nombre, String apellido, String curp, String edad, String genero, String calle, String numCalle, 
            String colonia, String codPost, String municipio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = curp;
        this.edad = edad;
        this.genero = genero;
        this.calle = calle;
        this.numCalle = numCalle;
        this.colonia = colonia;
        this.codPost = codPost;
        this.municipio = municipio;        
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

    public String getCurp() {
        return curp;
    }
    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    } 

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumCalle() {
        return numCalle;
    }
    public void setNumCalle(String numCalle) {
        this.numCalle = numCalle;
    }

    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodPost() {
        return codPost;
    }
    public void setCodPost(String codPost) {
        this.codPost = codPost;
    }

    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }          
}