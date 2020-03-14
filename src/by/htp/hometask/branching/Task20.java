package by.htp.hometask.branching;

/*20. Определить, делителем каких чисел а, b, с является число k. */

public class Task20 {

	public static void main(String[] args) {
		
		int a = 474;
		int b = 154;
		int c = 1436;
		
		int k = 3;
		
		if (a % k == 0) {System.out.println("a делится на k");}
		if (b % k == 0) {System.out.println("b делится на k");}
		if (c % k == 0) {System.out.println("c делится на k");}
		if (a%k!=0 && b%k!=0 && c%k!=0) {System.out.println("числа не делятся на k");}

	}

}
