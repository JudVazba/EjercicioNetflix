package git.EjercicioNetflix.JudVazba;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
   
}
interface IReproduccion{
    public void reproducir();
    public void pausar();
    public void adelantar();
    public void atrasar();
}




private abstract class Netflix{
    private string tipo;

    public Netflix(string tipo) {
        this.tipo = tipo;
    }
}

private class Contenido extends Netflix{
    private string clase;
    private string titulo;
    private string director;
    private int duracion;
    private string productora;

    }

    public Contenido(string tipo,string clase, string titulo,string director, int duracion, string productora){
        super(tipo);
        this.clase = clase;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.productora = productora;
    }
}

private class Peliculas extends Contenido implements IReproduccion{
    public String genero;
    public void reproducir(){
        System.out.println("Reproduciendo");
    }
    public void pausar(){
        System.out.println("Pausado");
    }
    public void adelantar(){
        System.out.println("adelantando");
    }
    public void atrasar(){
        System.out.println("atrasando");
}

        public Peliculas(string tipo,string clase, string titulo,string director, int duracion, string productora, string genero){
            super(tipo, clase, titulo, director, duracion, productora);
            this.genero = genero; 
    }
}
private class Capitulo implements IReproduccion{
    public void reproducir(){
        System.out.println("Reproduciendo");
    }
    public void pausar(){
        System.out.println("Pausado");
    }
    public void adelantar(){
        System.out.println("adelantando");
    }
    public void atrasar(){
        System.out.println("atrasando");
    }

}
private class Series extends Contenido{
    public string genero;
    private ArrayList<Capitulo> capitulos = new ArrayList<Capitulo>();
    

    public Series(string tipo,string clase, string titulo,string director, int duracion, string productora, string genero){
        super(tipo, clase, titulo, director, duracion, productora);
        this.genero= genero;
    }
}
