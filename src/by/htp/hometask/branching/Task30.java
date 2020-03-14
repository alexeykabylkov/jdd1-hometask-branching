package by.htp.hometask.branching;

/*30. Даны действительные числа а,b,с. 
 * Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так. */

public class Task30 {

	public static void main(String[] args) {
		
		int a = -5;
		int b = -10;
		int c = -20;
		
		if (a>b && b>c) {
			a = a*2;
			b = b*2;
			c = c*2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
