package Modelos;

public class EventoDeportivo {
    private String CodigoEvento;
    private String Fecha;
    private Equipo EquipoLocal;
    private Equipo EquipoVisita;
    private String Resultado;
    private Integer MarcadorEquipoLocal;
    private Integer MarcadorEquipoVisitante;

    public EventoDeportivo(){}

    public EventoDeportivo(String CodigoEvento, Equipo EquipoLocal, Equipo EquipoVisita ,String fecha){
        this.CodigoEvento = CodigoEvento;
        this.EquipoLocal = EquipoLocal;
        this.EquipoVisita = EquipoVisita;
        this.Fecha = fecha;
    }

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
    public Equipo getEquipoVisita() {
        return EquipoVisita;
    }
    public void setEquipoVisita(Equipo equipoVisita) {
        this.EquipoVisita = equipoVisita;
    }
    public Equipo getEquipoLocal() {
        return EquipoLocal;
    }
    public void setEquipoLocal(Equipo equipoLocal) {
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
        //this.MarcadorEquipoLocal = (int)(Math.random()*4+1);
        //this.MarcadorEquipoVisitante = (int)(Math.random()*4+1);

        this.MarcadorEquipoLocal = 4;
        this.MarcadorEquipoVisitante = 2;

        if(this.MarcadorEquipoLocal > this.MarcadorEquipoVisitante ){
            this.Resultado = "LOCAL";
        }else if(this.MarcadorEquipoLocal < this.MarcadorEquipoVisitante ){
            this.Resultado = "VISITANTE";
        }else{
            this.Resultado = "EMPATE";
        }
    }

    public void mostrarResultado(){
        System.out.println( "Fecha: "+ this.Fecha);
        System.out.println( "EquipoLocal: "+ this.EquipoLocal.getNombreEquipo());
        System.out.println( "EquipoVisitante: "+ this.EquipoVisita.getNombreEquipo());
        System.out.println( "Resultado: "+ this.Resultado);
        System.out.println( "MarcadorLocal: "+ this.MarcadorEquipoLocal);
        System.out.println( "MarcadorVisitante: "+ this.MarcadorEquipoVisitante);

    }
}
