package ie.atu;


public class Passenger {

    private String Title; //creating variables
    private String Name;
    private String Id;
    private String Phone;
    private int Age;

    public Passenger(String title, String name, String id, String phone, int age) { //creating object
        Title = title;
        Name = name;
        Id = id;
        Phone = phone;
        Age = age;
    }
    public void mainPassenger(String title, String name, String id, String phone, int age) { //passing variables

            if (title == "Mr" || title == "Mrs" || title == "Ms") { //if title matches condition
                Title = title; //sets title
            } else {
                throw new IllegalArgumentException("Wrong title"); //throws arguement if doesnt match
            }

            if (name.length() >= 3) {
                Name = name;
            } else {
                throw new IllegalArgumentException("Name too short");
            }

            if (id.length() >= 10) {
                Id = id;
            } else {
                throw new IllegalArgumentException("Id less than 10 characters");
            }

            if (phone.length() >= 7) {
                Phone = phone;
            } else {
                throw new IllegalArgumentException("Phone to short");
            }

            if (age >= 16) {
                Age = age;
            } else {
                throw new IllegalArgumentException("Age less than 16");
            }

        }
    public String getTitle() { //getter methods for variable
        return Title;
    }
    public String getName() {
        return Name;
    }
    public String getId() {
        return Id;
    }
    public String getPhone() {
        return Phone;
    }
    public int getAge() {
        return Age;
    }
    }