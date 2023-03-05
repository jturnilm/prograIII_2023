/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolitomuestra;

/**
 *
 * @author ubuntu
 */
class Arbol {
    Nodo raiz;
    public void insertar(int v){
    
        if(raiz==null)
        {
            raiz=new Nodo(v);
            
        }/*validacion que la raiz es null*/
        else{
            Nodo aux=raiz,anterior=null;
            
            /*
            Nodo aux=raiz;
            Nodo anterior=null;
            
            */
            while(aux!=null)
            {
           /*  buscar donde realizara el insert*/
                
                anterior =aux;
                if(aux.valor<v)
                 aux=   aux.izq;
                else
                    aux=aux.der;
            }
            /*realiza el insert*/
            if(anterior.valor<v)
                anterior.izq=new Nodo(v);
            else
                anterior.der=new Nodo(v);
        }
    }
    
 void   imprimimos(Nodo n){//inorden
        if(n.izq!=null)
            imprimimos(n.izq);        
        System.out.println(n.valor);
        if(n.der!=null)
                       imprimimos(n.der);
    }

 
 
  void   imprimimos2(Nodo n){//postorden
        System.out.println(n.valor);

      if(n.izq!=null)
            imprimimos2(n.izq);
        
        if(n.der!=null)
            imprimimos2(n.der);
    
    }
         

  void   imprimimos3(Nodo n){//preorden
     
      if(n.izq!=null)
            imprimimos3(n.izq);
        
        if(n.der!=null)
            imprimimos3(n.der);
       System.out.println(n.valor);

    }
}
