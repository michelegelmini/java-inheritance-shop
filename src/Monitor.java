
public class Monitor extends Prodotto{
	
	private int size;
	private boolean isSmart;

	public Monitor(String name, String description, int size, boolean isSmart) {
		super(name, description);
		// TODO Auto-generated constructor stub
		
		this.size = size;
		this.isSmart = isSmart;
		
	}
	public String getIsSmart() {
		if (this.isSmart) {
			return "Questo modello è smart";
		} else {
			return "Questo modello non è smart";
		}
	}
	
	public void getProductInfo() {
		super.getProductInfo();
		this.getIsSmart();
		System.out.println("Dimensioni: " + this.size + " pollici");
		System.out.println("*******************************************");
		
	}
	
	@Override
	public String toString() {
		return super.toString() + 
		"Dimensioni: " + this.size + "pollici" + "\n" +
		this.getIsSmart() + "\n" +
		"*******************************************";
	}

}
