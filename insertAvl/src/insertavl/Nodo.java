/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insertavl;

/**
 *
 * @author ubuntu
 */
class Nodo {
    int valor;
    
    int altura, balanceo;
    Nodo izq, der;
    
    Nodo(int v)
    {
    valor=v;
    balanceo=0;
    altura=0;
    }
    
}
