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

    /**
     *
     */
    public Arbol() {
        raiz = null;
    }

    /**
     *
     * @param id
     * @param contenido
     */
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
            if (n.id.compareTo(n.padre.id) < 0) {
                n.padre.izquierda = n;
            }else{
                n.padre.derecha=n;
            }
        }
    }

    //Metodo para eliminar un nodo del Arbol

    /**
     *
     * @param id
     * @return
     */
    public String eliminar(String id) {
        String Mensaje = "";
        Nodo aux = raiz;
        Nodo padre = null;
        //BUSCAMOS EL NODO A ELIMINAR
        while (aux != null && !aux.id.equals(id)) {
            padre = aux;
            if (id.compareTo(aux.id) < 0) {
                aux = aux.izquierda;
            } else {
                aux = aux.derecha;
            }
        }
        //SI EL NODO A ELIMINAR NO EXISTE
        if (aux == null) {
            Mensaje = ("El nodo no existe");
        } else {
            //SI EL NODO A ELIMINAR ES LA RAIZ
            if (aux == raiz) {
                if (aux.izquierda == null && aux.derecha == null) {
                    raiz = null;
                } else if (aux.izquierda == null) {
                    raiz = aux.derecha;
                } else if (aux.derecha == null) {
                    raiz = aux.izquierda;
                } else {
                    Nodo aux2 = aux.izquierda;
                    Nodo padre2 = aux;
                    while (aux2.derecha != null) {
                        padre2 = aux2;
                        aux2 = aux2.derecha;
                    }
                    aux.id = aux2.id;
                    aux2.id = id;
                    if (padre2.derecha == aux2) {
                        padre2.derecha = aux2.izquierda;
                    } else {
                        padre2.izquierda = aux2.izquierda;
                    }
                }
            } else {
                //SI EL NODO A ELIMINAR NO ES LA RAIZ
                if (aux.izquierda == null && aux.derecha == null) {
                    if (aux.id.compareTo(padre.id) < 0) {
                        padre.izquierda = null;
                    } else {
                        padre.derecha = null;
                    }
                } else if (aux.izquierda == null) {
                    if (aux.id.compareTo(padre.id) < 0) {
                        padre.izquierda = aux.derecha;
                    } else {
                        padre.derecha = aux.derecha;
                    }
                } else if (aux.derecha == null) {
                    if (aux.id.compareTo(padre.id) < 0) {
                        padre.izquierda = aux.izquierda;
                    } else {
                        padre.derecha = aux.izquierda;
                    }
                } else {
                    Nodo aux2 = aux.izquierda;
                    Nodo padre2 = aux;
                    while (aux2.derecha != null) {
                        padre2 = aux2;
                        aux2 = aux2.derecha;
                    }
                    aux.id = aux2.id;
                    aux2.id = id;
                    if (padre2.derecha == aux2) {
                        padre2.derecha = aux2.izquierda;
                    } else {
                        padre2.izquierda = aux2.izquierda;
                    }
                }
            }
            Mensaje = "El nodo " + id + " ha sido eliminado";
        }
        return Mensaje;
        // obtenido de https://www.youtube.com/watch?v=22AE6WklXBg con algunas modificaciones
    } 
    
    /**
     *
     * @param N
     */
    public void inOrder(Nodo N){
        if(N != null){
            inOrder(N.izquierda);
            System.out.println("(" + N.id + "," + N.contenido + ")");
            inOrder(N.derecha);
        }
        // hecho con la ayuda de githubcopilot
    }

    /**
     *
     * @param id
     * @return
     */
    public String buscar(String id) {
        //se busca el nodo con el id que se le pasa y se retorna su contenido si existe de lo contraio se retorna un valor null
        String Mensaje = "";
        Nodo aux = raiz;
        while (aux != null && !aux.id.equals(id)) {
            if (id.compareTo(aux.id) < 0) {
                aux = aux.izquierda;
            } else {
                aux = aux.derecha;
            }
        }
        if (aux == null) {
            Mensaje = null;
        } else {
            Mensaje = id;
        }
        return Mensaje;
        // hecho con la ayuda de githubcopilot
    }

    /**
     *
     * @param id
     * @return
     */
    public String Traducir(String id){
        //se busca el nodo con el id que se le pasa y regresa el contenido del mismo, la traduccion
        //de lo contrario se retorna el valor original del id encerrado entre asteriscos
        String Mensaje = "";
        Nodo aux = raiz;
        while (aux != null && !aux.id.equals(id)) {
            if (id.compareTo(aux.id) < 0) {
                aux = aux.izquierda;
            } else {
                aux = aux.derecha;
            }
        }
        if (aux == null) {
            Mensaje = "*" + id + "*";
        } else {
            Mensaje = aux.contenido;
        }
        return Mensaje;
        // hecho con la ayuda de githubcopilot
    }

    /**
     *
     */
    public class Nodo{
        //clase nodo que contiene los atributos de un nodo del arbol

        /**
         *
         */
        public Nodo padre;

        /**
         *
         */
        public Nodo derecha;

        /**
         *
         */
        public Nodo izquierda;

        /**
         *
         */
        public String id;

        /**
         *
         */
        public String contenido;

        /**
         *
         * @param llave
         * @param contenido
         */
        public Nodo(String llave, String contenido) {
            //constructor de la clase nodo
            this.id = llave;
            this.contenido = contenido;
            this.padre = null;
            this.derecha = null;
            this.izquierda = null;
        }
    }
    
}
