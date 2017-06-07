public class Generictask1 {

   private static <T> void printToko(T Toko) {
        System.out.println("Toko : " +Toko);
        
	    Character varChar = 'M';
        Integer varInt = 90000;
        String varString = "Kemeja";
        
        System.out.println();
        System.out.println("Barang yang di beli : ");
        
        print(varInt);
        print(varChar);
        print(varString);
    }
    public static void print (Character TokoChar) {
        System.out.println(TokoChar);
    }
    
    public static void print (Integer TokoInteger) {
        System.out.println(TokoInteger);
    }
      
    public static void print (String TokoString) {
        System.out.println(TokoString);

    }
}
