package LB06;
public class Person {
    private String fullName;
    private int age;
    
    public Person() {
    }
    
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    
    public void move() {
        System.out.println(fullName + " рухається");
    }
    
    public void talk() {
        System.out.println(fullName + " говорить");
    }
    
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Іванов Іван";
        person1.age = 30;
        
        Person person2 = new Person("Петров Петро", 25);
        
        person1.move();
        person1.talk();
        
        person2.move();
        person2.talk();
    }
}
