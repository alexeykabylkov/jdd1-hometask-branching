package by.htp.hometask.circling;

/*14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n. */

public class Task14 {

	public static void main(String[] args) {
		
		int n = 10;
		int i;
		double sum = 0;
		
		for (i=1; i<=n; i++) {
			sum = sum + (1/(double)i);
		}
		System.out.println(sum);

	}

}
