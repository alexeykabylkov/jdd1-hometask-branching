package by.htp.hometask.branching;

/*23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). 
 * Если введены некорректные данные, то сообщить об этом. */

import java.util.Scanner;
public class Task23 {

	public static void main(String[] args) {
		int day;
		int mon;
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Введите день: ");
		day = sc1.nextInt();
		System.out.println("");
		System.out.print("Введите месяц: ");
		mon = sc2.nextInt();
		
		while (!((day>=1 && day<=31) && (mon>=1 && mon<=12))) {
			System.out.println("Неверный формат данных. Повторите еще раз!");
			System.out.print("Введите день: ");
			day = sc1.nextInt();
			System.out.println("");
			System.out.print("Введите месяц: ");
			
			mon = sc2.nextInt();
		}
		sc1.close();
		sc2.close();
		
		
		System.out.println("");
		System.out.println("Дата: " + day + " Месяц: " + mon);
		

	}

}
