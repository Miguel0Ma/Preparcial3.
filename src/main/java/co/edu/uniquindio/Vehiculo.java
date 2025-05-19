package co.edu.uniquindio;

public abstract class Vehiculo {
    private String placa;
    private int numeroPeajesPagos;

    public Vehiculo(String placa, int numeroPeajesPagos) {
        this.placa = placa;
        this.numeroPeajesPagos = numeroPeajesPagos;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getNumeroPeajesPagos() {
        return numeroPeajesPagos;
    }
    public void setNumeroPeajesPagos(int numeroPeajesPagos) {
        this.numeroPeajesPagos = numeroPeajesPagos;
    }

}