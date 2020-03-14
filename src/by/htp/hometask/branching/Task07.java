package by.htp.hometask.branching;

/*7. ��������� ��������� ���������� ������ ��������� a*x*x + b*x + c ��� �������� ��������� a, b, c � � */

public class Task07 {

	public static void main(String[] args) {
		int a = -2;
		int b = -3;
		int c = -4;
		int x = 5;
		int res;
		
		res = a*x*x + b*x + c;
		
		if (res < 0) {
			res = res * -1;
		}
		
		System.out.println("Модуль равен  " + res);
		

	}

}
