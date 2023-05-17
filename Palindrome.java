import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int org=M;
        int rev=0;
        while(M>0){
            int rem=M%10;
            rev=rev*10+rem;
            M=M/10;
        }
        if(org==rev){
            System.out.print(org+" is a palindrome number");
        }
        else{
            System.out.print(org+" is not a palindrome number");
        }
    }
}
