package by.htp.hometask.circling;

/*18. Даны числовой ряд и некоторое число е. 
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид*/

public class Task18 {

	public static void main(String[] args) {
		
		double a;
		double e = 2;
		double n;
		double sum = 0;
		
		for(n=1; n<=10 ; n++) {
			a = Math.pow(-1, n-1) / n;
			if (Math.abs(a) >= e) {
				sum = sum + a;
			}
			
		}
		
		System.out.println(sum);
		

	}

}
