/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipo2;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public abstract class ContenidoMultimedia {
    String titulo;
    int duracionMinutos;
    int anioLanzamiento;

    public ContenidoMultimedia(String titulo, int duracionMinutos, int anioLanzamiento) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.anioLanzamiento = anioLanzamiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContenidoMultimedia other = (ContenidoMultimedia) obj;
        if (this.duracionMinutos != other.duracionMinutos) {
            return false;
        }
        if (this.anioLanzamiento != other.anioLanzamiento) {
            return false;
        }
        return Objects.equals(this.titulo, other.titulo);
    }
    public abstract void  iniciarReproduccion();
    public String obtenerReumen(){
        return this.titulo + ""+ anioLanzamiento;
    }
}


   