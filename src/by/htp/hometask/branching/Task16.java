package by.htp.hometask.branching;

/*16. �� ��������� ��Y ������ ������ ������������ ����� �. 
 * �������, ��� ��� ����������� (�� ����� ��� ��� � ����� ������������ ����). */

public class Task16 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = -1;
		
		if (x==0 && y==0) {System.out.println("����� ��������� � ������ ���������");}
		else if (x==0 && y!=0) {System.out.println("����� ��������� �� ��� y");}
		else if (x!=0 && y==0) {System.out.println("����� ��������� �� ��� �");}
		else if (x>0 && y>0) {System.out.println("����� ��������� � ������������ ���� I");}
		else if (x<0 && y>0) {System.out.println("����� ��������� � ������������ ���� II");}
		else if (x<0 && y<0) {System.out.println("����� ��������� � ������������ ���� III");}
		else if (x>0 && y<0) {System.out.println("����� ��������� � ������������ ���� IV");}

	}

}
