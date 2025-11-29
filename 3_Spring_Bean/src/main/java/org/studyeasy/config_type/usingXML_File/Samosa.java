package org.studyeasy.config_type.usingXML_File;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/28/2025 11:59 AM
 Project Name : 3_Spring_Bean
 ************************************************************************/
public class Samosa {
    private String count;
    private String price;

    public Samosa(String count, String price) {
        this.count = count;
        this.price = price;
    }

    public Samosa(){

    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "count='" + count + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    //call init()
    public void start(){
        System.out.println("this is the init method ..!");
    }

    // call Destroy()
    public void end(){
        System.out.println("this is the destroy method ..!");
    }
}
