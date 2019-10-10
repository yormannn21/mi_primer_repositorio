// AUTOR: YORMAN ALBA PEREZ
package metodos;

import java.util.Scanner;

public class Metodos {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        sinretornosinparametros saludo = new sinretornosinparametros();
        sinretornoconparametros nombreusuario = new sinretornoconparametros();
        
        String nombre ="";
        //utilizando un metodo sin retorno y sin parametros
        saludo.mostrarsaludo();
        
        System.out.println("por favor ingrese su nombre: ");
        nombre = input.nextLine();
        
        nombreusuario.ingresarnombre(nombre);
    }
    
}
