package Other;

public class Phone {
    String number;
    String model;
    double weight;

    public static void main(String[] args) {
        Phone firstPhone = new Phone();
        firstPhone.number = "0639905488";
        firstPhone.model = "Samsung";
        firstPhone.weight = 20.5;
        System.out.println("Номер телефону: " + firstPhone.number);
        System.out.println("Модель телефону: " + firstPhone.model);
        System.out.println("Вага телефону: " + firstPhone.weight + "g" + "\n");
        firstPhone.receiveCall("Анатолій");
        firstPhone.getNumber();


        Phone secondPhone = new Phone();
        secondPhone.number = "0639905499";
        secondPhone.model = "Motorola";
        secondPhone.weight = 17.3;
        System.out.println("Номер телефону: " + secondPhone.number);
        System.out.println("Модель телефону: " + secondPhone.model);
        System.out.println("Вага телефону: " + secondPhone.weight + "g" + "\n");
        secondPhone.receiveCall("Ірина");
        secondPhone.getNumber();

        Phone thirdPhone = new Phone();
        thirdPhone.number = "0639905477";
        thirdPhone.model = "HTC";
        thirdPhone.weight = 19.2;
        System.out.println("Номер телефону: " + thirdPhone.number);
        System.out.println("Модель телефону: " + thirdPhone.model);
        System.out.println("Вага телефону: " + thirdPhone.weight + "g" + "\n");
        thirdPhone.receiveCall("Олександр");
        thirdPhone.getNumber();
    }

    public void receiveCall(String name) {
        System.out.println("Телефонує: " + name + "\n");
    }
    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public  Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }


}
