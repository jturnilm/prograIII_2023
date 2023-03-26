/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jgraphx;
import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
/**
 *
 * @author ubuntu
 */
public class Jgraphx  extends JFrame{

    /**
     * @param args the command line arguments
     */
    private static final long serialVersionUID = -2707712944901661771L;

	public Jgraphx()
	{
		super("Hello, World!");

		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();

		graph.getModel().beginUpdate();
		try
		{
			Object padre = graph.insertVertex(parent, null, "Razas", 0, 0, 80,
					30);
			Object v2 = graph.insertVertex(parent, null, "labrador", 100, 30, 80,30);
                        Object v3 = graph.insertVertex(parent, null, "shitzu",100,70,  80,30);
                        Object v4 = graph.insertVertex(parent, null, "french",100, 100, 80,30);
                         
			graph.insertEdge(parent, null, "Edge", padre, v2);
                        graph.insertEdge(parent, null, "Edge", padre, v3);
                        graph.insertEdge(parent, null, "Edge", padre, v4);
                       // graph.insertEdge(parent, null, "Edge", padre, v2);
		}
		finally
		{
			graph.getModel().endUpdate();
		}

		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		getContentPane().add(graphComponent);
	}
    public static void main(String[] args) {
        // TODO code application logic here
        Jgraphx frame = new Jgraphx();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 320);
		frame.setVisible(true);
        
        avl arbol= new avl();
   arbol.raiz=     arbol.insert(arbol.raiz,20);
  arbol.raiz=       arbol.insert(arbol.raiz, 25);
   arbol.raiz=       arbol.insert(arbol.raiz, 24);
 /*    arbol.raiz=    arbol.insert(arbol.raiz, 15);
   arbol.raiz=      arbol.insert(arbol.raiz, 26);
    arbol.raiz=     arbol.insert(arbol.raiz, 30);*/
        
    }
    
}
