
public class Test {

	public static void main(String[] args) {
	/*	GraphAM g = new GraphAM(5);
		
		g.addEdge(0, 2, 12);
		g.addEdge(0, 3, 60);
		g.addEdge(1, 0, 10);
		g.addEdge(2, 1, 20);
		g.addEdge(2, 3, 32);
		g.addEdge(4, 0, 7);
		
		g.displayGraph();
	*/
		
		
		
		GraphAL a = new GraphAL(5);
		
		a.addEdge(0, 2);
		a.addEdge(0, 3);
		a.addEdge(1, 0);
		a.addEdge(2, 1);
		a.addEdge(2, 3);
		a.addEdge(4, 0);
		
		
		a.displayGraph();
		a.DFS(0);
		
	}
}
