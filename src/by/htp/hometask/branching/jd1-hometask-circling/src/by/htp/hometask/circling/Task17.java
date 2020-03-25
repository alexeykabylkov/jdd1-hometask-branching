package by.htp.hometask.circling;

/*17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1) */

public class Task17 {

	public static void main(String[] args) {
		int a = -7;
		int n = 3;
		int pr = a;
		
		for(int i=1; i<n; i++) {
			pr = pr * (a + i);
		}
		System.out.println(pr);

	}

}
