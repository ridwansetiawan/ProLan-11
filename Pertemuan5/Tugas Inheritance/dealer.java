public class dealer extends apv {
	
	
	
	@Override	
	public void VarianMobil(){
		System.out.println("Mobil Yang Ready");
	}	
		
	public dealer (String warna){
		super(warna);
	}
	public void apv (){
	System.out.println("Merek Mobil : " + super.merek);
	
	super.VarianMobil();
	VarianMobil();
	
	}
	public static void main(String argd[]) {
		dealer warna = new dealer("WARNA MOBIL");
		warna.Warnamobil();
		dealer nmtk = new dealer("Warna");
		nmtk.apv();
	}
	}	
	
		