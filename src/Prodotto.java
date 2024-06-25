

import java.util.Random;

public class Prodotto {
	private String code;
	private String name;
	private String description;
	private double price;
	private int vat;
	
	
	//costruttore
	public Prodotto(String name, String description) {
		this.code = generateCode();
		this.name = name;
		this.description = description;
		
		
	}
	
	//getter e setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		System.out.println(this.description);
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
		this.price = price;
		} else {
			System.out.println("Il prezzo non può essere negativo");
		}
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		if (vat >= 0) {
			this.vat = vat;
			} else {
				System.out.println("l'IVA non può essere negativa");
			}
	}

	public String getCode() {
		return code;
	}
	
	// metodo per la generazione del codice prodotto
		static String generateCode() {
			Random r = new Random();
			int max = 10000000;
			int result = r.nextInt(max);
			return (String.format("%08d", result));
		}
		
	//metodo per avere il prezzo base
	public void getBasePrice() {
		if (this.price > 0) 
		System.out.println("Il prezzo base del prodotto è €" + (String.format("%,.2f", this.price)));
	}
		
	//metodo per avere il prezzo comprensivo di IVA
	public void getVatPrice() {
		if (this.price > 0  && this.vat > 0) {
		double finalPrice = this.price += this.price * this.vat / 100;
		System.out.println("Il prezzo comprensivo di IVA del prodotto è €" + (String.format("%,.2f", finalPrice)));
		}
	}
	
	//metodo per avere il nome esteso, ottenuto concatenando codice-nome
	
	public void getFullName() {
		System.out.println(this.code + " - " + this.name);
	}
	
	public void getProductInfo() {
		System.out.println("*******************************************");
		this.getFullName();
		this.getDescription();
		this.getVatPrice();
		
	}
	
	
	//override del metodo toString
	@Override
	public String toString() {
	 return this.name;
	}
	
	
}
