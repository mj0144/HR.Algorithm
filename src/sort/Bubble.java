package sort;

import java.util.Scanner;

public class Bubble {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기 : ");
		int size = sc.nextInt(); //배열 크기
		int[] array = new int[size];
		
		for(int i=0; i<array.length; i++) { //배열 요소 입력
			array[i] = sc.nextInt();
		}
		
		sort(array);	
	}

	private static void sort(int[] array2) {
		int temp=0; //임시변수
		int stop = 0; //정렬이 다 되었으면 멈출 변수.
		
		
		for(int i=0; i<array2.length-1; i++) {
			for(int j=i+1; j<array2.length; j++) {
				if(array2[i]>array2[j]) {
					stop=1;
					temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
				}
			}
			if(stop==0) { //swap을 거치지 않았다면 -> 정렬이 되었다면 stop.
				System.out.println("stop");
				break;
			}
		}				
		for(int e : array2) {
			System.out.print(e + " ");
		}
		
	}
}
