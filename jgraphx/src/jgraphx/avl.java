/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jgraphx;

/**
 *
 * @author ubuntu
 */
public class avl {
   public Nodo raiz;
    int max(int a, int b)
    {
    return (a>b)?a:b;
    }
    int altura(Nodo r){
    if(r!=null) return r.altura;
   
    return 0;
        
    }
    int balance(Nodo r){
    if(r==null)
        return 0;
    return altura(r.izq)-altura(r.der);
       
    }
    public Nodo insert(Nodo r, int x){
    
        if(r==null){
        return new Nodo(x);
        }
        else 
            if(r.valor>x){
            r.izq=insert(r.izq,x);
            }
        else
            {
          r.der=  insert(r.der,x);
            }
        r.altura=max(altura(r.der),altura(r.izq))+1;
        
        r.balance=balance(r);
        
        if(r.balance>1 && x<r.izq.valor)
            System.out.println("debalanceado 1");
        if(r.balance<-1 && x<r.der.valor)
        { 
            System.out.println("debalanceado 2");
     r=   balanceado2(r);
        }
        
        
        
        if(r.balance>1 && x>r.izq.valor)
        {System.out.println("debalanceado 3");
      //  balancear3(r);
        }
        if(r.balance<-1 && x>r.der.valor)
        {System.out.println("debalanceado 4");
        r=balancear4(r);
        }
        
        
    return r;
    }
    
    public Nodo balanceado2(Nodo n){
        
        System.out.println("n1 "+n.valor);
         System.out.println("n2 "+n.der.valor);
          System.out.println("n2 "+n.der.izq.valor);
          Nodo n1=n;//20
          Nodo n2=n.der;//25
          Nodo n3=n.der.izq;//24
          
          n3.izq=n1;
          //n1.der=null
          n3.izq.der=null;
          n3.izq.altura=1; n3.izq.balance=0;
          n3.der=n2;
          n3.der.izq=null; 
          
          n3.der.altura=1;
          n3.der.balance=0;
          
           n3.altura=max(altura(n3.der),altura(n3.izq))+1;
        
        n3.balance=balance(n3);
          return n3;
    }
    
    public Nodo balancear4(Nodo n){
        System.out.println("n:"+n.valor);
          System.out.println("n2:"+n.der.valor);
          if(n.der.der!=null)
          {System.out.println("3 en fila a la derecha n3:"+n.der.der.valor);
          //el primero debe de bajar y el 2ndo debe de subi
          Nodo n1=n;//25
         
          Nodo n2=n.der;//26
          Nodo n3= n.der.der; //este no lo vamos a usar 30
          n2.izq=n1;
          n=n2;
          n2.izq.der=null; 
          n2.izq.altura=1; 
          n2.izq.balance=0;//agarramos el n1 y lo reiniciamos como si fuera un nodo hoja
          
        n2.altura=max(altura(n2.der),altura(n2.izq))+1;
        
        n2.balance=balance(n2);
          
        return n2;
    
    }
          else
          {    System.out.println("3 cruzados n3:"+n.der.izq.valor);
          
          Nodo n1=n;//20
          Nodo n2=n.der;//26
          Nodo n3=n.der.izq;//24
          
          n3.izq=n1;
          
          n3.der=n2;
          }
          
          
          return n;
          
    }
    public void balancear3(Nodo n3){
        System.out.println("n:"+n3.valor);
          System.out.println("n2:"+n3.der.valor);
          System.out.println("n3:"+n3.der.der.valor);
          
    }
    
}
