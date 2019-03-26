package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: martin
 */
//用户实体类
public class User {
    private int id;
    private String username;
    private String password;
    private char gender;
    private String email;
    private Date birthday;
    public User(){}

    public User(int id, String username, String password, char gender, String email, Date birthday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.email = email;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        //格式化输出日期
        return new SimpleDateFormat("yyyy-MM-dd").format(birthday);
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
