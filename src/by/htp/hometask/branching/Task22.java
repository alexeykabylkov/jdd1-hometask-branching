package by.htp.hometask.branching;

/*22. ���������������� �������� ���������� � � � ���, ����� � � ��������� ������� �� ���� ��������, � � y - �������. */

public class Task22 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 9;
		int z;
		
		if (x > y) {
			/*z = x;
			x = y;
			y = z;*/
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		} else if(x < y) {
			z = y;
			y = x;
			x = z;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		} else {
			System.out.println("x = y, ����������������� �� �����, ��� �� ��������� ��������!");
		}

	}

}
