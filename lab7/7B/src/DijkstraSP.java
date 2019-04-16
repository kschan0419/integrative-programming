import java.util.Scanner;

public class DijkstraSP {
	private static int [][] adj;
	private static int n;
	//int q[20],visited[20],n,i,j,f,r;
	//double infinity = Double.POSITIVE_INFINITY;

	public static void main(String [] args) {
		int v;
		int [][] cost;
		int [] dist ; //= new int[10]; //for Dijkstra
		Scanner sc = new Scanner(System.in);

		//System.out.println("Enter the number of vertices:" );
		n = sc.nextInt();
		//System.out.println("Enter graph data in adjacency matrix form: " );
		adj = new int [n+1][n+1];
		cost = new int [n+1][n+1];
		dist = new int [n+1];

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				adj[i][j] = sc.nextInt();
				cost[i][j] = adj[i][j];
				if (cost[i][j] == 0)
					cost[i][j] = 999; //Integer.MAX_VALUE;			
			}
		}

		//Dijkstra process starts ...
		//System.out.println("DIJKSTRA: SHORTEST PATH");
		//System.out.println("Enter the source vertex:");
		
		String str [] = new String [n];
		sc.nextLine();
		for(int y=0; y<n; y++){
			str[y] = sc.nextLine();
		}
		
		int nc = sc.nextInt();
		for(int x=0; x<nc; x++){
		v = sc.nextInt();
		int end = sc.nextInt();
		dijkstra(n, v, cost, dist);

		//Printing result ...
		//System.out.println(" Shortest path: ");
		
		for(int i = 1; i <= n; i++) {
			if (i == end)
				System.out.println(str[v-1]+" to "+str[i-1]+" is "+dist[i]+" km");
		}
		
	    }
		
	}

	//Dijkstra's Algorithm
	public static void dijkstra(int n, int v, int [][] cost,int []dist) {
		int u=0, count, min;
		int [] flag = new int[n+1];
		for(int i = 1; i <= n; i++) {
			flag[i] = 0;
			dist[i] = cost[v][i];
		}
		count = 2;
		while(count <= n) {
			min=999;
			for(int w = 1; w <=n; w++)
				if((dist[w] < min) && (flag[w] == 0)) {
					min=dist[w];
					u=w;
				}
			flag[u]=1;
			count++;
			for(int w = 1; w <= n; w++)
				if((dist[u]+cost[u][w]<dist[w]) && (flag[w]== 0))
					dist[w]=dist[u]+cost[u][w];
		}
	} //ends of Dijkstra
	
	/*
	 12
	 0 47 412 0 0 0 0 0 0 0 0 0
	 47 0 357 118 0 236 0 0 0 0 0 0
	 412 357 0 0 159 0 0 0 0 0 0 0
	 0 118 0 0 0 161 0 0 0 0 0 0
	 0 0 159 0 0 0 0 232 0 0 0 0
	 0 236 0 161 0 0 89 0 205 0 0 0
	 0 0 0 0 0 89 0 340 206 0 0 0
	 0 0 0 0 232 0 340 0 233 293 0 344
	 0 0 0 0 0 205 206 233 0 64 0 0
	 0 0 0 0 0 0 0 293 64 0 86 0
	 0 0 0 0 0 0 0 0 0 86 0 225
	 0 0 0 0 0 0 0 344 0 0 225 0 
	 Kangar
	 Alor Setar
	 Kota Bharu
	 George Town
	 Kuala Terengganu
	 Ipoh
	 Cameron Highlands
	 Kuantan
	 Kuala Lumpur
	 Seremban
	 Melaka
	 Johor Baharu
	 3
	 1 3
	 10 8
	 8 2
	 */
}