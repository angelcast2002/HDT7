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

    /**
     *
     * @param args
     */
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
            //--* System.out.println("3. Eliminar un nodo de todos los diccionarios");
            System.out.println("3. Cargar un txt para traducirlo");
            System.out.println("4. Imprimir InOrden los diccionarios");
            System.out.println("5. Salir");
            //Se imprimen las opciones del menu
            opcion = sc.nextInt();
            sc.nextLine();

            //Se ejecutan las opciones del menu
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
                    //pedir el diccionario a imprimir
                    //siendo 1 para ingles y 2 para frances
                    System.out.println("Ingrese el diccionario a imprimir, 1 para ingles y 2 para frances");
                    int diccionario = sc.nextInt();
                    sc.nextLine();

                    if (diccionario == 1) {
                        System.out.println("----Diccionario Ingles: ");
                        ac.arbolIngles.inOrder(ac.arbolIngles.raiz);
                    } if (diccionario == 2) {
                        System.out.println("----Diccionario Frances: ");
                        ac.arbolFrances.inOrder(ac.arbolFrances.raiz);
                    }
                    else {
                        System.out.println("Opcion invalida");
                    }

                    break;
                case 5:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
            
        }

        //--* Codigo generado con ayuda de githubcopilot
        
       
    }
}
