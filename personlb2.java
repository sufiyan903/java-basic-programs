public class Personlb2 {
    String name;
    private int age;

   
    public Personlb2() {
        name = "unknown";
        age = 0;
    }

   
    public Personlb2(String name) { 
        this.name = name;
        age = 0;
    }

    
    public Personlb2(String name, int age) { 
        this.name = name;
        this.age = age;
    }

    
    public void displayInfo() { 
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    
    public void displayInfo(String greeting) { 
        System.out.println(greeting + " Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) { 
    
        Personlb2 person1 = new Personlb2("Arun", 20);
        Personlb2 person2 = new Personlb2("Ram", 19);

        person1.displayInfo();
        person2.displayInfo("Hello");
    }
}
