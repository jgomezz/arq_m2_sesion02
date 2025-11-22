package pe.edu.codigo.poo.patron.ioc;

public class Aplicacion {


    public static void main(String[] args) {
        Mensaje mensaje = new MensajeEn();
        mensaje.setNombre("Jaime");
        procesar(mensaje);

    }

    public static void procesar( Mensaje msg) {
        msg.procesarMsg();
    }


}
