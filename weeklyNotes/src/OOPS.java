import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class OOPS{
    public static void main(String[] args){
        try{
            File textFile = new File("sabid.txt");
            FileWriter writer = new FileWriter(textFile);
            if(textFile.createNewFile()){
                System.out.println("File Created!");
            }else {
                System.out.println("File already Exists!");
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name : ");
            String input = sc.nextLine();
            for (int i = 0; i < input.length(); i++){
                writer.write(input.substring(i, i+ 1));
            }
            writer.close();
        }catch (Exception e){
            System.out.println("An Error happened with creating this file! ");
        }
        System.out.println("Text saved after Encryption!");
    }
}