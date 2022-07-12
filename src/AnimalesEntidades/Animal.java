/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesEntidades;

/**
 *
 * @author Bibi
 */
public class Animal {
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }
    //metodo alimentarse

    public void Alimentarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
