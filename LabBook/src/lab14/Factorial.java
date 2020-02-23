package lab14;

import java.util.function.Function;

public class Factorial {
	public int getFactorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			int result = 1;
			for (int i = 1; i <= num; i++) {
				result = result * i;
			}
			return result;
		}
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		int n = 7;
		Function<Integer, Integer> fr = f::getFactorial;
		System.out.println(fr.apply(n));
	}
}
