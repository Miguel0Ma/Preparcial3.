package co.edu.uniquindio;

public class Camion extends Vehiculo {
    private int ejes;
    private int capacidadCarga;

    public Camion(String placa, int numPejaesPagos, int ejes, int capacidadCarga) {
        super(placa, numPejaesPagos);
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public double ValorBaseCamion(){
        double valorBase=7000*getEjes();
        return valorBase;
    }
}