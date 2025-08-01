/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelos;

/**
 *
 * @author frank
 */
public class Reserva{
    public String asiento;
    public int Nvuelo;

    public Reserva(String asiento, int Nvuelo) {
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

    @Override
    public String toString() {
        return "Reserva{" + "asiento=" + asiento + ", Nvuelo=" + Nvuelo + '}';
    }

 
    }

  
    
    

