package by.htp.hometask.branching;

/*21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». 
 * В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».*/
import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		String res;
		
		System.out.print("Кто ты мальчик или девочка? Введи Д или М: ");
		str = sc.nextLine();
		
		while(! (str.equalsIgnoreCase("Д") || str.equalsIgnoreCase("М"))){
			System.out.print("Будь добр, или может быть добра, и введи то, что я просил, Д или М: ");
			str = sc.nextLine();
		}
		
		res = str.toLowerCase();
		sc.close();
		
		if (res.equals("д")) {
			System.out.println("Мне нравятся девочки!");
		} else {
		System.out.println("Мне нравятся мальчики!");
		}

	}

}
