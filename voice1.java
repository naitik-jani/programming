//using method overriding
class demo{
    void animal(){
        System.out.println("bhaw bhaw");
    }
}
class demo1 extends demo{
    void animal(String type){
        System.out.println(type);
    }
}
public class voice1 {
public static void main(String[] args) {
    demo1 d1=new demo1();
    d1.animal("meow meow");
    demo d=new demo();
    d.animal();
}
}