package es.ies.puerto.gestion.model;
import java.util.Objects;

public class Empleado {
    String nombre;
    int edad;
    Double salarioBase;


    public Empleado() {
    }

    public Empleado(String nombre, int edad, Double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Empleado nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Empleado edad(int edad) {
        setEdad(edad);
        return this;
    }

    public Empleado salarioBase(Double salarioBase) {
        setSalarioBase(salarioBase);
        return this;
    }
    
    public Double calcularSalarioBase(){
        return 0.1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre) && edad == empleado.edad && Objects.equals(salarioBase, empleado.salarioBase);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", salarioBase='" + getSalarioBase() + "'" +
            "}";
    }
    
}
