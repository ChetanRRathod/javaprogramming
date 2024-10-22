
// decimal no to binary no

import java.util.Scanner;

public class Programthree {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int decimalno,quot;
        int i=0;
        int binaryno[]=new int[100];

        System.err.println("Enter the decimal no:");
        decimalno=sc.nextInt();

        quot=decimalno;

        while(quot!=0){
            binaryno[i++]=quot%2;
            quot=quot/2;
        }
        System.err.println("the no is:");
        for(int j=0;j<i;j++){
            System.err.print(binaryno[j]);
        }

    }
}
