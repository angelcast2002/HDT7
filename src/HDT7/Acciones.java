/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HDT7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class Acciones {
    //Logica del programa

    LeerDatos leer = new LeerDatos();
    ArrayList <String> datos = new ArrayList<>();

    Arbol arbolIngles = new Arbol();
    Arbol arbolFrances = new Arbol();

    /**
     *
     */
    public void Separar() {
        //se llama a leer y se separa por medio de ,
        ArrayList <String> Datos = new ArrayList<>();
        try {
            Datos = leer.LeerDatos();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int i = 0; i < Datos.size(); i++) {
            String[] palabras = Datos.get(i).split(",");
            for (int j = 0; j < palabras.length; j++) {
                palabras[j] = palabras[j].toLowerCase();
                datos.add(palabras[j]);
            }
        }

    }

    /**
     *
     */
    public void CrearArboles() {
        //se crean los arboles
        
        ArrayList <String> Ingles = new ArrayList<>();
        ArrayList <String> Espanol = new ArrayList<>();
        ArrayList <String> Frances = new ArrayList<>();

        for (int i = 0; i < datos.size(); i++) {

            Ingles.add(datos.get(i));
            i = i + 1;
            Espanol.add(datos.get(i));
            i = i + 1;
            Frances.add(datos.get(i));

        }
        
        for (int i = 0; i < Ingles.size(); i++) {
            arbolIngles.insertar(Ingles.get(i), Espanol.get(i));
            
        }

        for (int i = 0; i < Frances.size(); i++) {
            arbolFrances.insertar(Frances.get(i), Espanol.get(i));
            
        }

        System.out.println("----Diccionario Ingles: ");
        arbolIngles.inOrder(arbolIngles.raiz);
        System.out.println("----Diccionario Frances: ");
        arbolFrances.inOrder(arbolFrances.raiz);


    }
    
    /**
     *
     * @param id String del nodo a eliminar
     * @return String con el diccionario en InOrder
     */
    public String eliminar(String id){
        //Elimina un nodo del arbol
        String resultado = " ";
        resultado = "En el diccionario de ingles: "  + arbolIngles.eliminar(id);
        resultado = resultado + "\n" +"En el diccionario de frances: " +arbolFrances.eliminar(id);

        System.out.println("----Diccionario Ingles: ");
        arbolIngles.inOrder(arbolIngles.raiz);
        System.out.println("----Diccionario Frances: ");
        arbolFrances.inOrder(arbolFrances.raiz);

        return resultado;

    }
    
    /**
     *
     * @param id String del nodo a insertar
     * @param espanol String con la traduccion del nodo
     * @param frances String con la traduccion del nodo
     * @return String con el resultado de la insercion
     */
    public String Insertar(String id, String espanol, String frances) {
        //Se llama a insertar en los arboles y se imprime el resultado
        String resultado = "";
        arbolIngles.insertar(id, espanol);
        arbolFrances.insertar(frances, espanol);
        resultado = "En los diccionarios se ha agregado la palabra: " + id + " con la traduccion: (espanol) " + espanol + " frances " + frances;
        return resultado;
    }

    /**
     *
     * @param nombreArchivo String con el nombre del archivo
     * @return String con el resultado de la traduccion
     */
    public String Traducir(String nombreArchivo) {
        //se llama a leer y se separa por medio de un espacio
        ArrayList <String> porTraducir = new ArrayList<>();
        String resultado = "";
        ArrayList <String> Datos = new ArrayList<>();
        int Lenguaje = 0;
        try {
            Datos = leer.LeerDatos2(nombreArchivo);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("No se encontro el archivo");
        }

        try {
            // Datos.add("The woman asked me to do my homework about my town");

            for (int i = 0; i < Datos.size(); i++) {
                String[] palabras = Datos.get(i).split(" ");
                for (int j = 0; j < palabras.length; j++) {
                    palabras[j] = palabras[j].toLowerCase();
                    porTraducir.add(palabras[j]);
                }
            }
    
            //Si se encuentran alguna de las palabras en alguno de los diccionarios se hace un break y se trabaja con ese diccionario de lo contrario se devuelve un mensaje de error
            for (int i = 0; i < porTraducir.size(); i++) {
                if (arbolIngles.buscar(porTraducir.get(i)) != null) {
                    Lenguaje = 1;
                    break;
                }
                else if (arbolFrances.buscar(porTraducir.get(i)) != null) {
                    Lenguaje = 2;
                    break;
                }
                else{
                    Lenguaje = 3;
                }
            }
            
            //Dependiendo del lenguaje se traduce palabra a palabra y se concatena en un string
            if (Lenguaje == 1) {
                for (int i = 0; i < porTraducir.size(); i++) {
                    resultado = resultado + " " + arbolIngles.Traducir(porTraducir.get(i)) + " ";
                }
                
            }
            else if(Lenguaje == 2){
                for (int i = 0; i < porTraducir.size(); i++) {
                    resultado = resultado + " " + arbolFrances.Traducir(porTraducir.get(i)) + " ";
                }
                
            }
            else{
                resultado = "No se encuentra la palabra en ninguno de los diccionarios";
            }
            
        } catch (Exception e) {
            //TODO: handle exception
            resultado = "No se encontro el archivo";
        }

        
        
        return resultado;
    }
    
}
