package org.Refference_Object;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/26/2025 8:42 PM
 Project Name : Inject_Type
 ************************************************************************/
public class Std_Cource {
    private String cource_type;
    private String duration;

    public Std_Cource(String cource_type, String duration) {
        this.cource_type = cource_type;
        this.duration = duration;
    }

    public Std_Cource() {
    }

    public String getCource_type() {
        return cource_type;
    }

    public void setCource_type(String cource_type) {
        this.cource_type = cource_type;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Std_Cource{" +
                "cource_type='" + cource_type + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
