
package facturaciondealmacen;

import java.util.Scanner;
public class Facturaciondealmacen {
        
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String sede="";
        int diafacturacion = 0;
        int valorcompra = 0;
        int edad = 0;
        
        System.out.println("ingrese la sede del almacen: ");
        sede = input.next();
        System.out.println("ingrese dia de facturacion: ");
        diafacturacion = input.nextInt();
        System.out.println("ingrese valor compra: ");
        valorcompra = input.nextInt();
        System.out.println("ingrese edad: ");
        edad = input.nextInt();
        
        if (sede!="bogota"){
        System.out.println("los descuentos no aplican para esta sede");
        }
        else {
            if ((diafacturacion == 15 || diafacturacion == 30) && valorcompra >= 50000)
                valorcompra = valorcompra * 0.95;
                System.out.println("felicitaciones has obtenido un 10% de descuento en tus compras");
                
        }
        
        
        
        
        
        
    }
    
}
