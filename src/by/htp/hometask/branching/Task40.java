package by.htp.hometask.branching;

/*40. Вычислить значение функции: */

public class Task40 {

	public static void main(String[] args) {
		
		double f;
		double x = 12;
		
		if (x<=13) {
			f = -1*(Math.pow(x, 3)) + 9;
		} else {
			f = -1* (3 / (x+1));
		}
		System.out.println("f(x) = " + f);

	}

}
