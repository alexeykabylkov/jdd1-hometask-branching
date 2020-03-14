package by.htp.hometask.branching;

/*33. Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе 
 * данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. 
 * Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 
 * 9455, 8997 — доступен модуль базы С. */

public class Task33 {

	public static void main(String[] args) {
		
		int pass = 2345;
		
		switch(pass) {
		case 9583: {System.out.println("Level 1 ABC");}
		break;
		case 1747: {System.out.println("Level 1 ABC");}
		break;
		case 3331: {System.out.println("Level 2 BC");}
		break;
		case 7922: {System.out.println("Level 2 BC");}
		break;
		case 9455: {System.out.println("Level 3 C");}
		break;
		case 8997: {System.out.println("Level 3 ABC");}
		break;
		default: {System.out.println("Access denied");}
		}

	}

}
