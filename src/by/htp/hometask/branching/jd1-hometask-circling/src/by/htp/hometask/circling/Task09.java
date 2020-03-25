package by.htp.hometask.circling;

/*9. Найти сумму квадратов первых ста чисел. */

public class Task09 {

	public static void main(String[] args) {
		
		int i;
		int sq;
		int sum = 0;
		
		for(i=0; i<=100; i++) {
			sq = i*i;
			sum = sum + sq;
		}
		System.out.println("sum = " + sum);

	}

}
