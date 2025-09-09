package phones;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("iPhone", "16 Pro");
        smartphone.call("+34 123 456 789");
        smartphone.ringAlarm();
        smartphone.takePhoto();
    }
}
