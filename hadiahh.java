import java.util.Scanner;
public class hadiahh {
	public static void main (String [] args){
		
		int detik,menit,jam,total,tdetik;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print (" Input Jam = "); jam = input.nextInt(); 
		System.out.print (" Input Menit = "); menit = input.nextInt(); 
		System.out.print (" Input Detik = "); detik = input.nextInt(); 
		
		tdetik = jam*3600+menit*60+detik;
		System.out.println("Total Detik = "+tdetik);

	}
}