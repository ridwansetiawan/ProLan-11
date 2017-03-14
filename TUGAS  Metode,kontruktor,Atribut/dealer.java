public class dealer {
	private String nama,jenismobil;
	
	private void mobil () {
		System.out.println ("Jenis Mobil");
	}
	public static void main (String[] args) {
		apv cars = new apv();
		System.out.println (cars.nama);
		cars.jmobil("jenismobil");
		cars.jmobil("jenismobil", "Suzuki APV");
		}
}		