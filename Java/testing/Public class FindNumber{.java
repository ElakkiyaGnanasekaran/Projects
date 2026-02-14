public class FindNumber{
    public static void main(String[] args){
        int[] arr = {9,4,4,5};
        int number = 4;

        for (int i =0;i<arr.length;i++){
            if(arr[i]==number){
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        } 
}
}