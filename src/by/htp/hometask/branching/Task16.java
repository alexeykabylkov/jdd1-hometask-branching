package by.htp.hometask.branching;

/*16. На плоскости ХОY задана своими координатами точка А. 
 * Указать, где она расположена (на какой оси или в каком координатном угле). */

public class Task16 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = -1;
		
		if (x==0 && y==0) {System.out.println("точка находится в начале координат");}
		else if (x==0 && y!=0) {System.out.println("точка находится на оси y");}
		else if (x!=0 && y==0) {System.out.println("точка находится на оси х");}
		else if (x>0 && y>0) {System.out.println("точка находится в координатном угле I");}
		else if (x<0 && y>0) {System.out.println("точка находится в координатном угле II");}
		else if (x<0 && y<0) {System.out.println("точка находится в координатном угле III");}
		else if (x>0 && y<0) {System.out.println("точка находится в координатном угле IV");}

	}

}
