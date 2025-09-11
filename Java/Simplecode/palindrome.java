package Java.Simplecode;

public class palindrome {
    public static boolean ispalindrome(String str){
        int left = 0,right = str.length() -1;
        while(left<right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;

    }
    public static void main(String args[]){
        String date = "12022021";
        for(int i=1;i<=date.length();i++){
           String sub = date.substring(0, i);
           if (ispalindrome(sub)){
            System.out.println("substring: " +sub);
            break;
           }

        }
    }

    
}
