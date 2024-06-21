
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone iPhone14 = new Smartphone("iPhone 14", "Ultima generazione di iPhone cazzutissimi", 43242, 128);
		
		iPhone14.setPrice(999.99d);
		iPhone14.setVat(22);
		iPhone14.getProductInfo();
	
		Cuffie AKG = new Cuffie("AKG", "Cuffie molto belle", "Nero", true);
		
		AKG.setPrice(110);
		AKG.setVat(22);
		AKG.getProductInfo();
		
		Monitor Samsung = new Monitor("Samsung", "Monitor Ultrawide bellissimo", 32, false);
		
		Samsung.setPrice(1152.99d);
		Samsung.setVat(22);
		Samsung.getProductInfo();
	}

}
