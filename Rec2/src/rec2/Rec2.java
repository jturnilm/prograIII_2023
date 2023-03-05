/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rec2;

/**
 *
 * @author ubuntu
 */
public class Rec2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        r1(0);
    }
    
    public static  int r1(int v)
    {
    if(v<3)
    { 
        System.out.println("v1"+v);
        int x=++v;
        r1(x);
        System.out.println("de regreso v"+v);
    }
    else{System.out.println("fin v:"+v);}
        System.out.println("v2"+v);
    
    
    return 0;
    }
}
