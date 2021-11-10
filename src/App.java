
import Modelos.Equipo;
import Modelos.EventoDeportivo;
import Modelos.Apostador;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Crear Equipos
        Equipo Equipo1 = new Equipo( "E1", "Alianza Lima");
        Equipo Equipo2 = new Equipo( "E2", "Universitario");
        Equipo Equipo3 = new Equipo( "E3", "Cristal");
        Equipo Equipo4 = new Equipo( "E4", "Melgar");     

        //Crear Apostadores 
        Apostador apostador1 = new Apostador("3457893","Jose Lopez");
        Apostador apostador2 = new Apostador("5742157","Raul Silva");


        //Crear Evento Deportivo
        EventoDeportivo evento1 = new EventoDeportivo("eve1",Equipo1,Equipo2,"10/11/2021");
        EventoDeportivo evento2 = new EventoDeportivo("eve1",Equipo3,Equipo4,"10/11/2021");

        //Calcular Resultado
        evento1.CalcularResultado();
        evento2.CalcularResultado();
        //
        System.out.println("---------------PARTIDO--------------------------");
        evento1.mostrarResultado();
        System.out.println("---------------PARTIDO--------------------------");
        evento2.mostrarResultado();
        //evento2.mostrarResultado();
        
    }
}
