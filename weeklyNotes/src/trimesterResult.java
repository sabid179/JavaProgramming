import java.util.Scanner;

public class trimesterResult {
    public static String encode(String input){
        char[] array = input.toCharArray();
        String output = "";
        for (char a : array){
            a += 2;
            output += a;
        }
        return output;
    }
    public static String decode(String input){
        String decoded = "";
        char[] array = input.toCharArray();
        for (char a : array){
            a -= 2;
            decoded += a;
        }
        return decoded;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String :\t");
        String input = scan.nextLine();
        String sabid = encode(input);
        System.out.println(sabid);
        System.out.println(decode(encode(input)));
    }
}