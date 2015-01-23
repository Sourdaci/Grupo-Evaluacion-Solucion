public class Test
{
    public void test1()
    {
        Profesor profesor = new Profesor();
        
        profesor.registrarPropuesta("1");
        profesor.registrarPropuesta("2");
        profesor.registrarPropuesta("3");
        profesor.registrarPropuesta("4");
        profesor.registrarPropuesta("5");
        profesor.registrarPropuesta("6");
        profesor.registrarPropuesta("7");
        
        profesor.registrarEvaluador("A");
        profesor.registrarEvaluador("B");
        profesor.registrarEvaluador("C");
        
        profesor.repartir();
        profesor.mostrarReparto();
    }
    
    
}