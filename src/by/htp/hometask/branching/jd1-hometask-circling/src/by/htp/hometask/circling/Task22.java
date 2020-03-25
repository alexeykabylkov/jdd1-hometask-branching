package by.htp.hometask.circling;

/*22. Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. 
 * Результат представить в виде таблицы, первый столбец которой – значения  аргумента, 
 * второй - соответствующие значения функции*/

public class Task22 {

	public static void main(String[] args) {
		
		int x;
		int a = -5;
		int b = 2;
		int h = 1;
		double y;
		
		for (x=a; x<=b; x=x+h) {
			y = Math.sin(x) * Math.sin(x);
			if (x==0) {
				break;
			}
			System.out.println(x + "   " + y);
		}

	}

}
