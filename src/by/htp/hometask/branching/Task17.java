package by.htp.hometask.branching;

/*17. ���� ����� ����� �, �. ���� ����� �� �����, �� �������� ������ �� ��� ����� � ��� �� ������, 
 * ������ �������� �� ��������, � ���� �����, �� �������� ����� ������. 
 */

public class Task17 {

	public static void main(String[] args) {
		
		int x = -3;
		int y = 2;
		
		if ( x != y) {
			if (x > y) {
				y = x;
			} else {
				x = y;
			}
		} else {
			x = 0;
			y = 0;
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
