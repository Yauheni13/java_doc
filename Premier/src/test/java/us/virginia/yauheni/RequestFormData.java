package us.virginia.yauheni;

public class RequestFormData {
    private final String firstName;
    private final String lastName;
    private final String organization;
    private final String email;
    private final String phone;
    private final String city;
    private final String state;
    private final String zipCode;
    private final String comments;

    public RequestFormData(String firstName, String lastName, String organization, String email, String phone, String city, String state, String zipCode, String comments) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.organization = organization;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.comments = comments;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOrganization() {
        return organization;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getComments() {
        return comments;
    }
}
