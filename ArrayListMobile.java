import java.util.ArrayList;


public class ArrayListMobile{
    private String myPhonenumber;
    private ArrayList<ArrayListContact> myContacts;

    public ArrayListMobile(String myPhonenumber) {
        this.myPhonenumber = myPhonenumber;
        this.myContacts = new ArrayList<ArrayListContact>();
    }

    public int M_findName(String name){
        for(int i=0; i<myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public boolean M_addContact(ArrayListContact contact){
        int index_num = M_findName(contact.getName());
        if(index_num < 0){
            myContacts.add(contact);
            return true;
        }
        return false;
    }
    public void M_printall(){
        for(int i=0; i<myContacts.size(); i++){
            System.out.println(myContacts.get(i).getName() + myContacts.get(i).getPhoneNumber());
        }
    }
    public void M_modifyContact(int position, ArrayListContact contact){
        this.myContacts.set(position, contact);
    }
}