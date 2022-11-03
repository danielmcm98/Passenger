package ie.atu;


public class Passenger {

    private String Title;
    private String Name;
    private String Id;
    private int Phone;
    private int Age;

    public Passenger(String title, String name, String id, int phone, int age) {
        Title = title;
        Name = name;
        Id = id;
        Phone = phone;
        Age = age;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title){
        if (title == "Mr" || title == "Mrs" || title == "Ms") {
            Title = title;
        }
         else {
            throw new IllegalArgumentException("Wrong title");
        }
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
         Name = name;
    }
        else {
            throw new IllegalArgumentException("Name to short");
        }
    }

    public String getId() {

        return Id;
    }

    public void setId(String id) {
        if(id.length() >= 10)
        {
            Id = id;
        }
        else {
            throw new IllegalArgumentException("Id less than 10 characters");
        }
    }

    public int getPhone() {

        return Phone;
    }

    public void setPhone(int phone) {

        Phone = phone;
    }

    public int getAge() {

        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

}
