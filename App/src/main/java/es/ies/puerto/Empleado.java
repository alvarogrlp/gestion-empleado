public abstract class Empleado {
    String nombre;
    Int edad;
    Double salarioBase;


    public Empleado() {
    }

    public Empleado(String nombre, Int edad, Double salarioBase) {
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

    public Int getEdad() {
        return this.edad;
    }

    public void setEdad(Int edad) {
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

    public Empleado edad(Int edad) {
        setEdad(edad);
        return this;
    }

    public Empleado salarioBase(Double salarioBase) {
        setSalarioBase(salarioBase);
        return this;
    }

    public Double calcularSalarioBase(){

    }

    public String mostrarInformacion(){

    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre) && Objects.equals(edad, empleado.edad) && Objects.equals(salarioBase, empleado.salarioBase);
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
