import java.util.Scanner;

public class Carrello {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner productType = new Scanner(System.in);
		System.out.println("Vuoi aggiungere uno smartphone, un monitor o delle cuffie?");
		
		String productTypeSelected = productType.nextLine().toString().toLowerCase();
		
		
		if (productTypeSelected.equals("smartphone")) {
			System.out.println("Hai aggiunto uno smartphone");
			//creo un nuovo smartphone
			Smartphone newSmartphone = new Smartphone();
			
			//assegno caratteristiche (nome, descrizione, prezzo)
			Scanner userProductName = new Scanner(System.in);
			System.out.println("Come si chiama il tuo smartphone?");
			newSmartphone.setName(userProductName.nextLine().toString());
			
			Scanner userProductDescription = new Scanner(System.in);
			System.out.println("Come descriveresti il tuo smartphone?");
			newSmartphone.setDescription(userProductDescription.nextLine().toString());
			
			Scanner userProductPrice = new Scanner(System.in);
			System.out.println("Quanto costa il tuo smartphone?");
			newSmartphone.setPrice(Integer.valueOf(userProductPrice.nextLine()));
			
			newSmartphone.setVat(22);
			System.out.println(newSmartphone.toString());
			
		} else if (productTypeSelected.equals("monitor")) {
			System.out.println("Hai aggiunto un monitor");
		} else if (productTypeSelected.equals("cuffie")) {
			System.out.println("Hai aggiunto delle cuffie");
		} else {
			System.out.println("Riprova");
		}
	}
	
}
