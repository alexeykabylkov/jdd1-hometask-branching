package by.htp.hometask.branching;

/*13. Даны две точки А(х1, у1) и В(х2, у2). 
 * Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. */

public class Task13 {

	public static void main(String[] args) {
		
		int x1 = 2;
		int y1 = 2;
		
		int x2 = -2;
		int y2 = -3;
		
		double d1, d2;
		
		d1 = Math.sqrt(x1*x1 + y1*y1);
		d2 = Math.sqrt(x2*x2 + y2*y2);
		
		if (d1 < d2) {System.out.println("Точка А ближе к началу координат");} 
		else if(d1 > d2) {System.out.println("Точка B ближе к началу координат");}
		else {System.out.println("Точки на одинаковом расстоянии");}

	}

}
