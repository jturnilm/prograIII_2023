/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insertavl;

/**
 *
 * @author ubuntu
 */
public class Avl {
   
    
        Nodo raiz;
        
        public Nodo insertar(Nodo r,int v){
           if(r==null)
        {
            return new Nodo(v);
            
        } 
           else
           {
               if(v<r.valor)
               { r.izq=insertar(r.izq, v);}
               else
               {r.der=insertar(r.der, v);}
           
           }
           
           r.altura= max(altura(r.izq),altura(r.der))+1;
           
           r.balanceo = balanceo(r);
           
           if(r.balanceo >=2)
                System.out.println("balanceo 1");
           
           if(r.balanceo<=-2)
                System.out.println("balanceo 2");
           
           return r;
        }
        
     int balanceo( Nodo r)
     {
     if(r==null)
         return 0;
     
     return altura(r.izq)-altura(r.der);
     }
        
   int altura(Nodo r)
   {
       if(r==null)
           return 0;
      
       return r.altura;
       
   }
   
   int max(int a, int b)
   {
       if(a>b) return a;
       
       return b;
   
   }
    
}
