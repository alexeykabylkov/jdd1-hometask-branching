package by.htp.hometask.circling;

/*13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5. */

public class Task13 {

	public static void main(String[] args) {
		
		double a = -5;
		double b = 5;
		double s = 0.5;
		double x;
		double y;
		
		for (x=a; x<=b; x = x+s) {
			y = (x*x) / 2;
			System.out.println("x = " + x + "; y = " + y);
		}

	}

}
