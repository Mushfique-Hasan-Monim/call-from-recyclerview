package info.androidhive.recyclerviewsearch;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Contact> contacts = new ArrayList<>();

    public List<Contact> fetchContacts(){
        contacts.add(new Contact("Md. Monim", "https://api.androidhive.info/json/images/tom_hardy.jpg", "01977042737"));
        contacts.add(new Contact("Md. Johnny", "https://api.androidhive.info/json/images/johnny.jpg", "01977042737"));
        contacts.add(new Contact("Md. Cruise", "https://api.androidhive.info/json/images/tom_cruise.jpg", "01977042737"));
        contacts.add(new Contact("Md. Keira", "", "01977042737"));
        return  contacts;
    }
}
