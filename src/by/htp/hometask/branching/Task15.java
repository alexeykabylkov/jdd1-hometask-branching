package by.htp.hometask.branching;

/*15. Даны действительные числа х и у, не равные друг другу. 
 * Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.*/

public class Task15 {

	public static void main(String[] args) {
		
		double x = 5;
		double y = 2;
		double sum;
		double pr;
		
		sum  = (x + y) / 2;
		pr = x*y * 2;
		
		
		if (x < y) {
		
			x = sum;
			y = pr;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		} else if (y < x) {
			x = pr;
			y = sum;
			System.out.println("x = равен " + x);
			System.out.println("y = равен " + y);
		}

	}

}
