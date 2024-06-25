
public class Smartphone extends Prodotto{
	
	private int imeiCode;
	private int storage;

	public Smartphone() {};
	
	public Smartphone(String name, String description, int imeiCode, int storage) {
		super(name, description);
		// TODO Auto-generated constructor stub
		this.imeiCode = imeiCode;
		this.storage = storage;
	}
	
	
	public void getProductInfo() {
		super.getProductInfo();
		System.out.println("Codice IMEI: " + this.imeiCode);
		System.out.println("Capacità: " + this.storage + "GB");
		System.out.println("*******************************************");
		
	}
	
	@Override
	public String toString() {
		return super.toString() + 
		"Codice IMEI: " + this.imeiCode + "\n" +
		"Capacità: " + this.storage + "GB" + "\n" +
		"*******************************************";
	}
	
}
