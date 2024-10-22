//code for area and division

import java.util.Scanner;

class Programone{

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no A:");
        int A=sc.nextInt();
        System.out.println("Enter the no B:");
        int B=sc.nextInt();

        if(B==0){
            System.out.println("The Division can not be done by 0");
        }else{
            int Y=A/B;
            int R=A%B;
        

            System.out.println("The Division is"+ Y +"and the Remainder is"+ R);
        }


    }

}
