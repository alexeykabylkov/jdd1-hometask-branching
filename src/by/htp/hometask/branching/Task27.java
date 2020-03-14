package by.htp.hometask.branching;

/*27. Найти max{min(a, b), min(c, d)}. */

public class Task27 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 2;
		int c = 2;
		int d = 2;
		int minab, mincd;
		int max;
		
		if (a > b) { minab = b;}
		else {minab = a;}
		
		if (c > d) {mincd = d;}
		else {mincd = c;}
		
		if (minab > mincd) {max = minab; System.out.println("max = " + max);}
		else if (minab < mincd) {max = mincd; System.out.println("max = " + max);}
		else if (minab == mincd) {System.out.println("numbers are equal");}
	}

}
