package by.htp.hometask.circling;

/*6. Напишите программу, где пользователь вводит любое целое положительное число. 
 * А программа суммирует все числа от 1 до введенного пользователем числа.*/
import java.util.Scanner;
public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n;
		int i = 1;
		
		System.out.print("Введите целое число: ");
		n = sc.nextInt();
		while (!(n>0)) {
			System.out.println("");
			System.out.print("Следуйте условию! Целое положительное число: ");
			n = sc.nextInt();
		}
		sc.close();
		
		while(i <= n) {
			sum = sum + i;
			i++;
		}
		
		System.out.println("sum = " + sum);
			

	}

}
