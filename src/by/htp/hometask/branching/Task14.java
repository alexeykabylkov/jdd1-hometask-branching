package by.htp.hometask.branching;

/*14. Даны два угла треугольника (в градусах). 
 * Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным. */

public class Task14 {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 30;
		
		if (a+b < 180) {
			System.out.println("Треугольник существует");
			if (a+b==90 || a==90 || b==90) {
				System.out.println("И это прямоугольный треугольник");
			} else {
				System.out.println("Треугольник не является прямоугольным");
			}
		} else {
			System.out.println("Треугольника не существует");
		}

	}

}
