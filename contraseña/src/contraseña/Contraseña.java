// AUTOR: YORMAN ALBA PEREZ
package contraseña;

import java.util.Scanner;
public class Contraseña {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String user = "yorman";
        String userpass = "";
        String contrasena = "1234";
        String contrasenaingresada = "";
        
        
        System.out.println("INGRESE USUARIO");
        userpass = input.nextLine();
        
        if (userpass.equals(user)){
        
        System.out.println("INGRESE CONTRASEÑA");
        contrasenaingresada = input.nextLine();
        }
        else {
        System.out.println("jhjERROR DE DATOS");
        }
        
        if (contrasenaingresada.equals(contrasena)){
        System.out.println("BIENVENIDO USUARIO: "  + user);
        }
        else{
        System.out.println("ERROR DE DATOS");
        }
        
    }
    
}
