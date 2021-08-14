package com.mycompany.trabajopractico;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String editorDeCodigoPreferido;
        String sistemaOperativoQueUtiliza;
        
      
        System.out.println("Ingrese su nombre :");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese su apellido :");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese su edad :");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese su hobbie :");
        hobbie = entrada.nextLine();
        
        System.out.println("Editor de codigo preferido :");
        editorDeCodigoPreferido = entrada.nextLine();   
        
        System.out.println("Sistema operativo que utiliza :");
        sistemaOperativoQueUtiliza= entrada.nextLine();  
        
        System.out.println("Los datos ingresados por el usuarios son: ");
        System.out.println("|");
        System.out.println("---> nombre: " + nombre);
        System.out.println("---> apellido: " + apellido);
        System.out.println("---> edad: " + edad + " años");
        System.out.println("---> hobbie: " + hobbie);
        System.out.println("---> Editor de codigo preferido: " + editorDeCodigoPreferido);
        System.out.println("---> Sistema operativo que utiliza: " + sistemaOperativoQueUtiliza);
        
        
    }
    
}
 