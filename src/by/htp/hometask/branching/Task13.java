package by.htp.hometask.branching;

/*13. ���� ��� ����� �(�1, �1) � �(�2, �2). 
 * ��������� ��������, ������������, ������� �� ����� ��������� ����� � ������ ���������. */

public class Task13 {

	public static void main(String[] args) {
		
		int x1 = 2;
		int y1 = 2;
		
		int x2 = -2;
		int y2 = -3;
		
		double d1, d2;
		
		d1 = Math.sqrt(x1*x1 + y1*y1);
		d2 = Math.sqrt(x2*x2 + y2*y2);
		
		if (d1 < d2) {System.out.println("����� � ����� � ������ ���������");} 
		else if(d1 > d2) {System.out.println("����� B ����� � ������ ���������");}
		else {System.out.println("����� �� ���������� ����������");}

	}

}
