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
		System.out.println("Quanto costa il tuo smartphone?");
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
			
			newSmartphone.setVat(22);
			System.out.println(newSmartphone.toString());
			
		} else if (productTypeSelected.equals("monitor")) {
			System.out.println("Hai aggiunto un monitor");
		} else if (productTypeSelected.equals("cuffie")) {
			System.out.println("Hai aggiunto delle cuffie");
		} 
	}
	
}
