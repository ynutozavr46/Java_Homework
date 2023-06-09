package LB06;
public class Phone {
    private String number;
    private String model;
    private double weight;
    
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    
    public Phone(String number, String model) {
        this(number, model, 0.0);
    }
    
    public Phone() {
        this("", "", 0.0);
    }
    
    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }
    
    public String getNumber() {
        return number;
    }
    
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Дзвонить " + callerName + " (" + callerNumber + ")");
    }
    
    public void sendMessage(String... numbers) {
        System.out.println("Надіслано повідомлення на наступні номери:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
    
    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Nokia", 150.0);
        Phone phone2 = new Phone("987654321", "Samsung");
        Phone phone3 = new Phone();
        
        System.out.println("Інформація про перший телефон:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.model);
        System.out.println("Вага: " + phone1.weight);
        
        System.out.println("Інформація про другий телефон:");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель: " + phone2.model);
        System.out.println("Вага: " + phone2.weight);
        
        System.out.println("Інформація про третій телефон:");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.model);
        System.out.println("Вага: " + phone3.weight);
        
        phone1.receiveCall("Іван");
        phone2.receiveCall("Петро", "987654321");
        
        phone1.sendMessage("111111111", "222222222");
        phone2.sendMessage("333333333", "444444444", "555555555");
    }
}
