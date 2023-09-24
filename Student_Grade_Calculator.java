//STUDENT GRADE CALCULATOR....

import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Mark's of 1st subject :-");
        int first = obj.nextInt();
        System.out.print("Enter Mark's of 2nd subject :-");
        int second = obj.nextInt();
        System.out.print("Enter Mark's of 3rd subject :-");
        int third = obj.nextInt();
        System.out.print("Enter Mark's of 4th subject :-");
        int fourth = obj.nextInt();
        System.out.print("Enter Mark's of 5th subject :-");
        int fifth = obj.nextInt();

        int Total = first + second + third + fourth + fifth;
        System.out.println("Total marks is :- " + Total);
        System.out.println("Average Percentage is :- " + Total / 5 + "%");
        if (Total >= 300)
            System.out.println("Grade 'A'");

        else if (Total >= 225 & Total <= 299)
            System.out.println("Grade 'B'");

        else if (Total >= 125 & Total <= 224)
            System.out.println("Grade 'C'");

        else
            System.out.println("Grade 'D'");

        obj.close();
    }

}
