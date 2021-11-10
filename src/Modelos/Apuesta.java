package Modelos;

public class Apuesta {
    private String codigoApuesta;
    private Apostador Apostador;
    private EventoDeportivo EventoDeportivo;
    private String TipoApuesta; // PorResultado , IncluyeMarcador
    private String Prediccion ; // VISITANTE,LOCAL,EMPATE
    private Integer MarcadorLocal;
    private Integer MarcadorVisita;
    private Float ValorApuesta;
    
    static Float Bonificacion = (float) 0.2;

    public Apuesta(){}

    public Apuesta(String codigoApuesta,Apostador Apostador, EventoDeportivo EventoDeportivo, String TipoApuesta,Float ValorApuesta,String Prediccion,Integer MarcadorLocal,Integer MarcadorVisita){
        this.codigoApuesta = codigoApuesta;
        this.Apostador = Apostador;
        this.EventoDeportivo = EventoDeportivo;
        this.ValorApuesta = ValorApuesta;
        this.TipoApuesta = TipoApuesta;

        if(TipoApuesta == "PorResultado"){
            this.Prediccion = Prediccion;
        }
        if (TipoApuesta == "IncluyeMarcador"){
            this.Prediccion = Prediccion;
            this.MarcadorLocal = MarcadorLocal;
            this.MarcadorVisita = MarcadorVisita;
        }    
    }

   public String getCodigoApuesta() {
        return codigoApuesta;
    }

    public void setCodigoApuesta(String codigoApuesta) {
        this.codigoApuesta = codigoApuesta;
    }

    public EventoDeportivo getEventoDeportivo() {
        return EventoDeportivo;
    }

    public void setEventoDeportivo(EventoDeportivo eventoDeportivo) {
        this.EventoDeportivo = eventoDeportivo;
    }

    public Apostador getApostador() {
        return Apostador;
    }

    public void setApostador(Apostador apostador) {
        this.Apostador = apostador;
    }

    public String getTipoApuesta() {
        return TipoApuesta;
    }
    public void setTipoApuesta(String TipoApuesta) {
        this.TipoApuesta = TipoApuesta;
    }
    public String getPrediccion() {
        return Prediccion;
    }
    public void setPrediccion(String Prediccion) {
        this.Prediccion = Prediccion;
    }
    public Integer getMarcadorLocal() {
        return MarcadorLocal;
    }
    public void setMarcadorLocal(Integer MarcadorLocal) {
        this.MarcadorLocal = MarcadorLocal;
    }
    public Integer getMarcadorVisita() {
        return MarcadorVisita;
    }
    public void setMarcadorVisita(Integer MarcadorVisita) {
        this.MarcadorVisita = MarcadorVisita;
    }
   
    public void Validar(EventoDeportivo EventoDeportivo){
        if(this.TipoApuesta =="PorResultado" ){
           if(this.Prediccion == EventoDeportivo.getResultado()){
                System.out.print("Felicitaciones gano : " + this.ValorApuesta*2 );
           }else{
                System.out.print("Sigue intentando");
           }
        }else{
            if(this.Prediccion == EventoDeportivo.getResultado()){
                //String MarcApuesta = this.MarcadorLocal+"-"+this.MarcadorVisita;
                //String MarcadorRealPartido = EventoDeportivo.getMarcadorEquipoLocal()+ "-"+ EventoDeportivo.getMarcadorEquipoVisitante();
                
                if( this.MarcadorLocal == EventoDeportivo.getMarcadorEquipoLocal() && this.MarcadorVisita == EventoDeportivo.getMarcadorEquipoVisitante()){
                    System.out.println("Felicitaciones gano: " + this.ValorApuesta*2 );
                    System.out.println("Bonificacion: " + this.ValorApuesta*Bonificacion);
                    System.out.println("Ganancia: " + (this.ValorApuesta*2+this.ValorApuesta*Bonificacion));
                }else{
                    System.out.print("Sigue intentando");
                }
                
           }else{
                System.out.print("Sigue intentando");
           }
        }
    }

}