/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadinamicaprograiii;

/**
 *
 * @author ubuntu
 */
public class ListaADM {
        Miobjeto primero;//nulo 
    
    
    void agregar_pastel(String pastel) {
    
        if(primero==null)//primera vez
        { primero= new Miobjeto();
            primero.nombre=pastel;
        }
        else    // 2nda en adelante
        {
        //2
        //2
        
        Miobjeto pastel_aux = new Miobjeto();
        pastel_aux.nombre=pastel;
        
      //  x-y-o-m-
        
        if(primero.siguiente==null)
        primero.siguiente=pastel_aux;//es la 2nda vez
        else            //3 en adelante
        {
        /*int v[20];
        for(int i;i<20; i++)
            int iterador=v[20];*/
        Miobjeto iterador=primero.siguiente;//es el 2ndo vd
        boolean insertado=false;
        while(iterador!=null & insertado==false){
            
        if(iterador.siguiente!=null)
        {
             iterador=iterador.siguiente;
         
         
        }
        else{
       iterador.siguiente=pastel_aux;  
        insertado=true;
        }
        
        
            
        }
        
            
            
        }
    }
    
}

    boolean buscar(String pastel) {
        
        if(primero.nombre.equals(pastel))
            return true;
        
            Miobjeto iterador=primero.siguiente;//es el 2ndo vd
       
        while(iterador!=null ){
            
        if(!iterador.nombre.equals(pastel))
        {
             iterador=iterador.siguiente;
        }
        else{
            
       return true;
        
        }
    
        }
        
        return false;
    }
    
     boolean buscarR(String pastel,Miobjeto s)
    {
            //iterador=iterador.siguiente;
        if(s!=null ){
                        if(!s.nombre.equals(pastel))
                        {return true;}
                         else
                        buscarR(pastel,s.siguiente);
                     }
        else
            return false;
        
        return false;
    }
   
}