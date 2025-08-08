import java.util.Scanner;
public class per {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the marks of java");
        int j=sc.nextInt();

        System.out.println("enter the marks of c");
        int c=sc.nextInt();

        System.out.println("enter the marks of php");
        int p=sc.nextInt();

        float percentage=(j+c+p)/3;
        System.out.println(percentage);
 
        if(percentage>75){
            System.out.println("distrinct");
        }
        else if (percentage>60 && percentage<75) {
            System.out.println("first class");
        } 
        else if (percentage>35 && percentage<60) {
            System.out.println("second class");
        }
        else{
            System.out.println("fail");
        }

    }
}