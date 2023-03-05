/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolitomuestra;

/**
 *
 * @author ubuntu
 */
public class Arbolitomuestra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        Nodo n;
        n=new Nodo(5);
        
        
  Arbol  lista= new Arbol();
  lista.insertar(15);
  
  lista.insertar(2);
  lista.insertar(3);
  lista.insertar(16);
  lista.insertar(17);
  lista.insertar(20);
  
  lista.imprimimos(lista.raiz);
 
  lista.imprimimos2(lista.raiz);
  
  lista.imprimimos3(lista.raiz);

    }
    
}
