import java.util.Scanner;

public class Programfour {

    public static void main(String[] args){



        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your string to check no of characters,numbers,space and others:");
        String input_string= sc.nextLine();

        count(input_string);


    }
    

    public static void count(String X) {
        char[] ch= X.toCharArray();

    int letter=0,space=0,num=0,others=0;

        for(int i=0;i<X.length();i++){

            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isDigit(ch[i])){

                num++;
            }else if(Character.isSpaceChar(ch[i])){
                space++;
            }
            else{
                others++;
            }

        }
        

        System.out.println("Letters: "+letter);
        System.out.println("Numbers: "+num);
        System.out.println("Others: "+others);
        System.out.println("Space: "+space);

    }
}
