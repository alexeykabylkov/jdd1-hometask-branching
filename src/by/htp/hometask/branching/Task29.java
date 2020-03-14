package by.htp.hometask.branching;

/*29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. */

public class Task29 {

	public static void main(String[] args) {
		
		int x1 = -4;
		int y1 = -3;
		
		int x2 = 0;
		int y2 = -1;
		
		int x3 = 3;
		int y3 = -3;
		double d1, d2, d3;
		double m;
		
		
		d1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		d2 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
		d3 = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
		
		if (d1>d2 && d1>d3) {m = d1;}
		else if (d1<d2 && d1>d3) {m = d2;}
		else {m = d3;}
		
		
		
		if ((m-d1) + (m-d2) + (m-d3) == m) {System.out.println("Точки лежат на одной прямой");} 
		else {
			System.out.println("Точки не лежат на одной прямой");
		}

	}

}
