package Utils;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nombre;
    public String usuario;
    public String genero;
    public int edad;
    public List<Playlist> playlists;
    public Cliente(String nombre, String usuario, String genero, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.genero = genero;
        this.edad = edad;
        this.playlists = new ArrayList<Playlist>();
    }
}
