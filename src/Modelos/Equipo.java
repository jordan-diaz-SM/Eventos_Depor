package Modelos;

public class Equipo {
    private String codigoEquipo;
    private String nombreEquipo;

    public Equipo() {}

    public Equipo(String codigoEquipo , String nombreEquipo) {
        this.codigoEquipo = codigoEquipo;
        this.nombreEquipo = nombreEquipo;
    }

    public String getCodigoEquipo() {
        return codigoEquipo;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }
    
}
