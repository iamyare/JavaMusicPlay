package Application;
import Utils.*;
public class App {
    public static void main(String[] args){
        //Creacion de Cliente
        Cliente usuario1 = new Cliente("Yamir Rodas", "iamyare", "Masculino",21);
        Artista artista1 = new Artista("Marron five", "Masculino", "Pop rock, electropop, pop, dance-pop, neo soul, funk rock");
        Artista artista2 = new Artista("Bruno Mars", "Masculino", "R&B contemporáneo, funk, pop, soul, reggae, hip hop y rock");

        //Creando Albums
        Playlist album1 = new Playlist("Just the Hits: Noughties", artista1.nombre);
        Playlist album2 = new Playlist("V", artista1.nombre);
        Playlist album3 = new Playlist("Memories", artista1.nombre);
        artista1.albums.add(album1);artista1.albums.add(album2);artista1.albums.add(album3);//Subscripcion de albumnes

        Playlist colab = new Playlist("Life", artista1.nombre+" ft "+artista2.nombre);
        artista1.albums.add(colab);artista2.albums.add(colab);

        Playlist album4 = new Playlist("Unorthodox Jukebox", artista2.nombre);
        Playlist album5 = new Playlist("Locked Out of Heaven", artista2.nombre);
        Playlist album6 = new Playlist("24K Magic", artista2.nombre);
        artista2.albums.add(album4);artista2.albums.add(album5);artista2.albums.add(album6);//Subscripcion de albumnes

        //Usuario sigue playlist
        usuario1.playlists.add(album1);usuario1.playlists.add(album3);usuario1.playlists.add(album6);

        //Creacion de las canciones
        Canciones song1 = new Canciones("This Love", artista1.nombre, "Pop", "13:00",album1.nombre_album , 2002);
        Canciones song2 = new Canciones("Animals", artista1.nombre, "Pop", "13:00",album2.nombre_album , 2014);
        Canciones song3 = new Canciones("Sugar", artista1.nombre, "Pop", "13:00",album2.nombre_album , 2015);
        Canciones song4 = new Canciones("Maps", artista1.nombre, "Pop", "13:00",album2.nombre_album , 2017);
        Canciones song5 = new Canciones("Memories", artista1.nombre, "Pop", "13:00",album3.nombre_album , 2019);
        Canciones song6 = new Canciones("When i was your man", artista1.nombre, "Pop", "2:42",album4.nombre_album , 2012);
        Canciones song7 = new Canciones("Locked Out Of Heaven", artista1.nombre, "Reggae rock", "3:00",album5.nombre_album , 2014);
        Canciones song8 = new Canciones("Thats What I Like", artista1.nombre, "R&B contemporáneo", "2:50",album6.nombre_album , 2016);
        Canciones song9 = new Canciones("24K Magic", artista1.nombre, "R&B contemporáneo", "2:30",album6.nombre_album  , 2016);
        Canciones song10 = new Canciones("Finesse", artista1.nombre, "Funk", "3:00",album6.nombre_album  , 2016);
        Canciones song11 = new Canciones("Lower", artista1.nombre+" ft "+artista2.nombre, "Funk", "3:00",colab.nombre_album  , 2016);
        Canciones song12 = new Canciones("Space", artista1.nombre+" ft "+artista2.nombre, "Pop", "3:00",colab.nombre_album  , 2016);

        //Canciones de artistas
        artista1.canciones.add(song1);artista1.canciones.add(song2);artista1.canciones.add(song3);artista1.canciones.add(song4);artista1.canciones.add(song5);
        artista2.canciones.add(song6);artista2.canciones.add(song7);artista2.canciones.add(song8);artista2.canciones.add(song9);artista2.canciones.add(song10);
        artista1.canciones.add(song11);artista1.canciones.add(song12);artista2.canciones.add(song11);artista2.canciones.add(song12);

        //Agregamos canciones a album
        album1.albums.add(song1);album2.albums.add(song2);album2.albums.add(song3);album2.albums.add(song4);album3.albums.add(song5); //Artista1
        album4.albums.add(song6);album5.albums.add(song7);album6.albums.add(song8);album6.albums.add(song9);album6.albums.add(song10); //Artista2
        colab.albums.add(song11);colab.albums.add(song12); //Artista 1 y 2

        //Lista de canciones
        System.out.println("Lista de canciones");
        for (Canciones c: artista1.canciones){//Artista1
            System.out.println(c.artista+" - "+c.nombre_cancion+" Album:"+c.album+", Lanzamiento: "+c.anio);
        }
        for (Canciones c: artista2.canciones){//Artista2
            System.out.println(c.artista+" - "+c.nombre_cancion+" Album:"+c.album+", Lanzamiento: "+c.anio);
        }


        //Almunes del artista
        System.out.println("\nEl artista "+artista1.nombre+" cuenta con los albumnes: ");
        for (Playlist p: artista1.albums){
            System.out.println(p.nombre_album+" con "+p.albums.size()+" canciones.");
        }
        //Almunes del artista 2
        System.out.println("\nEl artista "+artista2.nombre+" cuenta con los albumnes: ");
        for (Playlist p: artista2.albums){
            System.out.println(p.nombre_album+" con "+p.albums.size()+" canciones.");
        }

        //Playlist que sigue el usuario
        System.out.println("\n"+usuario1.nombre+" usted sigue estas playlist: ");
        for (Playlist p: usuario1.playlists){
            System.out.println(p.nombre_album+", del Artista: "+p.creador+" con "+ p.albums.size()+" canciones.");
        }


        //Colaboraciones
        System.out.println("\n"+artista1.nombre+" tiene "+colab.albums.size()+" colaboraciones con "+artista2.nombre);
        System.out.println("En el album: "+colab.nombre_album);
        System.out.println("Sus canciones son: ");
        for (Canciones c: colab.albums){//Artista2
            System.out.println(c.nombre_cancion+" - "+c.artista);
        }

    }
}
