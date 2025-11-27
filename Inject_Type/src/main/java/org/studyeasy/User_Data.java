package org.studyeasy;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/26/2025 7:41 PM
 Project Name : Inject_Type
 ************************************************************************/
public class User_Data {
    private int user_id;
    private String name;
    private String email;
    private String age;

    public User_Data(int user_id, String name, String email, String age) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public User_Data() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User_Data{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
