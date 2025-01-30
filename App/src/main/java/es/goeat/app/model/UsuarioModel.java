package main.java.es.goeat.app.model;
import java.util.Objects;

public class UsuarioModel {
    String nombre;
    String password;
    String dni;
    String email;

    public UsuarioModel() {
    }

    public UsuarioModel(String nombre, String password, String dni, String email) {
        this.nombre = nombre;
        this.password = password;
        this.dni = dni;
        this.email = email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UsuarioModel nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public UsuarioModel password(String password) {
        setPassword(password);
        return this;
    }

    public UsuarioModel dni(String dni) {
        setDni(dni);
        return this;
    }

    public UsuarioModel email(String email) {
        setEmail(email);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UsuarioModel)) {
            return false;
        }
        UsuarioModel usuarioModel = (UsuarioModel) o;
        return Objects.equals(dni, usuarioModel.dni);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", password='" + getPassword() + "'" +
            ", dni='" + getDni() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
    
}
