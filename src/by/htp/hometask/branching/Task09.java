package by.htp.hometask.branching;

/*9. ��������� ���������, ������� ��������� �� ���� ��������� ��������, 
 * �������� �� ������ ����������� ��������������. */

public class Task09 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		int c = 5;
		
		if (a<=0 || b<=0 || c<=0) {
			System.out.println("��� �� �����������");
		} else if (a==b && a==c) {
			System.out.println("����������� �������� ��������������");
		} else {
			System.out.println("����������� �� �������� ��������������");
		}	

	}

}
