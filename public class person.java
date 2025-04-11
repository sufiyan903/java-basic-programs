public class person{
	string name;
	private int age;
constructor with no parameter
public person(){
	name=unknown
	age=0;
  }

constructor with one parameter(name)
public person(string name){
this.name=name;
age=0;
}
constructor with two parameter(Name and Age)
public person(string name,int age){
this.name=name;
this.age=age;
}
method to displaypersoninformation(method overloading)
public void displayinfo(){
	System.out.println(Name+name);
	System.out.println(Age+age);
}
method to display a greeting(method overloading)
public void displayibfo(string greeting){
	System.out.println(greeting+Name+name);
	System.out.println(Age+age);
   }
   public static void main(string[]args){
creating object using different constructors with the desired name and ages
person person1=new person(arun,20);
person person2=new person(ram,19);
call displayinfo method
person 1.displayinfo();
person2.displayinfo(hello)
  }
