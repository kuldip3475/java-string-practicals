import java.util.Scanner;

public class test1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or line:");
        String name = scan.nextLine();
        char ch = name.charAt(3);
        System.out.println("the letter present in 4 is "+ch);
    }
}