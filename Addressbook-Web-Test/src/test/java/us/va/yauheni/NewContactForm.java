package us.va.yauheni;

public class NewContactForm {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String title;
    private final String company;
    private final String address;
    private final String homephone;
    private final String mobilephone;
    private final String email;
    private final String birthDay;
    private final String birthMonth;
    private final String group;
    private final String birthdayyear;
    private final String secondaddress;

    public NewContactForm(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String homephone, String mobilephone, String email, String BirthDay, String BirthMonth, String Group, String birthdayyear, String secondaddress) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homephone = homephone;
        this.mobilephone = mobilephone;
        this.email = email;
        birthDay = BirthDay;
        birthMonth = BirthMonth;
        group = Group;
        this.birthdayyear = birthdayyear;
        this.secondaddress = secondaddress;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomephone() {
        return homephone;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getGroup() {
        return group;
    }

    public String getBirthdayyear() {
        return birthdayyear;
    }

    public String getSecondaddress() {
        return secondaddress;
    }
}
