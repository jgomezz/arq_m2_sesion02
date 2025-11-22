package pe.edu.codigo.poo.patron.ioc;

public class MensajeEn implements Mensaje{

    String nombre;

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void procesarMsg() {
        System.out.println("Good morning ...!: " + this.nombre);
    }


}
