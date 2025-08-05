import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Subject 1 marks");
        int sub1 = sc.nextInt();

        System.out.println("Enter your Subject 2 marks");
        int sub2 = sc.nextInt();

        System.out.println("Enter your Subject 3 marks");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        System.out.println("Total is " + total);

        int grade = (total / 3);
        System.out.println("Grade is " + grade);

        if (grade > 35) 
        {
            if(grade > 75)
            {
                System.out.println("Passing with good marks");
            }
            else
            {
                System.out.println("Pass");
            }
        }
        else
        {
            System.out.println("fail");
        }

    }
}