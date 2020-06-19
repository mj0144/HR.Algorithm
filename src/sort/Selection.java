package sort;

import java.util.Scanner;

public class Selection {

	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		sort(array);
		
	}


	private static void sort(int[] array2) {
		
		int temp=0; //swap 임시변수
		int index=0; //최솟값을 가지는 인덱스
		
		for(int i=0; i<array2.length-1; i++) {
			int min = array2[i]; //최솟값
			index = i; //i가 최솟값일 수 있으니깐
			for(int j=i+1; j<array2.length; j++) {
				if(array2[j]<min) {
					min = array2[j];	
					index=j; //최솟값이 갱신될 때마다 인덱스도 갱신.		
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
