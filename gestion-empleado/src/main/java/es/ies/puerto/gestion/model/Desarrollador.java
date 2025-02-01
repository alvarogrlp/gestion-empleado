package es.ies.puerto.gestion.model;

public class Desarrollador extends Empleado{
    @Override
    public Double calcularSalarioFinal(){
        return getSalarioBase() * 0.2;
    }
}