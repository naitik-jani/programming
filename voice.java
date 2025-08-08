//using method overloading
class demo{
    void animal(){
        System.out.println("bhaw bhaw");
    }
    void animal(String type){
System.out.println(type);
    }
}
public class voice {
    
    public static void main(String[] args) {
        demo d1=new demo();
        d1.animal();
        d1.animal("meow meow");
    }
}
