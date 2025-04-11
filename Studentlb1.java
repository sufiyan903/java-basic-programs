public class Studentlb1 {
    private String name;
    private int age;

    public Studentlb1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Studentlb1 s1 = new Studentlb1("Abhijith", 20);
        s1.display();
    }
}
