package by.htp.hometask.branching;

/*18. ѕодсчитать количество отрицательных среди чисел а, b, с. */

public class Task18 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 0;
		int c = -8;
		int count = 0;
		
		int[] mas = new int[3];
		mas[0] = a;
		mas[1] = b;
		mas[2] = c;
		
		for (int i=0; i<mas.length; i++) {
			if (mas[i] < 0) {
				count = count + 1;
			}
		}
		
		System.out.println(" оличество отрицательных чисел равно " + count);
		

	}

}
