public class operator {
    public static void main(String[] args) {
        int a=20,b=10;
        //assignment operator
        System.out.println(a+=2);
        System.out.println(a-=2);
        System.out.println(a*=2);
        System.out.println(a/=2);

        //conditional/ternary operator
        System.out.println(b>=15?b:a);
   
        //logical operator
        System.out.println(a>=10 && b>=20);//and operator
        System.out.println(a>=10 || b>=20);//or operator
        System.out.println(!(a>=10));      //not oprator

        //arithmatic operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //increment/decriment operator
        System.out.println(a++);
        System.out.println(++b);
    }
}
   