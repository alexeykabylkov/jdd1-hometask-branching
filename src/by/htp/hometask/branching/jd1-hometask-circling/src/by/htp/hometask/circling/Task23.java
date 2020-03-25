package by.htp.hometask.circling;

/*23. Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. 
 * Результат представить в виде таблицы, первый столбец которой – значения  аргумента, 
 * второй - соответствующие значения функции: 
)*/

public class Task23 {

	public static void main(String[] args) {
		
		int x;
		int a = -5;
		int b = 2;
		int h = 1;
		double y;
		
		for (x=a; x<=b; x=x+h) {
			y = ((1/Math.tan(x)) * (x / 3)) + (Math.sin(x) / 2);
			if (x==0) {
				break;
			}
			System.out.println(x + "   " + y);
		}

	}

}
