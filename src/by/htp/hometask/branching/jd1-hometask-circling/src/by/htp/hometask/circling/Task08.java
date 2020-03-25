package by.htp.hometask.circling;

/*8. Вычислить значения функции на отрезке [а,b] c шагом h: */

public class Task08 {

	public static void main(String[] args) {
		int a = 13;
		int b = 16;
		int h = 1;
		int y;
		int x;
		int c = 1;
		
		for (x=a; x<=b; x=x+h) {
			if(x!=15) {
				y=(x-c) + 6;
				System.out.println(y);
			} 
			else {
				y= (x+c) + 6;
				System.out.println(y);
			}
		}
		

	}

}
