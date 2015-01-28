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
    
    public void test2()
    {
        Profesor profesor = new Profesor();
        
        profesor.registrarPropuesta("1");
        profesor.registrarPropuesta("2");
        profesor.registrarPropuesta("3");
        profesor.registrarPropuesta("4");
        profesor.registrarPropuesta("5");
        profesor.registrarPropuesta("6");
        profesor.registrarPropuesta("7");
        profesor.registrarPropuesta("8");
        profesor.registrarPropuesta("9");
        profesor.registrarPropuesta("10");
        profesor.registrarPropuesta("11");
        profesor.registrarPropuesta("12");
        profesor.registrarPropuesta("14a");
        profesor.registrarPropuesta("14b");
        
        profesor.registrarEvaluador("A");
        profesor.registrarEvaluador("B");
        profesor.registrarEvaluador("C");
        
        profesor.repartir();
        profesor.mostrarReparto();
    }
    
    public void test3()
    {
        Profesor profesor = new Profesor();
        
        profesor.registrarPropuesta("1");
        profesor.registrarPropuesta("2");
        profesor.registrarPropuesta("3");
        
        profesor.registrarEvaluador("A");
        profesor.registrarEvaluador("B");
        profesor.registrarEvaluador("C");
        
        profesor.repartir();
        profesor.mostrarReparto();
    }
    
    public void test4()
    {
        Profesor profesor = new Profesor();
        
        profesor.registrarPropuesta("1");
        profesor.registrarPropuesta("2");
        profesor.registrarPropuesta("3");
        profesor.registrarPropuesta("4");
        profesor.registrarPropuesta("5");
        profesor.registrarPropuesta("6");
        profesor.registrarPropuesta("7");
        profesor.registrarPropuesta("8");
        profesor.registrarPropuesta("9");
        profesor.registrarPropuesta("10");
        profesor.registrarPropuesta("11");
        profesor.registrarPropuesta("12");
        profesor.registrarPropuesta("14a");
        profesor.registrarPropuesta("14b");
        
        profesor.emparejarDe2En2ByJuliaModdedByMiguel();
    }
}