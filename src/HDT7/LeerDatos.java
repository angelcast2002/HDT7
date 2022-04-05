/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HDT7;

import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class LeerDatos {

    /**
     *
     * @return ArrayList con los datos
     * @throws IOException
     * @throws FileNotFoundException
     */
     //se leen los datos iniciales del programa
    public static ArrayList LeerDatos()throws IOException, FileNotFoundException{
        ArrayList <String> Datos = new ArrayList<>();
        String cadena;
        FileReader file = new FileReader("diccionario.txt");
        BufferedReader b = new BufferedReader(file);

        while ((cadena = b.readLine()) != null) {
             Datos.add(cadena);

        }

        b.close();
        file.close();
        return Datos;
    } 
    //Se leen los datos de los archivos de texto a traducir

    /**
     *
     * @param NombreArchivo nombre del archivo
     * @return ArrayList con los datos
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static ArrayList LeerDatos2(String NombreArchivo)throws IOException, FileNotFoundException{
        ArrayList <String> Datos = new ArrayList<>();
        NombreArchivo = NombreArchivo + ".txt";
        String cadena;
        FileReader file = new FileReader(NombreArchivo);
        BufferedReader b = new BufferedReader(file);

        while ((cadena = b.readLine()) != null) {
             Datos.add(cadena);

        }

        b.close();
        file.close();
        return Datos;
    }  
    
}
