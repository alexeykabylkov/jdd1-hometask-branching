package by.htp.hometask.circling;

/*5. � ������� ��������� while �������� ��������� ����������� 
 * ����� ���� �������� ����� � ��������� �� 1 �� 99 ������������. */

public class Task05 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		while (i <= 99) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum = " + sum);

	}

}
