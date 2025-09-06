package Java.Simplecode;

public class Test {
    public static void main(String arg[]){
        int a = 15;
        int b = 20;
        float c = summary(a,b);
        System.out.println(c);
    }

    private static float summary(int x, int y) {
        return x - y;
    }
}
