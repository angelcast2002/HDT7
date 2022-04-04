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

    LeerDatos leer = new LeerDatos();
    ArrayList <String> datos = new ArrayList<>();

    Arbol arbolIngles = new Arbol();
    Arbol arbolFrances = new Arbol();

    public void Separar() {
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
                datos.add(palabras[j]);
            }
        }

    }

    public void CrearArboles() {
        
        ArrayList <String> Ingles = new ArrayList<>();
        ArrayList <String> Español = new ArrayList<>();
        ArrayList <String> Frances = new ArrayList<>();

        for (int i = 0; i < datos.size(); i++) {

            Ingles.add(datos.get(i));
            i = i + 1;
            Español.add(datos.get(i));
            i = i + 1;
            Frances.add(datos.get(i));

        }
        
        for (int i = 0; i < Ingles.size(); i++) {
            arbolIngles.insertar(Ingles.get(i), Español.get(i));
            
        }

        for (int i = 0; i < Frances.size(); i++) {
            arbolFrances.insertar(Frances.get(i), Español.get(i));
            
        }
        
        arbolIngles.inOrder(arbolIngles.raiz);

        arbolFrances.inOrder(arbolFrances.raiz);


    }
    
}
