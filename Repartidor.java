import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Repartidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Repartidor
{
    private ArrayList<String> evaluadores;
    private ArrayList<Elementos> reparto;
    private ArrayList<String> soluciones;
    
    /**
     * Constructor for objects of class Repartidor
     */
    public Repartidor()
    {
        evaluadores = new ArrayList<String>();
        soluciones = new ArrayList<String>();
    }

    public void otroEvaluadorMas(String evaluador){
        evaluadores.add(evaluador);
    }
    
    public void otraSolucionMas(String solucion){
        soluciones.add(solucion);
    }
    
    public void asignarSolucion(){
        int numeroSoluciones = soluciones.size();
        int numeroEvaluadores = evaluadores.size();
        int contadorBucle = 0;
        if(numeroSoluciones == 0){
            System.out.println("ERROR: No se han introducido soluciones para evaluar");
        }else if(numeroEvaluadores == 0){
            System.out.println("ERROR: No se han introducido evaluadores para las soluciones");
        }else if(numeroSoluciones >= numeroEvaluadores){
            ArrayList<String> shuffleSolucion = new ArrayList<String>(soluciones);
            Collections.shuffle(shuffleSolucion);
            reparto = null;
            reparto = new ArrayList<Elementos>();
            for(String persona : evaluadores){
                reparto.add(new Elementos(persona + " evaluara los siguientes proyectos:"));
            }
            for(String trabajo : shuffleSolucion){
                reparto.get(contadorBucle).addElemento(trabajo);
                contadorBucle++;
                if(contadorBucle >= numeroEvaluadores){
                    contadorBucle = 0;
                }
            }
        }else{
            ArrayList<String> shuffleEvaluadores = new ArrayList<String>(evaluadores);
            Collections.shuffle(shuffleEvaluadores);
            reparto = null;
            reparto = new ArrayList<Elementos>();
            for (String trabajo : soluciones){
                reparto.add(new Elementos("Los siguientes evaluadores revisaran el proyecto " + trabajo));
            }
            for(String persona : shuffleEvaluadores){
                reparto.get(contadorBucle).addElemento(persona);
                contadorBucle++;
                if(contadorBucle >= numeroSoluciones){
                    contadorBucle = 0;
                }
            }
        }
    }
    
    public void mostrarAsignacion(){
        if(reparto != null){
            for(Elementos parte : reparto){
                parte.muestraElemento();
            }
        }
    }
}
