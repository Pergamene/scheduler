package scheduler;

public class Contact {
    private String givenNames;
    private String surname;
    private String mobile;
    private String email;

    public Contact(String givenNames, String surname, String mobile, String email) {

        this.givenNames = givenNames;
        this.surname = surname;
        this.mobile = mobile;
        this.email = email;
    }

    public String getGivenNames() {
        return givenNames;
    }

    public void setGivenNames(String givenNames) {
        this.givenNames = givenNames;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
