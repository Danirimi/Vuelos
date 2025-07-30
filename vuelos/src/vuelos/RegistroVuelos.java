/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelos;
import java.util.ArrayList;
/**
 *
 * @author danir
 */
public class RegistroVuelos {
    public String destino; // lugar de destino
    public int Cpasajeros; // cantidad de pasajeros maximos
    public String Origen;// lugar de donde sale el vuelo
    public String FSalida;//fecha de salida
    public String aereolinia;// aereolinia donde pertecence el vuelo
    public int Nvuelo;

    public RegistroVuelos(String destino, int Cpasajeros, String Origen, String FSalida, String aereolinia, int Nvuelo) {
        this.destino = destino;
        this.Cpasajeros = Cpasajeros;
        this.Origen = Origen;
        this.FSalida = FSalida;
        this.aereolinia = aereolinia;
        this.Nvuelo = Nvuelo;
    }

    public int getNvuelo() {
        return Nvuelo;
    }

    public void setNvuelo(int Nvuelo) {
        this.Nvuelo = Nvuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCpasajeros() {
        return Cpasajeros;
    }

    public void setCpasajeros(int Cpasajeros) {
        this.Cpasajeros = Cpasajeros;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getFSalida() {
        return FSalida;
    }

    public void setFSalida(String FSalida) {
        this.FSalida = FSalida;
    }

    public String getAereolinia() {
        return aereolinia;
    }

    public void setAereolinia(String aereolinia) {
        this.aereolinia = aereolinia;
    }

    @Override
    public String toString() {
        return "Vuelo: "+Nvuelo+", Destino: "+destino+", Max pasajeros: "+Cpasajeros+", Origen: "+Origen+", Fecha salida: "+FSalida+", Aereolinia: "+aereolinia;
    }
    
  
    
    
    
}
