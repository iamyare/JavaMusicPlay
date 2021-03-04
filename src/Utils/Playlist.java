package Utils;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    public String nombre_album;
    public String creador;
    public int cant;
    public List<Canciones> albums;
    public Playlist(String nombre_album, String creador) {
        this.nombre_album = nombre_album;
        this.creador = creador;
        this.albums = new ArrayList<Canciones>();
    }
}
