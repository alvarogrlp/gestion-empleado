package main.java.es.goeat.app.model;
import java.util.Objects;

public class Mesas {
    int numeroMesa;
    int numeroAforo;


    public Mesas() {
    }

    public Mesas(int numeroMesa, int numeroAforo) {
        this.numeroMesa = numeroMesa;
        this.numeroAforo = numeroAforo;
    }

    public int getNumeroMesa() {
        return this.numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroAforo() {
        return this.numeroAforo;
    }

    public void setNumeroAforo(int numeroAforo) {
        this.numeroAforo = numeroAforo;
    }

    public Mesas numeroMesa(int numeroMesa) {
        setNumeroMesa(numeroMesa);
        return this;
    }

    public Mesas numeroAforo(int numeroAforo) {
        setNumeroAforo(numeroAforo);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mesas)) {
            return false;
        }
        Mesas mesas = (Mesas) o;
        return numeroMesa == mesas.numeroMesa;
    }

    @Override
    public String toString() {
        return "{" +
            " numeroMesa='" + getNumeroMesa() + "'" +
            ", numeroAforo='" + getNumeroAforo() + "'" +
            "}";
    }
    
}
