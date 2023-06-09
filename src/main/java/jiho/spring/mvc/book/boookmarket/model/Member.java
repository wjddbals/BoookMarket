package jiho.spring.mvc.book.boookmarket.model;

import java.util.Date;

public class Member {

    private int id;
    private String passwd;
    private String city;
    private String sex;
    private String[] hobby;

    private Date birth;

    public Member() {
    }

    public Member(int id, String passwd, String city, String sex, String[] hobby, Date birth) {
        this.id = id;
        this.passwd = passwd;
        this.city = city;
        this.sex = sex;
        this.hobby = hobby;
        this.birth = birth;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
