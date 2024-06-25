
public class Cuffie extends Prodotto{
	
	private String color;
	private boolean isWireless;

	public Cuffie(String name, String description, String color, boolean isWireless) {
		super(name, description);
		// TODO Auto-generated constructor stub
		this.color = color;
		this.isWireless = isWireless;
		
	}
	
	public void getIsWireless() {
		if (this.isWireless) {
			System.out.println("Questo modello è wireless");
		} else {
			System.out.println("Questo modello è cablato");
		}
	}
	
	public void getProductInfo() {
		super.getProductInfo();
		this.getIsWireless();
		System.out.println("Colore: " + this.color);
		System.out.println("*******************************************");
		
	}

}
