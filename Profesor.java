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
        int indiceDelEvaluadorActual = 0;
        int indiceDeLaPropuestaActual = 0;
    
        while (contador < (minimoPropuestas * cantidadEvaluadores)) {
            Evaluador persona = evaluadores.get(indiceDelEvaluadorActual);
            if (indiceDeLaPropuestaActual < cantidadPropuestas) {
                String propuesta = propuestas.get(indiceDeLaPropuestaActual);
                persona.asignarPropuesta(propuesta);
            }else{
                Random aleatorio = new Random();
                String propuesta = propuestas.get(aleatorio.nextInt(propuestas.size()));
                persona.asignarPropuesta(propuesta);
            }
            indiceDeLaPropuestaActual++;
            indiceDelEvaluadorActual++;
            if (indiceDelEvaluadorActual == cantidadEvaluadores)
            {
                indiceDelEvaluadorActual = 0;
            }
            contador++;
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
