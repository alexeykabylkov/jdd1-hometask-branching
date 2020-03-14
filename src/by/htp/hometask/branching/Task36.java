package by.htp.hometask.branching;

/*36. Вычислить значение функции*/

public class Task36 {

	public static void main(String[] args) {
		
		double f;
		double x = 7;
		
		if (x<=3) {
			f = x*x - 3*x + 9;
		} else {
			f = 1 / (x*x*x + 6);
		}
		System.out.println("f(x) = " + f);

	}

}
