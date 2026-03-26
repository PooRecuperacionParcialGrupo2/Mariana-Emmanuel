/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipo2;

/**
 *
 * @author Usuario
 */
public class AppStreaming {
    public static void main(String[] args) {
        
        Pelicula[] arregloPeliculas = new Pelicula[2];
        Podcast[] arregloPodcasts = new Podcast[2];
        
        int contPeliculas = 0;
        int contPodcasts = 0;

        Pelicula p1 = new Pelicula("Interstellar ", 169, 2014, "Christopher Nolan");
        Pelicula p2 = new Pelicula("Interstellar ", 169, 2014, "Christopher Nolan");
        Pelicula p3 = new Pelicula("Matrix ", 136, 1999, "Lana Wachowski");

        Podcast pod1 = new Podcast("De Todo Un Poco ", 45, 2024, "Juan Perez");
        Podcast pod2 = new Podcast("De Todo Un Poco ", 45, 2024, "Juan Perez");
        Podcast pod3 = new Podcast("Experiencias Reales ", 60, 2023, "Maria Gomez");

        Pelicula[] candidatasPelicula = {p1, p2, p3};
        for (Pelicula candidata : candidatasPelicula) {
            boolean existe = false;
            for (int i = 0; i < contPeliculas; i++) {
                if (arregloPeliculas[i].equals(candidata)) {
                    existe = true;
                    break;
                }
            }
            if (!existe && contPeliculas < arregloPeliculas.length) {
                arregloPeliculas[contPeliculas] = candidata;
                contPeliculas++;
            }
        }

        Podcast[] candidatosPodcast = {pod1, pod2, pod3};
        for (Podcast candidato : candidatosPodcast) {
            boolean existe = false;
            for (int i = 0; i < contPodcasts; i++) {
                if (arregloPodcasts[i].equals(candidato)) {
                    existe = true;
                    break;
                }
            }
            if (!existe && contPodcasts < arregloPodcasts.length) {
                arregloPodcasts[contPodcasts] = candidato;
                contPodcasts++;
            }
        }

        ContenidoMultimedia[] catalogo = new ContenidoMultimedia[contPeliculas + contPodcasts];
        int index = 0;
        for(int i = 0; i < contPeliculas; i++) catalogo[index++] = arregloPeliculas[i];
        for(int i = 0; i < contPodcasts; i++) catalogo[index++] = arregloPodcasts[i];

        for (ContenidoMultimedia contenido : catalogo) {
            System.out.println("Resumen: " + contenido.obtenerReumen());
            contenido.iniciarReproduccion();
        }

        for (int i = 0; i < contPeliculas; i++) {
            System.out.println("Configurando opciones para: " + arregloPeliculas[i].obtenerReumen());
            arregloPeliculas[i].configurarVisualizacion();
            arregloPeliculas[i].configurarVisualizacion("4K");
            arregloPeliculas[i].configurarVisualizacion("1080p", "Espaniol");
        }
    }
}
