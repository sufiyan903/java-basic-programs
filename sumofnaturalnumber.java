import java.util.Scanner;
public class sumofnaturalnumber{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter n number");
int num=sc.nextInt();
int i;
int sum=0;
for(i=1;i<=num;++i){
sum=sum+i;
  }
System.out.println("sum of given natural number is:"+sum);
 }
}