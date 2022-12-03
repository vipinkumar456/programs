
import java.util.Scanner;
 
public class Loop26 {
 
    public static void main(String[] args) {
        // System.out.println("Enter a String: ");
        // Scanner sc = new Scanner(System.in);
        String s ="india";
        // sc.close();
        
        char [] a=s.toCharArray();
        for (int i = 0; i<=4; i++) {
            for (int j = 0; j <= i; j++) 
			{
                System.out.print(a[j]);
            }
			
			
            System.out.println();
        }int r=4;
		for (int n=0; n<=4; n++,r--)
		{
		 for (int k =0; k<=r; k++) 
			{
                System.out.print(a[k]);
            }
			System.out.println();
		}
    }
 
}