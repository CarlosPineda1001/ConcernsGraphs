import java.util.Iterator;
import java.util.LinkedList;

public class GraphAL {
	int n;
	LinkedList<Integer>[] al;
	int [] weight;
	
	public GraphAL(int n) {
		this.n = n;
		al = new LinkedList[n];
		for(int i = 0; i < al.length; i++) {
			al[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int start, int end) {
		al[start].add(end);
	}
	
	public void displayGraph() {
		System.out.println("Adjacency List");
		System.out.println("===============");
		for(int i = 0; i < al.length; i++) {
			switch(i) {
			case(0): System.out.print('A' + ": ");
					break;
			case(1): System.out.print('B' + ": ");
					break;
			case(2): System.out.print('C' + ": ");
					break;
			case(3): System.out.print('D' + ": ");
					break;
			case(4): System.out.print('E' + ": ");
					break;
			}
			for(int j = 0; j < al[i].size(); j++) {
				System.out.print(al[i].get(j) + " ");
			}
			System.out.println();
		}
	}
	
	void BFS(int start) {
		boolean visited[] = new boolean[n];			//creating an array that will monitor the nodes if they are visited or not
													//initial value is false
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[start] = true;
		queue.add(start);
		
		while(queue.size() !=0) {
			start = queue.poll();
			switch(start) {
			case(0): System.out.print('A' + " ");
					break;
			case(1): System.out.print('B' + " ");
					break;
			case(2): System.out.print('C' + " ");
					break;
			case(3): System.out.print('D' + " ");
					break;
			case(4): System.out.print('E' + " ");
					break;
			}
			
			//System.out.print(start + " ");
			
			Iterator<Integer> i = al[start].listIterator();
			while(i.hasNext()) 
			{
				int n = i.next();
				if(!visited[n]) 
				{
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	private void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        switch(v) {
		case(0): System.out.print('A' + " ");
				break;
		case(1): System.out.print('B' + " ");
				break;
		case(2): System.out.print('C' + " ");
				break;
		case(3): System.out.print('D' + " ");
				break;
		case(4): System.out.print('E' + " ");
				break;
		}

        Iterator<Integer> i = al[v].listIterator();
        while(i.hasNext()) {
            int n = i.next();
            if(!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

        void DFS(int v) {
            boolean visited[] = new boolean[n];
            DFSUtil(v,visited);
        }
	
	

}