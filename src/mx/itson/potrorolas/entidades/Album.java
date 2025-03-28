/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potrorolas.entidades;

import java.util.List;
import mx.itson.potrorolas.enums.Genero;

/**
 *
 * @author alumnog
 */
public class Album {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the artista
     */
    public Artista getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    /**
     * @return the lanzamiento
     */
    public int getLanzamiento() {
        return lanzamiento;
    }

    /**
     * @param lanzamiento the lanzamiento to set
     */
    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    /**
     * @return the canción
     */
    public List<Canción> getCanción() {
        return canción;
    }

    /**
     * @param canción the canción to set
     */
    public void setCanción(List<Canción> canción) {
        this.canción = canción;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
    private String nombre;
    private Artista artista;  
    private int lanzamiento;
   // private Canción canción;  no se puede utilizar al no tenerlo como una lista 
   //o clase por esto se utiliza el de abajo. es algo que viene incluido
   //por defecto dentro de java para crear esas "colecciones"
    private List<Canción> canción;       
    private Genero genero;
            
}
