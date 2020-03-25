package by.htp.hometask.circling;

/*10. Составить программу нахождения произведения квадратов первых двухсот чисел. */

public class Task10 {

	public static void main(String[] args) {
		
		double i;
		double sq;
		double sum = 1;
		
		for(i=1; i<=200; i=i+1) {
			sq = i*i;
			sum = sum * sq;
		}
		System.out.println("sum = " + sum);

	}

}
