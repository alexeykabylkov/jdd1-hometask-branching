package by.htp.hometask.branching;

/*8. Составить программу нахождения наименьшего из квадратов двух чисел а и b. */

public class Task08 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 6;
		
		if (a*a < b*b) {
			System.out.println("Наименьший квадрат а =  " + a*a);
		} else {
			System.out.println("Наименьший квадрат b =  " + b*b);
		}

	}

}
