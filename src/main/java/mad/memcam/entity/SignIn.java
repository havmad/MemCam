package mad.memcam.entity;

import javax.persistence.*;

@Entity
public class SignIn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String signId;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @Column(unique = true, nullable = false)
    private String gender;

    @OneToOne(cascade = {CascadeType.ALL})
    //@Column(unique = true, nullable = false)
    private Login login;

    @OneToOne(cascade = {CascadeType.ALL})
    //@Column(unique = true, nullable = false)
    private Address address;

    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
