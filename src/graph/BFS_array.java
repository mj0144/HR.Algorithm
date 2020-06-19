package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_array {
	private static int V;//정점
	private static int E;//간선
	
	private static boolean[] visit;
	private static int[][] array;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();

		array = new int[E+1][E+1];
		visit = new boolean[E+1];
		
		
		int a=0;
		int b=0;
		for(int i=1; i<=E; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			array[b][a] = 1;
			array[a][b] = 1;
			
		}
		
		bfs(1);
		
		
	}
	
	
	
	private static void bfs(int node) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(node);
//		
//		visit[node] = true;
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			visit[temp] = true;
			System.out.println(temp);
			
			for(int i=1; i<=E; i++) {
				if(!q.contains(i) && visit[i]==false && array[temp][i]==1) {
					q.offer(i);
				}
			}
			
		}
		
	}
}
