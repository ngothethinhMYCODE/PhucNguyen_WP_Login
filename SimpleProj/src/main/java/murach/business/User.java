package murach.business;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private String email;

    // Constructor mặc định
    public User() {
        firstName = "";
        lastName = "";
        email = "";
    }

    // Constructor có tham số
    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Getter và Setter cho firstName
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter và Setter cho lastName
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter và Setter cho email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
