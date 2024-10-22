import java.util.Scanner;

public class Programfive {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string for reversing it: ");
        String st=sc.nextLine();
        char[] letter=st.toCharArray();


        // or better way is to use only array funtion to directly store the string while converting it into array//
        // like char[] letter=sc.nextLine().toCharArray();
        
        System.out.println("the reverse string is: ");
        
        for(int i=st.length()-1;i>=0;i--){

            System.out.print(letter[i]);
        }


    }
    
}
