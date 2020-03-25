package by.htp.hometask.circling;

/*25. Требуется определить факториал числа, которое ввел пользователь.*/
import java.util.Scanner;
public class Task25 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int n;
		int f = 1;
		
		System.out.println("Введите натуральное число: ");
		n = sc1.nextInt();
		
		while (n<=0) {
			System.out.println("Неверный ввод. Попробуйте еще раз: ");
			n = sc1.nextInt();
		}
		sc1.close();
		f = n;
		while (n>1) {
			f = f * (n - 1);
			n--;
		}
		
		System.out.println("Factorial = " + f);

	}

}
