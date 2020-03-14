package by.htp.hometask.branching;

/*11. Составить программу, которая определит площадь какого треугольника больше. */

public class Task11 {

	public static void main(String[] args) {
		
		int a1 = 5;
		int b1 = 5;
		int c1 = 5;
		double p1;
		double s1;
		
		int a2 = 6;
		int b2 = 6;
		int c2 = 6;
		double p2;
		double s2;
		
		p1 = (a1 + b1 + c1) / 2;
		p2 = (a2 + b2 + c2) / 2;
		
		s1 = Math.sqrt(p1 * (p1-a1) * (p1-b1) * (p1-c1));
		s2 = Math.sqrt(p2 * (p2-a2) * (p2-b2) * (p2-c2));
		
		if (s1 > s2) {
			System.out.println("Треугольник с наибольшей площадью s1");
		} else {
			System.out.println("Треугольник с наибольшей площадью s2");
		}
	}

}
