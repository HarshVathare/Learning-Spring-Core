package org.Construction_Injection;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/27/2025 12:20 PM
 Project Name : Inject_Type
 ************************************************************************/
public class Person {
    private String name;
    private int personId;
    private Certi certi;

    public Person(String name, int personId,Certi certi ) {
        this.name = name;
        this.personId = personId;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certi=" + certi +
                '}';
    }
}
