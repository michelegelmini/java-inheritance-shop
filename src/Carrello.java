import java.util.Scanner;

public class Carrello {
	
	private Prodotto[] shoppingChart;
	
	public Carrello() {
		this.shoppingChart = new Prodotto[0];
	}
	
	public Prodotto[] getshoppingChart() {
		return this.shoppingChart;
	}
	
	public void addProduct(Prodotto newProduct) {
		
		// creo un nuovo array lungo un elemento in più di quello iniziale
		Prodotto[] newProducts = new Prodotto[this.shoppingChart.length + 1];
		
		
		// conto gli elementi del vecchio array e aggiungo un posto alla fine
		for (int index = 0; index < this.shoppingChart.length; index++) {
			newProducts[index] = this.shoppingChart[index];
		}
		
		//aggiungo il nuovo studente nel posto rimasto vuoto in fondo all'array
		newProducts[newProducts.length - 1] = newProduct;
		
		//sovrascrivo il vecchio array con quello nuovo
		this.shoppingChart = newProducts;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creo un nuovo carrello
		Carrello[] myShoppingChart = new Carrello[0];

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
		
		Prodotto newProduct = new Prodotto();
		
		//assegno caratteristiche comuni a tutti i prodotti (nome, descrizione, prezzo)
		newProduct.setName(userProductName);
		newProduct.setDescription(userProductDescription);
		newProduct.setPrice(userProductPrice);
		
		if (productTypeSelected.equals("smartphone")) {
			
			System.out.println("Hai aggiunto uno smartphone");
			//creo un nuovo smartphone
			newProduct = new Smartphone(newProduct.getName(), newProduct.getDescription(), newProduct.getPrice());
				
			//assegno caratteristiche specifiche dello smartphone
			
			Scanner userProductStorage = new Scanner(System.in);
			System.out.println("Quanti GB ha il tuo smartphone?");
			((Smartphone) newProduct).setStorage(userProductStorage.nextLine().toString());
			
			
		} else if (productTypeSelected.equals("monitor")) {
			System.out.println("Hai aggiunto un monitor");
			//creo un nuovo monitor
			newProduct = new Monitor(newProduct.getName(), newProduct.getDescription(), newProduct.getPrice());
			
			//assegno caratteristiche specifiche dei monitors
			
			Scanner userProductIsSmart = new Scanner(System.in);
			System.out.println("Il tuo monitor ha funzioni smart?");
			
			boolean hasSmartFunctions = false;
			if (userProductIsSmart.nextLine().toLowerCase().equals("si")) {
				hasSmartFunctions = true;
			}
			((Monitor) newProduct).setIsSmart(hasSmartFunctions);			
			
			Scanner userProductSize = new Scanner(System.in);
			System.out.println("Quanti pollici misura il tuo monitor?");
			((Monitor) newProduct).setSize(Integer.valueOf(userProductSize.nextLine()));
			
			
		} else if (productTypeSelected.equals("cuffie")) {
			System.out.println("Hai aggiunto delle cuffie");
			//creo nuove cuffie
			 newProduct = new Cuffie(newProduct.getName(), newProduct.getDescription(), newProduct.getPrice());
			
			//assegno caratteristiche specifiche delle cuffie
			
			Scanner userProductIsWireless = new Scanner(System.in);
			System.out.println("Le tue cuffie sono cablate o wireless?");
			((Cuffie) newProduct).setIsWireless(userProductIsWireless.nextLine());
					
			
			Scanner userProductColor = new Scanner(System.in);
			System.out.println("Di che colore sono?");
			((Cuffie) newProduct).setColor(userProductColor.nextLine());
						
			
		} 
		
		//assegno l'IVA e stampo il risultato
		newProduct.setVat(22);
		System.out.println(newProduct.toString());
		
		// addProduct(newProduct);
		
		
	
	}
	
}
