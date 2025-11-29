package org.studyeasy.Autowiring.Using_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/29/2025 2:01 PM
 Project Name : 4_Autowiring_In_Spring
 ************************************************************************/
public class Emp {
    private String name;
    private Address address;

    public Emp(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Emp() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
