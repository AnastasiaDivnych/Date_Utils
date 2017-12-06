package Es;

import java.util.Date;

public class Metodi {
	
	public static void DifferenzaSecondi (Date date , Date date2) {
		long diff = date2.getTime() - date.getTime();
		int diffSeconds = (int) (diff / 1000 * 60);
		System.out.println("In secondi : " + diffSeconds);
	}
	
	public static void DifferenzaMinuti (Date date , Date date2) {
		long diff = date2.getTime() - date.getTime();
		int diffMinutes = (int) (diff / (60 * 1000) * 60);
		System.out.println("In minuti : " + diffMinutes);
	}
	
	public static void DifferenzaOre (Date date , Date date2) {
		long diff = date2.getTime() - date.getTime();
		int diffHours = (int) (diff / (60 * 60 * 1000));
		System.out.println("In ore : " + diffHours);
	}
	
	public static void DifferenzaAnni (Date date , Date date2) {
		@SuppressWarnings("deprecation")
		int diffYear = date2.getYear() - date.getYear();
		System.out.println("In anni : " + diffYear);
	}
	
	public static void DifferenzaMesi (Date date , Date date2) {
		@SuppressWarnings("deprecation")
		int year = date2.getYear() - date.getYear();
	    @SuppressWarnings("deprecation")
		int diffInMounth = year * 12 + date2.getMonth() - date.getMonth();
	    System.out.println("In mesi : " + diffInMounth);
	}
	
	public static void DifferenzaGiorni (Date date , Date date2) {
		long diff = date2.getTime() - date.getTime();
		int diffInDays = (int) (diff / (1000 * 60 * 60 * 24));
		System.out.println("In giorni : " + diffInDays);
	}
	
	@SuppressWarnings("deprecation")
	public static void AggiungereSecondi (Date date , int secondi) {
		long add = date.getSeconds() + secondi;
		date.setSeconds((int) add);
		System.out.println(date);
	}
	@SuppressWarnings("deprecation")
	public static void AggiungereMinuti (Date date , int minuti) {
		long add = date.getMinutes() + minuti;
		date.setMinutes((int) add);
		System.out.println(date);
	}
	@SuppressWarnings("deprecation")
	public static void AggiungereOre (Date date , int ore) {
		long add = date.getHours() + ore;
		date.setHours((int) add);
		System.out.println(date);
	}
	@SuppressWarnings("deprecation")
	public static void AggiungereGiorni (Date date , int giorni) {
		long add = (date.getDate() )+ giorni;
		date.setDate((int) add);
		System.out.println(date);
	}
	public static void AggiungereMesi (Date date , int mesi) {
		long mesmil = mesi * (1000 * 60 * 60 * 24 * 12);
		long add = date.getTime() + mesmil ;
		date.setTime(add);
		System.out.println(date);
	}
	@SuppressWarnings("deprecation")
	public static void AggiungereAnni (Date date , int anni) {
		long add = date.getYear() + anni;
		date.setYear((int) add);
		System.out.println(date);
	}
	
	public static void main (String[] args) {
		@SuppressWarnings("deprecation")
		Date d = new Date(2017 - 1900,10,3,9,29,52);
		@SuppressWarnings("deprecation")
		Date d2 = new Date (2017 - 1900,12,4,9,29,58);
		
		DifferenzaAnni(d, d2);
		DifferenzaMesi(d, d2);
		DifferenzaGiorni(d, d2);
		DifferenzaOre(d, d2);
		DifferenzaMinuti(d, d2);
		DifferenzaSecondi(d, d2);
		
		AggiungereSecondi(d , 2);
		AggiungereMinuti(d , 2);
		AggiungereOre(d , 2);
		AggiungereGiorni(d , 2);
		AggiungereMesi(d , 1);
		AggiungereAnni(d , 2);
		
	}
}
