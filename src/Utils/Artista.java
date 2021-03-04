package Utils;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    public String nombre;
    public String genero;
    public String genero_musical;

    public List<Canciones> canciones;
    public List<Playlist> albums;

    public Artista(String nombre, String genero, String genero_musical) {
        this.nombre = nombre;
        this.genero = genero;
        this.genero_musical = genero_musical;
        this.canciones = new ArrayList<Canciones>();
        this.albums = new ArrayList<Playlist>();
    }


}

