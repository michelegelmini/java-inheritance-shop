
public class Monitor extends Prodotto{
	
	private int size;
	private boolean isSmart;

	public Monitor(String name, String description, int size, boolean isSmart) {
		super(name, description);
		// TODO Auto-generated constructor stub
		
		this.size = size;
		this.isSmart = isSmart;
		
	}
	public void getIsSmart() {
		if (this.isSmart) {
			System.out.println("Questo modello è smart");
		} else {
			System.out.println("Questo modello non è smart");
		}
	}
	
	public void getProductInfo() {
		super.getProductInfo();
		this.getIsSmart();
		System.out.println("Dimensioni: " + this.size + " pollici");
		System.out.println("*******************************************");
		
	}

}
