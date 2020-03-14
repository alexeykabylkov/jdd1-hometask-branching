package by.htp.hometask.branching;
import java.util.Scanner;

/*34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. 
 * Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; 
 * если сдачи не требуется, печатает на экране «спасибо»; если денег внесено больше, чем необходимо, 
 * то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, 
 * то печатает сообщение об этом и указывает размер недостающей суммы. */

public class Task34 {

	public static void main(String[] args) {
		
		int price;
		int money;
		int change;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Сколько стоит книга? ");
		price = sc1.nextInt();
		System.out.print("Оплатите товар  ");
		money = sc2.nextInt();
		
		sc1.close();
		sc2.close();
		
		change = money - price;
		
		if (change == 0) {
			System.out.println("Спасибо.");
		}
		if (change > 0) {
			System.out.println("Возьмите сдачу " + change);
		}
		if (change < 0) {
			System.out.println("Денег не достатчно. Внесите еще " + Math.abs(change));
		}

	}

}
