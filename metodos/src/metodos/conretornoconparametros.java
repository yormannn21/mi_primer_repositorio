// AUTOR: YORMAN ALBA PEREZ
package metodos;

import java.util.Scanner;
public class conretornoconparametros {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        formatofechas fechames = new formatofechas();
        int dianacimiento = 0;
        int mesnacimiento = 0;
        int anyonacimiento =0;
        String mesenletras="";
    
    System.out.println("ingrese su fecha de nacimiento");
    System.out.println("ingrese el dia");
    dianacimiento=input.nextInt();
    System.out.println("ingrese el mes (utilice solo enteros)");
    mesnacimiento = input.nextInt();
    System.out.println("ingrese el año");
    anyonacimiento = input.nextInt();
    
    mesenletras = fechames.devolvermestexto(mesnacimiento);
    
    System.out.println("usted nacio en el dia " + dianacimiento + " del mes " + mesenletras + " del año " + anyonacimiento);
    
}
}
