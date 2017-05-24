import java.util.Scanner;

public class DealerMain {
  public static void main(String args[]){
	String Merek;
	String TypeM;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Masukkan Merek:");
	Merek = input.next();
	
	
	System.out.println("Masukkan Type Mobil:");
	TypeM = input.next();
	
	Pembeli buyer = new Pembeli(); 
	buyer.DP();
	buyer.Cash();
	
	}	
}  