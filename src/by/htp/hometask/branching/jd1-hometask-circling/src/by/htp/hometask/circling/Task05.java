package by.htp.hometask.circling;

/*5. С помощью оператора while напишите программу определения 
 * суммы всех нечетных чисел в диапазоне от 1 до 99 включительно. */

public class Task05 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		while (i <= 99) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum = " + sum);

	}

}
