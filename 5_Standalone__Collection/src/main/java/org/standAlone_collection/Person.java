package org.standAlone_collection;

import java.util.List;
import java.util.Map;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/2/2025 9:28 AM
 Project Name : Spring Concepts
 ************************************************************************/
public class Person {
    private List<String> friends;

    private Map<String, String> course;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", course=" + course +
                '}';
    }
}
