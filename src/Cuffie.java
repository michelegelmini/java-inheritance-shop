
public class Cuffie extends Prodotto{
	
	private String color;
	private String isWireless;
	
	public Cuffie() {}

	public Cuffie(String name, String description, String color, String isWireless) {
		super(name, description);
		// TODO Auto-generated constructor stub
		this.color = color;
		this.isWireless = isWireless;
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setIsWireless(String isWireless) {
		this.isWireless = isWireless;
	}

	public String getIsWireless() {
		if (this.isWireless.toLowerCase().equals("si")) {
			return "Questo modello è wireless";
		} else if (this.isWireless.toLowerCase().equals("no")){
			return "Questo modello è cablato";
		} else if (this.isWireless.toLowerCase().equals("entrambe")){
			return "Questo modello è sia cablato che wireless";
		} else {
			return "N/A";
		}
	}
	
	public void getProductInfo() {
		super.getProductInfo();
		this.getIsWireless();
		System.out.println("Colore: " + this.color);
		System.out.println("*******************************************");
		
	}
	
	@Override
	public String toString() {
		return super.toString() + 
		"Colore: " + this.color + "\n" +
		this.getIsWireless() + "\n" +
		"*******************************************";
	}

}
