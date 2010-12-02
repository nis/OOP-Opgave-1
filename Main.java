public class Main {
	public static void main (String[] args) {
		int startDato = 19781020;
		System.out.println("Sætter datoen til: 20/10-1978");
		Dato d = new Dato(startDato);
		System.out.println("Dato: " + d.getDay() + "/" + d.getMonth() + "-" + d.getYear() );
		
		
		System.out.println("\nLægger en dag til datoen:");
		d.setDatoPlusEn();
		
		System.out.println("Dato: " + d.getDay() + "/" + d.getMonth() + "-" + d.getYear() );
		
		System.out.println("\nTrækker en dag fra datoen:");
		d.setDatoMinusEn();
		
		System.out.println("Dato: " + d.getDay() + "/" + d.getMonth() + "-" + d.getYear() );
		
		
		System.out.println("\nLægger 20 dage til datoen:");
		d.setNyDato(20);
		
		System.out.println("Dato: " + d.getDay() + "/" + d.getMonth() + "-" + d.getYear() );
		
		System.out.println("\nTrækker 20 dage fra datoen:");
		d.setNyDato(-20);
		
		System.out.println("Dato: " + d.getDay() + "/" + d.getMonth() + "-" + d.getYear() );
		
		System.out.println("\nTester forskellen i dage:");
		System.out.println("Forskellen mellem den ovenstående og den samme: " + d.forskelIDage(d));
		System.out.println("Forskellen mellem den ovenstående og 30/10-1978: " + d.forskelIDage(new Dato(19781030)));
		System.out.println("Forskellen mellem den ovenstående og 10/10-1978: " + d.forskelIDage(new Dato(19781010)));
		System.out.println("Forskellen mellem den ovenstående og 20/10-1979: " + d.forskelIDage(new Dato(19791020)));
		
		System.out.println("\nTester ugeDag():");
		System.out.println("Ugedag for 20/10-1978: " + d.ugeDag());
		System.out.println("Ugedag for 2/12-2010: " + new Dato(20101202).ugeDag());
		
		System.out.println("\nTester ugeDagTekst():");
		System.out.println("Ugedag for 20/10-1978: " + d.ugeDagTekst());
		System.out.println("Ugedag for 2/12-2010: " + new Dato(20101202).ugeDagTekst());
		
		// De resterende linjer tester funktionaliteten fra første portefølge opgave:
		
		// System.out.println("\nSætter datoen til: 25/5-0005");
		// d.setDay(25);
		// d.setMonth(5);
		// d.setYear(5);
		// System.out.println("Datoen er: " + d.getDay() + "/" + d.getMonth() + "-" + d.getYear());
		// 
		// System.out.println("\nTester kvartaler:");
		// int i;
		// for (i = 1; i <= 12 ; i++) {
		// 	d.setMonth(i);
		// 	System.out.println(d.getMonth() +". måned er i " + d.getQuarter() + ". kvartal");
		// }
		// 
		// System.out.println("\nTester skudår:");
		// d.setYear(1900);
		// if (d.leapYear()) {
		// 	System.out.println("År " + d.getYear() + " er et skudår");
		// } else {
		// 	System.out.println("År " + d.getYear() + " er ikke et skudår");
		// }
		// 
		// d.setYear(2000);
		// if (d.leapYear()) {
		// 	System.out.println("År " + d.getYear() + " er et skudår");
		// } else {
		// 	System.out.println("År " + d.getYear() + " er ikke et skudår");
		// }
		// 
		// d.setYear(2004);
		// if (d.leapYear()) {
		// 	System.out.println("År " + d.getYear() + " er et skudår");
		// } else {
		// 	System.out.println("År " + d.getYear() + " er ikke et skudår");
		// }
		// 
		// d.setYear(2100);
		// if (d.leapYear()) {
		// 	System.out.println("År " + d.getYear() + " er et skudår");
		// } else {
		// 	System.out.println("År " + d.getYear() + " er ikke et skudår");
		// }
		// 
		// System.out.println("\nTester datovalidatoren:");
		// d.setDay(37);
		// d.setMonth(5);
		// d.setYear(1450);
		// if (d.validate()) {
		// 	System.out.println(d.getDay() + "/" + d.getMonth() + "-" + d.getYear() + " er en korrekt dato");
		// } else {
		// 	System.out.println(d.getDay() + "/" + d.getMonth() + "-" + d.getYear() + " er ikke en korrekt dato");
		// }
		// 
		// d.setDay(31);
		// d.setMonth(12);
		// d.setYear(2011);
		// if (d.validate()) {
		// 	System.out.println(d.getDay() + "/" + d.getMonth() + "-" + d.getYear() + " er en korrekt dato");
		// } else {
		// 	System.out.println(d.getDay() + "/" + d.getMonth() + "-" + d.getYear() + " er ikke en korrekt dato");
		// }
		// 
		// System.out.println("\nTester dayOfYear():");
		// d.setDay(1);
		// d.setMonth(1);
		// d.setYear(2010);
		// System.out.println(d.getDay() + "/" + d.getMonth() + "-" + d.getYear() + " er dag nummer " + d.dayOfYear());
		// 
		// d.setDay(31);
		// d.setMonth(12);
		// d.setYear(2004);
		// System.out.println(d.getDay() + "/" + d.getMonth() + "-" + d.getYear() + " er dag nummer " + d.dayOfYear());
		// 
		// d.setDay(20);
		// d.setMonth(10);
		// d.setYear(1978);
		// System.out.println(d.getDay() + "/" + d.getMonth() + "-" + d.getYear() + " er dag nummer " + d.dayOfYear());
		// 
		// 
		// System.out.println("\nTester remainingDaysInYear():");
		// d.setDay(1);
		// d.setMonth(1);
		// d.setYear(2010);
		// System.out.println(d.getDay() + "/" + d.getMonth() + "-" + d.getYear() + " er der " + d.remainingDaysInYear() + " dage tilbage af året");
		// 
		// d.setDay(31);
		// d.setMonth(12);
		// d.setYear(2004);
		// System.out.println(d.getDay() + "/" + d.getMonth() + "-" + d.getYear() + " er der " + d.remainingDaysInYear() + " dage tilbage af året");
		// 
		// d.setDay(20);
		// d.setMonth(10);
		// d.setYear(1978);
		// System.out.println(d.getDay() + "/" + d.getMonth() + "-" + d.getYear() + " er der " + d.remainingDaysInYear() + " dage tilbage af året");
	}
}