package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class adjcency {

	private static int V;
	private static int E;
	private static List<List<Integer>> list;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt(); //������ ����
		E = sc.nextInt(); // ��������


		List<ArrayList<Integer>> list = new LinkedList<ArrayList<Integer>>();
		
		
		for(int i=0; i<E; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		int a=0;
		int b=0;
		for(int i=1; i<=E; i++) {
			a= sc.nextInt(); //�������� �̾��� �ִ� ��
			b = sc.nextInt();
			
			list.get(a).add(b);
			list.get(b).add(a);
			
			
		}
		
	}
	
}
