import java.util.Random;

public class Smartphone extends Prodotto{
	
	private String imeiCode;
	private String storage;

	public Smartphone() {
		this.imeiCode = generateIMEICode();
	};
	
	public Smartphone(String name, String description, String storage) {
		super(name, description);
		// TODO Auto-generated constructor stub
		this.storage = storage;
		this.imeiCode = generateIMEICode();
	}
	
	
	static String generateIMEICode() {
		Random r = new Random();
		long max = 100000000000000L;
		long result = r.nextLong(max);
		return (String.format("%015d", result));
	}
	
	public void setStorage(String storage) {
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
