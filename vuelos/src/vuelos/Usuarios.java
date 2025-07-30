/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelos;

/**
 *
 * @author danir
 */
public class Usuarios {
    public String UNombre;
    public String UCorreo;
    public int edad;

    public Usuarios(String UNombre, String UCorreo, int edad) {
        this.UNombre = UNombre;
        this.UCorreo = UCorreo;
        this.edad = edad;
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
    
    
}
