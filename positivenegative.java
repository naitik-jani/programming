import java.util.Scanner;
public class positivenegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();

        if (num>=0) {
            System.out.println("positive number");
        }
        else{
            System.out.println("negative number");
        }
    }
}
