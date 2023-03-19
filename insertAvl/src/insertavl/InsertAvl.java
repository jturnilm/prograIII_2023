/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertavl;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import javax.swing.JFrame;
/**
 *
 * @author ubuntu
 */
public class InsertAvl extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    public InsertAvl()
	{
		super("Hello, World!");

		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();

		graph.getModel().beginUpdate();
		try
		{
			Object v1 = graph.insertVertex(parent, null, "Razas", 20, 20,    80,30);
			Object v2 = graph.insertVertex(parent, null, "Golden!", 20, 150,  80, 30);
                        Object v3 = graph.insertVertex(parent, null, "fench", 80, 150,    80,30);
                        Object v4 = graph.insertVertex(parent, null, "shitzu", 130, 150,    80,30);
                        Object v5 = graph.insertVertex(parent, null, "boxer", 180, 150,    80,30);
                        
                        Object v6 = graph.insertVertex(parent, null, "pitbull", 180, 200,    80,30);
			graph.insertEdge(parent, null, "", v1, v2);
                        graph.insertEdge(parent, null, "", v1, v3);
                        graph.insertEdge(parent, null, "", v1, v4);
                        graph.insertEdge(parent, null, "", v5, v6);
                        
                        
                        
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
        
        InsertAvl frame = new InsertAvl();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 320);
		frame.setVisible(true);
        
        
        Avl arbol= new Avl();
     arbol.raiz=  arbol.insertar(arbol.raiz,20);
      arbol.raiz=  arbol.insertar(arbol.raiz,15);
       arbol.raiz=  arbol.insertar(arbol.raiz,25);
        arbol.raiz=  arbol.insertar(arbol.raiz,16);
          arbol.raiz=  arbol.insertar(arbol.raiz,17);
    }
    
}
