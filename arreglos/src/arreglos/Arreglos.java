//AUTOR: YORMAN ALBA PEREZ
package arreglos;

import java.util.Scanner;

public class Arreglos {


    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[] notas = new int [5];
       for (int estudiante=0; estudiante <= 4; estudiante++){
           System.out.println("ingrese la calificacion del estudiante n. "+ (estudiante + 1)+ ": ");
           notas[estudiante] = input.nextInt();
        }
       for (int estudiante = 0; estudiante <=4; estudiante++){
           System.out.println("estudiante n. "+ (estudiante + 1) + ": " + notas[estudiante]);
        }
    }
    
}

