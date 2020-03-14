package by.htp.hometask.branching;

/*35. Вычислить число и месяц в невисокосном году по номеру дня. */

public class Task35 {

	public static void main(String[] args) {
		
		int day = 300;
		int date;

		
		if (day>=1 && day<=31) {
			date = day;
			System.out.println(date + " January");
		} else if(day>31 && day<=59) {
			date = day-31;
			System.out.println(date + " February");
		} else if(day>59 && day<=90) {
			date = day-31-28;
			System.out.println(date + " March");
		} else if(day>90 && day<=120) {
			date = day-31-28-31;
			System.out.println(date + " April");
		} else if(day>120 && day<=151) {
			date = day-31-28-31-30;
			System.out.println(date + " May");
		} else if(day>151 && day<=181) {
			date = day-31-28-31-30-31;
			System.out.println(date + " June");
		} else if(day>181 && day<=212) {
			date = day-31-28-31-30-31-30;
			System.out.println(date + " July");
		} else if(day>212 && day<=243) {
			date = day-31-28-31-30-31-30-31;
			System.out.println(date + " August");
		} else if(day>243 && day<=273) {
			date = day-31-28-31-30-31-30-31-31;
			System.out.println(date + " September");
		} else if(day>273 && day<=304) {
			date = day-31-28-31-30-31-30-31-31-30;
			System.out.println(date + " October");
		} else if(day>304 && day<=334) {
			date = day-31-28-31-30-31-30-31-31-30-31;
			System.out.println(date + " November");
		} else if(day>334 && day<=365) {
			date = day-31-28-31-30-31-30-31-31-30-31-30;
			System.out.println(date + " December");
		}
		
	}

}
