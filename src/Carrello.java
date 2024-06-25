import java.util.Scanner;

public class Carrello {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//assegnazione caratteristiche comuni a tutti i tipi di prodotto
		//Nome
		Scanner userProductNameScan = new Scanner(System.in);
		System.out.println("Come si chiama il prodotto che vuoi aggiungere?");
		String userProductName = userProductNameScan.nextLine().toString();

		//Descrizione
		Scanner userProductDescriptionScan = new Scanner(System.in);
		System.out.println("Descrivi il tuo prodotto:");
		String userProductDescription = userProductDescriptionScan.nextLine().toString();
		
		//Prezzo
		Scanner userProductPriceScan = new Scanner(System.in);
		System.out.println("Quanto costa il tuo prodotto?");
		int userProductPrice = Integer.valueOf(userProductPriceScan.nextLine());
		
		//chiedo quale delle tre tipologie di prodotto vuole aggiungere l'utente
		
		String productTypeSelected = "";
		boolean userChoice = false;
		System.out.println("Vuoi aggiungere uno smartphone, un monitor o delle cuffie?");
		
		while (userChoice == false) {
				Scanner productType = new Scanner(System.in);
				
				productTypeSelected = productType.nextLine().toString().toLowerCase();
				if ((productTypeSelected.equals("smartphone") || productTypeSelected.equals("cuffie") || productTypeSelected.equals("monitor"))) {
					userChoice = true;
				} else {
					System.out.println("Non hai inserito un valore valido. Riprova.");
				}
			}
		
		//creo l'oggetto opportuno sulla base della scelta dell'utente e aggiungo le caratteristiche specifiche
		
		if (productTypeSelected.equals("smartphone")) {
			
			System.out.println("Hai aggiunto uno smartphone");
			//creo un nuovo smartphone
			Smartphone newSmartphone = new Smartphone();
			
			//assegno caratteristiche comuni allo smartphone (nome, descrizione, prezzo)
			
			newSmartphone.setName(userProductName);
			newSmartphone.setDescription(userProductDescription);
			newSmartphone.setPrice(userProductPrice);
			
			//assegno caratteristiche specifiche dello smartphone
			
			Scanner userProductStorage = new Scanner(System.in);
			System.out.println("Quanti GB ha il tuo smartphone?");
			newSmartphone.setStorage(userProductStorage.nextLine().toString());
			
			//assegno l'IVA e stampo il risultato
			newSmartphone.setVat(22);
			System.out.println(newSmartphone.toString());
			
		} else if (productTypeSelected.equals("monitor")) {
			System.out.println("Hai aggiunto un monitor");
			//creo un nuovo monitor
			Monitor newMonitor = new Monitor();
			//assegno caratteristiche comuni allo smartphone (nome, descrizione, prezzo)
			
			newMonitor.setName(userProductName);
			newMonitor.setDescription(userProductDescription);
			newMonitor.setPrice(userProductPrice);
			
			//assegno caratteristiche specifiche dei monitors
			
			Scanner userProductIsSmart = new Scanner(System.in);
			System.out.println("Il tuo monitor ha funzioni smart?");
			
			boolean hasSmartFunctions = false;
			if (userProductIsSmart.nextLine().toLowerCase().equals("si")) {
				hasSmartFunctions = true;
			}
			newMonitor.setIsSmart(hasSmartFunctions);			
			
			Scanner userProductSize = new Scanner(System.in);
			System.out.println("Quanti pollici misura il tuo monitor?");
			newMonitor.setSize(Integer.valueOf(userProductSize.nextLine()));
			
			
			//assegno l'IVA e stampo il risultato
			newMonitor.setVat(22);
			System.out.println(newMonitor.toString());
			
		} else if (productTypeSelected.equals("cuffie")) {
			System.out.println("Hai aggiunto delle cuffie");
			//creo nuove cuffie
			Cuffie newHeadphones = new Cuffie();
			
			//assegno caratteristiche comuni (nome, descrizione, prezzo)
			newHeadphones.setName(userProductName);
			newHeadphones.setDescription(userProductDescription);
			newHeadphones.setPrice(userProductPrice);
			
			//assegno caratteristiche specifiche delle cuffie
			
			Scanner userProductIsWireless = new Scanner(System.in);
			System.out.println("Le tue cuffie sono cablate o wireless?");
			newHeadphones.setIsWireless(userProductIsWireless.nextLine());
					
			
			Scanner userProductColor = new Scanner(System.in);
			System.out.println("Di che colore sono?");
			newHeadphones.setColor(userProductColor.nextLine());
			
			
			//assegno l'IVA e stampo il risultato
			newHeadphones.setVat(22);
			System.out.println(newHeadphones.toString());
		} 
	}
	
}
