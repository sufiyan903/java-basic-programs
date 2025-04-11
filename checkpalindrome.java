import java.util.Scanner;
public class checkpalindrome{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
 System.out.println("enter num");
int num=sc.nextInt();
int backUP=num;
int rev=0;
while(num>0){
rev=rev*10+num%10;
num=num/10;
}
if(backUP==rev){
  System.out.println("palindrome");

}else{
   System.out.println("not palindrome");
  }
 }
}