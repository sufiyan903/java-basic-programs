class student

{

int rollno;

String name;

void addrecord(int r,String n)

{

rollno = r;

name = n;

}

void displayinfo()

{

System.out.println(rollno + " " +name);

}

}

class studentmethod

{

public static void main(String[] args)

{

student s1 = new student();

student s2 = new student();

s1.addrecord(1,"Arun");

s2.addrecord(2,"Akil");

s1.displayinfo();

s2.displayinfo();

}}