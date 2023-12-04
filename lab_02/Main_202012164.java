package lab_02;

public class Main_202012164 {
	public static void main(String[] args) {
		System.out.println("lab0_2:이윤아");
		// 저장 및 출력
		int n = 5;
		int FactoriaOutcome = factorial(n);
		System.out.println(FactoriaOutcome);
		int SumOcutcome = sum(n);
		System.out.println(SumOcutcome);
		show(n);
	}

	// 1 ~ n까지의 수를 합산
	private static int sum(int n) {
		if (n == 1)
			return 1;
		else
			return n + sum(n - 1);
	}

// 1 ~ n 의 수 출력
	private static void show(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i);
			if (i < n) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
	}

//팩토리얼 계산
	private static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}
}
