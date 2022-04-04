/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HDT7;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Menu {
    public static void main(String[] args) {
        Acciones ac = new Acciones();
        ac.Separar();
        ac.CrearArboles();
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        boolean salir = false;
        
       
        
        while (salir == false) {
            System.out.println("Ingrese una opcion");
            System.out.println("1. Agregar un nodo");
            System.out.println("2. Eliminar un nodo de un solo diccionario");
            //System.out.println("3. Eliminar un nodo de todos los diccionarios");
            System.out.println("3. Cargar un txt para traducirlo");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la palabra en ingles");
                    String palabra = sc.nextLine();
                    System.out.println("Ingrese la traduccion en español");
                    String traduccion = sc.nextLine();
                    System.out.println("Ingrese la traduccion en frances");
                    String traduccion2 = sc.nextLine();
                    System.out.println(ac.Insertar(palabra, traduccion, traduccion2));
                    break;
                case 2:
                    System.out.println("Ingrese un id para eliminarlo del arbol");
                    String id = sc.nextLine();
                    System.out.println(ac.eliminar(id));
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del archivo");
                    String nombre = sc.nextLine();
                    System.out.println(ac.Traducir(nombre));
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
            
        }
        
        //pedir un dato tipo string y guardarlo en una variable llamada id
        
       
    }
}
