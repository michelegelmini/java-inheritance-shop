
public class Cuffie extends Prodotto{
	
	private String color;
	private String isWireless;
	
	public Cuffie() {}
	
	public Cuffie(String name, String description, double price) {
		super(name, description, price);
	}

	public Cuffie(String name, String description, double price, String color, String isWireless) {
		super(name, description, price);
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
	return isWireless;
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
