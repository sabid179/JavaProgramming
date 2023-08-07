import java.util.Scanner;
public class Main {
    String[] days = new String[7];
    String saveSee; int yy = 0;
    String[] dayArr = new String[]{"friday", "saturday", "sunday", "monday", "tuesday", "wednesday", "thursday"};
    Scanner sc = new Scanner(System.in);
    public void save_or_see_Notes(){
        String day = sc.nextLine();
        for (int i = 0; i <= 7; i++){
            if(i == 7){
                System.out.print("Error day's name! Try again,\n :\t");
                yy = 0;
                break;
            } else {
                if(day.equalsIgnoreCase(dayArr[i]) && saveSee.equalsIgnoreCase("save")) {
                    System.out.print("Write a single line note,\n :\t");
                    days[i] = sc.nextLine();
                    System.out.println("Saved Note!");
                    yy++;
                    break;
                } else if (day.equalsIgnoreCase(dayArr[i]) && saveSee.equalsIgnoreCase("see")) {
                    System.out.println("Note : //\t" + days[i] + "\t//");
                    yy++;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        String cmd;
        for (int i = 0; i < 7; i++) {
            main.days[i] = "Nothing Here Yet!";
        }
        System.out.print("Launch NoteBook ??\n :\t");
        cmd = main.sc.nextLine();
        if (cmd.equalsIgnoreCase("yes")) {
            do {
                System.out.print("[-see-] or [-save-] or [-exit-]----??\n :\t");
                main.saveSee = main.sc.nextLine();
                if(main.saveSee.equalsIgnoreCase("exit")){
                    System.out.println("Thanks a lot! Wishing you a nice day..");
                    break;
                } else if (main.saveSee.equalsIgnoreCase("save") || main.saveSee.equalsIgnoreCase("see")) {
                    System.out.print("Which day do you want to " + (main.saveSee.equalsIgnoreCase("save")? "save ?\n :\t" : "see ?\n :\t"));
                    do {
                        main.save_or_see_Notes();
                    } while (main.yy == 0);
                } else {
                    System.out.println("Wrong command! Try again,");
                }
            } while (true);
        } else if (cmd.equalsIgnoreCase("no")) {
            System.out.println("bye bye");
        } else {
            System.out.println("Wrong command! bye bye..");
        }
    }
}
