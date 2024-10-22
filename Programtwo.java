import java.util.Scanner;

public class Programtwo {
    
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the length of the radius:");
        int a=sc.nextInt();

        float Area=(float)(a*a*Math.PI);
        float Peri=(float)(a*2*Math.PI);
        System.out.println("The Area is :"+Area);
        
        System.out.println("The Perimeter is :"+Peri);
    }

}
