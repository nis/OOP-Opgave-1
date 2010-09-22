public class Main {
	public static void main (String[] args) {
		int startDato = 19781020;
		System.out.println("Sætter datoen til: " + startDato);
		Dato d = new Dato(startDato);
		System.out.println("Dagen er: " + d.getDay());
		System.out.println("Måneden er: " + d.getMonth());
		System.out.println("Året er: " + d.getYear());
		
		System.out.println("\nSætter dagen til: 25");
		System.out.println("Sætter måneden til: 5");
		System.out.println("Sætter året til: 5");
		d.setDay(25);
		d.setMonth(5);
		d.setYear(5);
		System.out.println("Dagen er: " + d.getDay());
		System.out.println("Måneden er: " + d.getMonth());
		System.out.println("Året er: " + d.getYear());
		
		System.out.println("\nTester kvartaler:");
		int i;
		for (i = 1; i <= 12 ; i++) {
			d.setMonth(i);
			System.out.println("Måned " + d.getMonth() + " er i " + d.getQuarter() + ". kvartal");
		}
		
	}
}