import java.util.ArrayList;
public class ArrayListContact{
    private String name;
    private String phoneNumber;
    public ArrayListContact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static ArrayListContact createArrayListContact(String name, String phoneNumber){
        return new ArrayListContact(name, phoneNumber);
    }
}