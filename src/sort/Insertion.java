package sort;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();

		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		sort(array);
	}

	private static void sort(int[] array) {
		int temp = 0;
		int j = 0;
		// 25 31 12 22 11
//		for (int i = 1; i < array.length; i++) {
//			temp = array[i]; // 키 값.
//			for (j = i - 1; j >= 0; j--) {
//				if(temp<array[j])
//					array[j + 1] = array[j];
//				else 
//					break;				
//			}
//			array[j + 1] = temp;
//
//		}
		for (int i = 1; i < array.length; i++) {
			temp = array[i]; // 키 값.
			for (j = i - 1; j >= 0 && temp < array[j]; j--) {
				if(temp<array[j])
					array[j + 1] = array[j];			
			}
			array[j + 1] = temp;

		}

		for (int e : array)
			System.out.print(e + " ");

	}

}

/*
 * https://justicehui.github.io/easy-algorithm/2018/04/14/InsertionSort/
 * https://hahahoho5915.tistory.com/8
 * */
