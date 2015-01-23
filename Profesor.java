import java.util.ArrayList;
import java.util.Random;

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
        
        int contador = 0;
    
        while (contador < (minimoPropuestas * cantidadEvaluadores)) {
            for(Evaluador persona : evaluadores){
                String propuesta;
                if (contador < cantidadPropuestas) { // Si hay propuestas disponibles
                    // Se escogen consecutivamente con el indice que se incrementa despues
                    propuesta = propuestas.get(contador);
                }else{ // Si las soluciones son menos de numeroEvaluadores * minimoPropuestas
                    // Se escogen propuestas aleatoriamente para los Evaluadores
                    Random aleatorio = new Random();
                    propuesta = propuestas.get(aleatorio.nextInt(propuestas.size()));
                }
                persona.asignarPropuesta(propuesta);
                contador++;
            }
        }
        // Si aun quedan propuestas sin asignar entonces las recorremos
        // todas y las asignamos a los evaluadores segun vaya tocando
        while (contador < cantidadPropuestas){
            for(Evaluador persona : evaluadores){
                if (contador < cantidadPropuestas){
                    String propuesta = propuestas.get(contador);
                    persona.asignarPropuesta(propuesta);
                }
                contador++;
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