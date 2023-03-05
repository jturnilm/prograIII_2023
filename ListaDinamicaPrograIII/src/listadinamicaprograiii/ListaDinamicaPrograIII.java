/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadinamicaprograiii;

/**
 *
 * @author ubuntu
 */
public class ListaDinamicaPrograIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*Miobjeto pastel1=new Miobjeto();
        pastel1.nombre="freas con crema";
        
        Miobjeto pastel2= new Miobjeto();
        
        pastel2.nombre="tiramisu";
        
        
        Miobjeto pastel3= new Miobjeto();
        pastel3.nombre="3leches";
        
        
        
        pastel1.siguiente=pastel2;
        pastel2.siguiente=pastel3;
        
        Miobjeto pastel4= new Miobjeto();
        pastel4.nombre="chocolate";
        
              pastel3.siguiente=pastel4;  
        
        pastel4.siguiente=pastel1;
        
        
        
        System.out.println("pastel1"+pastel1.nombre);
        System.out.println("pastel2"+pastel1.siguiente.nombre);
        System.out.println("pastel3"+pastel1.siguiente.siguiente.nombre);
        System.out.println("pastel4"+pastel1.siguiente.siguiente.siguiente.nombre);
        System.out.println("pastel1*"+pastel1.siguiente.siguiente.siguiente.siguiente.nombre);
         
        
        */
       
       ListaADM lista=new ListaADM();
       
       lista.agregar_pastel("fresas con crema");
       lista.agregar_pastel("tiramisu");
       lista.agregar_pastel("3leches");
       lista.agregar_pastel("chocolate");
       lista.agregar_pastel("frutas");
       
       
       lista.buscar("fresas con crema");
        lista.buscar("chocolate");
       lista.buscarR("tiramisu", lista.primero);
    }
    
}
