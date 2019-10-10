// AUTOR: YORMAN ALBA PEREZ
package metodos2;

import java.util.Scanner;
public class Metodos2 {


    public static void main(String[] args) {
        String nombre="";
        String gato="";
        int cc;
        Scanner input = new Scanner(System.in);
        
        sinretornosinparametro2 objetosaludo = new sinretornosinparametro2();
        objetosaludo.saludosena();
        sinretornoconparametros2 objeto2 = new sinretornoconparametros2();
        System.out.println("INGRESE SU NOMBRE: ");
        nombre=input.nextLine();
        objeto2.ingresenombre(nombre);
        
        
        
        conretornosinparametro2 objeto3=new conretornosinparametro2();
        gato = objeto3.mensaje();
        System.out.println(gato);
        
        conretornoconparametros2 calculadora=new conretornoconparametros2();
        
        
        System.out.println("ingrese primer numero");
        int a = input.nextInt();
        
        System.out.println("ingrese segundo numero");
        int b = input.nextInt();
        
        System.out.println("eliga la operacion deseada 1)suma 2)resta 3)multiplicacion 4)divicion");
        int op = input.nextInt();
        
        System.out.println(calculadora.sumar(a, b, op));
                
    }
    
}
