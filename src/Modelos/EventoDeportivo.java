package Modelos;

public class EventoDeportivo {
    private String CodigoEvento;
    private String Fecha;
    private String EquipoLocal;
    private String EquipoVisita;
    private String Resultado;
    private Integer MarcadorEquipoLocal;
    private Integer MarcadorEquipoVisitante;

    public String getCodigoEvento() {
        return CodigoEvento;
    }
    public Integer getMarcadorEquipoVisitante() {
        return MarcadorEquipoVisitante;
    }
    public void setMarcadorEquipoVisitante(Integer marcadorEquipoVisitante) {
        this.MarcadorEquipoVisitante = marcadorEquipoVisitante;
    }
    public Integer getMarcadorEquipoLocal() {
        return MarcadorEquipoLocal;
    }
    public void setMarcadorEquipoLocal(Integer marcadorEquipoLocal) {
        this.MarcadorEquipoLocal = marcadorEquipoLocal;
    }
    public String getResultado() {
        return Resultado;
    }
    public void setResultado(String resultado) {
        this.Resultado = resultado;
    }
    public String getEquipoVisita() {
        return EquipoVisita;
    }
    public void setEquipoVisita(String equipoVisita) {
        this.EquipoVisita = equipoVisita;
    }
    public String getEquipoLocal() {
        return EquipoLocal;
    }
    public void setEquipoLocal(String equipoLocal) {
        this.EquipoLocal = equipoLocal;
    }
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }
    public void setCodigoEvento(String codigoEvento) {
        this.CodigoEvento = codigoEvento;
    } 

    public void CalcularResultado(){
        this.MarcadorEquipoLocal = (int)(Math.random()*10+1);
        this.MarcadorEquipoVisitante = (int)(Math.random()*10+1);

        if(this.MarcadorEquipoLocal > this.MarcadorEquipoVisitante ){
            this.Resultado = this.EquipoLocal;
        }else if(this.MarcadorEquipoLocal < this.MarcadorEquipoVisitante ){
            this.Resultado = this.EquipoVisita;
        }else{
            this.Resultado = "Empate";
        }
    }
}
