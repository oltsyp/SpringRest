package Spring.springrest.user;

import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    public Long getId() {return userId;}

    public void setId(long id) {
        this.userId = id;
    }


    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "gender_id")
    private Integer genderId;

    @Column(name = "date_of_birth")
    private Integer dateOfBirth;

    @Column(name = "city")
    private String city;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "user_info")
    private String userInfo;

    @Column(name = "user_nickname", unique = true, nullable = false)
    private String userNickname;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "phone_number", unique = true)
    private String phoneNumber;

    @Column(name = "hard_skills")
    private String hardSkills;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "photo_id")
    private Long photoId;

    //name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public String geMiddleName() {
        return middleName;
    }

    public void setMiddleName(String mname) {
        this.middleName = mname;
    }

    //int-id,birth

    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer id) {
        this.genderId = id;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer date) {
        this.dateOfBirth = date;
    }

    //string

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHardSkills() {
        return hardSkills;
    }

    public void setHardSkills(String hardSkills) {
        this.hardSkills = hardSkills;
    }

    //bool long

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long hardSkills) {
        this.photoId = photoId;
    }
}
