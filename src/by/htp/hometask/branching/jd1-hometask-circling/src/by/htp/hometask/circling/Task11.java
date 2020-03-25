package by.htp.hometask.circling;

/*11. Составить программу нахождения разности кубов первых двухсот чисел */

public class Task11 {

	public static void main(String[] args) {
		
		double i;
		double sq;
		double raz = 1;
		
		for(i=200; i>=0; i=i-1) {
			sq = i*i*i;
			raz = sq ;
		}
		System.out.println("sum = " + raz);

	}

}
