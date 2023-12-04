package lab_01;

import java.util.Scanner;

public class Main_202012164 {

	public static void main(String[] args) {

		System.out.println("lab0_1:이윤아");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// n개의 정수값을 입력받고 배열에 저장
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		//n개의 정수를 입력받아 배열에 저장
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += array[i];
		}

		// 평균 구하기
		double average = (double) sum / n;

		// 평균을 초과하는 정수 개수 구하기
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] > average) {
				count++;
			}
		}

		System.out.println(average);
		System.out.println(count);

		sc.close();
	}
}
