import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import java.util.Collections;

public class Profesor
{
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<String> propuestas;

    public Profesor()
    {
        evaluadores = new ArrayList<>();
        propuestas = new ArrayList<>();
    }
         
    public void registrarEvaluador(String nombre)
    {
        Evaluador nuevoEvaluador = new Evaluador(nombre);   
        evaluadores.add(nuevoEvaluador);
    }

    public void registrarPropuesta(String nombre)
    {
        propuestas.add(nombre);
    }
    
    public void repartir()
    {
        int cantidadEvaluadores = evaluadores.size();
        int cantidadPropuestas = propuestas.size();
        int minimoPropuestas = 3;
    
        if(minimoPropuestas * cantidadEvaluadores > cantidadPropuestas){
            Iterator<String> iterador = propuestas.iterator();
            while(minimoPropuestas > evaluadores.get(0).propuestasPorEvaluar()){
                for(Evaluador persona : evaluadores){
                    String propuesta;
                    if (iterador.hasNext()) { // Si hay propuestas disponibles
                        // Se escogen consecutivamente
                        propuesta = iterador.next();
                    }else{ // Si las soluciones son menos de numeroEvaluadores * minimoPropuestas
                        // Se escogen propuestas aleatoriamente para los Evaluadores
                        Random aleatorio = new Random();
                        propuesta = propuestas.get(aleatorio.nextInt(propuestas.size()));
                    }
                    persona.asignarPropuesta(propuesta);
                }
            }
        }else{
            Iterator<String> iterador = propuestas.iterator();
            while(iterador.hasNext()){
                for(Evaluador persona : evaluadores){
                    String propuesta;
                    if (iterador.hasNext()) { // Si hay propuestas disponibles
                        // Se escogen consecutivamente
                        persona.asignarPropuesta(iterador.next());
                    }
                }
            }
        }
    }
    
    public void mostrarReparto()
    {
        for (Evaluador evaluador : evaluadores)
        {
            evaluador.mostrarPropuestas();
        }
    }
    
}