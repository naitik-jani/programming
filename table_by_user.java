import java.util.Scanner;

public class table_by_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int i = 1;
        System.out.println("enter the number");
        a = sc.nextInt();
        while (i <= 10) {
            System.out.println(a + "X" + i + "=" + (a * i));
            i++;
        }
    }
} 