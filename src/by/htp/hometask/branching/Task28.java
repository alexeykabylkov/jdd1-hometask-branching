package by.htp.hometask.branching;

/*28. Даны три числа a, b, с. Определить, какое из них равно d. 
 * Если ни одно не равно d, то найти max(d — a, d — b, d — c). */

public class Task28 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 5;
		int max;
		
		int f1 = d - a;
		int f2 = d - b;
		int f3 = d - c;
		
		
		if (a == d) {System.out.println("a = d");}
		if (b == d) {System.out.println("b = d");}
		if (c == d) {System.out.println("c = d");}
		
		if (a!=d && b!=d && c!=d ) {
			if (f1>f2 && f1>f3) {max = f1;}
			else if (f1<f2 && f1>f3) {max = f2;}
			else {max = f3;}
			System.out.println("max = " + max);
		}

	}

}
