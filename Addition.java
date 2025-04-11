public class Addition

{

public static void main(String[] args)

{

int a = 19;

int b = 5;

//method calling

int c = add(a, b); 

System.out.println("The sum of a and b is= " + c);

}

//user defined method

public static int add(int n1, int n2) 
{

int s;

s=n1+n2;

return s; //returning the sum

}

}