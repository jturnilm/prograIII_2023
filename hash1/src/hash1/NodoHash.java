/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash1;

/**
 *
 * @author ubuntu
 */
public class NodoHash {
     
    NodoHash siguiente;
    String nombre;
    int data;

    /* Constructor */
    public NodoHash(int x,String n) {
        data = x;
        nombre=n;
        siguiente = null;
    }
}
