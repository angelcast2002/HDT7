/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HDT7;

/**
 *
 * @author Angel
 */
public class Arbol {

    Nodo raiz;
    public Arbol() {
        raiz = null;
    }

    public void insertar(String id, String contenido) {
        Nodo n = new Nodo(id, contenido);
        
        //SI LA RAIZ ES NULA SIGNIFICA QUE NO HA EMPEZADO A CRECER EL ARBOL
        if (raiz==null) {
            raiz=n;
        }else{
            // DE LO CONTRARIO CREAMO UN NO AUXILIAR ARA BUSCAR EN DONDE COLOCARLO, SI A LA DER O IZQ
            Nodo aux = raiz;
            //MIENTRAS EL AUXILIAR NO SEA NULO HAGAMOS QUE EL PADRE DEL NODO SEA EL AUXILIAR,
            //ASI VAMOS SUBIENDO EN EL ARBOL
            while(aux != null){
                
                n.padre = aux;
                //VALIDAMOS, SI EL INDICE ES MAYOR ENTONCES VA A LA DERECHA
                if (n.id.compareTo(aux.id) == 0 || n.id.compareTo(aux.id) > 0) { 
                    aux=aux.derecha;
                }else{
                    //SI NO VA A LA IZQUIERDA
                    aux=aux.izquierda;
                }
            }
            //si la llave del nodo actual es menor al indice del nodo padre entonces enlazo la direccion
            //dentro del arbol
            if (n.id.compareTo(aux.id) < 0) {
                n.padre.izquierda = n;
            }else{
                n.padre.derecha=n;
            }
        }
    }

    public void inOrder(Nodo N){
        if(N != null){
            inOrder(N.izquierda);
            System.out.println("(" + N.id + "," + N.contenido + ")");
            inOrder(N.derecha);
        }
    }

    private class Nodo{
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public String id;
        public String contenido;

        public Nodo(String llave, String contenido) {
            this.id = llave;
            this.contenido = contenido;
            this.padre = null;
            this.derecha = null;
            this.izquierda = null;
        }
    }
    
}
