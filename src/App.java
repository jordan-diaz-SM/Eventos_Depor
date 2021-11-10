public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Crear Equipos
        Equipo oi1 = new Equipo( "Code", 1, 400.90, "Internet");
        Equipo oi1 = new Equipo( "P01010034", 1, 400.90, "Internet");
        oi1 = new PedidoDetalle( "P01010034", 1, 400.90, "Internet");      

    }
}
