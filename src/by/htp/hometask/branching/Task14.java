package by.htp.hometask.branching;

/*14. ���� ��� ���� ������������ (� ��������). 
 * ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������. */

public class Task14 {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 30;
		
		if (a+b < 180) {
			System.out.println("����������� ����������");
			if (a+b==90 || a==90 || b==90) {
				System.out.println("� ��� ������������� �����������");
			} else {
				System.out.println("����������� �� �������� �������������");
			}
		} else {
			System.out.println("������������ �� ����������");
		}

	}

}
