package by.htp.hometask.branching;

/*9. Составить программу, которая определит по трем введенным сторонам, 
 * является ли данный треугольник равносторонним. */

public class Task09 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		int c = 5;
		
		if (a<=0 || b<=0 || c<=0) {
			System.out.println("Это не треугольник");
		} else if (a==b && a==c) {
			System.out.println("Треугольник является равносторонним");
		} else {
			System.out.println("Треугольник не является равносторонним");
		}	

	}

}
