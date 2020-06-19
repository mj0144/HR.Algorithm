package sort;

import java.util.Scanner;

public class Bubble {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭 ũ�� : ");
		int size = sc.nextInt(); //�迭 ũ��
		int[] array = new int[size];
		
		for(int i=0; i<array.length; i++) { //�迭 ��� �Է�
			array[i] = sc.nextInt();
		}
		
		sort(array);	
	}

	private static void sort(int[] array2) {
		int temp=0; //�ӽú���
		int stop = 0; //������ �� �Ǿ����� ���� ����.
		
		
		for(int i=0; i<array2.length-1; i++) {
			for(int j=i+1; j<array2.length; j++) {
				if(array2[i]>array2[j]) {
					stop=1;
					temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
				}
			}
			if(stop==0) { //swap�� ��ġ�� �ʾҴٸ� -> ������ �Ǿ��ٸ� stop.
				System.out.println("stop");
				break;
			}
		}				
		for(int e : array2) {
			System.out.print(e + " ");
		}
		
	}
}
