package by.htp.hometask.branching;

/*32. Написать программу, которая по заданным трем числам определяет, 
 * является ли сумма каких-либо двух из них положительной*/

public class Task32 {

	public static void main(String[] args) {
		
		int a = -2;
		int b = 0;
		int c = 5;
		boolean t = true;
		boolean f = false;
		
		if (a+b>=0 || a+c>=0 || b+c>=0) {
			System.out.println(t);
		} else {
			System.out.println(f);
		}

	}

}
