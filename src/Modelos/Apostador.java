package Modelos;

public class Apostador {
    private String dni;
    private String NombresApellidos;

    public Apostador (){}

    public Apostador (String dni, String NombresApellidos){
        this.dni = dni;
        this.NombresApellidos = NombresApellidos;
    }

    public String getdni() {
        return dni;
    }
    public String getNombresApellidos() {
        return NombresApellidos;
    }
    public void setNombresApellidos(String NombresApellidos) {
        this.NombresApellidos = NombresApellidos;
    }
    public void setdni(String dni) {
        this.dni = dni;
    }
}
