package gr.aueb.cf.cf9.ch11;

public class Customer {
    private long id;
    private String firstname;
    private String lastname;
    private String vat;
    private String phoneNumber;
    private String region;
    private String prefecture;
    private String municipality;
    private String city;
    private String street;
    private String streetNumber;
    private String email;

    public Customer() {

    }

    public Customer(long id, String email, String streetNumber, String firstname, String lastname, String vat, String phoneNumber, String region, String municipality, String prefecture, String city, String street) {
        this.id = id;
        this.email = email;
        this.streetNumber = streetNumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.vat = vat;
        this.phoneNumber = phoneNumber;
        this.region = region;
        this.municipality = municipality;
        this.prefecture = prefecture;
        this.city = city;
        this.street = street;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
