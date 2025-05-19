package co.edu.uniquindio;

import java.util.ArrayList;

public class Conductor extends Persona {
    private ArrayList<Vehiculo> listVehiculosAsignados;
    public Conductor(String nombre, String apellido, String id, String fechaNacimineto,
                     ArrayList<Vehiculo> listVehiculosAsignados) {
        super(nombre,apellido,id,fechaNacimineto);
        this.listVehiculosAsignados = listVehiculosAsignados;

    }
    public ArrayList<Vehiculo> getListVehiculosAsignados() {
        return listVehiculosAsignados;
    }

    public void setListVehiculosAsignados(ArrayList<Vehiculo> listVehiculosAsignados) {
        this.listVehiculosAsignados = listVehiculosAsignados;
    }

    public void asignarVehiculoAConductor(Vehiculo vehiculo) {
        if (vehiculo != null && !listVehiculosAsignados.contains(vehiculo)) {
            listVehiculosAsignados.add(vehiculo);
        }
    }
}