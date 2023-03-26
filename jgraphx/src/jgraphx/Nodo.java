/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jgraphx;

/**
 *
 * @author ubuntu
 */
public class Nodo {
    int valor;
    Nodo der;
    Nodo izq;
    int altura, balance;
    Nodo(int x){this.valor=x; altura=1;balance=0;}
    
}
