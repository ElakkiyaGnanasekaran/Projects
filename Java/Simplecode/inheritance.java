package Java.Simplecode;

public class inheritance {
    int nolegs = 4;

    public static void eat(){
        System.out.println("Eating");
    }

    public static void walk(){
        System.out.println("Walking");
    }
}

class Dog extends inheritance{
    Boolean canBark = true;

}

class call{
    public static void main(String[] args) {
        Dog obj = new Dog();
        System.out.println(obj.nolegs);
        System.out.println(obj.canBark);
        obj.eat();
        obj.walk();
    }
}