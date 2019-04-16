import java.util.Scanner;

public class PrimMST {
	private static int [][] adj;
	private static int [] q;
	private static int n;
	//q[20],visited[20],n,i,j,r;
	public static void main(String [] args) {
		int v;
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int cases1=0; cases1<cases; cases1++){
		// Preparing the graph
		//System.out.println("Enter the number of vertices:" );
		n = sc.nextInt();
		//System.out.println("Enter graph data in adjacency matrix form: " );
		//System.out.println("Enter the number of edges:" );
		int edge = sc.nextInt();
		adj = new int [n+1][n+1];
		q = new int [n+1];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				adj[i][j] = 999;
			}
		}
		
		for(int i = 1; i <= edge; i++) {
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int value = sc.nextInt();
			adj[a1][a2] = value;
			adj[a2][a1] = value;

		}
		
	
		//for(int i = 1; i <= n; i++) {
		//	for(int j = 1; j <= n; j++) {
				//adj[i][j] = sc.nextInt();
		//		if(adj[i][j]==999) System.out.print("-"+" ");
		//		else System.out.print(adj[i][j]+" ");
		//	}
		//	System.out.println();
			//}

		//initialization Prim
		int r = -1;
		for(int i=0; i <=n; i++) {
			q[i]=0;
		}

		//for Prim-----------------------------------------------------
		//System.out.println("PRIM: MINIMUM SPANNING TREE");
		//if (r != (n-1)) //check for connectivity
		//	System.out.println(" The graph is not connected");
		//else
			Prim(n, adj);
		//System.out.println();
		//for Prim-----------------------------------------------------
		}
	}

	//Prim's Algorithm
		public static void Prim(int n, int [][] cost) {
		int ne=1, min,a=0,b=0,u = 0,v1 = 0,  mincost=0;
		int [] visited = new int [n+1];
		for(int i=1; i<=n; i++)
			visited[i] = 0;

		visited[1]=1;
		while(ne < n) {
			min = 999;
			for(int i=1; i<=n; i++)
				for(int j=1; j <=n ; j++)
					if(cost[i][j] < min)
						if(visited[i] != 0) {
							min = cost[i][j];
							a=u=i;
							b=v1=j;
						}
			if(visited[u]==0 || visited[v1]==0) {
				ne++;
				//System.out.printf("\n Edge %d:(%d %d) cost:%d",ne++,a,b,min);
				mincost+=min;
				visited[b]=1;
				
			}
			cost[a][b]=cost[b][a]=999;
		}
		//System.out.printf("\n Minimun cost=%d\n", mincost);
		System.out.println(mincost);
	} //end Prim's Algorithm
	
}