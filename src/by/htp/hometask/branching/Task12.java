package by.htp.hometask.branching;

/*12. Даны три действительных числа. 
 * Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные. */

public class Task12 {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = -2;
		

		if (a >= 0) {
			a = a*a;
			System.out.println("число а > 0, квадрат равен " + a);
		} else {
			a = Math.pow(a, 4);
			System.out.println("число а < 0, 4-я степень равна " + a);
		}
		///////////////////////////
		if (b >= 0) {
			b = b*b;
			System.out.println("число а > 0, квадрат равен " + b);
		} else {
			b = Math.pow(b, 4);
			System.out.println("число а < 0, 4-я степень равна " + b);
		}
		///////////////////////////
		if (c >= 0) {
			c = c*c;
			System.out.println("число а > 0, квадрат равен " + c);
		} else {
			a = Math.pow(a, 4);
			System.out.println("число а < 0, 4-я степень равна " + a);
		}

	}

}
