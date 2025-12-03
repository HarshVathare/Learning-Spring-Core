package org.StereoType_Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/3/2025 12:21 PM
 Project Name : Spring Concepts
 ************************************************************************/

@Component
public class Student {
    @Value("Soham Mohite")
    private String name;

    @Value("Kolhapur")
    private String city;

    @Value("soham@gmail.com")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
