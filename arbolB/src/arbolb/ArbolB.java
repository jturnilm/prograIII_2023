/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolb;

/**
 *
 * @author ubuntu
 */
public class ArbolB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int t = 3;//de 3 hasta 7
        //Se crea el arbol B segun t
        Arbol arbolB = new Arbol(t);
        
        //Valores a ingresar primera ronda
        int[] valoresUno = {50, 10, 20, 5, 40,75,55};
        //1/  |25|||||
///2/10,20,25,40,50                  /2/ 40,50,,
        System.out.println("-- INICIO --");
        System.out.println("INSERTANDO VALORES AL ARBOL B");
        for(int i=0; i<valoresUno.length; i++) {
            System.out.println("Insertando... valor " + valoresUno[i]);
            arbolB.insertar(valoresUno[i]);
        }

        arbolB.imprimir();
        
    }
    
}
