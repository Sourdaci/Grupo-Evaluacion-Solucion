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
    
        if(cantidadPropuestas >= minimoPropuestas){ // se comprueba que hay un minimo de trabajos presentados
            // asi nos aseguramos de que no habra bucle infinito en la comprobacion de trabajo repetido
            
            // el programa trabaja de forma diferente si tiene o no soluciones suficientes
            // se entra en este if si hay que repartir soluciones aleatorias para llegar al minimo
            if(minimoPropuestas * cantidadEvaluadores > cantidadPropuestas){
                Iterator<String> iterador = propuestas.iterator(); // recorre las soluciones
                while(minimoPropuestas > evaluadores.get(0).propuestasPorEvaluar()){
                    // este bucle se itera si los evaluadores no tienen el minimo de soluciones
                    for(Evaluador persona : evaluadores){ // recorremos consecutivamente los evaluadores
                        String propuesta;
                        if (iterador.hasNext()) { // Si hay propuestas disponibles
                            // Se escogen consecutivamente
                            propuesta = iterador.next();
                        }else{ // Si las soluciones son menos de numeroEvaluadores * minimoPropuestas
                            // Se escogen propuestas aleatoriamente para los Evaluadores
                            Random aleatorio = new Random();
                            do{ // bucle que le pide al evaluador que compruebe si tiene la solucion escogida
                                // recordemos que esta solucion se escoge aleatoriamente
                                propuesta = propuestas.get(aleatorio.nextInt(propuestas.size()));
                            }while(persona.trabajoRepetido(propuesta)); // finaliza cuando recibe false (no)
                        }
                        persona.asignarPropuesta(propuesta);
                    }
                }
            }else{
                // se entra en el else si no hay que repartir soluciones aleatorias para cumplir el minimo
                Iterator<String> iterador = propuestas.iterator(); // recorre las soluciones
                while(iterador.hasNext()){ // mientras haya soluciones por repartir
                    for(Evaluador persona : evaluadores){
                        String propuesta;
                        if (iterador.hasNext()) { // Si hay propuestas disponibles
                            // Se escogen consecutivamente
                            persona.asignarPropuesta(iterador.next());
                        }
                    }
                }
            }
        }else{
            System.out.println("Error: no se puede evitar que un evaluador reciba trabajos repetidos");
            System.out.println("No se han asignado trabajos");
            System.out.println("Trabajos entregados: " + cantidadPropuestas + ", minimo necesario " + minimoPropuestas);
        }
    }
    
    public void emparejarDe2En2(){
        if(propuestas.size() % 2 == 0){ // si hay propuestas pares
            ArrayList<String> shufflePropuestas = new ArrayList<String>(propuestas); // copio las propuestas
            Collections.shuffle(shufflePropuestas); // mezclo las propuestas
            Iterator<String> iterador = shufflePropuestas.iterator(); // para recorrer las propuestas mezcladas
            int contador = 1; // para hacer bonito
            while(iterador.hasNext()){ // mientras haya propuestas para mostrar
                System.out.print("Eliminatoria " + contador + ": "); // aqui el contador que hace bonito
                System.out.print(iterador.next() + " y " + iterador.next() + "\n"); // muestro las 2 propuestas
                contador++;
            }
        }else{ // si hay propuestas impares
            System.out.println("Propuestas impares, no se puede emparejar");
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