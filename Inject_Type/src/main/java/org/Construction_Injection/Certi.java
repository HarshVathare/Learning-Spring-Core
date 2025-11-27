package org.Construction_Injection;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/27/2025 12:28 PM
 Project Name : Inject_Type
 ************************************************************************/
public class Certi {
    private String cource_name;
    private String duration;

    public Certi(String cource_name, String duration) {
        this.cource_name = cource_name;
        this.duration= duration;
    }

    @Override
    public String toString() {
        return "Certi{" +
                "cource_name='" + cource_name + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
