/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.potrorolas.entidades.Album;
import mx.itson.potrorolas.entidades.Artista;
import mx.itson.potrorolas.entidades.Canción;
import mx.itson.potrorolas.enums.Genero;

/**
 *
 * @author alumnog
 */
public class Main {
   
    public static void main(String[] args) {
        
        Artista artista = new Artista();
        artista.setNombre("Bad bunny");
        artista.setSitioWeb("www.badbunny,com");
        //a.setNombre(artista);
        
        Album a = new Album();
        a.setNombre("Debí tirar mas fotos");
        a.setLanzamiento(2025);
        a.setGenero(Genero.OTROS);
        
        List<Canción> canciones = new ArrayList<>();
        
        
        
        
        
        
        
    }
    
}
