import java.util.Scanner;
public class IPMahasiswa {
	
		public static void main(String[] args){
			IPMahasiswa ipmhs = new IPMahasiswa();
			Scanner input = new Scanner(System.in);
	 		float ip;
                        int jmlMhs = 0, mhsLLs = 0; 
			
                        System.out.print("Inputkan ip: ");
			ip = input.nextFloat();
			while (ip != -999) {
			        if (ipmhs.isWithinRange(ip, 0, 4) == 1){
				jmlMhs++;
				}
				if (ip >= 2.75) {
				    mhsLLs++;
                               
				}
				System.out.print("Inputkan Ip: ");
				ip = input.nextFloat();
			}

 		        System.out.println("jumlah mahasiswa  : " + jmlMhs);
			System.out.println("Mahasiwa Lulus adalah : " + mhsLLs);
                       
			
			}
			
			int isWithinRange(float X, int min, int max){
				if (X >= min && X <= max) {
				 return 1;
				} else {
				  return 0;
				}
			}
			}
				 