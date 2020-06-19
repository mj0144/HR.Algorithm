package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class BFS_adj {

	
	private static int V; //���� ����
	private static int E; //���� ����
	private static boolean[] visit; //�湮����
	private static List<List<Integer>> list;
	
	private static void bfs(int node) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(node);

		
		while(!q.isEmpty()) {
			int temp = q.poll(); //poll�� �����鼭 �����ϴµ�, ������ ��尡 �湮�ϴ� ���
			visit[temp] = true;
			System.out.println(temp); //�湮�ϴ� ���� ������.
			
			for(int e : list.get(temp)) {
				if(!q.contains(e) && visit[e]==false) { //��������ε� �湮���� ���� ����.
					q.offer(e); //ť�� �ְ�.						
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
		
		for(int i=1; i<=E; i++) { //����Ʈ �ʱ�ȭ
			list.add(new ArrayList<Integer>());
			visit[i] =false;
		}
		
		
		int a=0;
		int b=0;
		
		for(int i=1; i<=E; i++) {
			a = sc.nextInt(); //����Ǿ� �ִ� ���� �Է�
			b= sc.nextInt(); 
			
			list.get(a).add(b); //������̴ϱ� �������� �־���.
			list.get(b).add(a);
	
		}
		bfs(1);
	}



}
