package by.htp.hometask.branching;

/*12. ���� ��� �������������� �����. 
 * �������� � ������� �� �� ���, �������� ������� ��������������, � � ��������� ������� � �������������. */

public class Task12 {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = -2;
		

		if (a >= 0) {
			a = a*a;
			System.out.println("����� � > 0, ������� ����� " + a);
		} else {
			a = Math.pow(a, 4);
			System.out.println("����� � < 0, 4-� ������� ����� " + a);
		}
		///////////////////////////
		if (b >= 0) {
			b = b*b;
			System.out.println("����� � > 0, ������� ����� " + b);
		} else {
			b = Math.pow(b, 4);
			System.out.println("����� � < 0, 4-� ������� ����� " + b);
		}
		///////////////////////////
		if (c >= 0) {
			c = c*c;
			System.out.println("����� � > 0, ������� ����� " + c);
		} else {
			a = Math.pow(a, 4);
			System.out.println("����� � < 0, 4-� ������� ����� " + a);
		}

	}

}
