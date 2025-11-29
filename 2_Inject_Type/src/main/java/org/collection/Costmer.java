package org.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/26/2025 8:01 PM
 Project Name : Inject_Type
 ************************************************************************/
public class Costmer {
    private String name;
    private List<String> phone_numbers;
    private Set<String> addresses;
    private Map<String, String> cources;

    public Costmer(String name, List<String> phone_numbers, Set<String> addresses, Map<String, String> cources) {
        this.name = name;
        this.phone_numbers = phone_numbers;
        this.addresses = addresses;
        this.cources = cources;
    }

    public Costmer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone_numbers() {
        return phone_numbers;
    }

    public void setPhone_numbers(List<String> phone_numbers) {
        this.phone_numbers = phone_numbers;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCources() {
        return cources;
    }

    public void setCources(Map<String, String> cources) {
        this.cources = cources;
    }

    @Override
    public String toString() {
        return "Costmer{" +
                "name='" + name + '\'' +
                ", phone_numbers=" + phone_numbers +
                ", addresses=" + addresses +
                ", cources=" + cources +
                '}';
    }
}
