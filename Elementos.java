import java.util.ArrayList;
/**
 * Write a description of class Elementos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elementos
{
    private String cabecera;
    private ArrayList<String> coleccion;

    public Elementos(String cabecera)
    {
        this.cabecera = cabecera;
        coleccion = new ArrayList<String>();
    }
    
    public void addElemento(String seccion){
        coleccion.add(seccion);
    }

    public void muestraElemento(){
        System.out.println(cabecera);
        for(String seccion : coleccion){
            System.out.println("-> " + seccion);
        }
        System.out.println("");
    }
}
