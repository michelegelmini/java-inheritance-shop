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
		

		try (Scanner scanner = new Scanner(System.in)) {
				while (true) {
					
					System.out.println("Che tipo di prodotto vuoi aggiungere?" + "\n" + "1: Smartphone" + "\n" + "2: Monitor" + "\n" + "3: Cuffie" + "\n" + "4: Esci e vai al totale");
					int choiche = scanner.nextInt();
					scanner.nextLine();
					
					if (choiche == 4) {
						break;
					}
				
					//assegnazione caratteristiche comuni a tutti i tipi di prodotto
					//Nome
					System.out.println("Come si chiama il prodotto che vuoi aggiungere?");
					String userProductName = scanner.nextLine();
				
			
					//Descrizioned
					System.out.println("Descrivi il tuo prodotto:");
					String userProductDescription = scanner.nextLine();
				
					
					//Prezzo
					System.out.println("Quanto costa il tuo prodotto?");
					double userProductPrice = scanner.nextDouble();
					
					
					//creo l'oggetto opportuno sulla base della scelta dell'utente e aggiungo le caratteristiche specifiche
					
					switch (choiche) {
					
						case 1:	
							//assegno caratteristiche specifiche dello smartphone
							
							System.out.println("Quanti GB ha il tuo smartphone?");
							int userProductStorage = scanner.nextInt();
							scanner.nextLine();
							
							
							//creo un nuovo smartphone
							newProduct = new Smartphone(userProductName, userProductDescription, userProductPrice, userProductStorage);
							((Smartphone) newProduct).setStorage(userProductStorage);
							
							break;
							
							
						case 2:		
							
							//assegno caratteristiche specifiche dei monitors
							
							System.out.println("Il tuo monitor ha funzioni smart?");
							String userProductIsSmart = scanner.nextLine();
							scanner.nextLine();
							
							boolean hasSmartFunctions = false;
							if (userProductIsSmart.toLowerCase().equals("si")) {
								hasSmartFunctions = true;
							}
							
									
							System.out.println("Quanti pollici misura il tuo monitor?");
							int userProductSize = scanner.nextInt();
							
							scanner.nextLine();
													
							//creo un nuovo monitor
							newProduct = new Monitor(userProductName, userProductDescription, userProductPrice, userProductSize, hasSmartFunctions);
							
							break;
							
						case 3:
			
							//assegno caratteristiche specifiche delle cuffie
							String userProductIsWireless = "";
							System.out.println("Le tue cuffie sono" + "\n" + "1: Cablate" + "\n" + "2: Wireless" + "\n" + "3: Entrambe");
							int HeadphponesChoiche = scanner.nextInt();
							scanner.nextLine();
							switch (HeadphponesChoiche) {
								case 1:
									userProductIsWireless = "Questo modello è cablato";
									break;
								case 2:
									userProductIsWireless = "Questo modello è wireless";
									break;
								case 3:
									userProductIsWireless = "Questo modello è sia cablato che wireless";
									break;
								default:
									System.out.println("Scelta non valida. Riprova.");
							        continue;
							}
							
							System.out.println("Di che colore sono?");
							String userProductColor = scanner.nextLine();
							
				
							
							//creo nuove cuffie
							newProduct = new Cuffie(userProductName, userProductDescription, userProductPrice, userProductColor, userProductIsWireless);
							
							
							break;
							
						default:
							 System.out.println("Scelta non valida. Riprova.");
					         continue;
						} 
				
					myShoppingChart.addProduct(newProduct);
					
					
					System.out.println("Prodotto aggiunto!" + "\n" + "--------------------------------------------------------" + "\n" + "Se vuoi puoi aggiungerne ancora!");
					
						}
		}
				
				
				
				myShoppingChart.getShoppingChart();
				myShoppingChart.total();
				
				
				
	
		
		
	
	}
	
}
