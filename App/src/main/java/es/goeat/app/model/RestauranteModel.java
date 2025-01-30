package main.java.es.goeat.app.model;
import java.util.Objects;

public class Restaurante extends UsuarioModel{
    Mesas mesas;
    int numeroCliente; 


    public Restaurante() {
    }

    public Restaurante(Mesas mesas, int numeroCliente) {
        this.mesas = mesas;
        this.numeroCliente = numeroCliente;
    }

    public Mesas getMesas() {
        return this.mesas;
    }

    public void setMesas(Mesas mesas) {
        this.mesas = mesas;
    }

    public int getNumeroCliente() {
        return this.numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Restaurante mesas(Mesas mesas) {
        setMesas(mesas);
        return this;
    }

    public Restaurante numeroCliente(int numeroCliente) {
        setNumeroCliente(numeroCliente);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Restaurante)) {
            return false;
        }
        Restaurante restaurante = (Restaurante) o;
        return numeroCliente == restaurante.numeroCliente;
    }

    @Override
    public String toString() {
        return "{" +
            " mesas='" + getMesas() + "'" +
            ", numeroCliente='" + getNumeroCliente() + "'" +
            "}";
    }
    
}
