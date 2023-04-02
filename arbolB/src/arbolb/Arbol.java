/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolb;

/**
 *
 * @author ubuntu
 */
public class Arbol {
    
NodoB root;
    int t;

    //Constructor
    public Arbol(int t) {
        this.t = t;
        root = new NodoB(t); //inicaliza el arbol
    }

 /*
                        |||
    
                |20|25|30|          |30|||
    
    
    
    */
    public void insertar(int key) {
        NodoB r = root;

        //Si el nodo esta lleno lo debe separar antes de insertar
        if (r.n == ((2 * t) - 1)) {
            NodoB s = new NodoB(t); 
            root = s;
            s.leaf = false;
            s.n = 0;
            s.child[0] = r;
            split(s, 0, r); //dividimos
            nonFullInsert(s, key); //insertamos
        } else {
            nonFullInsert(r, key);
        }
    }
    
    // Caso cuando la raiz se divide
    // x =          | | | | | |
    //             /
    //      |10|20|30|40|50|            |40|50|||
    // i = 0
    // y = |10|20|30|40|50|
    private void split(NodoB x, int i, NodoB y) {
        //x es la raiz
        //y es el q trae los valroes y a ser dividido 
        
        //Nodo temporal que sera el hijo i + 1 de x
        NodoB z = new NodoB(t);
        z.leaf = y.leaf;
        z.n = (t - 1);

        //Copia las ultimas (t - 1) claves del nodo y al inicio del nodo z      // z = |40|50| | | |
        for (int j = 0; j < (t - 1); j++) {
            z.key[j] = y.key[(j + t)];
        }

        //Si no es hoja hay que reasignar los nodos hijos
        if (!y.leaf) {
            for (int k = 0; k < t; k++) {
                z.child[k] = y.child[(k + t)];
            }
        }

        //nuevo tamanio de y                                                    // x =            | | | | | |
        y.n = (t - 1);                                                          //               /   \
                                                                                //  |10|20| | | |
        //Mueve los hijos de x para darle espacio a z
        for (int j = x.n; j > i; j--) {
            x.child[(j + 1)] = x.child[j];
        }
        //Reasigna el hijo (i+1) de x                                           // x =            | | | | | |
        x.child[(i + 1)] = z;                                                   //               /   \
                                                                                //  |10|20| | | |     |40|50| | | |
        //Mueve las claves de x
        for (int j = x.n; j > i; j--) {
            x.key[(j + 1)] = x.key[j];
        }

        //Agrega la clave situada en la mediana                                 // x =            |25| | | | |
        x.key[i] = y.key[(t - 1)];                                              //               /    \
        x.n++;                                                                  //  |10|20| | | |      |40|50|75| | |
    }

    private void nonFullInsert(NodoB x, int key) {
        //Si es una hoja
        if (x.leaf) {
            int i = x.n; //cantidad de valores del nodo
            //busca la posicion i donde asignar el valor
            while (i >= 1 && key < x.key[i - 1]) {
                int temp= x.key[i - 1];
                x.key[i] = x.key[i - 1];//Desplaza los valores mayores a key            |2|4|5 |
                i--;
            }

            x.key[i] = key;//asigna el valor al nodo
            x.n++; //aumenta la cantidad de elementos del nodo
        } else {
            int j = 0;
            //Busca la posicion del hijo
            
            /*
            
                |25||||
            
        |10|15||        |40|50|||    
            */
            while (j < x.n && key > x.key[j]) {
                j++;
            }

            //Si el nodo hijo esta lleno lo separa
            if (x.child[j].n == (2 * t - 1)) {
                split(x, j, x.child[j]);

                if (key > x.key[j]) {
                    j++;
                }
            }

            nonFullInsert(x.child[j], key);
        }
    }

    public void imprimir(){//no trae nodo inicial
    imprimir(this.root);//se envia la raiz para empezar 
    }
    
         private void imprimir(NodoB n) {//la primera vez se recibe la raiz
        n.imprimir();//imprimimos la cabeza

        //Si no es hoja
        if (!n.leaf) { ///vemos que si tiene hijos al no permitir hacer insert
            //recorre los nodos para saber si tiene hijos
            for (int j = 0; j <= n.n; j++) {
                if (n.child[j] != null) {
                    System.out.println();
                    imprimir(n.child[j]);
                }
            }
        }
    }
    
}


