
package metodos2;


public class conretornoconparametros2 {
    int resultado;
    
    public int sumar(int a, int b, int op){
        switch (op){
            case 1:
                resultado = a+b;
                System.out.println("el resultado es: " + a + "+" + b + "= " + resultado);
                break;
        }
        
        resultado = a+b;
        return resultado;
        
        
    }
    
}
