package ie.atu.Passenger;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table

public class Passenger {

    private String title;
    private String name;
    private String iD;
    private String phone;
    private int age;

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long count;


    public Passenger(String title, String name, String iD, String phone, int age) {
        setTitle(title);
        setName(name);
        setId(iD);
        setPhone(phone);
        setAge(age);
    }
    public String getTitle() {
        return title;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return iD;
    }
    public String getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }

    public void setTitle(String title) {
        if (title == "Mr" || title == "Mrs" || title == "Ms") {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Wrong title");
        }
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name too short");
        }
    }

    public void setId(String iD) {
        if (iD.length() >= 10) {
            this.iD = iD;
        } else {
            throw new IllegalArgumentException("Id less than 10 characters");
        }
    }

    public void setPhone(String phone) {
        if (phone.length() >= 7) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone to short");
        }
    }

    public void setAge(int age) {
        if (age >= 16) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age less than 16");
        }
    }
}