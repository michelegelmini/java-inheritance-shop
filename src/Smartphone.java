
public class Smartphone extends Prodotto{
	
	private int imeiCode;
	private int storage;

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
	
}
