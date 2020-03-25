package by.htp.hometask.circling;

/*12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 
 * Составьте программу нахождения произведения первых 10 членов этой последовательности. */

public class Task12 {

	public static void main(String[] args) {
		
		int a = 1;
		int sum = 0;
		int i;
		
		for (i=1; i<=10; i++) {
			sum = sum + a;
			a = a+6;
		}
		System.out.println(sum);

	}

}
