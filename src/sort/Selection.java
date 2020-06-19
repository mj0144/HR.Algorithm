package sort;

import java.util.Scanner;

public class Selection {

	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�� : ");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		sort(array);
		
	}


	private static void sort(int[] array2) {
		
		int temp=0; //swap �ӽú���
		int index=0; //�ּڰ��� ������ �ε���
		
		for(int i=0; i<array2.length-1; i++) {
			int min = array2[i]; //�ּڰ�
			index = i; //i�� �ּڰ��� �� �����ϱ�
			for(int j=i+1; j<array2.length; j++) {
				if(array2[j]<min) {
					min = array2[j];	
					index=j; //�ּڰ��� ���ŵ� ������ �ε����� ����.		
				}				
			}
			temp = array2[index];
			array2[index] = array2[i];
			array2[i] = temp;
			
		}
		
//		for(int i=0; i<array2.length; i++) {
//			int indexMin = i;
//			for(int j=i+1; j<array2.length; j++) {
//				if(array2[j] <array2[indexMin])
//					indexMin= j;
//			}
//			temp = array2[index];
//			array2[index] = array2[i];
//			array2[i] = temp;
//		}
// https://justicehui.github.io/easy-algorithm/2018/04/11/SelectionSort/
		
		
		
		for(int e : array2) {
			System.out.print(e + " ");
		}
		
		
		
		
	}
}
