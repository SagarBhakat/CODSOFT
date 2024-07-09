import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to grade calculator");
        Scanner input = new Scanner(System.in);
        int sub1,sub2,sub3,sub4,sub5;
        System.out.print("Enter marks in first subject : ");
        sub1 = input.nextInt();
        System.out.print("Enter marks in second subject : ");
        sub2 = input.nextInt();
        System.out.print("Enter marks in third subject : ");
        sub3 = input.nextInt();
        System.out.print("Enter marks in fourth subject : ");
        sub4 = input.nextInt();
        System.out.print("Enter marks in fifth subject : ");
        sub5 = input.nextInt();

        int totalMarksObtained = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total marks obtained-"+totalMarksObtained);
        double percentage = (double) totalMarksObtained/5;
        System.out.println("Percentage-"+percentage);

        if(percentage>=90){
            System.out.println("Grade = A+");

        } else if (percentage>=80) {
            System.out.println("Grade = A");

        } else if (percentage>=70) {
            System.out.println("Grade = B+");


        }else if(percentage>=60){
            System.out.println("Grade = B");
        }else if(percentage>=50){
            System.out.println("Grade = C");
        }else if(percentage>=40){
            System.out.println("Grade = D");
        }else if(percentage>=33){
            System.out.println("Grade = E");
        }else{

            System.out.println("Fail");
        }

    }
}
