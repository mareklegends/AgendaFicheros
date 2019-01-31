/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioDatos;

import agendaficheros.Contacto;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Fichero {
    public static ArrayList<Contacto> cargarDatos(){
        ArrayList<Contacto> vAgenda = new ArrayList();
        
        Scanner leer=null;        
        File fichero = null;
        
        fichero = new File("agenda.txt");
        if (!fichero.exists()) {
            try {
                fichero.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el fichero");               
            }
        }
        
        try {
            leer = new Scanner(fichero);
            while(leer.hasNext()){
            String dato = leer.nextLine();            
            String aux[] = dato.split(dato);
            Contacto c = new Contacto(aux[0], aux[1]);
            }
        
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer el fichero");
        }
        
       
        return vAgenda;
    }
}
