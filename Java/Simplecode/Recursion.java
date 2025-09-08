package Java.Simplecode;
public class Recursion {
    public static void main(String args[]){
         int n;
         natprint(n=10);

    }
    public static void natprint(int n){
        if (n==1){
            System.out.println(1);
        }
        else{
            System.out.println(n);
            natprint(n-1);
        }
    }
}
