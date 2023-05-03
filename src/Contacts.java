import java.util.Scanner;

public class Contacts {

   private String Firstname;
   private String Lastname;
   private String Adress;
   private String City;
   private String State;
   private int zip;
   private long phonenumber;
   private String Email;

    public String getFirstName() {
        return Firstname;
    }

    public String getLastName() {
        return Lastname;
    }

    public String getAddress() {
        return Adress;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public int getZip() {
        return zip;
    }

    public long getPhoneNumber() {
        return phonenumber;
    }

    public String getEmail() {
        return Email;
    }


    public void setFirstName(String firstName) {
        this.Firstname = firstName;
    }

    public void setLastName(String lastName) {
        this.Lastname = lastName;
    }

    public void setAddress(String address) {
        this.Adress = address;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public void setState(String state) {
        this.State = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phonenumber = phoneNumber;
    }

    public void setEmail(String email) {
        Email = email;
    }

    Contacts(String f, String l, String a, String c, String s, int z, long p, String e) {
        this.Firstname = f;
        this.Lastname = l;
        this.Adress = a;
        this.City = c;
        this.State = s;
        this.zip = z;
        this.phonenumber = p;
        this.Email = e;
    }

    public String toString() {
        return (
                "First Name : " + getFirstName() + "; Last Name :  " + getLastName() + "; Address : " + getAddress() + "; City : " + getCity() + "; State : " + getState() + "; Zip : " + getZip() + "; PhoneNumber : " + getPhoneNumber() + "; Email : " + getEmail()
        );
    }
}