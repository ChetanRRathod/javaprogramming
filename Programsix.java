import java.util.Arrays;
import java.util.Scanner;

public class Programsix {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers with space in array 1:  ");
        String string1=sc.nextLine();

        String[] strtoarray1= string1.split(" ");
        int[] array1= Arrays.stream(strtoarray1).mapToInt(Integer::parseInt).toArray();


        
        System.out.println("Enter the numbers with space in array 2: ");

        String string2=sc.nextLine();
        String[] strtoarray2= string2.split(" ");
        int[] array2=Arrays.stream(strtoarray2).mapToInt(Integer::parseInt).toArray();

        // String output="";

        int minsize=Math.min(array1.length,array2.length);
        
        int[] total=new int[minsize];
        for(int i=0;i<minsize;i++){

            total[i]=array1[i]*array2[i];
            // int no1=array1[i];
            // int no2=array2[i];
            // output+=Integer.toString(no1*no2);
        }
        System.out.print("the multiplication is : ");
        System.out.print(Arrays.toString(total));
    }
}
