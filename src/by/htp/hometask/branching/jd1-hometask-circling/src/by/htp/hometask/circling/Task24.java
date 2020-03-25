package by.htp.hometask.circling;

/*24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. 
 * Преобразовать его в другое число, цифры которого будут следовать в обратном порядке 
 * по сравнению с введенным числом*/

public class Task24 {

	public static void main(String[] args) {
		
		int x = 5742;
		int sum = 0;
		int y;
		
		if(x <= 9) {
			sum = x;
			System.out.println("sum = " + sum + "; new x = " + x);
		}
		else {
			System.out.print("new x = ");
			while (x / 10 != 0) {
				y = x%10;
				System.out.print(y);
				if (y % 2 ==0) {
					sum = sum + y;
				}
				x = x / 10;
			}
			if (x%2==0) {
				sum = sum + x;
			}
			System.out.print(x);
			System.out.println("");
			System.out.println("sum = " + sum);
		}
		
	}

}
