package co.edu.uniquindio;

public class Carro extends Vehiculo {
    public  Boolean getPublico;
    public  double getValorBase;
    public  Boolean getElectrico;
    private boolean electrico;
    private boolean publico;

    public Carro(String placa, int numPeajesPagos, boolean electrico, boolean publico) {
        super(placa, numPeajesPagos);
        this.electrico = electrico;
        this.publico = publico;
    }

    public boolean getPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public boolean getElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public double valorBaseCarro() {
        return 10000;
    }
}