package by.htp.hometask.branching;
import java.util.Scanner;
/*25. Написать программу — модель анализа пожарного датчика в помещении, 
 * которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С. */

public class Task25 {

	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Результат измерений температуры: ");
		temp  = sc.nextInt();
		while(temp <= 60) {
			System.out.print("Пока все в порядке. Продолжаем измерения: ");
			temp = sc.nextInt();
		}
		sc.close();
		
		if (temp > 60) {
			System.out.println("Пожароопасная ситуация");
		}

	}

}
