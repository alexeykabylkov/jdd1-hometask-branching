package by.htp.hometask.branching;

/*21. ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ��� �������? ����� � ��� ̻. 
 * � ����������� �� ������ �� ������ ������ ��������� ����� ���� �������� �������!� ��� ���� �������� ��������!�.*/
import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		String res;
		
		System.out.print("��� �� ������� ��� �������? ����� � ��� �: ");
		str = sc.nextLine();
		
		while(! (str.equalsIgnoreCase("�") || str.equalsIgnoreCase("�"))){
			System.out.print("���� ����, ��� ����� ���� �����, � ����� ��, ��� � ������, � ��� �: ");
			str = sc.nextLine();
		}
		
		res = str.toLowerCase();
		sc.close();
		
		if (res.equals("�")) {
			System.out.println("��� �������� �������!");
		} else {
		System.out.println("��� �������� ��������!");
		}

	}

}
