import javax.xml.stream.events.EntityDeclaration;

public class Javarush_18 {
    public static void main(String[] args) {
    }
}
class Entity {
    public void eat() {
        System.out.print("I can eat");
    }
    public  void move() {
        System.out.println("I can move");
    }
}
class Human extends Entity {
    public void speak() {
        System.out.println("I can speak");
    }
}
class Programmer extends Human {
    public void code() {
        System.out.println("I can code");
    }
}
