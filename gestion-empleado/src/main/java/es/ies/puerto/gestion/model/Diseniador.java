package es.ies.puerto.gestion.model;

public class Diseniador extends Empleado{
    @Override
    public Double calcularSalarioFinal(){
        return getSalarioBase() * 0.1;
    }
}
