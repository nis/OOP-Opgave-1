import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Dato {
		private int date;					//Klassens eneste attribut
		
		public Dato(){}						//Default constructor
		
		public Dato(int aDate){				//Constructor med parameter
			this.date = aDate;
		}
		
		public String ugeDagTekst () {
			switch (ugeDag()) {
				case 1:  return "Mandag";
				case 2:  return "Tirsdag";
				case 3:  return "Onsdag";
				case 4:  return "Torsdag";
				case 5:  return "Fredag";
				case 6:  return "Lørdag";
				case 7:  return "Søndag";
				default: return "Forkert uge dags nummer.";
			}
		}
		
		public int ugeDag () {
			return ((new Dato(date).forskelIDage(new Dato(17000301))) % 7) + 1;
		}
		
		public int forskelIDage (Dato d) {
			Dato wD1 = new Dato(d.getDate());
			Dato wD2 = new Dato(date);
			int f = 0;
			
			if (wD1.getDate() == wD2.getDate()) {
				return f;
			}
			
			if (wD1.getDate() < wD2.getDate()) {
				while (wD1.getDate() != wD2.getDate()) {
					wD1.setDatoPlusEn();
					f++;
				}
			} else {
				while (wD2.getDate() != wD1.getDate()) {
					wD2.setDatoPlusEn();
					f++;
				}
			}
			
			return f;
		}
		
		public int getDate () {
			return date;
		}
		
		public void setNyDato (int d) {
			if (d > 0) {
				for (int i = 1; i <= d; i++) {
					setDatoPlusEn();
				}
				//System.out.println("1Hep!");
				return;
			}
			
			if (d < 0) {
				for (int i = -1; i >= d; i--) {
					setDatoMinusEn();
				}
				//System.out.println("2Hep!");
				return;
			}
		}
		
		public void setDatoPlusEn () {
			Calendar c = Calendar.getInstance();
			c.set(getYear(), getMonth() - 1, getDay());
			c.add(Calendar.DATE, 1);
			saveDate(c);
		}
		
		public void setDatoMinusEn () {
			Calendar c = Calendar.getInstance();
			c.set(getYear(), getMonth() - 1, getDay());
			c.add(Calendar.DATE, -1);
			saveDate(c);
		}
		
		public void saveDate(Calendar c) {
			SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd"); 
			date = Integer.parseInt(f.format(c.getTime()), 10);
			//System.out.println(f.format(c.getTime()));
		}
		
		public int getDay(){				//Returnerer dagen
			String aDate = 	Integer.toString(date);
			
			while (aDate.length() < 8) {
				aDate = "0" + aDate;
			}
			
			return Integer.parseInt(aDate.substring(6,8));
		}
		
		public int getMonth(){				//Returnerer måneden
			String aDate = 	Integer.toString(date);
			
			while (aDate.length() < 8) {
				aDate = "0" + aDate;
			}
			
			return Integer.parseInt(aDate.substring(4,6));
		}
		
		public int getYear(){				//Returnerer året
			String aDate = 	Integer.toString(date);
			
			while (aDate.length() < 8) {
				aDate = "0" + aDate;
			}

			return Integer.parseInt(aDate.substring(0,4));
		}
		
		public void setDay(int day){		//Ændrer dag til parameterens indhold
											//fx parameter 12 ændrer 20060928 til
											//20060912
			
			String aDay = Integer.toString(day);
			if (aDay.length() < 2) {
				aDay = "0" + aDay;
			}
			
			String aMonth = Integer.toString(getMonth());
			if (aMonth.length() < 2) {
				aMonth = "0" + aMonth;
			}
			
			String aYear = Integer.toString(getYear());
			if (aYear.length() < 2) {
				aYear = "0" + aYear;
			}
			
			if (aYear.length() < 3) {
				aYear = "0" + aYear;
			}
			
			if (aYear.length() < 4) {
				aYear = "0" + aYear;
			}
			
			
			
			date = Integer.parseInt(aYear + aMonth + aDay, 10);
		}
		
		public void setMonth(int m){		//Ændrer måned til parameterens indhold
											//fx parameter 12 ændrer 20060928 til
											//20061228
			
			String aDay = Integer.toString(getDay());
			if (aDay.length() < 2) {
				aDay = "0" + aDay;
			}
            
			String aMonth = Integer.toString(m);
			if (aMonth.length() < 2) {
				aMonth = "0" + aMonth;
			}
            
			String aYear = Integer.toString(getYear());
			if (aYear.length() < 2) {
				aYear = "0" + aYear;
			}
            
			if (aYear.length() < 3) {
				aYear = "0" + aYear;
			}
            
			if (aYear.length() < 4) {
				aYear = "0" + aYear;
			}
            
            
            
			date = Integer.parseInt(aYear + aMonth + aDay, 10);
		}
		
		public void setYear(int year){		//Ændrer år til parameterens indhold
											//fx parameter 2001 ændrer 20060928 til
											//20011228
			
			String aDay = Integer.toString(getDay());
			if (aDay.length() < 2) {
				aDay = "0" + aDay;
			}
            
			String aMonth = Integer.toString(getMonth());
			if (aMonth.length() < 2) {
				aMonth = "0" + aMonth;
			}
            
			String aYear = Integer.toString(year);
			if (aYear.length() < 2) {
				aYear = "0" + aYear;
			}
            
			if (aYear.length() < 3) {
				aYear = "0" + aYear;
			}
            
			if (aYear.length() < 4) {
				aYear = "0" + aYear;
			}
            
            
            
			date = Integer.parseInt(aYear + aMonth + aDay, 10);
		}
		
		public int getQuarter(){			//Returnerer kvartalet som 1-cifret tal
											//fx dato 20060928 returnerer 3
			if (getMonth() < 4) {
				return 1;
			}
			
			if (getMonth() < 7) {
				return 2;
			}
			
			if (getMonth() < 10) {
				return 3;
			}
			
			return 4;
		}
		
		public boolean leapYear(){			//Returnerer true på skudår ellers false
											//Skudår er år hvor 4 går op, dog ikke
											//år hvor 100 går op, men 400 ikke gør
			boolean aLeap = true;
			int aYear = getYear();
			
			aLeap = (aYear % 4 == 0);
			aLeap = aLeap && (aYear % 100 != 0);
			aLeap = aLeap || (aYear % 400 == 0);
			
			return aLeap;
		}
		
		public boolean validate(){			//Returnerer true, hvis aktuel dato er valid
											//ellers false. Fx 20060229 returnerer false.
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			dateFormat.setLenient(false);
			
			String aDay = Integer.toString(getDay());
			if (aDay.length() < 2) {
				aDay = "0" + aDay;
			}
            
			String aMonth = Integer.toString(getMonth());
			if (aMonth.length() < 2) {
				aMonth = "0" + aMonth;
			}
            
			String aYear = Integer.toString(getYear());
			if (aYear.length() < 2) {
				aYear = "0" + aYear;
			}
            
			if (aYear.length() < 3) {
				aYear = "0" + aYear;
			}
            
			if (aYear.length() < 4) {
				aYear = "0" + aYear;
			}
			
			try {
				dateFormat.parse(aYear + aMonth + aDay);
			} catch (ParseException pe) {
				return false;
			}
			
			return true;
		}
		
		public int dayOfYear(){				//Returnerer aktuel dato i året. Fx 20060211
											//returnerer 42.
			
			Calendar aCal = Calendar.getInstance();
			aCal.set(getYear(), getMonth() - 1, getDay());
			
			return aCal.get(Calendar.DAY_OF_YEAR);
		}
		
		public int remainingDaysInYear(){	//Returnerer resterende antal dage i året.
											//Fx 20060211 returnerer 323.
			if (leapYear()) {
				return 366 - dayOfYear();
			} else {
				return 365 - dayOfYear();
			}
		}
}