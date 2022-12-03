import java.util.*;
class PrimeInterval{
    public static void main(String[] args) {
        // Scanner kb=new Scanner(System.in);
        // System.out.println("enter the number");
        // int num=kb.nextInt();    
        int count=0;
            for(var i=2;i<100;i++)
            {
               for(var j=2;j<=i;j++){
                    if(i%j==0){
                        count=0;
                        break;
                    }
                    else
                    {
                        count=1;
                        break;
                    }
               }
               if(count==1){
                   System.out.println(i);
               }
               
            }
            // if(count==0)
            // {
            //     System.out.println("not prime");
            // }
            // else{
            //     System.out.println("prime");
            // }
        }
    
}