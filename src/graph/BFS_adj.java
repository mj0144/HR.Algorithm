package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class BFS_adj {

	
	private static int V; //정점 갯수
	private static int E; //간선 개수
	private static boolean[] visit; //방문여부
	private static List<List<Integer>> list;
	
	private static void bfs(int node) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(node);

		
		while(!q.isEmpty()) {
			int temp = q.poll(); //poll이 빼내면서 삭제하는데, 뺴내는 노드가 방문하는 노드
			visit[temp] = true;
			System.out.println(temp); //방문하는 노드는 찍어야지.
			
			for(int e : list.get(temp)) {
				if(!q.contains(e) && visit[e]==false) { //인접노드인데 방문하지 않은 노드들.
					q.offer(e); //큐에 넣고.						
				}				
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt();
		E = sc.nextInt();
		
		visit = new boolean[E+1];
		
		list = new ArrayList<List<Integer>>();
		
		for(int i=1; i<=E; i++) { //리스트 초기화
			list.add(new ArrayList<Integer>());
			visit[i] =false;
		}
		
		
		int a=0;
		int b=0;
		
		for(int i=1; i<=E; i++) {
			a = sc.nextInt(); //연결되어 있는 정점 입력
			b= sc.nextInt(); 
			
			list.get(a).add(b); //양방향이니깐 양쪽으로 넣어줌.
			list.get(b).add(a);
	
		}
		bfs(1);
	}



}
