public class Generictask2 {
	
    
    private static void getSepatu() {
        System.out.println(10);
    }
    public static <T> void Nomor(T Nomor) {
        System.out.println(Nomor);
    }
    
    public static <T> void harga (T harga) {
        System.out.println(harga);
    }
	   
    public static void main (String[] args){
      
      getSepatu();
      Nomor(40);
      harga(200000);
       
    }

    

    
    
}
    