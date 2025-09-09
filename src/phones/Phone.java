package phones;

public abstract class Phone {
    protected String brand;
    protected String model;

    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void call(String phoneNumber){
        System.out.println("Calling " + phoneNumber + "...");
    }
}
