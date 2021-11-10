package Modelos;

public class Apuesta {
    private String TApuesta;
    private Apostador Apostador;
    private EventoDeportivo EventoDeportivo;
    private Integer TipoApuesta;
    private String Resultado;
    private Integer MarcadorLocal;
    private Integer MarcadorVisita;

    public String getApuesta() {
        return Apuesta;
    }

   public String getTApuesta() {
        return TApuesta;
    }
    public void setTApuesta(String TApuesta) {
        this.TApuesta = TApuesta;
    }

    public Integer getTipoApuesta() {
        return TipoApuesta;
    }
    public void setTipoApuesta(Integer TipoApuesta) {
        this.TipoApuesta = TipoApuesta;
    }
    public String getResultado() {
        return Resultado;
    }
    public void setResultado(String resultado) {
        this.Resultado = resultado;
    }
    public Equipo getMarcadorLocal() {
        return MarcadorLocal;
    }
    public void setMarcadorLocal(Equipo MarcadorLocal) {
        this.MarcadorLocal = MarcadorLocal;
    }
    public Equipo getMarcadorVisita() {
        return MarcadorVisita;
    }
    public void setMarcadorVisita(Equipo MarcadorVisita) {
        this.MarcadorVisita = MarcadorVisita;
    }
   


}