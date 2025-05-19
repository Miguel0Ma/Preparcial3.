package co.edu.uniquindio;

import java.util.ArrayList;
public class Estacion {
    private String nombre;
    private String departamento;
    private double totalRecoletado;
    private ArrayList<Vehiculo> listvehiculos;


    public Estacion(String nombre, String departamento, double totalRecoletado) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalRecoletado = totalRecoletado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getTotalRecoletado() {
        return totalRecoletado;
    }

    public void setTotalRecoletado(double totalRecoletado) {
        this.totalRecoletado = totalRecoletado;
    }

    public ArrayList<Vehiculo> getListvehiculos() {
        return listvehiculos;
    }

    public void setListvehiculos(ArrayList<Vehiculo> listvehiculos) {
        this.listvehiculos = listvehiculos;
    }

    public double calcularValorVehiculo(){
        double valor = 0;
        for (Vehiculo vehiculo : listvehiculos){
            if(vehiculo instanceof Carro carro && carro.getPublico.equals(true)){
                 valor=(carro.valorBaseCarro()*0.15)+carro.valorBaseCarro();
            }
            if (carro.getElectrico.equals(true)){
                 valor=(carro.valorBaseCarro*0.2)-carro.valorBaseCarro;
            } else if (vehiculo instanceof Moto moto) {
                 valor=moto.valorbase();
                if (moto.getCilindrada()>200){
                    valor =moto.valorbase()+2000;
                }
            }else if (vehiculo instanceof Camion camion){
                valor=camion.ValorBaseCamion();
                if (camion.getEjes()>12){
                    valor=(camion.ValorBaseCamion()*0.1)=camion.ValorBaseCamion();

                }
            }

        }
        return valor;
    }

}

