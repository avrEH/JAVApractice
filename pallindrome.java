import java.util.Scanner;

/**
 * pallindrome
 */
public class pallindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A WORD");
        String str=sc.nextLine();
        boolean x = isPallindrome(str);
        if (x== true){
            System.out.println(" The given Word is Pallindrome");
        }
        else{
            System.out.println(" The given Word is not a Pallindrome");
        }
    }
    static boolean isPallindrome(String str){
        str =str.toLowerCase();
        for (int i = 0 ;i <=str.length()/2;i++){
            char start=str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start!=end){
                return false ;
            }
        }
        return true;

    }
}