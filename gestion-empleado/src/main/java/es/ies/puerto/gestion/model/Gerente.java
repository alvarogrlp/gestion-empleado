package es.ies.puerto.gestion.model;

public class Gerente extends Empleado{
    @Override
    public Double calcularSalarioFinal(){
        return getSalarioBase() * 0.3;
    }
}
