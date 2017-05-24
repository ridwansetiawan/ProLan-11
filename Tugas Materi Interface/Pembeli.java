public class Pembeli implements Dealer{

	@Override
	public void Merek(String Merek) {
		System.out.println("Merek");
	}

	@Override
	public void TypeM(String TypeM) {
		System.out.println("Type Mobil");
	}	
	
	@Override
	public void sport(String sport) {
		System.out.println("mobil sport");
	}	
	
	@Override
	public void mpv(String mpv) {
		System.out.println("Mpv Mobil Keluarga");
	}	
	
}
	