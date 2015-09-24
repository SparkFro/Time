import java.util.Scanner;
 
public class time {
	public static void main (String args []){
		Scanner input = new Scanner(System.in);
		
		int sec1 = 0;
		int sec2 = 0;
		int min = 0;
		int hrs = 0;
		 sec1 = input.nextInt();
		 hrs = sec1 / 3600; //Good
		 min = sec1 / 60;
		 min = min % 60;
		 sec2 = sec1 % 60;
				 
		System.out.print("The Converted time is " + hrs + " hrs " + min + " min " + sec2 + " sec" );		 
		 
		
		
	}
}
