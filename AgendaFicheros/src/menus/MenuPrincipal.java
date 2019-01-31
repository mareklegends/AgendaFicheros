/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.util.Scanner;

/**
 *
 * @author Juanfran
 */
public class MenuPrincipal {
    
    public static int menuPrincipal(){
        int opc=0;
        Scanner leer=null;
        while(opc<1 || opc>6){
            System.out.println("1- Añadir contacto");
            System.out.println("2- Borrar contacto");
            System.out.println("3- Editar contacto");
            System.out.println("4- Mostrar contacto");
            System.out.println("5- Mostrar todos los contactos");
            System.out.println("6- Salir");
            System.out.println("Escribe una opción");
            
            try{
                leer =new Scanner(System.in);
                opc = leer.nextInt();
            }catch(Exception e){
                System.out.println("Error al teclear la opción");
            }
        }
        return opc;
    }
}
