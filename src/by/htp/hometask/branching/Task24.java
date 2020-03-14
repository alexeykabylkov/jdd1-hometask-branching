package by.htp.hometask.branching;

/*24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», 
 * взяв за исходное данное количество лепестков п. */

public class Task24 {

	public static void main(String[] args) {
		
		int n = 4;
		int i;
		String res1 = "любит";
		String res2 = "не любит";
		
		for (i = 0; i <= n; i++) {
			if(i % 2 == 0) {System.out.println(res1);}
			else {System.out.println(res2);}
		}

	}

}