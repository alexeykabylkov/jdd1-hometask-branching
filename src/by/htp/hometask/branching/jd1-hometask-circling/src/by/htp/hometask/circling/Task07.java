package by.htp.hometask.circling;

/*Вычислить значения функции на отрезке [а,b] c шагом h: */

public class Task07 {

	public static void main(String[] args) {
		int a = -4;
		int b = 4;
		int h = 2;
		int y;
		int x;
		
		for (x=a; x<=b; x=x+h) {
			if(x>2) {
				y=x;
				System.out.println(y);
			} 
			else {
				y= -1*x;
				System.out.println(y);
			}
		}
	}

}
