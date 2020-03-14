package by.htp.hometask.branching;

/*31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 * Определить, пройдет ли кирпич через отверстие. */

public class Task31 {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int x = 5 ;
		int y = 8;
		int z = 3;
		int s;
		
		s = a*b;
		
		if (x*y<s || x*z<s || y*z<s) {
			System.out.println("the brick will pass");
		} else {
			System.out.println("the brick won't pass");
		}
		

	}

}
