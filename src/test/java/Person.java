public class Person {
    String fullName;
    int age;

    public void move() {
        System.out.println("Person рухаеєтся\n");
    }

    public void talk() {
        System.out.println("Person говорить\n");
    }

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.move();

        Person secondPerson = new Person("Ioann", 28);
        System.out.println("Ім'я: " + secondPerson.fullName);
        System.out.println("Вік: " + secondPerson.age);
    }
}
