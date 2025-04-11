import java.util.Scanner;
public class Amstrong{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter num");
int num=sc.nextInt();
int backUP=num;
int sum=0;
while(num>0){
sum=sum+(num%10)*(num%10)*(num%10);
num=num/10;
}
if(sum==backUP){
	System.out.println("Amstrong");
}else{
	System.out.println("not Amstrong");
     }
  }	

}