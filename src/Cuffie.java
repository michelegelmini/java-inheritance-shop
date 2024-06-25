
public class Cuffie extends Prodotto{
	
	private String color;
	private boolean isWireless;

	public Cuffie(String name, String description, String color, boolean isWireless) {
		super(name, description);
		// TODO Auto-generated constructor stub
		this.color = color;
		this.isWireless = isWireless;
		
	}
	
	public String getIsWireless() {
		if (this.isWireless) {
			return "Questo modello è wireless";
		} else {
			return "Questo modello è cablato";
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
