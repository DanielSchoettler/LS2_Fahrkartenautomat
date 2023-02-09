import java.util.Scanner;

class Fahrkartenautomat {
	
	public static void begreussung(){

		System.out.println("Herzlich Willkommen!");
	}
	
	public static double fahrkartenbestellungErfassen(Scanner tastatur){
		
		double Ticketpreis;
		double AnzahlTickets;
		double zuZahlenderBetrag;

		System.out.print("Ticketpreis (Euro): ");
		Ticketpreis = tastatur.nextDouble();
		System.out.print("Anzahl der Tickets: ");
		AnzahlTickets = tastatur.nextDouble();
		
		if (AnzahlTickets < 1 || AnzahlTickets > 10 || AnzahlTickets <0) {

			System.out.println("Fehlerhafte eingabe - Ticketanzahl wird auf 1 gesetzt");
			AnzahlTickets = 1;

		}

		zuZahlenderBetrag = Ticketpreis * AnzahlTickets;
		return zuZahlenderBetrag;
	}
	
	public static double fahrkartenBezahlen(Scanner tastatur,double zuZahlenderBetrag){
		
		
		double eingezahlterGesamtbetrag;
		double nochZuZahlen;
		double eingeworfeneMuenze;

		eingezahlterGesamtbetrag = 0.0;
		nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag){
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlen: %.2f Euro \n", nochZuZahlen);
			System.out.print("Eingabe (mind. 5 Cent, höchstens 20 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			
			if (eingeworfeneMuenze == 0.05 || eingeworfeneMuenze == 0.10 || eingeworfeneMuenze == 0.20 || eingeworfeneMuenze == 0.50
            || eingeworfeneMuenze == 1.00 || eingeworfeneMuenze == 2.00 || eingeworfeneMuenze == 5.00 || eingeworfeneMuenze == 10.00
            || eingeworfeneMuenze == 20.00) {
            eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
        } else {
            System.out.println("Ungültige Eingabe. Bitte erneut eingeben.");
        }
			
		}
		return eingezahlterGesamtbetrag;

    }

	public static void fahrkartenAusgeben(){
		
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");


	}

	public static double rueckgeldAusgeben(double eingezahlterGesamtbetrag,double zuZahlenderBetrag){

		double rueckgabebetrag;
		
		rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
		if (rueckgabebetrag > 0.0) {
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro \n", rueckgabebetrag);
			System.out.println("wird in folgenden Münzen/Schein ausgezahlt:");

			while (rueckgabebetrag >= 20.0) { // 20-Euro-Münzen
				System.out.println("20 Euro");
				rueckgabebetrag = rueckgabebetrag - 20.0;
			}
			while (rueckgabebetrag >= 10.0) { // 10-Euro-Münzen
				System.out.println("10 Euro");
				rueckgabebetrag = rueckgabebetrag - 10.0;
			}
			while (rueckgabebetrag >= 5.0) { // 5-Euro-Münzen
				System.out.println("5 Euro");
				rueckgabebetrag = rueckgabebetrag - 5.0;
			}
			while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
				rueckgabebetrag = rueckgabebetrag - 2.0;
			}
			while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro");
				rueckgabebetrag = rueckgabebetrag - 1.0;
			}
			while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
				System.out.println("50 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.5;
			}
			while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
				System.out.println("20 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.2;
			}
			while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.1;
			}
			while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.05;
			}
		}

		 System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");

		return rueckgabebetrag;

	}
	
	//public static double muenzRueckgabe(){




	
	
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double zuZahlenderBetrag;
		double eingezahlterGesamtbetrag;
	    
		
      
		begreussung();
		zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
		eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
		fahrkartenAusgeben();
		rueckgeldAusgeben(eingezahlterGesamtbetrag,zuZahlenderBetrag);
		
		tastatur.close();

		
		 

	}

	
}