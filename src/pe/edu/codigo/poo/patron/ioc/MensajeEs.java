package pe.edu.codigo.poo.patron.ioc;

public class MensajeEs implements Mensaje{

    String nombre;

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void procesarMsg() {
        System.out.println("Buenos dias: " + this.nombre);
    }
}
