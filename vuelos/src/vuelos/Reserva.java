/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelos;

/**
 *
 * @author frank
 */
public class Reserva extends Usuarios{
    public String asiento;
    public int Nvuelo;

    public Reserva(String asiento, int Nvuelo, String UNombre, String UCorreo, int edad) {
        super(UNombre, UCorreo, edad);
        this.asiento = asiento;
        this.Nvuelo = Nvuelo;
    }

 
    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public int getNvuelo() {
        return Nvuelo;
    }

    public void setNvuelo(int Nvuelo) {
        this.Nvuelo = Nvuelo;
    }

    public String getUNombre() {
        return UNombre;
    }

    public void setUNombre(String UNombre) {
        this.UNombre = UNombre;
    }

    public String getUCorreo() {
        return UCorreo;
    }

    public void setUCorreo(String UCorreo) {
        this.UCorreo = UCorreo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Reserva{" + "asiento=" + asiento + ", Nvuelo=" + Nvuelo + '}';
    }
    
    
}
