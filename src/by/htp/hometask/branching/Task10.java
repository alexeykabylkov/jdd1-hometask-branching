package by.htp.hometask.branching;

/*10. ��������� ���������, ������� ��������� ������� ������ ����� ������. */

public class Task10 {

	public static void main(String[] args) {
		int r1 = 10;
		int r2 = -2;
		
		double s1, s2;
		
		s1 = r1 * r1 * Math.PI;
		s2  = r2 * r2 * Math.PI;
		if (r1<=0 || r2<=0) {
			System.out.println("�� ����");
		} else if (s1 < s2) {
			System.out.println("�������� ����� s1 ������");
		} else {
			System.out.println("�������� ����� s2 ������");
		}

	}

}
