import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Std{
    String ID;
    Std(String id){
        this.ID = id;
    }

}
public class File_Handling {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
        try {
            File Obj = new File("C://Users//mdrak//Desktop//file.txt");
            Scanner Reader = new Scanner(Obj);
            int sum = 0, sum2 = 0, flag = 0;
            while (Reader.hasNext()){
                String text = Reader.nextLine();
                System.out.println(text);
                String[] array = text.split("\\s+\\+\\s+");
                for (int i = 0; i < array.length; i++){
                    if(flag == 0) {
                        sum += Integer.valueOf(array[i]);
                    }
                    else{
                        char c = array[i].charAt(0);
                        sum2 += (int) c;
                    }
                }
                flag++;
            }
            System.out.println(sum);
            System.out.println(sum2);
            Reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

    }
}
