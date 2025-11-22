package pe.edu.codigo.poo.banca;

public class CuentaBancaria implements ServicioBancarioATM, ServicioBancarioInternet{

    private String nroCuenta;
    private String titular;
    private double saldo;

    @Override
    public boolean pagoServicio(String servicio, double monto) {
        return false;
    }

    @Override
    public boolean pagoDiferidoServicio(String servicio, double monto) {
        return false;
    }
}
