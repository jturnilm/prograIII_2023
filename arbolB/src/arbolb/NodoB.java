/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolb;

/**
 *
 * @author ubuntu
 */
public class NodoB {
      int n; //numero de claves almacenadas en el nodo
    boolean leaf; //Si el nodo es hoja (nodo hoja=true; nodo interno=false)
    int key[];  //almacena las claves en el nodo
    NodoB child[]; //arreglo con referencias a los hijos

    //Constructores
    public NodoB(int t) {
        n = 0;
        leaf = true;
        key = new int[((2 * t) - 1)];     
        child = new NodoB[(2 * t)];
    }
    
    /*
               |5|20|30|
      
      ||||   |15|16|18|   ||||     ||||  
     */

    /*[ 1|2|3|..]*/
    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(key[i] + " | ");
            } else {
                System.out.print(key[i]);
            }
        }
        System.out.print("]");
    }

    public int find(int k) {
        for (int i = 0; i < n; i++) {
            if (key[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
