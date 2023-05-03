import java.util.*;
import java.util.concurrent.CountedCompleter;
import java.util.stream.Collectors;

public class Main {
    public static <List> void main(String[] args) {
//      Addressbook of Name Circle1 is Added.

        Contacts c1 = new Contacts("Pinaki", "Roy", "New Market", "Bangalore", "Karnataka", 562109, 709008980, "pinaki.mail");
        Contacts c2 = new Contacts("Pratik", "Ganguly", "Golpark", "Asansol", "WestBengal", 713305, 940000000, "pratik.mail");
        Contacts c3 = new Contacts("Anirban", "Bose", "Riverside", "Asansol", "WestBengal", 713304, 967878555, "anirban.mail");
        ArrayList<Contacts> AddressBookCircle1 = new ArrayList<>();
        AddressBookCircle1.add(c1);
        AddressBookCircle1.add(c2);
        AddressBookCircle1.add(c3);
//        System.out.println(AddressBookCircle1);
        AddressBookCircle1.remove(0);
//        System.out.println(AddressBookCircle1);
        AddressBookCircle1.set(1, new Contacts("Anil", "Sharma", "Newtown", "Kanpur", "Uttar Pradesh", 678645, 940897655, "anil.mail"));
//        System.out.println(AddressBookCircle1);
//      New AddressBook of name Circle 2 Added.
        Contacts c4 = new Contacts("Arvind", "KUMAR", "Clock Tower", "Pune", "Maharastra", 345652, 784665632, "arvind.mail");
        Contacts c5 = new Contacts("Sachin", "Sharma", "Laketown", "Ahmedabad", "Gujrat", 647265, 73335673, "sachin.mail");
        Contacts c6 = new Contacts("Jason", "Mathews", "Hillview", "Kanpur", "Uttar Pradesh", 263413, 53675427, "jason.mail");
        ArrayList<Contacts> AddressBookCircle2 = new ArrayList<>();
        AddressBookCircle2.add(c4);
        AddressBookCircle2.add(c5);
        AddressBookCircle2.add(c6);
        java.util.List<Contacts> l = AddressBookCircle2.stream().filter(i->i.getFirstName() == "Sachin").collect(Collectors.toList());
        System.out.println(l);
//        System.out.println(AddressBookCircle2);
//       New AddressBook of name Circle 3 Added.
        Contacts c7 = new Contacts("Kunal", "Mehta", "North Point", "Delhi", "Delhi", 758585, 894485747, "kunal.mail");
        Contacts c8 = new Contacts("Rohit", "Kumar", "Police Colony", "Morena", "Gujrat", 837365, 577638645, "rohit.mail");
        Contacts c9 = new Contacts("Avinash", "Thakur", "Hospital Road", "Lucknow", "Uttar Pradesh", 646547, 898367633, "avinash.mail");
        ArrayList<Contacts> AddressBookCircle3 = new ArrayList<>();
        AddressBookCircle3.add(c7);
        AddressBookCircle3.add(c8);
        AddressBookCircle3.add(c9);
//        System.out.println(AddressBookCircle3);
        java.util.List<ArrayList> AddressBook = new ArrayList<>();
        AddressBook.add(AddressBookCircle1);
        AddressBook.add(AddressBookCircle2);
        AddressBook.add(AddressBookCircle3);



        Hashtable<String , String> FindAddressBook = new Hashtable<String, String>();
        Scanner sc = new Scanner(System.in);
        String a;
        FindAddressBook.put("Pratik", c1.getCity());
        FindAddressBook.put("Sachin", c5.getCity());
        FindAddressBook.put("Kunal", c7.getCity());

        }

        }




