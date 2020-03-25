package by.htp.hometask.circling;

/*16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10). */

public class Task16 {

	public static void main(String[] args) {
		
		int i;
		long sum = 0;
		long pr = 1;
		
		for(i=1; i<=10; i++) {
			sum = sum + i;
			pr = pr * sum;
		}
		System.out.println(pr);

	}

}
