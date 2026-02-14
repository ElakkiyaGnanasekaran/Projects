package Java.testing;

public class Commonelement {
    public static void main(String[] args){
        int[] a = {1,2,3,4};
int[] b = {3,4,5,6};

for(int i=0;i<a.length;i++){
    for(int j=0;j<b.length;j++){
        if(a[i] == b[j])
            System.out.print(a[i]+" ");
    }
}
    
}
}
