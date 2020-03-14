package by.htp.hometask.branching;

/*17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, 
 * равным большему из исходных, а если равны, то заменить числа нулями. 
 */

public class Task17 {

	public static void main(String[] args) {
		
		int x = -3;
		int y = 2;
		
		if ( x != y) {
			if (x > y) {
				y = x;
			} else {
				x = y;
			}
		} else {
			x = 0;
			y = 0;
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
