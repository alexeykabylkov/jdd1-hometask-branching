package by.htp.hometask.branching;

/*15. ���� �������������� ����� � � �, �� ������ ���� �����. 
 * ������� �� ���� ���� ����� �������� ��������� �� �����, � ������� � �� ��������� �������������.*/

public class Task15 {

	public static void main(String[] args) {
		
		double x = 5;
		double y = 2;
		double sum;
		double pr;
		
		sum  = (x + y) / 2;
		pr = x*y * 2;
		
		
		if (x < y) {
		
			x = sum;
			y = pr;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		} else if (y < x) {
			x = pr;
			y = sum;
			System.out.println("x = ����� " + x);
			System.out.println("y = ����� " + y);
		}

	}

}
