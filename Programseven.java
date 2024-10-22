import java.util.Arrays;
import java.util.Scanner;

public class Programseven {

    public static void main(String[] args) {
        
        int Oddcount=0,Evencount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no in the array with space :");
        String Str=sc.nextLine();

        String[] strtoarray=Str.split(" ");

        int[] strNo=Arrays.stream(strtoarray).mapToInt(Integer::parseInt).toArray();

        for(int i=0;i<strNo.length;i++){
            
            if(strNo[i]%2==0){

                Evencount++;
                
            }else{
                Oddcount++;
            }

        }

        System.out.println("the count of ODD and EVEN no are ");
        System.out.println("No of ODD no: "+Oddcount+"\nNo of EVEN no: "+Evencount);


    }
    
}
