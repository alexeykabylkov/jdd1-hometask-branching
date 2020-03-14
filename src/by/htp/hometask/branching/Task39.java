package by.htp.hometask.branching;

/*39. Вычислить значение функции: */

public class Task39 {

	public static void main(String[] args) {

		double f;
		double x = 9;
		
		if (x>=8) {
			f = -1*(x*x) + x - 9;
		} else {
			f = 1 / (Math.pow(x, 4) - 6);
		}
		System.out.println("f(x) = " + f);

	}

}
