public class Prueba
{
    // instance variables - replace the example below with your own
    private Repartidor distribuye;

    /**
     * Constructor for objects of class Prueba_7sol2ev
     */
    public Prueba()
    {
        distribuye = new Repartidor();
    }

    public void sol6eval2()
    {
        for(int i = 0; i < 6; i++){
            distribuye.otraSolucionMas("sol0" + (i + 1));
        }
        for(int i = 0; i < 2; i++){
            distribuye.otroEvaluadorMas("eval0" + (i + 1));
        }
        repetirReparto();
    }
    
    public void sol7eval2()
    {
        for(int i = 0; i < 7; i++){
            distribuye.otraSolucionMas("sol0" + (i + 1));
        }
        for(int i = 0; i < 2; i++){
            distribuye.otroEvaluadorMas("eval0" + (i + 1));
        }
        repetirReparto();
    }
    
    public void sol7eval3()
    {
        for(int i = 0; i < 7; i++){
            distribuye.otraSolucionMas("sol0" + (i + 1));
        }
        for(int i = 0; i < 3; i++){
            distribuye.otroEvaluadorMas("eval0" + (i + 1));
        }
        repetirReparto();
    }
    
    public void sol8eval2()
    {
        for(int i = 0; i < 8; i++){
            distribuye.otraSolucionMas("sol0" + (i + 1));
        }
        for(int i = 0; i < 2; i++){
            distribuye.otroEvaluadorMas("eval0" + (i + 1));
        }
        repetirReparto();
    }
    
    public void sol2eval6()
    {
        for(int i = 0; i < 2; i++){
            distribuye.otraSolucionMas("sol0" + (i + 1));
        }
        for(int i = 0; i < 6; i++){
            distribuye.otroEvaluadorMas("eval0" + (i + 1));
        }
        repetirReparto();
    }
    
    public void sol2eval7()
    {
        for(int i = 0; i < 2; i++){
            distribuye.otraSolucionMas("sol0" + (i + 1));
        }
        for(int i = 0; i < 7; i++){
            distribuye.otroEvaluadorMas("eval0" + (i + 1));
        }
        repetirReparto();
    }
    
    public void repetirReparto(){
        distribuye.asignarSolucion();
        distribuye.mostrarAsignacion();
    }
}
