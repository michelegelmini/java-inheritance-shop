import java.util.Scanner;

public class Carrello {
	
	private Prodotto[] shoppingChart;
	private int numberOfProducts;
	
	public Carrello() {
		this.shoppingChart = new Prodotto[0];
		this.numberOfProducts = 0;
	}
	
	public void getShoppingChart() {
		for (int i = 0; i < numberOfProducts; i++) {
			System.out.println(shoppingChart[i]);
		}
	}
	
	public void addProduct(Prodotto newProduct) {
		
		// creo un nuovo array lungo un elemento in più di quello iniziale
		Prodotto[] newProducts = new Prodotto[shoppingChart.length + 1];
		
		
		// conto gli elementi del vecchio array e aggiungo un posto alla fine
		for (int index = 0; index < numberOfProducts; index++) {
			newProducts[index] = shoppingChart[index];
		}
		
		//aggiungo il nuovo prodotto nel posto rimasto vuoto in fondo all'array
		newProducts[numberOfProducts] = newProduct;
		
		//sovrascrivo il vecchio array con quello nuovo
		this.shoppingChart = newProducts;
		numberOfProducts++;
	}
	
	public void total() {
		double total = 0.0d;
		for (int i = 0; i < numberOfProducts; i++) {
			total += shoppingChart[i].getVatPrice();
		}
		System.out.println("Il costo totale dei prodotti è: " + (String.format("%,.2f",total)) + "€");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creo un nuovo carrello
		Carrello myShoppingChart = new Carrello();
		//creo un nuovo prodotto
		Prodotto newProduct = new Prodotto();
		int addAnotherProduct = 1;

		while (true) {
			
			if (addAnotherProduct != 1) {
				break;
			}
		
			//assegnazione caratteristiche comuni a tutti i tipi di prodotto
			//Nome
			Scanner userProductNameScan = new Scanner(System.in);
			System.out.println("Come si chiama il prodotto che vuoi aggiungere?");
			String userProductName = userProductNameScan.nextLine().toString();
			userProductNameScan.close();
	
			//Descrizione
			Scanner userProductDescriptionScan = new Scanner(System.in);
			System.out.println("Descrivi il tuo prodotto:");
			String userProductDescription = userProductDescriptionScan.nextLine().toString();
			userProductDescriptionScan.close();
			
			//Prezzo
			Scanner userProductPriceScan = new Scanner(System.in);
			System.out.println("Quanto costa il tuo prodotto?");
			int userProductPrice = Integer.valueOf(userProductPriceScan.nextLine());
			userProductPriceScan.close();
			
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
						productType.close();
					}
			
			//creo l'oggetto opportuno sulla base della scelta dell'utente e aggiungo le caratteristiche specifiche
			
			
			
			if (productTypeSelected.equals("smartphone") || productTypeSelected.equals("1") ) {
				
				System.out.println("Hai aggiunto uno smartphone");
				//creo un nuovo smartphone
				newProduct = new Smartphone(userProductName, userProductDescription, userProductPrice);
					
				//assegno caratteristiche specifiche dello smartphone
				
				Scanner userProductStorage = new Scanner(System.in);
				System.out.println("Quanti GB ha il tuo smartphone?");
				((Smartphone) newProduct).setStorage(userProductStorage.nextLine().toString());
				userProductStorage.close();
				
				
			} else if (productTypeSelected.equals("monitor")|| productTypeSelected.equals("2")) {
				System.out.println("Hai aggiunto un monitor");
				//creo un nuovo monitor
				newProduct = new Monitor(userProductName, userProductDescription, userProductPrice);
				
				//assegno caratteristiche specifiche dei monitors
				
				Scanner userProductIsSmart = new Scanner(System.in);
				System.out.println("Il tuo monitor ha funzioni smart?");
				
				boolean hasSmartFunctions = false;
				if (userProductIsSmart.nextLine().toLowerCase().equals("si")) {
					hasSmartFunctions = true;
				}
				((Monitor) newProduct).setIsSmart(hasSmartFunctions);			
				userProductIsSmart.close();
				
				Scanner userProductSize = new Scanner(System.in);
				System.out.println("Quanti pollici misura il tuo monitor?");
				((Monitor) newProduct).setSize(Integer.valueOf(userProductSize.nextLine()));
				userProductSize.close();
				
			} else if (productTypeSelected.equals("cuffie")|| productTypeSelected.equals("3")) {
				System.out.println("Hai aggiunto delle cuffie");
				//creo nuove cuffie
				 newProduct = new Cuffie(userProductName, userProductDescription, userProductPrice);
				
				//assegno caratteristiche specifiche delle cuffie
				
				Scanner userProductIsWireless = new Scanner(System.in);
				System.out.println("Le tue cuffie sono cablate o wireless?");
				((Cuffie) newProduct).setIsWireless(userProductIsWireless.nextLine());
				userProductIsWireless.close();	
				
				Scanner userProductColor = new Scanner(System.in);
				System.out.println("Di che colore sono?");
				((Cuffie) newProduct).setColor(userProductColor.nextLine());
				userProductColor.close();		
				
			} 
		
			myShoppingChart.addProduct(newProduct);
			
			Scanner addAnother = new Scanner(System.in);
			System.out.println("Vuoi aggiungere un altro prodotto?"+ "\n" + "1: sì, 2:no" + "\n");
			addAnotherProduct = addAnother.nextInt();
			addAnother.close();
			System.out.println("--------------------------------------------------------");
			
				}
		
		
		
		myShoppingChart.getShoppingChart();
		myShoppingChart.total();
		
		
		
	
		
		
	
	}
	
}
