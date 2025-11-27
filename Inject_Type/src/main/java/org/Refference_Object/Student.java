package org.Refference_Object;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/26/2025 8:41 PM
 Project Name : Inject_Type
 ************************************************************************/
public class Student {
   private String name;
   private String city;
   private Std_Cource stdCource;

    public Student(String name, String city, Std_Cource stdCource) {
        this.name = name;
        this.city = city;
        this.stdCource = stdCource;
    }

    public Student() {
    }

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

    public Std_Cource getStdCource() {
        return stdCource;
    }

    public void setStdCource(Std_Cource stdCource) {
        this.stdCource = stdCource;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", stdCource=" + stdCource +
                '}';
    }
}
