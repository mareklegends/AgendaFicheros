/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaficheros;

import java.util.Scanner;

/**
 *
 * @author Juanfran
 */
public class AgendaFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc=0;
        Agenda agenda = new Agenda("Juanfra");
        System.out.println("Bienvenido a la agenda de telefonos");
        Scanner leer;
        while(opc!=6){
            opc = menus.MenuPrincipal.menuPrincipal();
            switch(opc){
                case 1:
                    leer = new Scanner(System.in);
                    System.out.println("Dime el nombre y el telefono del nuevo contacto");                    
                    agenda.añadirContacto(new Contacto(leer.nextLine(),leer.nextLine()));
                    break;
                case 2:
                    leer = new Scanner(System.in);
                    System.out.println("Dime el nombre o el telefono para borrar");                    
                    agenda.borrarContacto(leer.nextLine());
                    break;
                case 3:
                    leer = new Scanner(System.in);
                    System.out.println("Dime el nombre o el telefono para editar");                    
                    agenda.editarContacto(leer.nextLine());
                    break;
                case 4:
                    leer = new Scanner(System.in);
                    System.out.println("Dime el nombre del contacto a buscar");
                    agenda.mostrarContacto(leer.nextLine());
                    break;
                case 5:
                    agenda.mostrarTodo();
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
            }
    }   }
    
}
