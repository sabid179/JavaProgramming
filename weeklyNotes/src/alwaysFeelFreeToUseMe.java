import java.util.Scanner;
class Student{
    String name = "no name";
    long ID = 0;
    String area = "not yet declared", district = "not yet declared", city = "not yet declared";
    public void setAddress(String area, String district, String city){
        this.area = area;
        this.district = district;
        this.city = city;
    }
    public void getAddress(){
        System.out.println("Area      : " + this.area + "\nDistrict  : "+ this.district + "\nCity      : " + this.city);
    }
    double EngMark, MathMark, SciMark, average;
    public void setMarks(double Eng, double Math, double Sci){
        this.EngMark = Eng;
        this.MathMark = Math;
        this.SciMark = Sci;
        average = (Eng + Math + Sci) / 3;
    }
    String grade;
    public void getGrade(){
        if(this.average >= 80 && this.average <= 100){
            this.grade = "A+";
        } else if(this.average >= 70){
            this.grade = "A";
        } else if(this.average >= 65){
            this.grade = "A-";
        } else if(this.average >= 60){
            this.grade = "B+";
        } else if(this.average >= 55){
            this.grade = "B";
        } else if(this.average >= 50){
            this.grade = "B-";
        } else if(this.average >= 45){
            this.grade = "C+";
        } else if(this.average >= 40){
            this.grade = "D+";
        } else if(this.average >= 35){
            this.grade = "D";
        } else if(this.average >= 33){
            this.grade = "D-";
        } else{
            this.grade = "F";
        }
        System.out.println(this.name +"(" + this.ID + ")" + " got " + grade + " in this Exam!");
    }
}

public class alwaysFeelFreeToUseMe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String buffer;
        System.out.print("How many students are there?\n :\t");
        int n = sc.nextInt();
        Student[] studentArray = new Student[n];
        for (int i = 0; i < n; i++){
            studentArray[i] = new Student();
        }
        int std_number = 1;
        for (Student std : studentArray){
            System.out.print("Enter the name of Student " + std_number + "..\n :\t");
            buffer = sc.nextLine();
            std.name = sc.nextLine();
            System.out.print("ID number : ");
            std.ID = sc.nextLong();
            System.out.print("Area      : ");
            buffer = sc.nextLine();
            String area = sc.nextLine();
            System.out.print("District  : ");
            String district = sc.nextLine();
            System.out.print("City      : ");
            String city = sc.nextLine();
            std.setAddress(area, district, city);
            System.out.print("Marks of English : ");
            double eng = sc.nextInt();
            System.out.print("Marks of Math    : ");
            double mat = sc.nextInt();
            System.out.print("Marks of Science : ");
            double sci = sc.nextInt();
            std.setMarks(eng, mat, sci);
            std_number++;
        }
        System.out.print("Enter the name of Student whom you want to see the result\n :\t");
        buffer = sc.nextLine();
        String re = sc.nextLine();
        for (int i = 0; i < n; i++){
            if(studentArray[i].name.equalsIgnoreCase(re)){
                studentArray[i].getGrade();
                break;
            }
        }
    }
}