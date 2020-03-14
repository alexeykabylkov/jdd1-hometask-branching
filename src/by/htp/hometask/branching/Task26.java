package by.htp.hometask.branching;

/*26. Написать программу нахождения суммы большего и меньшего из трех чисел. */

public class Task26 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		int c = 8;
		int max, min, sum;
		
		
		if (a>b && a>c && b>c) {max = a; min = c; sum = min + max; System.out.println("sum = " + sum);}
		else if (a>b && a>c && b<c) {max = a; min = b; sum = min + max; System.out.println("sum = " + sum);} 
		else if (a<b && a<c && b<c) {max = c; min = a; sum = min + max; System.out.println("sum = " + sum);}
		else if (a<b && a<c && b>c) {max = b; min = a; sum = min + max; System.out.println("sum = " + sum);}  
		else if (a>b && a<c && b<c) {max = c; min = b; sum = min + max; System.out.println("sum = " + sum);} 
		else if (a<b && a>c && b>c) {max = b; min = c; sum = min + max; System.out.println("sum = " + sum);} 
		else if (a>b && b==c) {max = a; min = c; sum = min + max; System.out.println("sum = " + sum);}
		else if (a<b && b==c) {max = c; min = a; sum = min + max; System.out.println("sum = " + sum);}
		else if (c<b && a==b) {max = b; min = c; sum = min + max; System.out.println("sum = " + sum);}
		else if (c>b && a==b) {max = c; min = a; sum = min + max; System.out.println("sum = " + sum);}
		else if (a<b && a==c) {max = b; min = a; sum = min + max; System.out.println("sum = " + sum);}
		else if (a>b && a==c) {max = a; min = b; sum = min + max; System.out.println("sum = " + sum);}
		else if (a==b && b==c) {System.out.println("unable to find max or min");}
		

	}

}
