package org.studyeasy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.-com
 Created On : 12/6/2025 11:53 AM
 Project Name : Spring Concepts
 ************************************************************************/
@Component
public class Student {
    @Value("data")
    private String stdname;

    @Value("demo")
    private String city;

    @Value("#{temp}")
    private List<String> address;

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdname='" + stdname + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }
}
