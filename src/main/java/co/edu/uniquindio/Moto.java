package co.edu.uniquindio;

public class Moto extends Vehiculo {
    private int cilindrada;
    public Moto(String placa, int numPeajesPagos, int cilindrada) {
        super (placa,numPeajesPagos);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public static  double valorbase() {
        return 5000;
    }

}